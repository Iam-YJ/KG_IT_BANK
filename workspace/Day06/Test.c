#include <stdio.h>
#include <stdlib.h>


//문제1
//typedef struct
//{
//	int data1;
//	int data2;
//}Data1;

//문제2
//typedef struct
//{
//	char name[20];
//	int score;
//}Element;
//
//typedef struct
//{
//	int data1;
//	int data2;
//	Element p;
//}Data1;


//문제3
//typedef struct
//{
//	char name[20];
//	int score;
//}Element;
//
//typedef struct
//{
//	int data1;
//	int data2;
//	Element* p;
//}Data1;

//문제4
typedef struct
{
	char* name;
	int score;
}Element;

typedef struct
{
	int data1;
	int data2;
	Element* p;
}Data1;

void Func1(Data1** p);
void Func2(Data1 p);

int main() {

	////문제1
	//Data1* p = (Data1*)malloc(sizeof(Data1));
	////Func1()함수를 만들어서 Func1()안에서 data1에 100을 넣으세요.
	////Func2()함수를 만들어서 Func2()안에서 data2에 200을 넣으세요.
	//Func1(&p);
	//Func2(p);
	////data1과 data2를 출력하세요.
	//printf("%d\n", p->data1);//함수가 실행되고 난 다음에는 변수가 소멸되니까 p로 가르킴
	//printf("%d\n", p->data2);
	//// 동적해제 코드를 추가하세요.
	//free(p); //동적 해제하고자 하는 주소값 


	//문제2
	//Data1* p = (Data1*)malloc(sizeof(Data1));

	//printf("이름을 입력하세요 : ");
	////scanf()를 이용해 name에 이름을 입력 받으세요.
	//scanf("%s", p->p.name);
	//fflush(stdin);
	//printf("점수를 입력하세요 : ");
	////scanf()를 이용해 score에 점수를 입력 받으세요.
	//scanf("%d", &(p->p.score));
	////입력받은 값을 출력하세요.
	//printf("이름은 %s\n", p->p.name);
	//printf("성적은 %d\n", p->p.score);


	//문제3
	//Data1* p = (Data1*)malloc(sizeof(Data1));
	//p->p = (Element*)malloc(sizeof(Element));

	//printf("이름을 입력하세요 : ");
	////scanf()를 이용해 name에 이름을 입력 받으세요.
	//scanf("%s", p->p->name);
	////scanf()를 이용해 score에 점수를 입력 받으세요.
	//printf("점수를 입력하세요 : ");
	//scanf("%d", &(p->p->score));
	////입력받은 값을 출력하세요.
	//printf("이름은 %s", p->p->name);
	//printf("점수는 %d", p->p->score);
	////동적 해제 코드를 추가하세요.
	//free(p);


	//문제4
	Data1* p = (Data1*)malloc(sizeof(Data1));
	p->p = (Element*)malloc(sizeof(Element));
	printf("이름을 입력하세요 : ");
	//scanf()를 이용해 name에 이름을 입력 받으세요.
	scanf("%s", &(p->p->name));
	printf("점수를 입력하세요 : ");
	//scanf()를 이용해 score에 점수를 입력 받으세요.
	scanf("%d", (p->p->score));
	//입력받은 값을 출력하세요.
	printf("이름은 %s", p->p->name);
	printf("점수는 %d", p->p->score);
	//동적 해제 코드를 추가하세요.
	free(p);

	return 0;

}

void Func1(Data1* *p) {//함수가 주소값을 받기를 원했음 
	(**p).data1 = 100;
	//(*p)->data1=100;
}

void Func2(Data1* p) {
	p->data2 = 200;
}