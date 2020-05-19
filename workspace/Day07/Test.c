#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0



//문제4
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

//문제5
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

//자료구조
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


//void Func1(Data1** p) //p를 저장하는 data1*의 형태 
//{
//    Data2* p2 = (Data2*)malloc(sizeof(Data2));
//    (*p)->p = p2;
//
//    Func2((*p)->p);
//    //Func2()함수를 만들어서 Func2()안에서 data3에 100을 넣으세요. 
//    Func3(&p);
//    //Func3()함수를 만들어서 Func3()안에서 data4에 200을 넣으세요.
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

    //문제4
    //Data1* p = (Data1*)malloc(sizeof(Data1));
    //p->p = (Element*)malloc(sizeof(Element));

    //printf("이름을 입력하세요 : ");
    ////scanf()를 이용해 name에 이름을 입력 받으세요.
    //scanf("%s", &(p->p->name));
    //printf("점수를 입력하세요 : ");
    ////scanf()를 이용해 score에 점수를 입력 받으세요.
    //scanf("%d", &(p->p->score));
    ////입력받은 값을 출력하세요.
    //printf("이름은 : %s", &(p->p->name));
    //printf("점수는 : %d", (p->p->score));
    ////동적 해제 코드를 추가하세요.
    //free(p);


    //문제5
    //Data1* p = (Data1*)malloc(sizeof(Data1));
    //Func1(&p);
    ////data3와 data4를 출력하세요.
    //printf("%d\n", p->p->data3);
    //printf("%d\n", p->p->data4);
    //free(p->p);
    //free(p);

    
    //자료구조
    //코드1 작성 - 구조 파악 - 메인에서 push1 하고나서 상황 그리기
    Stack* top = EMPTY;
    Push(&top, 10);
    Push(&top, 20);
    Push(&top, 30);



    return 0;
}





