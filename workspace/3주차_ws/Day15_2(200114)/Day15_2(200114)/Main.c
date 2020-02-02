#include <stdio.h>

#define PI 3.141592
#define MAX 10
#define MULTI(x) x*x
#define HAP(x,y) x+y
#define GOP(x,y) x*y

void radian();
void funcArray();
void funcMacro();

void main(){
	//define 예시
	//radian();
	funcArray();
	funcMacro();

}

void funcArray(){
	int arr[MAX];
	int i;
	for(i=0; i<MAX; i++){
		arr[i] = i+1;
	}

	for(i=0; i<MAX; i++){
		printf("arr[%d] = %d \n",i,arr[i]);
	}
}

void radian(){
	int r;
	printf("반지름 입력 : \n");
	scanf("%d",&r);
	printf("원의 넓이는 %.2lf입니다.\n",(r*PI));
}

void funcMacro(){
	int num;
	int num1,result;

	printf("숫자 입력 : ");
	scanf("%d",&num);

	result = 10*HAP(num,4);
	printf("%d\n",result);

	result = 10*HAP(num,4);
	result = GOP(1+2,3+4);
	printf("%d\n",result);

	printf("%d의 제곱은 %d 입니다\n",num,MULTI(num));

}