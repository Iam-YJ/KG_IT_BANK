#include <stdio.h>

void printLine();
void sum(int a, int b);
void reply(int r, char ch);
int bigNum(int num1, int num2);
void func();

int global = 10; //��������

void main(){
	int r,i;
	char ch;

	//����- 1 2 3 4 5// 10 9 8 7 6
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

	//�Լ� ���� 1
	//sum(3,4);

	//�Լ� ���� 2
	//printf("�� �� �ݺ��ϰ� �����Ű���?");
	//scanf("%d",&r);
	//fflush(stdin);
	//printf("� ���ڸ� �ݺ��ϰ� �����Ű���?");
	//scanf("%c",&ch);

	//reply(r, ch);

	//�Լ� ���� 3
	//int num1, num2;
	//int res;
	//printf("�Է� 1 : ");
	//scanf("%d",&num1);
	//printf("�Է� 2 : ");
	//scanf("%d",&num2);
	//res = multiply(num1,num2);
	//printf("%d * %d = %d\n",num1,num2,res);

	//�Լ� ���� 4 - �� ���� �Է¹ް� ū ���� ���
//	int num1, num2;
//	int res;
//
//	printf("�Է� 1 : ");
//	scanf("%d",&num1); 
//	//fflush(stdin) ���� ? -�ֳĸ���ۿ� �����ִ°� 
//	//�ƽ�Ű�ڵ�� ���� �� ���� ���̿���
//	printf("�Է� 2 : ");
//	scanf("%d",&num2);
//
//	res = bigNum(num1,num2);
//	printf("�� ���� ū ���� %d �Դϴ�\n",res);
	
	//�������� ����
	int num = 10;
	//printf("main : global = %d\n",global);
	func();
	func();
	func();
	//printf("main : global = %d\n",global);

}


//�Լ� ���� 1
//void printline(int a){
//	printf("=================\n");
//}
//void sum(int a, int b){
//	printLine(10);
//	printf("%d + %d = %d\n",a,b,(a+b));
//	printLine(10);
//}

//����2 - �ݺ� Ƚ���� ���ڸ� ���޹޾� �ݺ� Ƚ����ŭ ����ϼ���.
//void reply(int r, char ch){
//	int i ;
//	for(i=0; i<r; i++){
//		printf("%c",ch);
//	}printf("\n",ch);
//	printf("��\n");
//
//}

//�Լ� ���� 3
//int multiply(int num1, int num2){
//	int res;
//	res = num1 * num2;
//	return res;	
//}

//�Լ� ���� 4
//int bigNum(int num1, int num2){
//	int big;
//
//	if(num1 > num2){
//		return num1;
	//������ ����ϸ� ������ ��ġ���� �Լ��� ������ �� �ִ�
//	}return num2;
//}

//�������� ����
void func(){
	static int count = 0;//������ ������ �Ҵ�
	int num;

	count ++;
	global = 20;
	num=20;
	printf("func : num = %d\n",num);
	printf("func : global = %d\n",global);
	printf("func : count = %d\n",count);
}