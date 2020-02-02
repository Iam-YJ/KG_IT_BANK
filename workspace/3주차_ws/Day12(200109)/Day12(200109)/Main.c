#include <stdio.h>

void main(){
//배열과 포인터 예시
	//int i;
	//int arr[5] = {1,2,3,4,5};
	//printf("arr\%p\n",arr);
	//for(i=0; i<5; i++){
	//	printf("a[%d] = %d / &a[%d] = %p\n",i,arr[i],i,&arr[i]);
	//}


//배열과 포인터 예시 2
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


//배열과 포인터 예시3
	/*int a[3] = {1,2,3};
	int *ptr;

	ptr = a;

	printf("주소값\n");
	printf("ptr+0=%p / ptr+1=%p  / ptr+2=%p ",ptr+0,(ptr+1), (ptr+2));
	printf("\n");
	printf("&a[0]=%p / &a[1]=%p  / &a[2]=%p ",&a[0],&a[1],&a[2]);
	printf("\n");
	printf("이제 값\n");
	printf("&a[0]=%d / &a[1]=%d  / &a[2]=%d ",a[0],a[1],a[2]);
	printf("\n");
	printf("*(ptr+0)=%d / *(ptr+1)=%d  / *(ptr+2)=%d ",*(ptr+0),*(ptr+1),*(ptr+2));*/
	//00FBF958


//배열과 포인터 4
	//int a[5] = {10,20,30,40,50};
	//int *ptr;
	//
	//ptr = a;
	//printf("a=%p\n",a); //100

	//printf("*ptr=%d\n",*ptr);//10
	//printf("*(ptr+1)=%d\n",*(ptr+1));//20

	//printf("ptr[2]=%d\n",ptr[2]);//틀렸음 30
	//printf("*(a+2)=%d\n",*(a+2));//30

	//ptr += 2; //ptr = 108
	//printf("a=%p\n",a);//100

	//printf("*p=%d\n",*ptr); //30
	//printf("*(p+2)=%d\n",*(ptr+2)); //50

	//printf("ptr-1=%p\n",ptr-1); //104
	//printf("ptr[-1]=%d\n",ptr[-1]); // 틀렸음 20

	//printf("a[2]=%d\n",a[2]);//30
	//printf("ptr[2]=%d\n",ptr[2]);//50

	//printf("*ptr+2=%d\n",*ptr+2);//단항연산자 *, 이항연산자 + >> 32


//배열과 포인터 예시 5 - 방향키(+,-),인덱스 입력받아서 
	//왼쪽은 포인터로 접근, 오른쪽은 배열 이름으로 접근
	//입력받은 인덱스로부터 +오른쪽으로 출력 - 왼쪽으로
	//예제 - 인덱스 3(배열의 4), + > 출력 4 5 1 2 3
	//	 - 인덱스 2, - > 3 2 1 5 4 
	//int n, i, j;
	//char p=' ',m=' ', u =' ';
	//int num[5] = {1,2,3,4,5};

	//int *ptr;
	//
	//ptr = num;

	//printf("인덱스를 입력하세요 : \n");
	//scanf("%d",&n);
	//fflush(stdin);
	//printf("방향키를 입력하세요(+,-) : \n");
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
	//	printf("%c를 입력하셨습니다\n",u);
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
	//	printf("%c를 입력하셨습니다",u);
	//}
	//printf("종료");
	//}


//배열과 포인터 예시 5 풀이
	//int num[5] = {1,2,3,4,5};
	//int *ptr;
	//int i, index;
	//char dir =' ';

	//ptr = num;

	//printf("정수 출력\n");
	//for(i=0; i<5; i++){
	//	printf("%d\n",num[i]);
	//}

	//printf("방향키를 입력하세요(+,-) : \n");
	//scanf("%c",&dir);
	//fflush(stdin);
	//printf("인덱스를 입력하세요 : \n");
	//scanf("%d",&index);

	//printf("결과 출력\n");

	//if(dir=='+'){
	//	printf("%c를 입력하셨습니다\n",dir);
	//	for(i=0; i<5; i++){
	//		printf("%d",*(ptr + index));
	//		index = (index + 1)%5;
	//	}
	//		}
	//else if(dir=='-'){
	//	printf("%c를 입력하셨습니다\n",dir);
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
	//	printf("잘못된 입력입니다.\n");
	//	
	//}
			
		}
