#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//�ڷᱸ�� Queue
//typedef struct node {
//	int data;
//	struct node* link;
//} Queue;
//
//Queue* GetNode() {
//	Queue* tmp = (Queue*)malloc(sizeof(Queue));
//	tmp->link = EMPTY;
//	return tmp;
//}
//
//void Insert(Queue** front, Queue** rear, int data) {
//	Queue* tmp;
//	if ((*front) == NULL) {
//		(*front) = GetNode();//�ٳ�忡�� tmp�� �ּҰ��� ��ȯ�ϴµ�, �̰Ÿ� ����Ʈ�� �����Ҳ���
//		(*rear) = (*front);
//		//(*rear) = (*front)->link; ���� �̤�? - ù��° ��Ȳ�̿��� FRONT�� ����Ű�� LINK�� ����
//	}
//	else {
//		(*rear)->link = GetNode();
//		*rear = (*rear)->link;
//		
//	}
//	(*rear)->data = data;
//
//}
//
//void Delete(Queue** front) {
//	Queue* tmp;
//	tmp = *front;
//	printf("����� ���� %d \n", (tmp)->data);
//	if (*front == EMPTY) {
//		printf("Queue is empty\n");
//	}
//	*front = (*front)->link;
//	free(tmp);
//
//}

//List
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

//Output �Լ�, ��ͷ�, 10..30 �� 
void Output(Linklist** head) {
	Linklist* tmp = (*head)->link;

	if (*head == NULL)
	{
		printf("����� ���� %d\n", (*head)->data);
		free(head);

		return;
	}
	printf("����� ���� %d\n", (*head)->data);
	free(head);
	Output((tmp)->link);
	
}



int main(void) {
	////�ڷᱸ�� Queue
	//Queue* front = EMPTY;
	//Queue* rear = EMPTY;

	//Insert(&front, &rear, 10);
	//printf("%d %d\n", front->data, rear->data);
	//Insert(&front, &rear, 20);
	//printf("%d %d\n", front->data, rear->data);
	//Insert(&front, &rear, 30);
	//printf("%d %d\n", front->data, rear->data);
	//
	//Delete(&front);
	//Delete(&front);
	//Delete(&front);


	//List
	Linklist* head = NULL;

	Insert(&head, 10);
	printf("�߰��� ���� %d\n", head->data);
	Insert(&head, 20);
	printf("�߰��� ���� %d\n", head->link->data);
	Insert(&head, 30);
	printf("�߰��� ���� %d\n", head->link->link->data);


	Output(&head);
	Output(&head);
	Output(&head);


	return 0;
}






