#include <stdio.h>

void main(){

	//이중 for 문
	//	int i,j,k=0,count=0, sum=0;

	//for(i=1; i<=10; i++){
	//	for(j=1; j<=10; j++){
	//		printf("i=%d / j=%d\n",i,j);
	//	}
	//}

	//for(i=1; i<=10; i++){
	//	for(j=1; j<=10; j++){
	//		++count;
	//		printf("%d+%d = %d\n",sum,count,(sum+count));
	//		sum += count;
	//	}
	//}

	//별찍기
	//for(i=1; i<=5; i++){
	//	printf("%d행 : ",i);
	//	for(j=1; j<=3; j++){
	//		printf("*");
	//	
	//	}printf("\n");
	//}

	////구구단 2~9단
	//for(i=2; i<=9; i++){
	//	for(j =1; j<=9; j++){
	//		printf("%d * %d = %d\n",i,j,(i*j));

	//	}printf("\n");

	//}

	////12345
	////23456 ... 출력
	//for(i = 1; i<=5; i++){
	//	for(j=0; j<=4; j++){
	//		printf("%d ",(j+i));
	//	}printf("\n");
	//}

	//배열
	//int test[10];
	//int i;
	//
	//
	//for(i=0; i<10; i++){
	//	test[i] = i+1;
	//	printf("test[%d] : %d\n",i,test[i]);
	//}

	//예시 - 1~100까지 짝수를 저장하고 출력
	//int arr[101];
	//int i, num;

	//for(i=0; i<=100; i++){
	//	num = i%2;
	//	if(num==0){
	//		arr[i] = i;
	//		printf("%d, ",arr[i]);
	//	}
	//}printf("\b\b \n");

//강사
	//int i, index = 0;
	//int arr[50];
	//int size;
	//int count =1;

	//for(i=1; i<=100; i++){
	//	if(i%3 == 0){
	//		arr[index] = i;
	//		index++;
	//	}
	//}
	//size = sizeof(arr) / sizeof(arr[0]);
	//for(i=0; i<size; i++){
	//	if((arr[i]>=0) && (arr[i]<=100)){
	//		printf("%4d",arr[i]);
	//		if(count %10 ==0){
	//			printf("\n");
	//		}
	//		count++;
	//	}
	//}

//정수 받아서 배열 선언
	//int i, arr[10]; //변수 선언 구간
	//
	//for(i=0; i<10; i++){ //배열에 넣기
	//	printf("정수 입력 : ");
	//	scanf("%d",&arr[i]);
	//}

	//for(i=0; i<10; i++){ //출력
	//	printf("%-3d", arr[i]);
	//}
	//printf("\n");

//문자 받아서 배열 선언
	char str[10]; //배열이 가지고 있는 값 자체가 주소 .. 그래서 0부터 시작 
	int i;

	printf("문자열 입력 : ");
	scanf("%s", str);

	for(i=0; i<10; i++){
		fflush(stdin);
		printf("%c",str[i]); //한글자 한글자 접근
		
	}
	printf("\n");
	printf("%s",str); //문자열로 접근





}