#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void main() {

	//����
	/*  int score;
	int i;
	int sum = 0;
	int ave = 0;
	int arr[5];

	printf("������ �Է��ϼ���");
	for (i = 0; i < 5; i++) {
	scanf("%d", &score);
	arr[i] = score;
	}


	for (i = 0; i < 5; i++) {
	sum += arr[i];

	printf("%d�� �л� ���� : %d\n", (i + 1), arr[i]);
	}
	ave = sum / 5;
	printf("�� ���� %d ���̰� ����� %d �Դϴ�", sum, ave);*/


	//���� Ǯ��
	//int jumsu[5];
	//int i, sum = 0;
	//double avg = 0;
	//int size;

	//size = sizeof(jumsu) / sizeof(jumsu[0]);

	//for(i=0; i<size; i++){
	//	printf("%d�� �л� ���� : \n",(i+1));
	//	scanf("%d",&jumsu[i]);

	//	sum += jumsu[i];
	//}

	//avg = (double) sum / size;
	//printf("�� ���� %d ���̰� ����� %.2lf �Դϴ�", sum, avg);

	//rand �Լ�
	//int i;
	//
	//srand(time(NULL));
	//for(i=0; i<5; i++){
	//	if(i==0){
	//		printf("random :\n");
	//	}
	//	 printf("%c\t", (rand()%26) + 65);
	//	
	//	  printf("%d\t\n", (rand()%26) + 65);
	//}
	//printf("\n");

	//������ ���� 5���� �����ؼ� �ִ밪 ���ϱ�
	//int i;
	//int arr [5];
	//int min = 0;
	//int max = 0;
	//int range ;

	//srand(time(NULL));

	//printf("���� �Է� : \n" );
	//scanf("%d", &range);

	//for(i=0; i<5; i++){
	//	arr[i] = rand()*range;
	//}

	//max = arr[0];
	//for(i=1; i<=4; i++){
	//	if(max < arr[i]){
	//		max = arr[i];
	//	}
	//}

	//for(i=0; i<5; i++){
	//	printf("%d\t\n",arr[i]);
	//	_sleep(1000);
	//}
	//printf("�ִ밪�� %d\n",max);


	//�ʱ�ȭ
	//int a[5];
	//int b[5] = {1,2,3,4,5};
	//int c[5] = {1};
	//int d[] = {1,2,3,4,5};
	//int i;

	//char str[] = "C language";

	//for(i=0; i<5; i++){
	//	printf("a[%d] = %d\n",i, a[i]);
	//}
	//printf("\n");
	//for(i=0; i<5; i++){
	//	printf("b[%d] = %d\n",i, b[i]);
	//}
	//printf("\n");
	//for(i=0; i<5; i++){
	//	printf("c[%d] = %d\n",i, c[i]);
	//}
	//printf("\n");
	//for(i=0; i<5; i++){
	//	printf("d[%d] = %d\n",i, d[i]);
	//}
	//printf("\n");
	//for(i=0; i<11; i++){
	//	printf("c[%d] = %c\n",i, str[i]);
	//}

//�迭�� �ʱ�ȭ �̿��ؼ� �޸��� �� ���� �ִ���
//���� - ���� ���� ���� �Է� �޾Ƽ� 1�� 1�Ϻ����� �ϼ� ���ϱ�
	//int month[13] = {0,31,28,31,30,31,30,31,30,30,31,30,31};
	//int i;
	//int m, d;
	//int date=0;

	//for(i=1; i<=12; i++){
	//	printf("[%d��] �� �ϼ��� [%d] �� �Դϴ�\n",i, month[i]);
	//}printf("\n");

	//printf("�ñ��� ���� �Է��ϼ��� : \n");
	//scanf("%d", &m);
	//printf("�ñ��� ���� �Է��ϼ��� : \n");
	//scanf("%d", &d);

	//for(i=1; i<m; i++){
	//	date += month[i];
	//}
	//date += d;

	//printf("1�� 1�Ϻ��� �� �ϼ��� %d �Դϴ�", date);

//������ �迭
	//int a[4][5];
	//int i, j;
	//int val = 1;

	//for(i=0; i<4; i++){
	//	for(j=0; j<5; j++){
	//		a[i][j] = val;
	//		val++;	
	//	}
	//}

	//for(i=0; i<4; i++){
	//	for(j=0; j<5; j++){
	//			printf("a[%d][%d] = %d\t",i,j,a[i][j]);
	//	}printf("\n");
	//}

//���� - 1~100���� ������ ���� 25���� �����ؼ� ���ٿ� 5���� ��� / 2���� �迭 �̿�
	int r,i,j;
	int arr[5][5];

	srand(time(NULL));

	for(i=0; i<5; i++){
		for(j=0; j<5; j++){
			r = ((rand()%100) + 1) ; 
			arr[i][j] = r;
		}
	}

	for(i=0; i<5; i++){
		for(j=0; j<5; j++){
			printf("%d\t", arr[i][j]);
			_sleep(100);	
		}printf("\n");
	}

}