#include <stdio.h>
int Swap(int num1, int num2);

int main() {

	//������
	//int num;
	//int *ptr = &num; //num�� �ּҸ� ptr�� �ִ´�
	//*ptr = 10; //�����ͺ��� ptr�� ����Ű�� ������ ���� 10�� ��������
	//int** dptr = &ptr; //����� �ڷ����� �״��! �����´� 
	//int*** tptr = &dptr;


	/*printf("%d %d\n", num, *ptr);
	printf("%d\n", sizeof(ptr));*/

	// printf("%p %p\n",ptr,ptr+1);
	
	//���� ������
	/*printf("%d\n", num);
	printf("%d\n", *ptr);
	printf("%d\n", **dptr);
	printf("%d\n", ***tptr);*/

	//�����ϰ� �޸� ���� �׸����� ǥ��
	//int num = 10;
	//int* ptr1 = &num;
	//int* ptr2 = ptr1;

	//(*ptr1)++;
	//(*ptr2)++;

	//printf("%d \n", num);


	//���� ���� 2
	/*int num1 = 10, num2 = 20;

	printf("%d %d\n", num1, num2);
	Swap(&num1, &num2);
	printf("%d %d\n", num1, num2);*/


	//�����Ϳ� �迭 
	//int arr[3] = { 10,20,30 };
	//int* ptr = arr;
	//
	//printf("%p %p %p \n", &arr[0], &arr[1], &arr[2]);
	//printf("%p \n", arr);
	//
	//printf("%d \n", *arr);
	//printf("%d \n", *(arr+1));
	//printf("%d \n", *(arr + 2)); // �迭�� �̸� �̿��ؼ� ���� ��ҿ� �����ϱ� 

	//printf("%d \n", ptr[0]); //������ ������ �̿��ؼ� �迭�� ���� 
	//printf("%d \n", arr[0]); //�迭�� ��� ������ �����Ϳ��� ù��° �ּҸ� ������ �־���Ѵ�.
	//printf("%d \n", *arr);
	//printf("%d \n", *ptr);

	//���� �ۼ� �� �׸����� ǥ��
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