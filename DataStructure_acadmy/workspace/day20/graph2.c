#include <stdio.h>
#define EMPTY 0

int a[1001][1001];
int n, m;
int x, y;

typedef struct {
	int index;
	struct node* link;
}node;

node* GetNode() {
	node* tmp;
	tmp = (node*)malloc(sizeof(node));
	tmp->link = EMPTY;
	return tmp;
}

void Pop() {
	
	for (int i = 0; i <= n; i++) {
		node** b = (node**)malloc(sizeof(node*) * n + 1);
		if (a[x][y] == 1) {
			b[x] = x;
			

		}
	}
}

int main(void) {

	//���� ���  - ������ ���� , ������ ���� �Է¹ޱ� ,��𿡼� ��� ����Ǵ� ���� �Է¹ޱ�

	printf("������ ������ ������ ������ �Է��ϼ��� \n");
	scanf("%d %d", &n, &m);
	for (int i = 0; i < m; i++) {
		
		printf("������ ������ �Է��ϼ��� \n");
		scanf("%d %d", &x, &y);
		a[x][y] = 1;
		a[y][x] = 1;
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			printf("%d ", a[i][j]);

		}printf("\n");
	}

	//���� ����Ʈ - ����, ����ġ 

	return 0;
}