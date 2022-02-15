#include <stdio.h>

void main(){
	
//포인터
// int *ptr 변수(주소 데이터를 저장할 수 있는)
// &a (주소를 알아옵시당) 
// *ptr (참조해서 사용해주세요. 간접접근)

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

	//포인터 예시 2
	//int num1 = 10, num2;
	//int *ptr;

	//ptr = &num1; 
	//num1++; 
	//printf("1번째 *ptr = %d\n",*ptr);

	//num2 = 5;
	//ptr = &num2; 

	//*ptr = *ptr +num1 +num2;
	//printf("num1 = %d\n",num1); 
	//printf("num2 = %d\n",num2);
	//printf("2번째 *ptr = %d\n",*ptr); 
	
//포인터 크기에 대해
	//int i=10;
	//int j=1024;
	//char c = 'A';
	//double d = 3.14;
	//
	//int *ip = &i;
	//char *cp = &c;
	//double *dp = &d;

	//printf("10 = %dbyte\n", sizeof(10)); //4byte - 데이터타입 int 형
	//printf("A = %dbyte\n", sizeof('A')); //4byte - 아스키코드를 사용한다.. 
	//printf("3.14 = %dbyte\n",sizeof(3.14));//8byte - 기본이 더블형이여서 
	//printf("\n");

	//printf("ip = %dbyte\n", sizeof(ip));
	//printf("cp = %dbyte\n", sizeof(cp)); //모든 포인터 변수는 4byte 이다.
	//printf("dp = %dbyte\n",sizeof(dp));
	//printf("\n");
	//
	//printf("j = %d\n",j);
	//c = j;
	//printf("c = %d\n",c); //char에 int 넣었더니, 앞의 3byte는 날라갔다 


	//예시

	//char c = 'a';
	//int i = 3;
	//double d = 3.14;

	//char *cp;
	//int * ip;
	//double *dp;

	//cp = &c;
	//ip = &i;
	//dp = &d;

//포인터 구현하기 1
	//int a=5;
	//double d=3.14;
	//double result ;

	//int *ap; //포인터(변수)를 만들었다
	//double *dp;

	//ap = &a; //ap는 주소를 받아왔다. <-> *ap 는 주소에 해당하는 값이다
	//dp = &d;

	//result = *ap + *dp;

	//printf("합은 %.2lf입니다.\n",result);

//포인터 구현하기 2
	int num1 = 3, num2;
	int *ptr;

	ptr = &num1; //주솟값
	num2 = *ptr; //3
	num2++; //넘2 4

	printf("*ptr=%d / ptr=%p\n",*ptr,ptr); //3 
	printf("num1=%d / &num1=%p\n",num1,&num1); //3 
	printf("num2=%d / &num2=%p\n",num2,&num2); //4
	printf("\n");

	ptr = &num2; //주솟값
	printf("*ptr=%d / ptr=%p\n",*ptr,ptr); //4
	printf("num1=%d / &num1=%p\n",num1,&num1);//3
	printf("num2=%d / &num2=%p\n",num2,&num2);//4
	printf("\n");

	*ptr = *ptr + 3; //4 + 3 = 7
	printf("*ptr=%d / ptr=%p\n",*ptr,ptr);//7
	printf("num1=%d / &num1=%p\n",num1,&num1);//3
	printf("num2=%d / &num2=%p\n",num2,&num2);//7


}