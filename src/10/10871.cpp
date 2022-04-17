#include <stdio.h>

int main() {
    int N, X;
    scanf("%d %d", &N, &X);
    for (int i = 0; i < N; i++) {
        int n;
        scanf("%d", &n);
        if (n < X) printf("%d ", n);
    }
    return 0;
}