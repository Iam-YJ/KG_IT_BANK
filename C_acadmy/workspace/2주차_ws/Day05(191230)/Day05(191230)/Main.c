#include <stdio.h>

void main(){

	//���� Ǯ��
	//int price, cash, change;
	//int k, kc, hk,hkc, m,mc,d,dc;

	//price = 460;
	//printf("���ǰ� : %d�� \n ", price);
	//cash = 10000;
	//printf("���Ҿ� : %d�� \n", cash);

	//change = cash - price;

	//printf("====================\n");
	//printf("�Ž����� : %d��\n", change);
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

	//printf("%6s : %2d��\n","1000��", k);
	//printf("%6s : %2d��\n","500��", hk);
	//printf("%6s : %2d��\n","100��", m);
	//printf("%6s : %2d��\n","10��", d);


	//��� : ���α׷��� �帧�� �ٲ� �� �ִ�.
	//����
	//���ǹ� : if, if-else, if - else if
	//�ݺ��� : while, do-while, for
	//�б⹮ : switch-case, break, continue, goto
	// �б⹮ : call(return �ٽ� ���ƿ�), jump(�ٽ� ���ƿ��� ����)

	/*int num ; 
	printf("���� �Է� : ");
	scanf("%d",&num);

	if(num < 0){
	num *= -1 ;
	printf("������ ����� ��ȯ�Ǿ����ϴ�.\n");
	}
	printf("��� : %d\n",num);
	*/


	/*char ch;
	printf("���� �Է� : ");
	scanf("%c",&ch);

	if(ch>='a'&& ch<='z'){
	ch -= ('a'-'A');
	printf("�ҹ��ڰ� �빮�ڷ� ��ȯ�Ǿ����ϴ�.\n");
	}
	printf("��� : %c\n",ch);*/


	//if-else ���� 1
	//���ڸ� �Է¹ް�, ���ĺ��� ���, 
	//���� - �빮�ڸ� �ҹ��ڷ� ��ȯ
	//char ch;
	//printf("���ڸ� �Է��ϼ��� : \n");
	//scanf("%c",&ch);
	//

	//if(((ch>='a')&&(ch<='z'))||(ch>='A')&& (ch<='Z')){
	//	if((ch>='A')&& (ch<='Z')){
	//		ch += ('a'-'A');
	//		printf("�빮�ڰ� �ҹ��ڷ� ��ȯ�Ǿ����ϴ�.\n");
	//		printf("��� : %c\n",ch);	
	//	}
	//	else{ 
	//		printf("��� : %c\n",ch);
	//		ch = ' ';
	//	}
	//}else {
	//	printf("���ĺ��� �Է��ϼ���\n");
	//}


	//���� 2 - �� ���� ������ �Է� �޾� ū ���� ���
	/*	int a;
	int b;
	printf("�� ���� ������ �Է��ϼ��� : \n");
	scanf("%d%d",&a,&b);
	printf("�� ū ������ " );
	if(a>b){
	printf("%d �Դϴ�\n",a);
	}else{
	printf("%d �Դϴ�\n",b);
	}*/	


	//���� 3 - ������ ���� ���� �Է¹޾� 60�� �̻��̸� �հ�, �Ѱ��� �̻� 60�� �̸��̸� ���հ�
	//int kor;
	//int eng;
	//int math;
	//int sum = 0;

	//printf("����, ����, ������ ������ �Է��ϼ��� : \n");
	//scanf("%d%d%d",&kor,&eng,&math);
	//sum = kor + eng + math;
	//if(kor>=60&&eng>=60&&math>=60){
	//printf("�հ��Դϴ�\n");
	//}else {
	//printf("���հ��Դϴ�\n");
	//}


	//����4 - ���� �Է¹޾Ƽ�, Ȧ/¦/���� ���� 
	/*int a ;
	int aN;
	printf("���ڸ� �Է����ּ��� : \n");
	scanf("%d",&a);

	if(a >= 0) {
		aN = a % 2;
		printf("%d�� ��� �Դϴ�\n",a);
		if(aN == 0){
			printf("%d�� ¦�� �Դϴ� \n",a);
	
		}
		else{
			printf("%d�� Ȧ�� �Դϴ� \n",a);
		}

	}else {
		printf("%d�� ���� �Դϴ�\n",a);

	}*/

	//����5 - ������ ���� �Է¹޾Ƽ� ��� ���ϼ��� 
	//��� 60�̻� �հ� , 60�̸� ���հ�
	//�� ���� 60�� �̸��̸� ����

	//int kor, eng, math;
	//int sum = 0;
	//int ave = 0;

	//printf("���� ���� ���� ������ �Է��ϼ��� : \n");
	//scanf("%d%d%d",&kor,&eng,&math);
	//sum = kor + eng + math;
	//ave = sum /3 ;
	//
	//printf("���� %d��, ���� %d��, ���� %d�� �Դϴ�\n",kor,eng,math);
	//if(ave>=60){
	//	if(kor>=60 && eng>=60 && math>=60){
	//		printf("��� %d�� �Դϴ�.\n",ave);
	//		printf("���迡 �հ��ϼ̽��ϴ�.\n");

	//	}else {
	//		
	//		if(kor<60){
	//			printf("���� ���� �����Դϴ�.\n");
	//		}
	//		if(eng<60){
	//			printf("���� ���� �����Դϴ�.\n");
	//		}
	//		if(math<60){
	//			printf("���� ���� �����Դϴ�.\n");
	//		}
	//		printf("���迡 ���հ��ϼ̽��ϴ�.\n");
	//	}
	//}else {
	//	printf("��� %d�� �Դϴ�.\n",ave);
	//	printf("��� �̴� �Դϴ�.\n");
	//	printf("���迡 ���հ��ϼ̽��ϴ�.\n");
	//}

	//����6 - �����������ް� ���հ� ���� ��� 70���� �۱�
	/*int kor, eng, math;
	int sum = 0;
	int ave = 0;

	printf("���� ���� ���� ������ �Է��ϼ��� : \n");
	scanf("%d%d%d",&kor,&eng,&math);
	sum = kor + eng + math;
	ave = sum /3 ;
	
	if(ave<=70){
		printf("���հ�\n");
	}else if(kor<60){
		printf("���� ���հ�\n");
	}else if(eng<60){
		printf("���� ���հ�\n");
	} else if(math<60){
		printf("���� ���հ�\n");
	}else{
		printf("�հ�\n");
	}*/

	//���� - ������ �������� �Է¹޾Ƽ�, ����� ���� �Ŀ�
	//��� 90�̻� a��� ... 80b 70c 60d �׾Ʒ�f
	//�����__�� __����Դϴ�.


	int kor, eng, math;
	int sum = 0;
	char grade = ' ';
	
	printf("���� ���� ���� ������ �Է��ϼ��� : \n");
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
	
	printf("����� %d�� %c ����Դϴ�." , sum, grade);

	





}