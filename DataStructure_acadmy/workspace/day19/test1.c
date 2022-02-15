#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

int n, m;
int* a[1001];

typedef struct node
{
    int data;
    int ga;
    struct node* link;
}Linklist;

Linklist* GetNode()
{
    Linklist* tmp;
    tmp = (Linklist*)malloc(sizeof(Linklist));
    tmp->link = NULL;
    return tmp;
}



void Insert(Linklist** head, int data, int ga)
{
    if (*head == NULL)
    {
        *head = GetNode();
        (*head)->data = data;
        (*head)->ga = ga;
        return;
    }
    Insert(&(*head)->link, data, ga);
}




int main(void) {
    int n, m;
    int x, y, g;

    Linklist* head = NULL;

    //���� ����Ʈ - ����, ����ġ ǥ���ؾ���

    printf("������ ������ �Է��ϼ��� \n");
    scanf("%d", &n);

    for (int i = 1; i < n+1; i++) {
        a[i] = 1;
    }

    printf("������ ������ �Է��ϼ��� \n");
    scanf("%d", &m);
    
    for (int i = 0; i < m; i++) {
        printf("������ ������ ����ġ�� �Է��ϼ���  \n");
        scanf("%d %d %d", &x,&y,&g);

        if (a[i] == 1) {
            a[i] = GetNode();
            
        }
    }
        
    printf("");



    return 0;
}





