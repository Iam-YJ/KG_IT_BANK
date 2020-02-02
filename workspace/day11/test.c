#include <stdio.h>
#include <stdlib.h>


//자료구조
//LinkedList
typedef struct node
{
    int data;
    struct node* link;
}Linklist;

Linklist* GetNode()
{
    Linklist* tmp;
    tmp = (Linklist*)malloc(sizeof(Linklist));
    tmp->link = NULL;
    return tmp;
}

void Insert(Linklist** head, int data)
{
    if (*head == NULL)
    {
        *head = GetNode();
        (*head)->data = data;
        return;
    }
    Insert(&(*head)->link, data);
}


void Output(Linklist** head) {
   
    if (*head != NULL) {
        printf("output 수는 %d \n", (*head)->data);
        Output(&(*head)->link);
    }

}

//search - 현재 리스트에 내가 찾고자하는 함수가 있는지 . 있으면 o 없으면 x
void Search(Linklist** head, int data) {
 
    if ((*head)->data == data) {
        printf("%d SEARCH! \n", data);

    }
    else {
        if ((*head)->link == NULL) {
            printf("%d Not exit! \n", data);
            return;
        }
        Search(&(*head)->link,data);
    }

}

//add - 중간에 삽입하는 목적, 내가 원하는 위치랑 데이터 뒤.. 
void Add(Linklist **head,int data1, int data2) {
    Linklist* tmp = NULL;
    
    if (!(*head)) {
        printf("없어용 \n");
    } else if ((*head)->data == data1) {
        Insert(&tmp, data2);
        tmp->link = (*head)->link;
        (*head)->link = tmp;
    }
    else {
        Add(&(*head)->link, data1, data2);
    }
    
  
}

//delete - 현재 리스트에 있는 것을 삭제 , 내가 원하는 값 
void Delete(Linklist**head, int data) {
    Linklist* tmp;

    if (!(*head)) {
        printf("없음용 \n");
    }
    else if ((*head)->data == data) {
        tmp = *head;
        *head = (*head)->link;
        free(tmp);
    }
    else {
        Delete(&(*head)->link, data);
    }
}

int main(void) {
    //List
    Linklist* head = NULL;

    Insert(&head, 10);
    printf("추가된 수는 %d\n", head->data);
    Insert(&head, 20);
    printf("추가된 수는 %d\n", head->link->data);
    Insert(&head, 30);
    printf("추가된 수는 %d\n", head->link->link->data);
    printf("\n");

    Output(&head);
    printf("\n");

   Search(&head,25);
   printf("\n");


    Add(&head,10,15);
    printf("\n");

    Output(&head);
    printf("\n");

    Delete(&head, 20);
    Output(&head);
    printf("\n");

    return 0;
}





