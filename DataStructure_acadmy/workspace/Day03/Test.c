#include <stdio.h>
int Swap(int num1, int num2);

int main() {

	//포인터
	//int num;
	//int *ptr = &num; //num의 주소를 ptr에 넣는다
	//*ptr = 10; //포인터변수 ptr이 가르키는 공간에 가서 10을 넣을꺼야
	//int** dptr = &ptr; //사용할 자료형을 그대로! 가져온다 
	//int*** tptr = &dptr;


	/*printf("%d %d\n", num, *ptr);
	printf("%d\n", sizeof(ptr));*/

	// printf("%p %p\n",ptr,ptr+1);
	
	//다중 포인터
	/*printf("%d\n", num);
	printf("%d\n", *ptr);
	printf("%d\n", **dptr);
	printf("%d\n", ***tptr);*/

	//예제하고 메모리 구조 그림으로 표현
	//int num = 10;
	//int* ptr1 = &num;
	//int* ptr2 = ptr1;

	//(*ptr1)++;
	//(*ptr2)++;

	//printf("%d \n", num);


	//예시 문제 2
	/*int num1 = 10, num2 = 20;

	printf("%d %d\n", num1, num2);
	Swap(&num1, &num2);
	printf("%d %d\n", num1, num2);*/


	//포인터와 배열 
	//int arr[3] = { 10,20,30 };
	//int* ptr = arr;
	//
	//printf("%p %p %p \n", &arr[0], &arr[1], &arr[2]);
	//printf("%p \n", arr);
	//
	//printf("%d \n", *arr);
	//printf("%d \n", *(arr+1));
	//printf("%d \n", *(arr + 2)); // 배열의 이름 이용해서 각각 요소에 접근하기 

	//printf("%d \n", ptr[0]); //포인터 변수를 이용해서 배열에 접근 
	//printf("%d \n", arr[0]); //배열은 상수 형태의 포인터여서 첫번째 주소만 가지고 있어야한다.
	//printf("%d \n", *arr);
	//printf("%d \n", *ptr);

	//예제 작성 후 그림으로 표현
	int num1 = 10, num2 = 20, num3 = 30;

	int* ptr1 = &num1;
	int* ptr2 = &num2;
	int* ptr3 = &num3;

	int* ptrArr[] = { ptr1, ptr2, ptr3 };
	int** dptr = ptrArr;

	printf("%d %d %d\n", *(ptrArr[0]), *(ptrArr[1]), *(ptrArr[2]));
	printf("%d %d %d\n", *(dptr[0]), *(dptr[1]), *(dptr[2]));





	return 0;
}

int Swap(int *n1, int *n2) {
	int temp;
	
	temp = *n1;
	*n1 = *n2;
	*n2 = temp;
	
} 