#include <stdio.h>
#include <stdlib.h>

//char name[10];

char* Name() {

	char* name = (char*)malloc(sizeof(char)*20);
	printf("What's your name? \n");
	scanf("%s", name);

	return name;
}

typedef struct
{
	int data1;
	int data2;
}Data1;




int main() {
	//동적할당
	
	//예제1 작성 후 문제점 찾기
	//문제점 지역변수여서 > 전역변수로 하면 된다
	//char* name1, * name2;

	//name1 = Name();
	//name2 = Name();
	//printf("Your name is %s.\n", name1);
	//printf("Your name is %s.\n", name2);

	//free(name1);
	//free(name2);

	//int * ptr = (int*)malloc(sizeof(int)); //void *_cdecl malloc(size_t_Size)
	// 주소를 반환한다 (void 포인터형)
	//*ptr = 10;
	//printf("%d \n", *ptr);
	//free(ptr); //void_cded free(void *_Block) //동적 해제하고자하는 공간의 주소

	//예제2 - 그림을 보고 코드를 작성해라
	//int* ptr = (int*)malloc(sizeof(int)*5);
	//for (int i = 0; i < 5; i++) {
	//	ptr[i] = (i + 1) * 10;
	//	printf("%d ", ptr[i]);
	//}
	//printf("\n");

	//예제2 새로운 풀이
	//int arr[20] = { 10,20,30,40,50 };
	//int* ptr = (int*)malloc(sizeof(int)*5); //~~ 공간의 크기만 정해준 것
	//ptr = arr; // 이제 arr과 ptr을 연결? 해줌 
	//printf("%d %d", *ptr, *(ptr + 1));


	//문제1
	Data1* p = (Data1*)malloc(sizeof(Data1));
	Func1(&p);
	//Func1()함수를 만들어서 Func1()안에서 data1에 100을 넣으세요.
	Func2(*p);
	//Func2()함수를 만들어서 Func2()안에서 data2에 200을 넣으세요.	
	//data1과 data2를 출력하세요.
	// 동적해제 코드를 추가하세요.
	free(p->data1);
	free(p->data2);

	return 0;
}

void Func1(Data1 *p) {
	(*p).data1 = 100;
	printf("%d", (*p).data1);
}

void Func2(Data1 p) {
	p.data1 = 200;
	printf("%d", p.data1);
}


