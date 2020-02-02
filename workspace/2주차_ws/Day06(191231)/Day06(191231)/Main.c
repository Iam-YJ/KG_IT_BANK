#include <stdio.h>

void main(){

	//int num;

	//printf("정수 입력 : ");
	//scanf("%d",&num);

	//switch(num){
	//case 1:
	//	printf("1이 입력되었습니다 \n");
	//	break;
	//case 2 :
	//	printf("2가 입력되었습니다 \n");
	//	break;
	//case 100:
	//	printf("100이 입력되었습니다 \n");
	//	break;
	//default:
	//	printf("정상적인 라벨이 아닙니다 \n");
	//	break;


	//char label;

	//printf("문자 입력 : ");
	//scanf("%c",&label);

	//switch(label){
	//case 'a': 
	//	printf("a 입력\n");
	//	break;
	//case 'b':
	//	printf("b 입력 \n");
	//	break;
	//default :
	//	printf("a와 b를 제외한 문자 입력 \n");
	//}

	//3의 배수만 출력하기
	//int num;
	//int three=0;
	//
	//printf("숫자를 입력하세요 \n");
	//scanf("%d",&num);
	//
	//three = num % 3;

	//switch(three){
	//	case 0:
	//		printf("3의 배수가 입력되었습니다 \n");
	//		break;

	//	default :
	//		printf("3의 배수가 아닙니다 \n");
	//		break;
	//}

	//문제1 1~10까지 숫자를 입력해서 
	//1,2,3-표시 나머지에러
	/*int num;
	printf("1~10까지의 숫자를 입력하세요 : \n");
	scanf("%d",&num);

	switch(num){
	case 1:
	printf("ONE\n");
	break;
	case 2:
	printf("TWO\n");
	break;
	case 3:
	printf("THREE\n");
	break;
	default:
	printf("ERROR\n");
	break;

	}*/

	//문제2 : 메뉴 코드를 입력받아
	//f/F면 [File Menu]
	//e/E면 [Edit Menu]
	//h/H [Help Menu]
	//나머지 error

	//char c;
	//printf("메뉴 코드를 입력하세요 : [] \n");
	//scanf("%c",&c);

	//printf("메뉴 코드 입력 : [%c]\n",c);

	//switch(c){
	//	case 'f':
	//	case 'F':
	//		printf("[File Menu]\n");
	//		break;
	//	case 'e':
	//	case 'E':
	//		printf("[Edit Menu]\n");
	//		break;
	//	case 'h':
	//	case 'H':
	//		printf("[Help Menu]\n");
	//		break;
	//	default:
	//		printf("error\n");
	//}

	//문제3 : 세 과목의 성적을 입력받아 합게와 평균 구하고
	//평균 90이상 a 80b 70c 60d 나머지f
	/*	int kor, eng, math;
	int sum = 0;
	int avg = 0;
	int avgg = 0;
	int grade = ' ';

	printf("국어 영어 수학 점수를 입력하세요 : \n");
	scanf("%d%d%d",&kor,&eng,&math);
	sum = kor + eng + math;
	avg = sum /3;
	avgg = avg / 10;

	switch(avgg){
	case 10:
	case 9:
	grade = 'A';
	break;
	case 8:
	grade = 'B';
	break;
	case 7:
	grade = 'C';
	break;
	case 6:
	grade = 'D';
	break;
	default:
	grade = 'F';
	}
	printf("합계 점수 : %d 점 \n",sum);
	printf("평균 점수 : %d 점 \n",avg);
	printf("등		급 : %c \n",grade);*/


	//int sum =0;
	//int num=0;

	//while(num<100){
	//	num ++ ;
	//	printf("%d + %d = %d\n",sum,num,sum+num);
	//	sum += num;
	//
	//}

	//메모장 만들기
	/*char ch;
	printf("문자열 입력 : \n");
	while((ch=getchar()) != -1){
	printf("%c ",ch);
	}
	printf("\n");*/

	//알파벳은 모두 소문자, 알파벳이 아니면 * - 종료 조건은 x
	//char ch;
	//printf("문자열 입력 : \n");
	//scanf("%c",&ch);

	//while((ch=getchar()) != 'x'){
	//	if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
	//		if((ch>='A')&&(ch<='Z')){
	//		ch += 'a'-'A';
	//		}else{
	//			ch =ch;
	//		}
	//	}else{
	//		ch = '*';
	//	}printf("%c",ch);
	//}printf("\n");

	//알파벳만 출력하는 반복문	
	//char ch;
	//printf("알파벳을 입력하세요 : ");

	//while((ch=getchar())!= '\n'){
	//	if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
	//		printf("%c",ch);
	//	}
	//}

	//do-while로 1~100 합 구하기
	//int sum =0;
	//int i =0;

	//do{
	//	printf("%d+%d = %d\n",sum,i,(sum+i));
	//	sum += i;
	//	i++;
	//}while(i>0 && i<=100);

	//int sum=0, i =0;
	//while(1){
	//	i++;
	//	if(i>100){
	//		break;
	//	}
	//	if(i%2==0){
	//		continue;
	//	}
	//	printf("%d+%d=%\n",sum,i,(sum+i));
	//	sum += i;
	//}
	//printf("sum = %d\n",sum);


	//문자열 입력받고 나서 while문으로 돌리기
	//q 입력 받았을 때 프로그램 종료

	//char ch = ' ';

	//while(1){
	//	fflush(stdin);
	//	printf("문자를 입력하세요 : ");
	//	scanf("%c",&ch);
	//	printf("문자 출력 : %c\n",ch);
	//	
	//	if(ch == 'q'){
	//		break;
	//	}else{
	//		continue;
	//	}

	//}




}