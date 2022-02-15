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
	//define ����
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
	printf("������ �Է� : \n");
	scanf("%d",&r);
	printf("���� ���̴� %.2lf�Դϴ�.\n",(r*PI));
}

void funcMacro(){
	int num;
	int num1,result;

	printf("���� �Է� : ");
	scanf("%d",&num);

	result = 10*HAP(num,4);
	printf("%d\n",result);

	result = 10*HAP(num,4);
	result = GOP(1+2,3+4);
	printf("%d\n",result);

	printf("%d�� ������ %d �Դϴ�\n",num,MULTI(num));

}