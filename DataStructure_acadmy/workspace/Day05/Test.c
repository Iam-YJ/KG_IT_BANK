#include <stdio.h>
#include <stdlib.h>

//char name[10];

char* Name() {

	char* name = (char*)malloc(sizeof(char)*20);
	printf("What's your name? \n");
	scanf("%s", name);

	return name;
}

typedef struct
{
	int data1;
	int data2;
}Data1;




int main() {
	//�����Ҵ�
	
	//����1 �ۼ� �� ������ ã��
	//������ ������������ > ���������� �ϸ� �ȴ�
	//char* name1, * name2;

	//name1 = Name();
	//name2 = Name();
	//printf("Your name is %s.\n", name1);
	//printf("Your name is %s.\n", name2);

	//free(name1);
	//free(name2);

	//int * ptr = (int*)malloc(sizeof(int)); //void *_cdecl malloc(size_t_Size)
	// �ּҸ� ��ȯ�Ѵ� (void ��������)
	//*ptr = 10;
	//printf("%d \n", *ptr);
	//free(ptr); //void_cded free(void *_Block) //���� �����ϰ����ϴ� ������ �ּ�

	//����2 - �׸��� ���� �ڵ带 �ۼ��ض�
	//int* ptr = (int*)malloc(sizeof(int)*5);
	//for (int i = 0; i < 5; i++) {
	//	ptr[i] = (i + 1) * 10;
	//	printf("%d ", ptr[i]);
	//}
	//printf("\n");

	//����2 ���ο� Ǯ��
	//int arr[20] = { 10,20,30,40,50 };
	//int* ptr = (int*)malloc(sizeof(int)*5); //~~ ������ ũ�⸸ ������ ��
	//ptr = arr; // ���� arr�� ptr�� ����? ���� 
	//printf("%d %d", *ptr, *(ptr + 1));


	//����1
	Data1* p = (Data1*)malloc(sizeof(Data1));
	Func1(&p);
	//Func1()�Լ��� ���� Func1()�ȿ��� data1�� 100�� ��������.
	Func2(*p);
	//Func2()�Լ��� ���� Func2()�ȿ��� data2�� 200�� ��������.	
	//data1�� data2�� ����ϼ���.
	// �������� �ڵ带 �߰��ϼ���.
	free(p->data1);
	free(p->data2);

	return 0;
}

void Func1(Data1 *p) {
	(*p).data1 = 100;
	printf("%d", (*p).data1);
}

void Func2(Data1 p) {
	p.data1 = 200;
	printf("%d", p.data1);
}


