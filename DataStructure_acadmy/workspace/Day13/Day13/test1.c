//#include <stdio.h>
//#include <stdlib.h>
//#define EMPTY 0
//
////�ڷᱸ�� DoubleLinkedList
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
//    if ((*head) == NULL) { //ù ��° ��� �Ҵ� 
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
//        printf("����� \n");
//    }
//    else if ((*head)->data == data1) {
//        Insert(&tmp, data2);
//        tmp->left = *head;
//        tmp->right = (*head)->right;
//        (*head)->right = tmp; //���� ����� rlink ����
//        (*head)->right->left = tmp; // ���� ����� llink ����
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
//        if ((*head)->right = NULL) { //������ ��� ����
//            (*head) = NULL;
//        }
//        else { //ó���� �߰���� ���� 
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
////add - null �� ���̽����� üũ�ϱ�
////delete - null�� ���̽����� üũ�ϱ� 
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
//    printf("insert �� \n");
//
//
//    Add(&head, 10, 15);
//    Output(&head);
//    printf("add �� \n");
//
//    Delete(&head, 10);
//  //  Delete(&head, 30);
//    Output(&head);
//    printf("delete �� \n");
//  
// 
//
//
//
//    return 0;
//}




