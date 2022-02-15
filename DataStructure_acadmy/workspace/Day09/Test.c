#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//자료구조 Queue

typedef struct node {
	int data;
	struct node* link;
} Queue;

Queue* GetNode() {
	Queue* tmp = (Queue*)malloc(sizeof(Queue));
	tmp->link = EMPTY;
	return tmp;
}

void Insert(Queue **front, Queue**rear, int data) {
	
	if ((*front) == NULL) {
		(*front) = GetNode();//겟노드에서 tmp의 주소값을 반환하는데, 이거를 프론트에 저장할꺼여
		(*rear) = (*front);
		//(*rear) = (*front)->link; 왜지 ㅜㅜ? - 첫번째 상황이여서 FRONT가 가르키는 LINK가 없다
		(*front)->data = data;
	}else {
		(*rear) = GetNode();
		(*rear)->data = data;
		(*front)->link = (*rear) ;
	}
	

}

void Delete(Queue** front) {
	Queue* tmp;
	tmp = *front;
	printf("지우는 수는 %d \n", (tmp)->data);
	*front = (*front)->link;
	free(tmp);

}


int main(void) {
	Queue* front = EMPTY;
	Queue* rear = EMPTY;

	Insert(&front, &rear, 10);
	printf("%d %d\n",front->data,rear->data);
	Insert(&front, &rear, 20);
	printf("%d %d\n", front->data, rear->data);
	Insert(&front, &rear, 30);
	printf("%d %d\n", front->data, rear->data);
	printf("%d \n", (front)->link);
	printf("%d %d %d", (front)->link, (front)->link->link, (front)->link->link->link);
	
	
	Delete(&front);
	Delete(&front);
	Delete(&front);



	

	
	return 0;
}






