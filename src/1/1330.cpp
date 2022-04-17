/**
 * 1330. 두 수 비교하기
 *
 * 작성자: whitekr
 * 언어: C++17
 * 사용 메모리: 1,116 KB
 * 소요 시간: 0 ms
 * 해결 날짜: 2021년 3월 4일
 */

#include <stdio.h>

int main() {
    int A, B;
    scanf("%d%d", &A, &B);
    if (A > B) printf(">");
    else if (A < B) printf("<");
    else printf("==");
    return 0;
}