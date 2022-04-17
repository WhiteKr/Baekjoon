/**
 * 2438. 별 찍기 - 1
 *
 * 작성자: whitekr
 * 언어: C++17
 * 사용 메모리: 1,116 KB
 * 소요 시간: 0 ms
 * 해결 날짜: 2021년 3월 5일
 */

#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++)
            printf("*");
        printf("\n");
    }
    return 0;
}