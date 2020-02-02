#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void main(){

/* 과제
	int kor = 100;
	int eng = 67;
	int math = 60;
	int sum = kor + eng + math ;
	float avg = (float) sum / 3;
	char grade = 'B';
	

	printf("국어 점수 %d\n",kor);
	printf("%s%d\n","영어 점수",eng);
	printf("%s%d\n","수학 점수",math);
	printf("%s%d\n","합계 점수",sum);
	printf("%s%.2f\n","평균 점수",avg);
	printf("%s%c\n","등급 점수",grade);
*/

	//const double pi =3.14;

	//printf("pi는 %lf\n",pi);


// 과제 1
	//int basic = 1500000;
	//int bonus = 700000;
	//const double tax = 0.9;
	//double realPay = 0;
	//double realTax = 0.1;
	//realTax = 0.1 * basic;
	//realPay = basic*tax + bonus;

	//printf("기본 급여액은 %d 원 입니다. \n",basic);
	//printf("보너스 급여액은 %d 원 입니다. \n",bonus);
	//printf("실 급여액은 %.2lf 원 입니다. \n",realPay);
	//printf("세금은 %.2lf 원 입니다. \n",realTax);
	

//scanf 정수형
	//int num1, num2, sum =0;
	//printf("정수 입력 : ");
	//scanf("%d", &num1);
	//// scanf는 Lvalue가 필요함 (공간)
	//printf("정수 입력 : ");
	//scanf("%d",&num2);
	////\n는 출력을 위한 제어 명령어이다. scanf 함수에 사용하면 안된다
	//
	//sum = num1 + num2;

	//printf("입력된 값은 %d와 %d 이고," ,num1, num2);
	//printf("두 수의 합은 %d입니다. \n", sum);


//scanf char형
	//char grade ;
	//int score ;

	//printf("점수 입력 : \n");
	//scanf("%d",&score);
	//
	//fflush(stdin);
	//printf("등급 입력 : \n");
	//scanf("%c",&grade);
	//
	//printf("점수는 %d점 이고, ",score);
	//printf("등급은 %c 입니다. ",grade);

//scanf 실수형
	//int d1, d2;
	//double df1, df2;
	//double resd, resf;

	//printf("정수1 / 정수2 두 개 입력 : ");
	//scanf("%d %d",&d1,&d2);
	//printf("실수1 / 실수2 두 개 입력 : ");
	//scanf("%lf %lf",&df1,&df2);

	//resd = (double)(d1+d2)/2;
	//resf = (df1+df2)/2;

	//printf("정수의 평균값 : %.2lf\n",resd);
	//printf("실수의 평균값 : %.2lf\n",resf);


//과제 
	//int kor=0;
	//int eng=0;
	//int math=0;
	//char grade;
	//double sum;
	//

	//printf("국어 점수를 입력하세요 : ");
	//scanf("%d",&kor);

	//printf("영어 점수를 입력하세요 : ");
	//scanf("%d",&eng);

	//printf("수학 점수를 입력하세요 : ");
	//scanf("%d",&math);

	//fflush(stdin);
	//printf("등급을 입력하세요 : ");
	//scanf("%c",&grade);
	//
	//sum = (double)(kor+eng+math)/3;

	//printf("국어 점수 : %d\n",kor);
	//printf("영어 점수 : %d\n",eng);
	//printf("수학 점수 : %d\n",math);
	//printf("등급 : %c\n",grade);
	//printf("당신의 점수는 %.2lf으로 %c등급 입니다.",sum,grade);

//문자형 입력 함수
	/*char ch;

	printf("getchar 입력 : ");
	ch = getchar();
	printf(" / getchar 출력 : %c\n" ,ch);

	printf("getch 입력 : ");
	ch = getch();
	printf(" / getch 출력 : %c\n",ch);

	printf("getche 입력 : ");
	ch = getche();
	printf(" / getche 출력 : %c\n",ch);*/


// puts gets
	//printf("hello 유진");
	//puts("Hello World");

	
	

}