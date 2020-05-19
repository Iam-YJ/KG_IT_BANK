//#include <stdio.h>
//#include <stdlib.h>
//#define EMPTY 0
//
//int n, m;
//int* a[1001];
//
//typedef struct 
//{
//    int distance;
//    int index;
//    struct Node* next;
//}Node;
//
//
//
//void Add(Node* head, int index, int distance) {
//
//    Node* tmp = (Node*)malloc(sizeof(Node));
//    tmp->index = index;
//    tmp->distance = distance;
//    tmp->next = head->next;
//    head->next = tmp;
//}
//
//void Show(Node* head) {
//    Node* cur = head->next;
//
//    while (cur != NULL) {
//        printf("[%d](거리:%d) ", cur->index, cur->distance);
//        cur = cur->next;
//    }
//}
//
//void Push() {
//
//}
//
//
//int main(void) {
//
//    int v, e;
//    printf("정점, 간선 수 : ");
//    scanf("%d %d", &v, &e);
//    Node** a = (Node**)malloc(sizeof(Node*) * v + 1);
//
//    for (int i = 0; i <= v; i++) {
//        a[i] = (Node*)malloc(sizeof(Node));
//        a[i]->next = NULL;
//    }
//
//    for (int i = 0; i < e; i++) {
//        int v1, v2, d;
//        printf("정점1, 정점2, 거리 : ");
//        scanf("%d %d %d", &v1, &v2, &d);
//        Add(a[v1], v2, d);
//    }
//    printf("\n\n");
//
//    for (int i = 0; i <= v; i++) {
//        printf("[%d] ->", i);
//        Show(a[i]);
//        printf("\n");
//    }
//
//
//
//    return 0;
//}
//
//
//
//
//
