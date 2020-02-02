#include <stdio.h>

void main(){

	//for 문
	/*int i, sum=0;

	for(i=1; i<=10; i++){	
	printf("%d+%d=%d\n",sum,i,(sum+i));
	sum += 1;
	}*/


	//문제 - 10~0까지 출력
	//int i;
	//for(i=10; i>0; i--){
	//	printf("%d\n",i);
	//}


	//문제 - Hello 4번 / A~Z 출력 / 3+6+9=18 출력
	//int i=0;
	//int sum =0;
	//int num = 3;
	//char ch= 'A';

	//for(i=0; i<=3; i++){
	//	printf("Hello\n");
	//}



	//for (i=0; i<=('a'-'A'); i++){	
	//	if((ch>='A') && (ch<='Z')){
	//		printf("%c",ch);
	//		ch += 1;
	//		if((ch>='A') && (ch<='Z')){
	//			printf(", ");
	//		}
	//	}
	//}printf("\n");

	////강사
	//for(i = 'A'; i<='Z'; i++){
	//	printf("%c, ",i);
	//}printf("\b\b \n");



	//for(i=1;i<=10; i++){
	//	if(num<10){
	//		printf("%d",num);
	//		if(num<=6){
	//			printf("+");
	//		}
	//		sum += num;
	//		num += 3;
	//	}
	//}
	//printf("=");
	//printf("%d\n",sum);

	////강사
	//sum = 0;
	//for(i=1; i<=10; i++){
	//	if(i%3==0){
	//	printf("%d + ", i);
	//	sum+=i;
	//	}
	//}
	//printf("\b\b=%d\n",sum);


	//문제 : 1~100까지 3의 배수만 출력후 3의 배수만 합 구하기
	//int i;
	//int sum=0;

	//for(i=1; i<=100; i++){
	//	if(i%3 ==0 ){
	//		printf("%d, ",i);
	//		sum += i;
	//	}
	//
	//}
	//printf("\b\b \n");
	//printf("3의 배수의 합은 %d\n",sum);


	//문제 : 1~100 사이 값 입력받고,
	//입력받은 수까지 3의 배수를 출력한 후,
	//3의 배수의 합과 갯수 구하기
	//int i;
	//int user;
	//int sum=0;
	//int count=0;

	//printf("1~100 사이의 값을 입력하세요 : ");
	//scanf("%d",&user);

	//for(i=1; i<=user; i++){
	//	if(i%3 == 0){
	//		printf("%d ", i);
	//		count++;
	//		sum+= i;
	//	}
	//} 
	//printf("\n입력받은 수는 %d개 \n", user);
	//printf("입력받은 갯수는 %d개 \n", count);
	//printf("입력받은 합은 %d \n ", sum);


	//문제 : 임의의 정수를 입력받아 
	//1~1000까지 입력받은 수의 배수를 제외한 합 구하기
	//입력받은 수의 배수이면서 3의 배수는 포함
	//10개씩 출력..

	int i,j;
	int sum=0, count=1;
	int user;

	printf("1~1000까지의 수를 입력하세요 \n");
	scanf("%d",&user);

	for(i=1; i<=1000; i++){
		if(i%user == 0){
			if(i%3 ==0){
				sum += i;
				printf("%3d ",i);
				count++;
			}
		}
		else if(i%user != 0) {
			sum+=i;
			printf("%3d ",i);
			count++;
		}
		if(count%10 ==0){
				printf("\n");	
		}

	}printf("\n\n 입력받은 수의 합은 %d \n",sum);

}