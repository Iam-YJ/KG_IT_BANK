#include <stdio.h>


int main(void) {
	//int i;

	//int arr[3] = { 10,20,30 };
	//int* ptr = arr;

	//printf("%d\n", *(arr + 1));
	//printf("%d\n", ptr[i]);
	//printf("%d\n", *(ptr + 1));
	//// printf("%d\n", *arr[i]); // 접근 자체가 불가능 하다 

	//xor 연산 이용하기
	//char ch;

	//scanf("%c", &ch);

	//printf("%c\n", ch ^ 32);

	

//문제 11번
	char arr[] = "C Programming";

	arr[0] = 'D';
	//ptr[0] = 'D'; //오류
	//포인터 변수로 저장한 문자열은 상수여서
	//맘대로 바꿀 수 없다
	printf("arr : %s ptr : %s\n", arr, ptr);

	//arr = "Hello, World"; // 오류
	//배열이름 자체가 상수 형태의 포인터여서
	//다른 문자열의 주소를 저장할 수 없다.
	ptr = "Hello, World";
	printf("arr: %s ptr : %s\n", arr, ptr);


	return 0;
}

