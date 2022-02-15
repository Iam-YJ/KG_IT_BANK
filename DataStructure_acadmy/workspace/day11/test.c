#include <stdio.h>
#include <stdlib.h>


//�ڷᱸ��
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
        printf("output ���� %d \n", (*head)->data);
        Output(&(*head)->link);
    }

}

//search - ���� ����Ʈ�� ���� ã�����ϴ� �Լ��� �ִ��� . ������ o ������ x
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

//add - �߰��� �����ϴ� ����, ���� ���ϴ� ��ġ�� ������ ��.. 
void Add(Linklist **head,int data1, int data2) {
    Linklist* tmp = NULL;
    
    if (!(*head)) {
        printf("����� \n");
    } else if ((*head)->data == data1) {
        Insert(&tmp, data2);
        tmp->link = (*head)->link;
        (*head)->link = tmp;
    }
    else {
        Add(&(*head)->link, data1, data2);
    }
    
  
}

//delete - ���� ����Ʈ�� �ִ� ���� ���� , ���� ���ϴ� �� 
void Delete(Linklist**head, int data) {
    Linklist* tmp;

    if (!(*head)) {
        printf("������ \n");
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
    printf("�߰��� ���� %d\n", head->data);
    Insert(&head, 20);
    printf("�߰��� ���� %d\n", head->link->data);
    Insert(&head, 30);
    printf("�߰��� ���� %d\n", head->link->link->data);
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





