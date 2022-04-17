import { promisify } from 'util';
import { red, yellow, white, green } from 'chalk';
const request = promisify(require('request'));
import { load } from 'cheerio';
import { sync } from 'fast-glob';
import { writeFileSync, readFileSync } from 'fs';
import filesize from 'filesize';
const nf = new Intl.NumberFormat();
import { extname } from 'path';
const exec = promisify(require('child_process').exec);
const rgx_id = /\d+/;
const argv = process.argv.slice(2).map(a => a.match(rgx_id)[0]);
const URL = 'https://solved.ac/search?query=';
const saveFile = './solved.json';
const list = require(saveFile);
import LANG from './langs.json';
import COLOR from './colors.json';

async function main() {
    let promises = [],
        ids = [...new Set(argv)];

    for (let id of ids) {
        promises.push(getInfo(id));
    }

    await Promise.all(promises);
    list.sort((a, b) => a.id - b.id);
    updateReadme(list);
    writeFileSync(saveFile, JSON.stringify(list, null, 4));
}

async function getInfo(id) {
    let { body } = await request(URL + id),
        $ = load(body),
        problems = JSON.parse($('#__NEXT_DATA__').html()).props.pageProps.problems.items,
        { problemId, titleKo, level } = problems.find(p => p.problemId === +id);

    saveInfo(problemId, titleKo, level);
}

function saveInfo(id, title, level) {
    let sid = String(id),
        folder = sid.substr(0, sid.length - 3),
        codes = sync(`src/${folder}/${id}.*`, { cwd: '..' }),
        info = { id, title, level, codes },
        i = list.findIndex(p => p.id === +id);

    if (i !== -1) {
        if (codes.length < 1) {
            list.splice(i, 1);
            console.log(red(`[Deleted] ${id}. ${title}`));
        } else if (JSON.stringify(list[i]) !== JSON.stringify(info)) {
            list[i] = info;

            console.log(yellow(`[Updated] ${id}. ${title}`));
        } else {
            console.log(white(`[Duplicated] ${id}. ${title}`));
        }
    } else {
        list.push(info);
        console.log(green(`[Added] ${id}. ${title}`));
    }
}

async function updateReadme(list) {
    let readme = readFileSync('README.template.md', 'utf-8'),
        total = 0,
        langs = [],
        langsMarkdown = [];

    list.forEach(p => {
        p.codes.forEach(code => {
            let ext = LANG[extname(code).substr(1)],
                target = langs.find(lang => lang.name === ext);

            if (!target) {
                langs.push({ name: ext, count: 0 });

                target = langs[langs.length - 1];
            }

            target.count++;
        });

        total += p.codes.length;
    });

    langs.push({ name: 'Total', count: total });

    for (let lang of langs) {
        let ext = Object.keys(LANG).find(key => LANG[key] === lang.name) || '',
            [lines, size] = (await exec(`bash getDetails.sh ${ext}`)).stdout.trim().split(' ');

        lang.lines = +lines;
        lang.size = +size;
    }

    langs.sort((x, y) => {
        if (x.name === 'Total') {
            return Infinity;
        }

        if (x.count !== y.count) {
            return x.count > y.count ? -1 : 1;
        } else {
            if (x.lines !== y.lines) {
                return x.lines > y.lines ? -1 : 1;
            } else {
                return x.size > y.size ? -1 : 1;
            }
        }
    });

    for (let { name, count, lines, size } of langs) {
        langsMarkdown.push(`
    <tr>
        <td><b>${name}</b></td>
        <td>${nf.format(count)}</td>
        <td>${nf.format(lines)}</td>
        <td>${filesize(size)}</td>
    </tr>`
        );
    }

    let codesMarkdown = list.map(p => {
        let codes = p.codes.map(code => {
            let lang = LANG[extname(code).substr(1)],
                color = COLOR[lang].replace('#', '') || 'EDEDED';

            return `
            <img src="https://via.placeholder.com/12/${color}/000000?text=+" height="12">
            <a href="${code}">${lang}</a>
        `;
        });

        return `
    <tr>
        <td>
            <a href="https://www.acmicpc.net/problem/${p.id}">
                <img src="https://static.solved.ac/tier_small/${p.level}.svg" height="14">
                ${p.id} ${p.title}
            </a>
        </td>
        <td>${codes.join('\t<br>')}</td>
    </tr>`;
    });

    readme = readme
        .replace('${{TOTAL}}', list.length)
        .replace('${{LANGUAGES}}', langsMarkdown.join('').trim())
        .replace('${{SOLVED}}', codesMarkdown.join('').trim());

    writeFileSync('../README.md', readme);
}

main();
