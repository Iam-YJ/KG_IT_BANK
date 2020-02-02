#include <stdio.h>

void main(){

	//문제 풀이
	//int price, cash, change;
	//int k, kc, hk,hkc, m,mc,d,dc;

	//price = 460;
	//printf("물건값 : %d원 \n ", price);
	//cash = 10000;
	//printf("지불액 : %d원 \n", cash);

	//change = cash - price;

	//printf("====================\n");
	//printf("거스름돈 : %d원\n", change);
	//printf("====================\n");

	//k = change / 1000;
	//kc = change %1000;

	//hk = kc/500;
	//hkc = kc%500;
	//
	//m = hkc / 100;
	//mc = hkc % 100;
	//
	//d = mc / 10;
	//dc = mc % 10;

	//printf("%6s : %2d개\n","1000원", k);
	//printf("%6s : %2d개\n","500원", hk);
	//printf("%6s : %2d개\n","100원", m);
	//printf("%6s : %2d개\n","10원", d);


	//제어문 : 프로그램의 흐름을 바꿀 수 있다.
	//종류
	//조건문 : if, if-else, if - else if
	//반복문 : while, do-while, for
	//분기문 : switch-case, break, continue, goto
	// 분기문 : call(return 다시 돌아옴), jump(다시 돌아오지 않음)

	/*int num ; 
	printf("정수 입력 : ");
	scanf("%d",&num);

	if(num < 0){
	num *= -1 ;
	printf("음수가 양수로 변환되었습니다.\n");
	}
	printf("결과 : %d\n",num);
	*/


	/*char ch;
	printf("문자 입력 : ");
	scanf("%c",&ch);

	if(ch>='a'&& ch<='z'){
	ch -= ('a'-'A');
	printf("소문자가 대문자로 변환되었습니다.\n");
	}
	printf("결과 : %c\n",ch);*/


	//if-else 문제 1
	//문자를 입력받고, 알파벳만 출력, 
	//조건 - 대문자만 소문자로 변환
	//char ch;
	//printf("문자를 입력하세요 : \n");
	//scanf("%c",&ch);
	//

	//if(((ch>='a')&&(ch<='z'))||(ch>='A')&& (ch<='Z')){
	//	if((ch>='A')&& (ch<='Z')){
	//		ch += ('a'-'A');
	//		printf("대문자가 소문자로 변환되었습니다.\n");
	//		printf("결과 : %c\n",ch);	
	//	}
	//	else{ 
	//		printf("결과 : %c\n",ch);
	//		ch = ' ';
	//	}
	//}else {
	//	printf("알파벳을 입력하세요\n");
	//}


	//문제 2 - 두 개의 정수를 입력 받아 큰 수를 출력
	/*	int a;
	int b;
	printf("두 개의 정수를 입력하세요 : \n");
	scanf("%d%d",&a,&b);
	printf("더 큰 정수는 " );
	if(a>b){
	printf("%d 입니다\n",a);
	}else{
	printf("%d 입니다\n",b);
	}*/	


	//문제 3 - 국영수 수학 점수 입력받아 60점 이상이면 합격, 한과목 이상 60점 미만이면 불합격
	//int kor;
	//int eng;
	//int math;
	//int sum = 0;

	//printf("국어, 영어, 수학의 점수를 입력하세요 : \n");
	//scanf("%d%d%d",&kor,&eng,&math);
	//sum = kor + eng + math;
	//if(kor>=60&&eng>=60&&math>=60){
	//printf("합격입니다\n");
	//}else {
	//printf("불합격입니다\n");
	//}


	//문제4 - 수를 입력받아서, 홀/짝/음수 구별 
	/*int a ;
	int aN;
	printf("숫자를 입력해주세요 : \n");
	scanf("%d",&a);

	if(a >= 0) {
		aN = a % 2;
		printf("%d는 양수 입니다\n",a);
		if(aN == 0){
			printf("%d는 짝수 입니다 \n",a);
	
		}
		else{
			printf("%d는 홀수 입니다 \n",a);
		}

	}else {
		printf("%d는 음수 입니다\n",a);

	}*/

	//문제5 - 국영수 점수 입력받아서 평균 구하세요 
	//평균 60이상 합격 , 60미만 불합격
	//한 과목 60점 미만이면 과락

	//int kor, eng, math;
	//int sum = 0;
	//int ave = 0;

	//printf("국어 영어 수학 점수를 입력하세요 : \n");
	//scanf("%d%d%d",&kor,&eng,&math);
	//sum = kor + eng + math;
	//ave = sum /3 ;
	//
	//printf("국어 %d점, 영어 %d점, 수학 %d점 입니다\n",kor,eng,math);
	//if(ave>=60){
	//	if(kor>=60 && eng>=60 && math>=60){
	//		printf("평균 %d점 입니다.\n",ave);
	//		printf("시험에 합격하셨습니다.\n");

	//	}else {
	//		
	//		if(kor<60){
	//			printf("국어 과목 과락입니다.\n");
	//		}
	//		if(eng<60){
	//			printf("영어 과목 과락입니다.\n");
	//		}
	//		if(math<60){
	//			printf("수학 과목 과락입니다.\n");
	//		}
	//		printf("시험에 불합격하셨습니다.\n");
	//	}
	//}else {
	//	printf("평균 %d점 입니다.\n",ave);
	//	printf("평균 미달 입니다.\n");
	//	printf("시험에 불합격하셨습니다.\n");
	//}

	//문제6 - 국영수점수받고 불합격 조건 평균 70보다 작기
	/*int kor, eng, math;
	int sum = 0;
	int ave = 0;

	printf("국어 영어 수학 점수를 입력하세요 : \n");
	scanf("%d%d%d",&kor,&eng,&math);
	sum = kor + eng + math;
	ave = sum /3 ;
	
	if(ave<=70){
		printf("불합격\n");
	}else if(kor<60){
		printf("국어 불합격\n");
	}else if(eng<60){
		printf("영어 불합격\n");
	} else if(math<60){
		printf("수학 불합격\n");
	}else{
		printf("합격\n");
	}*/

	//과제 - 국영수 수학점수 입력받아서, 평균을 구한 후에
	//평균 90이상 a등급 ... 80b 70c 60d 그아래f
	//평균은__로 __등급입니다.


	int kor, eng, math;
	int sum = 0;
	char grade = ' ';
	
	printf("국어 영어 수학 점수를 입력하세요 : \n");
	scanf("%d%d%d",&kor,&eng,&math);
	sum = kor+eng+math;
	sum/= 3;

	if(sum >= 90){
	grade = 'A';
	}else if(sum >=80){
	grade = 'B';
	}else if(sum >=70){
	grade = 'C';
	}else if(sum >=60){
	grade = 'D';
	}else {
	grade = 'F';
	}
	
	printf("평균은 %d로 %c 등급입니다." , sum, grade);

	





}