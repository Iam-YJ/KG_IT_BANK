#include <stdio.h>

void main(){
	
//������
// int *ptr ����(�ּ� �����͸� ������ �� �ִ�)
// &a (�ּҸ� �˾ƿɽô�) 
// *ptr (�����ؼ� ������ּ���. ��������)

	//char c = 'a';
	//int i = 3;
	//double d = 3.14;

	//char *cp;
	//int * ip;
	//double *dp;

	//cp = &c;
	//ip = &i;
	//dp = &d;

	//printf("&c = %p\n",&c);
	//printf("&i  = %p\n",&i);
	//printf("&d  = %p\n",&d);
	//printf("cp = %p\n",cp);
	//printf("ip  = %p\n",ip);
	//printf("dp  = %p\n",dp);

	//printf("\nc = %c\n",c);
	//printf("i  = %d\n",i);
	//printf("d  = %.2lf\n",d);
	//printf("*cp = %c\n",*cp);
	//printf("*ip  = %d\n",*ip);
	//printf("*dp  = %.2lf\n",*dp);

	//������ ���� 2
	//int num1 = 10, num2;
	//int *ptr;

	//ptr = &num1; 
	//num1++; 
	//printf("1��° *ptr = %d\n",*ptr);

	//num2 = 5;
	//ptr = &num2; 

	//*ptr = *ptr +num1 +num2;
	//printf("num1 = %d\n",num1); 
	//printf("num2 = %d\n",num2);
	//printf("2��° *ptr = %d\n",*ptr); 
	
//������ ũ�⿡ ����
	//int i=10;
	//int j=1024;
	//char c = 'A';
	//double d = 3.14;
	//
	//int *ip = &i;
	//char *cp = &c;
	//double *dp = &d;

	//printf("10 = %dbyte\n", sizeof(10)); //4byte - ������Ÿ�� int ��
	//printf("A = %dbyte\n", sizeof('A')); //4byte - �ƽ�Ű�ڵ带 ����Ѵ�.. 
	//printf("3.14 = %dbyte\n",sizeof(3.14));//8byte - �⺻�� �������̿��� 
	//printf("\n");

	//printf("ip = %dbyte\n", sizeof(ip));
	//printf("cp = %dbyte\n", sizeof(cp)); //��� ������ ������ 4byte �̴�.
	//printf("dp = %dbyte\n",sizeof(dp));
	//printf("\n");
	//
	//printf("j = %d\n",j);
	//c = j;
	//printf("c = %d\n",c); //char�� int �־�����, ���� 3byte�� ���󰬴� 


	//����

	//char c = 'a';
	//int i = 3;
	//double d = 3.14;

	//char *cp;
	//int * ip;
	//double *dp;

	//cp = &c;
	//ip = &i;
	//dp = &d;

//������ �����ϱ� 1
	//int a=5;
	//double d=3.14;
	//double result ;

	//int *ap; //������(����)�� �������
	//double *dp;

	//ap = &a; //ap�� �ּҸ� �޾ƿԴ�. <-> *ap �� �ּҿ� �ش��ϴ� ���̴�
	//dp = &d;

	//result = *ap + *dp;

	//printf("���� %.2lf�Դϴ�.\n",result);

//������ �����ϱ� 2
	int num1 = 3, num2;
	int *ptr;

	ptr = &num1; //�ּڰ�
	num2 = *ptr; //3
	num2++; //��2 4

	printf("*ptr=%d / ptr=%p\n",*ptr,ptr); //3 
	printf("num1=%d / &num1=%p\n",num1,&num1); //3 
	printf("num2=%d / &num2=%p\n",num2,&num2); //4
	printf("\n");

	ptr = &num2; //�ּڰ�
	printf("*ptr=%d / ptr=%p\n",*ptr,ptr); //4
	printf("num1=%d / &num1=%p\n",num1,&num1);//3
	printf("num2=%d / &num2=%p\n",num2,&num2);//4
	printf("\n");

	*ptr = *ptr + 3; //4 + 3 = 7
	printf("*ptr=%d / ptr=%p\n",*ptr,ptr);//7
	printf("num1=%d / &num1=%p\n",num1,&num1);//3
	printf("num2=%d / &num2=%p\n",num2,&num2);//7


}