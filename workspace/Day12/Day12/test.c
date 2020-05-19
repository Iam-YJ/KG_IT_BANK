#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//자료구조 DoubleLinkedList

typedef struct node {
    int data;
    struct node* right;
    struct node* left;
} DoubleLink;

DoubleLink* GetNode() {
    DoubleLink* tmp = (DoubleLink*)malloc(sizeof(DoubleLink));
    tmp->right = EMPTY;
    tmp->left = EMPTY;
    return tmp;
}

void Insert(DoubleLink** head, int data) {

    if ((*head) == NULL) { //첫 번째 노드 할당 
        *head = GetNode();
        (*head)->data = data;
        return;
    }
    else {
        Insert(&(*head)->right, data);
        (*head)->right->left = *head;
    }
}

void Add(DoubleLink** head,int data1, int data2) {
    DoubleLink* ltmp = (*head)->right;
    DoubleLink* rtmp = (*head)->right->left;

    if (data1 == 1) {
       
        if ((*head)->data = data1) {
            head = &(*head)->right;
            (*head) = GetNode();
            (*head)->data = data2;
            (*head)->right = ltmp;
            ltmp = (*head)->right;
            (*head)->left = head;
            return;
        }
    }
    else {
        Add(&(*head)->right, data1, data2);
    }
   

   
}

//add - null 값 케이스별로 체크하기
//delete - null값 케이스별로 체크하기 


int main(void) {
    DoubleLink* head = EMPTY;
    DoubleLink* rear = EMPTY;

    Insert(&head, 10);
    printf("%d \n", head->data);

    Insert(&head, 20);
    printf("%d \n", head->right->data);
    printf("하나 뒤로 %d \n", head->right->left->data);

    Insert(&head, 30);
    printf("%d \n", head->right->right->data);
    printf("하나 뒤로 %d \n", head->right->right->left->data);

    Add(&head, 1, 15);
    printf("%d \n", head->data);
    printf("%d \n", head->right->data);

    Add(&head, 2, 30);
    printf("%d \n", head->data);
    printf("%d \n", head->right->data);
    printf("%d \n", head->right->right->data);


    return 0;
}





