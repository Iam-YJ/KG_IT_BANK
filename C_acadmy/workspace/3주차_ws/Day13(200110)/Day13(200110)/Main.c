#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void func(char *str);
void happy(char *str);
void sCount (char *str, int *num);

void main(){
	

	//printf("%s\n","Happy Birthday"); //"~~" 
	//printf("%s\n","Happy Birthday"+1);
	//printf("%s\n","Happy Birthday"+6);
	//printf("%s\n","========================");

	//func("Happy Birthday");

//�迭�� ���ڿ�
	//char str[] = {'H','a','a','p','p','y',' ','B','i','r','t','h','d','a','y','\0'};
//	char str[] = "Happy Birthday"; //�̰Ŵ� �ּҰ�!

	//int i, size;
	//size = sizeof(str)/sizeof(str[0]);
	//for(i=0; i<size; i++){
	//	printf("%c", str[i]);
	//}printf("\n");
	//printf("%s\n",str);
	
	//���� ���� 1
	//printf("Before : %s\n",str);
	//happy(str);
	//printf("After : %s\n",str);

	//scanf �� gets ������
	//char str[255];
	//
	//printf("scanf ���ڿ� �Է� : ");
	//scanf("%s",str);
	//printf("scanf �Է� ���� ���ڿ� : %s\n",str);

	//fflush(stdin);
	//printf("gets ���ڿ� �Է� : ");
	//gets(str);
	//printf("gets �Է� ���� ���ڿ� : %s\n",str);

//gets ���� - ���ڿ��� �Է¹ް�, �Է� ���� ���ڿ��� ���� ���� Ȯ���ϱ�
	//���ο��� �Լ� �޾Ƽ� > ���� �Լ� > �� �㿡 ���
	//char str[255];
	//int num=0;

	//printf("���ڿ� �Է� : ");
	//gets(str);
	//printf("�Էµ� ���ڿ� : %s\n", str);

	//sCount(str, &num);
	//printf("���ڿ� ���� : %d\n", num);


//strlen ����
	//char name[20];
	//int length = 0;

	//printf("�̸� �Է� : " );
	//gets(name);

	//length = strlen(name);
	//printf("������ ���� : %d\n",length);

//strcpy
	//char str[255] = "Happy BirthDay";
	//char copy_str[255];
	//int i;

	//printf("str : %s\n",str);
	//printf("before copy_str : %s\n",copy_str);

	//for(i=0; str[i] != '\0'; i++){
	//	copy_str[i] = str[i];
	//}
	//copy_str[i] = '\0';
	//printf("after copy_str : %s\n",copy_str);

//strcpy
	//char str[255] = "Happy BirthDay";
	//char copy_str[255];
	//int i;

	//printf("str : %s\n",str);
	//printf("before copy_str : %s\n",copy_str);

	//strcpy(copy_str,str);
	//printf("after copy_str : %s\n",copy_str);


//���ڿ� �Է¹ް�, �Է� ���� ���ڿ��� ������ �����ϴ� ���α׷�
	//char str[200];
	//char copy_str[200] ;
	//int i,ic=0;

	//printf("���ڸ� �Է��ϼ��� : \n");
	//gets(str);

	//printf("�Է¹��� ���ڿ��� %s �Դϴ�\n",str);
	//
	//for(i=0; str[i] != '\0'; i++){
	//	if(str[i] != ' '){
	//		copy_str[ic] = str[i];
	//		ic++;
	//	}
	//}copy_str[ic] = '\0';
	//printf("��µǴ� ���ڿ��� %s �Դϴ�\n",copy_str);

//�������� - Ǯ��
	//char buf[255], copy[255];
	//int i,index=0,size;

	//printf("���ڿ� �Է� : ");
	//gets(buf);
	//printf("�Էµ� ���ڿ� : %s\n",buf);

	//size = strlen(buf);
	//for(i=0; i<size; i++){
	//	if(buf[i] != ' '){
	//		copy[index] = buf[i];
	//		index++;
	//	}
	//}copy[index] = '\0';
	//strcpy(buf,copy); //������ ���� copy�� buf�� �ִ´�

	//printf("���� ���ŵ� ���ڿ� %s\n",buf);

//strcat
	//char str1[20] = "Happy";
	//char str2[20] = "World";

	//printf("%s\n",str1);
	//strcat(str1,str2);
	//printf("%s\n",str1);


//strcat - ���� // ���� �̸��� �Է¹޾� ".txt"Ȯ���ڸ� ���̼���
	//char str1[20];
	//char str2[20] = ".txt";
	//
	//printf("���� �̸��� �Է��ϼ��� : ");
	//gets(str1);

	//strcat(str1,str2);
	//printf("%s\n",str1);
	//strcat(str1,".txt");

//strcmp 
	//char fStr[20] = "c language";
	//char sStr[20];
	//int flag = 1;

	//while(flag){
	//printf("���� ���ڿ� : %s\n",fStr);
	//printf("�� ���ڿ��� �Է��ϼ��� : ");
	//gets(sStr);

	//flag = strlen(sStr);
	//if(flag>10){
	//	printf("���α׷� ����");
	//	break;
	//}

	//if(strcmp(fStr,sStr)==1){
	//	printf("%s�� �� Ů�ϴ�.\n",fStr);
	//}else if(strcmp(fStr,sStr)==0){
	//	printf("%s�� %s�� �����ϴ�.\n",fStr,sStr);
	//}else {
	//	printf("%s�� �� Ů�ϴ�. \n",sStr);
	//}
	//printf("\n");
	//system("pause");
	//system("cls");
	//}

//�� ���� - ���� ���� ���� ������ �� ���ǿ� ���� �޼��� ����ϱ�
//��ǻ�� -> �� �̸� , 
//���� / ���� / �� ���� : ��
//--> �����ϴ�

}




//void func(char *str){
//	printf("%s\n",str);
//	printf("%s\n",str+1);
//	printf("%s\n",str+6);
//}


////���� ���� 1
////srt�� �Լ��� ���� > �Լ� ��ҹ��� ���� >> ����� ���� ���ο��� ���
//void happy(char *str){
//
//	int i;
//	char n,o;
//
//	for(i=0; str[i] != '\0'; i++){ //a97 A65
//		if((str[i] >='a') && (str[i] <='z')){
//			str[i] -= 32;
//			
//		}else if((str[i] >='A') && (str[i] <= 'Z')){
//			str[i] += 32;
//		}else{
//			str[i] = str[i];
//		}
//}
//	
//}


//gets ���� - ���ڿ��� �Է¹ް�, �Է� ���� ���ڿ��� ���� ���� Ȯ���ϱ�
//void sCount (char *str, int *num){
//	int i=0;
//
//	while(str[i] != '\0'){
//		(*num)++;
//		i++;
//	}
//}
