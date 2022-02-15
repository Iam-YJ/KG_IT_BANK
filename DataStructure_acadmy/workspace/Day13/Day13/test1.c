//#include <stdio.h>
//#include <stdlib.h>
//#define EMPTY 0
//
////자료구조 DoubleLinkedList
//
//typedef struct node {
//    int data;
//    struct node* right;
//    struct node* left;
//} DoubleLink;
//
//DoubleLink* GetNode() {
//    DoubleLink* tmp = (DoubleLink*)malloc(sizeof(DoubleLink));
//    tmp->right = EMPTY;
//    tmp->left = EMPTY;
//    return tmp;
//}
//
//void Insert(DoubleLink** head, int data) {
//
//    if ((*head) == NULL) { //첫 번째 노드 할당 
//        *head = GetNode();
//        (*head)->data = data;
//        return;
//    }
//    else {
//        Insert(&(*head)->right, data);
//        (*head)->right->left = *head;
//    }
//}
//
//void Add(DoubleLink** head, int data1, int data2) {
//    DoubleLink* tmp = NULL;
//
//    if (!(*head)) {
//        printf("없어용 \n");
//    }
//    else if ((*head)->data == data1) {
//        Insert(&tmp, data2);
//        tmp->left = *head;
//        tmp->right = (*head)->right;
//        (*head)->right = tmp; //이전 노드의 rlink 연결
//        (*head)->right->left = tmp; // 이후 노드의 llink 연결
//    }
//    else {
//        Add(&(*head)->right, data1, data2);
//    }
//
//
//}
//
//void Output(DoubleLink **head) {
//
//    if (*head) {
//        printf("%d ", (*head)->data);
//        Output(&(*head)->right);
//    }
//
//}
//
//void Delete(DoubleLink** head, int data) {
//    DoubleLink* tmp = NULL;
//
//    if ((*head)->data == data) {
//        tmp = *head;
//
//        if ((*head)->right = NULL) { //마지막 노드 삭제
//            (*head) = NULL;
//        }
//        else { //처음과 중간노드 삭제 
//            *head = (*head)->right;
//            (*head)->left = (*head)->left->left;
//        }
//        free(tmp);
//
//    }
//    else {
//        Delete(&(*head)->right, data);
//   
//    }
//
//}
//
//
////add - null 값 케이스별로 체크하기
////delete - null값 케이스별로 체크하기 
//
//
//int main(void) {
//    DoubleLink* head = EMPTY;
//    DoubleLink* rear = EMPTY;
//
//    Insert(&head, 10);
//    Insert(&head, 20);
//    Insert(&head, 30);
//    Output(&head);
//    printf("insert 끝 \n");
//
//
//    Add(&head, 10, 15);
//    Output(&head);
//    printf("add 끝 \n");
//
//    Delete(&head, 10);
//  //  Delete(&head, 30);
//    Output(&head);
//    printf("delete 끝 \n");
//  
// 
//
//
//
//    return 0;
//}




