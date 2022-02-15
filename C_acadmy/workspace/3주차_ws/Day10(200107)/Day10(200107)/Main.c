#include <stdio.h>

void printLine();
void sum(int a, int b);
void reply(int r, char ch);
int bigNum(int num1, int num2);
void func();

int global = 10; //전역변수

void main(){
	int r,i;
	char ch;

	//예제- 1 2 3 4 5// 10 9 8 7 6
	//int arr[5][5];
	//int i,j;
	//int count = 1;
	//int n = 1;

	//for(i=0; i<5; i++){
	//	for(j=0; j<5; j++){
	//		arr[i][j] = count;
	//		count++;
	//	}
	//}
	//for(i=0; i<5; i++){
	//	if(i%2 == 0){
	//		for(j=0; j<5; j++){
	//			printf("%-4d", arr[i][j]);
	//		}printf("\n");
	//	}if(i%2 !=0) {
	//		for(j=4; j>-1; j--){
	//			printf("%-4d", arr[i][j]);
	//			// 6 7 8 9 10 
	//			//arr[1][4] arr[1][3] arr[1][2] arr[1][1] arr[1][0]
	//		}printf("\n");
	//	}
	// }

	//함수 예시 1
	//sum(3,4);

	//함수 예시 2
	//printf("몇 번 반복하고 싶으신가요?");
	//scanf("%d",&r);
	//fflush(stdin);
	//printf("어떤 문자를 반복하고 싶으신가요?");
	//scanf("%c",&ch);

	//reply(r, ch);

	//함수 예시 3
	//int num1, num2;
	//int res;
	//printf("입력 1 : ");
	//scanf("%d",&num1);
	//printf("입력 2 : ");
	//scanf("%d",&num2);
	//res = multiply(num1,num2);
	//printf("%d * %d = %d\n",num1,num2,res);

	//함수 예시 4 - 두 수를 입력받고 큰 수를 출력
//	int num1, num2;
//	int res;
//
//	printf("입력 1 : ");
//	scanf("%d",&num1); 
//	//fflush(stdin) 굳이 ? -왜냐면버퍼에 남아있는게 
//	//아스키코드로 읽을 수 없는 값이여서
//	printf("입력 2 : ");
//	scanf("%d",&num2);
//
//	res = bigNum(num1,num2);
//	printf("두 수중 큰 수는 %d 입니다\n",res);
	
	//지역변수 예시
	int num = 10;
	//printf("main : global = %d\n",global);
	func();
	func();
	func();
	//printf("main : global = %d\n",global);

}


//함수 예시 1
//void printline(int a){
//	printf("=================\n");
//}
//void sum(int a, int b){
//	printLine(10);
//	printf("%d + %d = %d\n",a,b,(a+b));
//	printLine(10);
//}

//예시2 - 반복 횟수와 문자를 전달받아 반복 횟수만큼 출력하세요.
//void reply(int r, char ch){
//	int i ;
//	for(i=0; i<r; i++){
//		printf("%c",ch);
//	}printf("\n",ch);
//	printf("끝\n");
//
//}

//함수 예시 3
//int multiply(int num1, int num2){
//	int res;
//	res = num1 * num2;
//	return res;	
//}

//함수 예시 4
//int bigNum(int num1, int num2){
//	int big;
//
//	if(num1 > num2){
//		return num1;
	//리턴을 사용하면 임의의 위치에서 함수를 종료할 수 있다
//	}return num2;
//}

//지역변수 예시
void func(){
	static int count = 0;//데이터 영역에 할당
	int num;

	count ++;
	global = 20;
	num=20;
	printf("func : num = %d\n",num);
	printf("func : global = %d\n",global);
	printf("func : count = %d\n",count);
}