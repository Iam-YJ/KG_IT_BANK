#include <stdio.h>

int a[1001][1001];
int n, m;

int main(void) {

	//���� ���  - ������ ���� , ������ ���� �Է¹ޱ� ,��𿡼� ��� ����Ǵ� ���� �Է¹ޱ�

	printf("������ ������ ������ ������ �Է��ϼ��� \n");
	scanf("%d %d", &n, &m);
	for (int i = 0; i < m; i++) {
		int x, y;
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