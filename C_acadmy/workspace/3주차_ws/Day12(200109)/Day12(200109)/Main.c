#include <stdio.h>

void main(){
//�迭�� ������ ����
	//int i;
	//int arr[5] = {1,2,3,4,5};
	//printf("arr\%p\n",arr);
	//for(i=0; i<5; i++){
	//	printf("a[%d] = %d / &a[%d] = %p\n",i,arr[i],i,&arr[i]);
	//}


//�迭�� ������ ���� 2
	//char c = 'a';
	//int i = 3;
	//double d = 3.14;

	//char *cp = &c;
	//int *ip = &i;
	//double *dp = &d;

	//printf("cp=%p / ip=%p / dp = %p\n",cp,ip,dp);
	//cp = cp +1;
	//ip = ip+1;
	//dp = dp+1;
	//printf("cp=%p / ip=%p / dp = %p\n",cp,ip,dp);


//�迭�� ������ ����3
	/*int a[3] = {1,2,3};
	int *ptr;

	ptr = a;

	printf("�ּҰ�\n");
	printf("ptr+0=%p / ptr+1=%p  / ptr+2=%p ",ptr+0,(ptr+1), (ptr+2));
	printf("\n");
	printf("&a[0]=%p / &a[1]=%p  / &a[2]=%p ",&a[0],&a[1],&a[2]);
	printf("\n");
	printf("���� ��\n");
	printf("&a[0]=%d / &a[1]=%d  / &a[2]=%d ",a[0],a[1],a[2]);
	printf("\n");
	printf("*(ptr+0)=%d / *(ptr+1)=%d  / *(ptr+2)=%d ",*(ptr+0),*(ptr+1),*(ptr+2));*/
	//00FBF958


//�迭�� ������ 4
	//int a[5] = {10,20,30,40,50};
	//int *ptr;
	//
	//ptr = a;
	//printf("a=%p\n",a); //100

	//printf("*ptr=%d\n",*ptr);//10
	//printf("*(ptr+1)=%d\n",*(ptr+1));//20

	//printf("ptr[2]=%d\n",ptr[2]);//Ʋ���� 30
	//printf("*(a+2)=%d\n",*(a+2));//30

	//ptr += 2; //ptr = 108
	//printf("a=%p\n",a);//100

	//printf("*p=%d\n",*ptr); //30
	//printf("*(p+2)=%d\n",*(ptr+2)); //50

	//printf("ptr-1=%p\n",ptr-1); //104
	//printf("ptr[-1]=%d\n",ptr[-1]); // Ʋ���� 20

	//printf("a[2]=%d\n",a[2]);//30
	//printf("ptr[2]=%d\n",ptr[2]);//50

	//printf("*ptr+2=%d\n",*ptr+2);//���׿����� *, ���׿����� + >> 32


//�迭�� ������ ���� 5 - ����Ű(+,-),�ε��� �Է¹޾Ƽ� 
	//������ �����ͷ� ����, �������� �迭 �̸����� ����
	//�Է¹��� �ε����κ��� +���������� ��� - ��������
	//���� - �ε��� 3(�迭�� 4), + > ��� 4 5 1 2 3
	//	 - �ε��� 2, - > 3 2 1 5 4 
	//int n, i, j;
	//char p=' ',m=' ', u =' ';
	//int num[5] = {1,2,3,4,5};

	//int *ptr;
	//
	//ptr = num;

	//printf("�ε����� �Է��ϼ��� : \n");
	//scanf("%d",&n);
	//fflush(stdin);
	//printf("����Ű�� �Է��ϼ���(+,-) : \n");
	//scanf("%c",&u);

	//		//for(i = (n-1); i>0; i--){
	//		//printf("%d ",num[n]);
	//		//n--;		
	//		//if(num[n]== num[0]){
	//		//	n=;
	//		//	for(i = 1; i<num[(n-1)]; i++){
	//		//	n--;
	//		//}
	//		//}

	//if(u=='+'){
	//	printf("%c�� �Է��ϼ̽��ϴ�\n",u);
	//		for(i = n; i<5; i++){
	//		printf("%d ",num[i]);
	//		if(i >= 4){
	//			for(j = 0; j<n; j++){
	//			printf("%d ",num[j]);
	//		}
	//		
	//	}
	//}
	//}else if(u=='-'){
	//	printf("%c�� �Է��ϼ̽��ϴ�",u);
	//}
	//printf("����");
	//}


//�迭�� ������ ���� 5 Ǯ��
	//int num[5] = {1,2,3,4,5};
	//int *ptr;
	//int i, index;
	//char dir =' ';

	//ptr = num;

	//printf("���� ���\n");
	//for(i=0; i<5; i++){
	//	printf("%d\n",num[i]);
	//}

	//printf("����Ű�� �Է��ϼ���(+,-) : \n");
	//scanf("%c",&dir);
	//fflush(stdin);
	//printf("�ε����� �Է��ϼ��� : \n");
	//scanf("%d",&index);

	//printf("��� ���\n");

	//if(dir=='+'){
	//	printf("%c�� �Է��ϼ̽��ϴ�\n",dir);
	//	for(i=0; i<5; i++){
	//		printf("%d",*(ptr + index));
	//		index = (index + 1)%5;
	//	}
	//		}
	//else if(dir=='-'){
	//	printf("%c�� �Է��ϼ̽��ϴ�\n",dir);
	//	for(i=0; i<5; i++){
	//		printf("%d",num[index]);
	//		index --;
	//		if(index <0 ){
	//			index = 4;
	//			printf("%d",num[index]);
	//		index --;
	//		}
	//	}
	//}
	//else{
	//	printf("�߸��� �Է��Դϴ�.\n");
	//	
	//}
			
		}
