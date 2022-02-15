#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void main() {

	//과제
	/*  int score;
	int i;
	int sum = 0;
	int ave = 0;
	int arr[5];

	printf("성적을 입력하세요");
	for (i = 0; i < 5; i++) {
	scanf("%d", &score);
	arr[i] = score;
	}


	for (i = 0; i < 5; i++) {
	sum += arr[i];

	printf("%d번 학생 성적 : %d\n", (i + 1), arr[i]);
	}
	ave = sum / 5;
	printf("총 점은 %d 점이고 평균은 %d 입니다", sum, ave);*/


	//강사 풀이
	//int jumsu[5];
	//int i, sum = 0;
	//double avg = 0;
	//int size;

	//size = sizeof(jumsu) / sizeof(jumsu[0]);

	//for(i=0; i<size; i++){
	//	printf("%d번 학생 성적 : \n",(i+1));
	//	scanf("%d",&jumsu[i]);

	//	sum += jumsu[i];
	//}

	//avg = (double) sum / size;
	//printf("총 점은 %d 점이고 평균은 %.2lf 입니다", sum, avg);

	//rand 함수
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

	//임의의 숫자 5개를 생성해서 최대값 구하기
	//int i;
	//int arr [5];
	//int min = 0;
	//int max = 0;
	//int range ;

	//srand(time(NULL));

	//printf("범위 입력 : \n" );
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
	//printf("최대값은 %d\n",max);


	//초기화
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

//배열의 초기화 이용해서 달마다 몇 일이 있는지
//예시 - 월과 일의 정보 입력 받아서 1월 1일부터의 일수 구하기
	//int month[13] = {0,31,28,31,30,31,30,31,30,30,31,30,31};
	//int i;
	//int m, d;
	//int date=0;

	//for(i=1; i<=12; i++){
	//	printf("[%d월] 의 일수는 [%d] 일 입니다\n",i, month[i]);
	//}printf("\n");

	//printf("궁금한 월을 입력하세요 : \n");
	//scanf("%d", &m);
	//printf("궁금한 일을 입력하세요 : \n");
	//scanf("%d", &d);

	//for(i=1; i<m; i++){
	//	date += month[i];
	//}
	//date += d;

	//printf("1월 1일부터 총 일수는 %d 입니다", date);

//다차원 배열
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

//예제 - 1~100까지 임의의 난수 25개를 생성해서 한줄에 5개씩 출력 / 2차원 배열 이용
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