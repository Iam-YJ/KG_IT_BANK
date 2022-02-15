#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//자료구조 Queue
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
//		(*front) = GetNode();//겟노드에서 tmp의 주소값을 반환하는데, 이거를 프론트에 저장할꺼여
//		(*rear) = (*front);
//		//(*rear) = (*front)->link; 왜지 ㅜㅜ? - 첫번째 상황이여서 FRONT가 가르키는 LINK가 없다
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
//	printf("지우는 수는 %d \n", (tmp)->data);
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

//Output 함수, 재귀로, 10..30 순 
void Output(Linklist** head) {
	Linklist* tmp = (*head)->link;

	if (*head == NULL)
	{
		printf("지우는 수는 %d\n", (*head)->data);
		free(head);

		return;
	}
	printf("지우는 수는 %d\n", (*head)->data);
	free(head);
	Output((tmp)->link);
	
}



int main(void) {
	////자료구조 Queue
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
	printf("추가된 수는 %d\n", head->data);
	Insert(&head, 20);
	printf("추가된 수는 %d\n", head->link->data);
	Insert(&head, 30);
	printf("추가된 수는 %d\n", head->link->link->data);


	Output(&head);
	Output(&head);
	Output(&head);


	return 0;
}






