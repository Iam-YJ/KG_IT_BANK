#include <stdio.h>
#include <conio.h>

void main(){

	//��������
	/*int a=1, b=2,c=3,d=4;

	printf("!(c<d) : %d\n",!(c<d));
	printf("a<b&&c>d : %d\n",a<b&&c>d);
	printf("a<b||c>d : %d\n",a<b||c>d);
	printf("5%%-3000 : %d\n",5&&-3000);*/

	//int su1;
	//float su2;

	//su1 = 5;
	//++su1 ;
	//printf("++su1 : %d\n",su1); //6

	//su1 = 5;
	//su1++ ;
	//printf("su1++ : %d\n",su1); //6
	//
	//su2 = 12.34;
	//printf("++su2 : %lf\n",++su2); //13.34

	//su2 = 12.34;
	//printf("su2++ : %lf\n",su2++);//12.34
	//printf("su2 : %lf\n",su2);//13.34

//	//���������� ���� 1
//	int a=5, b=6, c=10, d;
//
//	d=++a*b--;
//	printf("a=%d, b=%d, d=%d\n",a,b,d); // 6,5,36
//
//	d =a++ + ++c - b--;  
//	printf("a=%d, b=%d,c=%d, d=%d\n",a,b,c,d); //7 4 11 11
//
//	a=1;
//	b=0;
//	d= a++ || ++b * d-- / ++c;
//	printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d); //1 0 10 0
//	     
//	d = b++ && ++a / ++c * d++ ;
//	printf("a=%d,b=%d,c=%d,d=%d\n",a,b,c,d); //1 0 10 0
//

////a b c d
	//1��
////5 6 10 
////6 5   36
////
	//2��
////7 4 11 12
////
	//3��
////1 0
////2 0 11 1
////

	//4��
////2 1 11 0


	//���ǿ�����
   /*int su =8;
	(su%2==0) ? printf("%d ¦�� \n",su) : printf("%d Ȧ�� \n",su);

	su = 9;
	(su%2==0) ? printf("%d ¦�� \n",su) : printf("%d Ȧ�� \n",su);*/

	//��Ʈ������
	//int su1 = 12, su2 = 7, result;

	//result = su1 | su2;
	//printf("su1|su2 : %d\n",result);

	//su1 = 15;
	//su1 = ~ su1;
	//printf("~su1 : %d\n" , su1);
	//// 1111 0000 ���� ���ؼ� -16�� ���´�

	//su1 = 32;
	//result = su1 << 2;
	//printf("su1<<2 : %d\n", result);


//sizeof ������
	//int i = 10;
	//float f = 10.0;
	//double d = 100.0;
	//char c = 'a';

	//printf("������ ũ�� : %d\n", sizeof(i));
	//printf("�Ǽ��� ũ�� : %d\n", sizeof(f));
	//printf("������ ũ�� : %d\n", sizeof(d));
	//printf("������ ũ�� : %d\n", sizeof(c));
	////�ְ�� ������ Ÿ�� > �ƽ�Ű�ڵ� 4����Ʈ�� 1����Ʈ�� �������� �ϴ� ��.
	////�ٵ� �����Ϳ� ������ �Ͼ�� �ʴ´�.
	////�ֳĸ� �ƽ�Ű�ڵ�� �ᱹ���� ���� 3����Ʈ�� ������� �ʾƼ� ����
	////�ٵ� �ٸ� ���� ������ �ְ� �߻��� ���� ���� 

	//printf("10�� ũ�� : %d\n", sizeof(10));
	//printf("10.0�� ũ�� : %d\n", sizeof(10.0));
	//printf("100.0�� ũ�� : %d\n", sizeof(100.0));
	////8�̴�. c������ ������ �⺻���� double �̿���.
	//printf("'a'�� ũ�� : %d\n", sizeof('a'));
	////���ڸ� �Է��ߴµ� 1�� �ƴ� 4�� �����°Ŵ� �ƽ�Ű�ڵ忩��.

//���� 2

//��ĳ�� ���ǰ� , ���ұݾ� �Է�
//���Ҿ� - ���ǰ� �� �� ����ϱ� -> sizeof ����ؼ� õ�� ����� ��� �ʿ� ������
	//	- �ƴϸ� ����
	
	int buy = 0;//����
	int pay = 0; //����
	int get = 0;

		printf("���ǰ��� �Է��ϼ���. :\n");
		scanf("%d",&buy);
		
		fflush(stdin);
		printf("���Ұ��� �Է��ϼ���. :\n");
		scanf("%d",&pay);

		get = pay-buy; //�Ž�����

		if(get>=0){
			printf("=================\n");
			printf("�Ž����� %d ��\n",get);
			printf("=================\n");
			printf("1000�� : %d�� \n",get/1000);
			get % 1000;
			printf("500�� : %d�� \n",get/500);
			get % 500 ;
			printf("100�� : %d�� \n",get/100);
			get%100;
			printf("10�� : %d�� \n",get/10);
		}
	
		else{
			printf("���� �� �����ϼ���\n");
		}





}