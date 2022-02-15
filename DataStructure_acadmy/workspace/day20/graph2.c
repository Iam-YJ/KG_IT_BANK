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

	//인접 행렬  - 정점의 갯수 , 간선의 갯수 입력받기 ,어디에서 어디 연결되는 건지 입력받기

	printf("정점의 갯수와 간선의 갯수를 입력하세요 \n");
	scanf("%d %d", &n, &m);
	for (int i = 0; i < m; i++) {
		
		printf("연결할 간선을 입력하세요 \n");
		scanf("%d %d", &x, &y);
		a[x][y] = 1;
		a[y][x] = 1;
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			printf("%d ", a[i][j]);

		}printf("\n");
	}

	//인접 리스트 - 방향, 가중치 

	return 0;
}