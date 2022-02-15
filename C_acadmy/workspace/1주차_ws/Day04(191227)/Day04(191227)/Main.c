#include <stdio.h>
#include <conio.h>

void main(){

	//논리연산자
	/*int a=1, b=2,c=3,d=4;

	printf("!(c<d) : %d\n",!(c<d));
	printf("a<b&&c>d : %d\n",a<b&&c>d);
	printf("a<b||c>d : %d\n",a<b||c>d);
	printf("5%%-3000 : %d\n",5&&-3000);*/

	//int su1;
	//float su2;

	//su1 = 5;
	//++su1 ;
	//printf("++su1 : %d\n",su1); //6

	//su1 = 5;
	//su1++ ;
	//printf("su1++ : %d\n",su1); //6
	//
	//su2 = 12.34;
	//printf("++su2 : %lf\n",++su2); //13.34

	//su2 = 12.34;
	//printf("su2++ : %lf\n",su2++);//12.34
	//printf("su2 : %lf\n",su2);//13.34

//	//증감연산자 예시 1
//	int a=5, b=6, c=10, d;
//
//	d=++a*b--;
//	printf("a=%d, b=%d, d=%d\n",a,b,d); // 6,5,36
//
//	d =a++ + ++c - b--;  
//	printf("a=%d, b=%d,c=%d, d=%d\n",a,b,c,d); //7 4 11 11
//
//	a=1;
//	b=0;
//	d= a++ || ++b * d-- / ++c;
//	printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d); //1 0 10 0
//	     
//	d = b++ && ++a / ++c * d++ ;
//	printf("a=%d,b=%d,c=%d,d=%d\n",a,b,c,d); //1 0 10 0
//

////a b c d
	//1번
////5 6 10 
////6 5   36
////
	//2번
////7 4 11 12
////
	//3번
////1 0
////2 0 11 1
////

	//4번
////2 1 11 0


	//조건연산자
   /*int su =8;
	(su%2==0) ? printf("%d 짝수 \n",su) : printf("%d 홀수 \n",su);

	su = 9;
	(su%2==0) ? printf("%d 짝수 \n",su) : printf("%d 홀수 \n",su);*/

	//비트연산자
	//int su1 = 12, su2 = 7, result;

	//result = su1 | su2;
	//printf("su1|su2 : %d\n",result);

	//su1 = 15;
	//su1 = ~ su1;
	//printf("~su1 : %d\n" , su1);
	//// 1111 0000 으로 변해서 -16이 나온다

	//su1 = 32;
	//result = su1 << 2;
	//printf("su1<<2 : %d\n", result);


//sizeof 연산자
	//int i = 10;
	//float f = 10.0;
	//double d = 100.0;
	//char c = 'a';

	//printf("정수의 크기 : %d\n", sizeof(i));
	//printf("실수의 크기 : %d\n", sizeof(f));
	//printf("더블의 크기 : %d\n", sizeof(d));
	//printf("문자의 크기 : %d\n", sizeof(c));
	////왜곡된 데이터 타입 > 아스키코드 4바이트를 1바이트에 넣으려고 하는 것.
	////근데 데이터에 변형은 일어나지 않는다.
	////왜냐면 아스키코드는 결국에는 위에 3바이트는 사용하지 않아서 ㄱㅊ
	////근데 다른 것은 넣으면 왜곡 발생할 수도 있음 

	//printf("10의 크기 : %d\n", sizeof(10));
	//printf("10.0의 크기 : %d\n", sizeof(10.0));
	//printf("100.0의 크기 : %d\n", sizeof(100.0));
	////8이다. c에서는 정수의 기본형이 double 이여서.
	//printf("'a'의 크기 : %d\n", sizeof('a'));
	////문자를 입력했는데 1이 아닌 4가 나오는거는 아스키코드여서.

//문제 2

//스캐너 물건값 , 지불금액 입력
//지불액 - 물건값 일 때 계산하기 -> sizeof 사용해서 천원 오백원 백원 십원 나누기
	//	- 아니면 이프
	
	int buy = 0;//물건
	int pay = 0; //돈냄
	int get = 0;

		printf("물건값을 입력하세요. :\n");
		scanf("%d",&buy);
		
		fflush(stdin);
		printf("지불값을 입력하세요. :\n");
		scanf("%d",&pay);

		get = pay-buy; //거스름돈

		if(get>=0){
			printf("=================\n");
			printf("거스름돈 %d 원\n",get);
			printf("=================\n");
			printf("1000원 : %d개 \n",get/1000);
			get % 1000;
			printf("500원 : %d개 \n",get/500);
			get % 500 ;
			printf("100원 : %d개 \n",get/100);
			get%100;
			printf("10원 : %d개 \n",get/10);
		}
	
		else{
			printf("돈을 더 지불하세요\n");
		}





}