#include <stdio.h>

void main(){

	//���� for ��
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

	//�����
	//for(i=1; i<=5; i++){
	//	printf("%d�� : ",i);
	//	for(j=1; j<=3; j++){
	//		printf("*");
	//	
	//	}printf("\n");
	//}

	////������ 2~9��
	//for(i=2; i<=9; i++){
	//	for(j =1; j<=9; j++){
	//		printf("%d * %d = %d\n",i,j,(i*j));

	//	}printf("\n");

	//}

	////12345
	////23456 ... ���
	//for(i = 1; i<=5; i++){
	//	for(j=0; j<=4; j++){
	//		printf("%d ",(j+i));
	//	}printf("\n");
	//}

	//�迭
	//int test[10];
	//int i;
	//
	//
	//for(i=0; i<10; i++){
	//	test[i] = i+1;
	//	printf("test[%d] : %d\n",i,test[i]);
	//}

	//���� - 1~100���� ¦���� �����ϰ� ���
	//int arr[101];
	//int i, num;

	//for(i=0; i<=100; i++){
	//	num = i%2;
	//	if(num==0){
	//		arr[i] = i;
	//		printf("%d, ",arr[i]);
	//	}
	//}printf("\b\b \n");

//����
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

//���� �޾Ƽ� �迭 ����
	//int i, arr[10]; //���� ���� ����
	//
	//for(i=0; i<10; i++){ //�迭�� �ֱ�
	//	printf("���� �Է� : ");
	//	scanf("%d",&arr[i]);
	//}

	//for(i=0; i<10; i++){ //���
	//	printf("%-3d", arr[i]);
	//}
	//printf("\n");

//���� �޾Ƽ� �迭 ����
	char str[10]; //�迭�� ������ �ִ� �� ��ü�� �ּ� .. �׷��� 0���� ���� 
	int i;

	printf("���ڿ� �Է� : ");
	scanf("%s", str);

	for(i=0; i<10; i++){
		fflush(stdin);
		printf("%c",str[i]); //�ѱ��� �ѱ��� ����
		
	}
	printf("\n");
	printf("%s",str); //���ڿ��� ����





}