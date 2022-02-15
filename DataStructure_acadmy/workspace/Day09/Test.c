#include <stdio.h>
#include <stdlib.h>
#define EMPTY 0

//�ڷᱸ�� Queue

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
		(*front) = GetNode();//�ٳ�忡�� tmp�� �ּҰ��� ��ȯ�ϴµ�, �̰Ÿ� ����Ʈ�� �����Ҳ���
		(*rear) = (*front);
		//(*rear) = (*front)->link; ���� �̤�? - ù��° ��Ȳ�̿��� FRONT�� ����Ű�� LINK�� ����
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
	printf("����� ���� %d \n", (tmp)->data);
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






