#include <stdio.h>

void main(){

	//for ��
	/*int i, sum=0;

	for(i=1; i<=10; i++){	
	printf("%d+%d=%d\n",sum,i,(sum+i));
	sum += 1;
	}*/


	//���� - 10~0���� ���
	//int i;
	//for(i=10; i>0; i--){
	//	printf("%d\n",i);
	//}


	//���� - Hello 4�� / A~Z ��� / 3+6+9=18 ���
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

	////����
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

	////����
	//sum = 0;
	//for(i=1; i<=10; i++){
	//	if(i%3==0){
	//	printf("%d + ", i);
	//	sum+=i;
	//	}
	//}
	//printf("\b\b=%d\n",sum);


	//���� : 1~100���� 3�� ����� ����� 3�� ����� �� ���ϱ�
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
	//printf("3�� ����� ���� %d\n",sum);


	//���� : 1~100 ���� �� �Է¹ް�,
	//�Է¹��� ������ 3�� ����� ����� ��,
	//3�� ����� �հ� ���� ���ϱ�
	//int i;
	//int user;
	//int sum=0;
	//int count=0;

	//printf("1~100 ������ ���� �Է��ϼ��� : ");
	//scanf("%d",&user);

	//for(i=1; i<=user; i++){
	//	if(i%3 == 0){
	//		printf("%d ", i);
	//		count++;
	//		sum+= i;
	//	}
	//} 
	//printf("\n�Է¹��� ���� %d�� \n", user);
	//printf("�Է¹��� ������ %d�� \n", count);
	//printf("�Է¹��� ���� %d \n ", sum);


	//���� : ������ ������ �Է¹޾� 
	//1~1000���� �Է¹��� ���� ����� ������ �� ���ϱ�
	//�Է¹��� ���� ����̸鼭 3�� ����� ����
	//10���� ���..

	int i,j;
	int sum=0, count=1;
	int user;

	printf("1~1000������ ���� �Է��ϼ��� \n");
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

	}printf("\n\n �Է¹��� ���� ���� %d \n",sum);

}