#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//자료구조
//Stack - push & pop
//struct node {
//    int data;
//    struct node* link;
//};
//typedef struct node Stack;
//
//Stack* GetNode() {
//    Stack* tmp;
//    tmp = (Stack*)malloc(sizeof(Stack));
//    tmp->link = EMPTY;
//    return tmp;
//}
//
//void Pop(Stack** top);
//void Push(Stack** top, int data);
//
//void Push(Stack** top, int data) {
//    Stack* tmp;
//    tmp = *top;
//    *top = GetNode();
//    (*top)->data = data;
//    (*top)->link = tmp;
//}
//
//void Pop(Stack** top) {
//    Stack* tmp;
//    tmp=(*top);
//    if ((*top) == EMPTY) {
//        printf("Stack is empty \n");
//        return;
//    }
//    printf("%d\n", (*top)->data);
//    *top = (*top)->link;
//    free(tmp);
//
//}

//struct node {
//    int data;
//    struct node* link;
//};
//typedef struct node Stack;
//
//Stack* GetNode() {
//    Stack* tmp;
//    tmp = (Stack*)malloc(sizeof(Stack));
//    tmp->link = EMPTY;
//    return tmp;
//}

struct node {
    int data;
    struct node* link;
}; typedef struct node Queue;

Queue* GetNode() {
    Queue* tmp;
    tmp = (Queue*)malloc(sizeof(Queue));
    return tmp;
}


void Insert(Queue **front,int data) {
    (*front) = GetNode();
    (*front)->link = front;
    (*front)->data = data;
    printf("%d\n", (*front)->data);
}

void Delete(Queue**rear) {
    (*rear) = (*front)->data;



}


int main() {
    //자료구조
    //Stack 예시
    //Stack* top = EMPTY;
    //Push(&top, 10);
    //Push(&top, 20);
    //Push(&top, 30);

    //Pop(&top);
    //Pop(&top);
    //Pop(&top);
    //Pop(&top); //예외 상황 


    //Queue 예시
    Queue* front;
    Queue* rear;

    Insert(&front,10);
    Insert(&front, 20);
    Insert(&front, 30);
    Delete(&front);
    




    return 0;
}





