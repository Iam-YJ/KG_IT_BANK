#include <stdio.h>

void main(){

	//int num;

	//printf("���� �Է� : ");
	//scanf("%d",&num);

	//switch(num){
	//case 1:
	//	printf("1�� �ԷµǾ����ϴ� \n");
	//	break;
	//case 2 :
	//	printf("2�� �ԷµǾ����ϴ� \n");
	//	break;
	//case 100:
	//	printf("100�� �ԷµǾ����ϴ� \n");
	//	break;
	//default:
	//	printf("�������� ���� �ƴմϴ� \n");
	//	break;


	//char label;

	//printf("���� �Է� : ");
	//scanf("%c",&label);

	//switch(label){
	//case 'a': 
	//	printf("a �Է�\n");
	//	break;
	//case 'b':
	//	printf("b �Է� \n");
	//	break;
	//default :
	//	printf("a�� b�� ������ ���� �Է� \n");
	//}

	//3�� ����� ����ϱ�
	//int num;
	//int three=0;
	//
	//printf("���ڸ� �Է��ϼ��� \n");
	//scanf("%d",&num);
	//
	//three = num % 3;

	//switch(three){
	//	case 0:
	//		printf("3�� ����� �ԷµǾ����ϴ� \n");
	//		break;

	//	default :
	//		printf("3�� ����� �ƴմϴ� \n");
	//		break;
	//}

	//����1 1~10���� ���ڸ� �Է��ؼ� 
	//1,2,3-ǥ�� ����������
	/*int num;
	printf("1~10������ ���ڸ� �Է��ϼ��� : \n");
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

	//����2 : �޴� �ڵ带 �Է¹޾�
	//f/F�� [File Menu]
	//e/E�� [Edit Menu]
	//h/H [Help Menu]
	//������ error

	//char c;
	//printf("�޴� �ڵ带 �Է��ϼ��� : [] \n");
	//scanf("%c",&c);

	//printf("�޴� �ڵ� �Է� : [%c]\n",c);

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

	//����3 : �� ������ ������ �Է¹޾� �հԿ� ��� ���ϰ�
	//��� 90�̻� a 80b 70c 60d ������f
	/*	int kor, eng, math;
	int sum = 0;
	int avg = 0;
	int avgg = 0;
	int grade = ' ';

	printf("���� ���� ���� ������ �Է��ϼ��� : \n");
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
	printf("�հ� ���� : %d �� \n",sum);
	printf("��� ���� : %d �� \n",avg);
	printf("��		�� : %c \n",grade);*/


	//int sum =0;
	//int num=0;

	//while(num<100){
	//	num ++ ;
	//	printf("%d + %d = %d\n",sum,num,sum+num);
	//	sum += num;
	//
	//}

	//�޸��� �����
	/*char ch;
	printf("���ڿ� �Է� : \n");
	while((ch=getchar()) != -1){
	printf("%c ",ch);
	}
	printf("\n");*/

	//���ĺ��� ��� �ҹ���, ���ĺ��� �ƴϸ� * - ���� ������ x
	//char ch;
	//printf("���ڿ� �Է� : \n");
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

	//���ĺ��� ����ϴ� �ݺ���	
	//char ch;
	//printf("���ĺ��� �Է��ϼ��� : ");

	//while((ch=getchar())!= '\n'){
	//	if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
	//		printf("%c",ch);
	//	}
	//}

	//do-while�� 1~100 �� ���ϱ�
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


	//���ڿ� �Է¹ް� ���� while������ ������
	//q �Է� �޾��� �� ���α׷� ����

	//char ch = ' ';

	//while(1){
	//	fflush(stdin);
	//	printf("���ڸ� �Է��ϼ��� : ");
	//	scanf("%c",&ch);
	//	printf("���� ��� : %c\n",ch);
	//	
	//	if(ch == 'q'){
	//		break;
	//	}else{
	//		continue;
	//	}

	//}




}