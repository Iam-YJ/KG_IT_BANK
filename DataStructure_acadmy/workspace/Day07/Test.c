#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0



//����4
//typedef struct
//{
//   char* name;
//   int score;
//}Element;
//
//typedef struct
//{
//   int data1;
//   int data2;
//   Element* p;
//}Data1;

//����5
//typedef struct
//{
//    int data3;
//    int data4;
//}Data2;
//typedef struct
//{
//    int data1;
//    int data2;
//    Data2* p;
//}Data1;

//�ڷᱸ��
struct node {
    int data;
    struct node* link;
};
typedef struct node Stack;

Stack* GetNode() {
    Stack* tmp;
    tmp = (Stack*)malloc(sizeof(Stack));
    tmp->link = EMPTY;
    return tmp;
}

void Func2(Data2* p2);
void Func3(Data1*** p);


//void Func1(Data1** p) //p�� �����ϴ� data1*�� ���� 
//{
//    Data2* p2 = (Data2*)malloc(sizeof(Data2));
//    (*p)->p = p2;
//
//    Func2((*p)->p);
//    //Func2()�Լ��� ���� Func2()�ȿ��� data3�� 100�� ��������. 
//    Func3(&p);
//    //Func3()�Լ��� ���� Func3()�ȿ��� data4�� 200�� ��������.
//}

//void Func2(Data2* p) {
//    p->data3 = 100;
//}
//
//void Func3(Data1*** p) {
//    
//    (**p)->p->data4 = 200;
// 
//}

void Push(Stack** top, int data) {
    Stack* tmp;
    tmp = *top;
    *top = GetNode();
    (*top)->data = data;
    (*top)->link = tmp;
}

int main() {

    //����4
    //Data1* p = (Data1*)malloc(sizeof(Data1));
    //p->p = (Element*)malloc(sizeof(Element));

    //printf("�̸��� �Է��ϼ��� : ");
    ////scanf()�� �̿��� name�� �̸��� �Է� ��������.
    //scanf("%s", &(p->p->name));
    //printf("������ �Է��ϼ��� : ");
    ////scanf()�� �̿��� score�� ������ �Է� ��������.
    //scanf("%d", &(p->p->score));
    ////�Է¹��� ���� ����ϼ���.
    //printf("�̸��� : %s", &(p->p->name));
    //printf("������ : %d", (p->p->score));
    ////���� ���� �ڵ带 �߰��ϼ���.
    //free(p);


    //����5
    //Data1* p = (Data1*)malloc(sizeof(Data1));
    //Func1(&p);
    ////data3�� data4�� ����ϼ���.
    //printf("%d\n", p->p->data3);
    //printf("%d\n", p->p->data4);
    //free(p->p);
    //free(p);

    
    //�ڷᱸ��
    //�ڵ�1 �ۼ� - ���� �ľ� - ���ο��� push1 �ϰ��� ��Ȳ �׸���
    Stack* top = EMPTY;
    Push(&top, 10);
    Push(&top, 20);
    Push(&top, 30);



    return 0;
}





