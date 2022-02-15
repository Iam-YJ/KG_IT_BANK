#include <stdio.h>
#include <stdlib.h>


//����1
//typedef struct
//{
//	int data1;
//	int data2;
//}Data1;

//����2
//typedef struct
//{
//	char name[20];
//	int score;
//}Element;
//
//typedef struct
//{
//	int data1;
//	int data2;
//	Element p;
//}Data1;


//����3
//typedef struct
//{
//	char name[20];
//	int score;
//}Element;
//
//typedef struct
//{
//	int data1;
//	int data2;
//	Element* p;
//}Data1;

//����4
typedef struct
{
	char* name;
	int score;
}Element;

typedef struct
{
	int data1;
	int data2;
	Element* p;
}Data1;

void Func1(Data1** p);
void Func2(Data1 p);

int main() {

	////����1
	//Data1* p = (Data1*)malloc(sizeof(Data1));
	////Func1()�Լ��� ���� Func1()�ȿ��� data1�� 100�� ��������.
	////Func2()�Լ��� ���� Func2()�ȿ��� data2�� 200�� ��������.
	//Func1(&p);
	//Func2(p);
	////data1�� data2�� ����ϼ���.
	//printf("%d\n", p->data1);//�Լ��� ����ǰ� �� �������� ������ �Ҹ�Ǵϱ� p�� ����Ŵ
	//printf("%d\n", p->data2);
	//// �������� �ڵ带 �߰��ϼ���.
	//free(p); //���� �����ϰ��� �ϴ� �ּҰ� 


	//����2
	//Data1* p = (Data1*)malloc(sizeof(Data1));

	//printf("�̸��� �Է��ϼ��� : ");
	////scanf()�� �̿��� name�� �̸��� �Է� ��������.
	//scanf("%s", p->p.name);
	//fflush(stdin);
	//printf("������ �Է��ϼ��� : ");
	////scanf()�� �̿��� score�� ������ �Է� ��������.
	//scanf("%d", &(p->p.score));
	////�Է¹��� ���� ����ϼ���.
	//printf("�̸��� %s\n", p->p.name);
	//printf("������ %d\n", p->p.score);


	//����3
	//Data1* p = (Data1*)malloc(sizeof(Data1));
	//p->p = (Element*)malloc(sizeof(Element));

	//printf("�̸��� �Է��ϼ��� : ");
	////scanf()�� �̿��� name�� �̸��� �Է� ��������.
	//scanf("%s", p->p->name);
	////scanf()�� �̿��� score�� ������ �Է� ��������.
	//printf("������ �Է��ϼ��� : ");
	//scanf("%d", &(p->p->score));
	////�Է¹��� ���� ����ϼ���.
	//printf("�̸��� %s", p->p->name);
	//printf("������ %d", p->p->score);
	////���� ���� �ڵ带 �߰��ϼ���.
	//free(p);


	//����4
	Data1* p = (Data1*)malloc(sizeof(Data1));
	p->p = (Element*)malloc(sizeof(Element));
	printf("�̸��� �Է��ϼ��� : ");
	//scanf()�� �̿��� name�� �̸��� �Է� ��������.
	scanf("%s", &(p->p->name));
	printf("������ �Է��ϼ��� : ");
	//scanf()�� �̿��� score�� ������ �Է� ��������.
	scanf("%d", (p->p->score));
	//�Է¹��� ���� ����ϼ���.
	printf("�̸��� %s", p->p->name);
	printf("������ %d", p->p->score);
	//���� ���� �ڵ带 �߰��ϼ���.
	free(p);

	return 0;

}

void Func1(Data1* *p) {//�Լ��� �ּҰ��� �ޱ⸦ ������ 
	(**p).data1 = 100;
	//(*p)->data1=100;
}

void Func2(Data1* p) {
	p->data2 = 200;
}