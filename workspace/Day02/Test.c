#include <stdio.h>

int Add1(int n1, int n2);
void Add2(int n1, int n2);
int Add3();
void Add4(); //함수의 선언

void MaxFunc(int number1, int number2);
void Gugudan(int dan);
int MaxNum(int, int, int);
int MinNum(int, int, int);
int Compare(int n1, int n2);
int Absolute(int n);
int Recursive(int n);

int main() {

	//함수 
	/*int num = Add1(1,2);
	printf("%d\n", num);
	Add2(1, 2);
	int num3 = Add3();
	printf("%d\n", num3);
	Add4();*/

	//문제 풀기 
	/*MaxFunc(7, 4);
	MaxFunc(9, 12);

	int dan;
	printf("input : ");
	scanf("%d", &dan);
	Gugudan(dan);

	int num1, num2, num3;
	printf("세 개의 정수 입력 : ");
	scanf("%d %d %d", &num1, &num2, &num3);
	printf("가장 큰 수 : %d\n", MaxNum(num1, num2, num3));
	printf("가장 작은 수 : %d\n", MinNum(num1, num2, num3));
	
	int n1, n2;
	printf("두 개의 정수 입력 : ");
	scanf("%d %d", &n1, &n2);
	printf("%d 와 %d 중 절댓값이 큰 정수는 ? %d\n", n1, n2, Compare(n1, n2));*/
	
	int n1;   
	printf("정수 입력 : ");
	scanf("%d", &n1);
	printf("%d\n", Recursive(n));


	return 0;
}

int Recursive(int n) { //1~사용자가 입력한 합까지 출력
	
	if (n == 1) {
		return 1;
	}
	else {
		return n + Recursive(n - 1);
	}
	

	
}

int Add1(int n1, int n2) { //함수의 정의
	return n1 + n2;
}

void Add2(int n1, int n2) {
	int num;
	num = n1 + n2;
	printf("%d\n", num);
}

int Add3() {
	int n1 = 1, n2 = 2;
	return n1 + n2;
}

void Add4() {
	printf("%d\n", 3);
}

void MaxFunc(int number1, int number2)
{ 
	if (number1 - number2 > 0) {
		printf("%d\n", number1);
	}
	else {
		printf("%d\n", number2);
	}
		
}

void Gugudan(int dan)
{
	int i;
	for (i = 1; i < 10; i++) {
		printf("%d", dan);
		printf(" * %d = ",i);
		printf("%d\n", i * dan);
		
	}
}

int MaxNum(int num1, int num2 , int num3)
{ // 3 5 4
	int temp, max;
	if (num1 > num2) {
		if (num2 > num3) {
			return num1;
		}
		else {
			temp = num2;
			num2 = num3;
			num3 = num2;
		}
	}
	else {
		temp = num1;
		num1 = num2;
		num2 = num1;
		if (num2 > num3) {
			return num1;
		}
		else {
			temp = num2;
			num2 = num3;
			num3 = num2;
		}
	}
}

int MinNum(int num1, int num2, int num3)
{// 3 5 4
	int temp, max;
	if (num1 > num2) {
		if (num2 > num3) {
			return num3;
		}
		else {
			temp = num2;
			num2 = num3;
			num3 = num2;
		}
	}
	else {
		temp = num1;
		num1 = num2;
		num2 = num1;
		if (num2 > num3) {
			return num3;
		}
		else {
			temp = num2;
			num2 = num3;
			num3 = num2;
		}
	}
	
}

int Compare(int n1, int n2)
{
	int an1 = Absolute(n1); 
	int an2 = Absolute(n2);

	if (an1 > an2) {
		return an1;
	}
	else {
		return (-1*an2);
	}

}

int Absolute(int n)
{
	if (n >= 0) {
		return n;
	}
	else {
		return (-1 * n);
	}
}
