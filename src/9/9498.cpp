#include <iostream>

int main() {
	int score;
	scanf("%d", &score);
	char res;
	if (score >= 90) res = 'A';
	else if (score >= 80) res = 'B';
	else if (score >= 70) res = 'C';
	else if (score >= 60) res = 'D';
	else res = 'F';
	printf("%c", res);
}