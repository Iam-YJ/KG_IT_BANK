#include <stdio.h>

struct Data{
	int a;
	double d;
	char c;
};

typedef struct student{
	int no;
	char name[20];
	int score;
}St;


void linePrint(char ch, int repeat);

void main(){
	//struct Data d1 = {50, 3.45, 'A'};
	//struct Data d2;

	//printf("d2.c(문자) : ");
	//scanf("%c", &d2.c);

	//printf("d2.a(정수) : ");
	//scanf("%d", &d2.a);

	//printf("d2.d(실수) : ");
	//scanf("%lf", &d2.d);


	//printf("d1.a=%d / d1.d=%.2lf / d1.c=%c\n", d1.a, d1.d, d1.c);
	//printf("d2.a=%d / d2.d=%.2lf / d2.c=%c\n", d2.a, d2.d, d2.c);

//학번 : [001]
//이름 : 김태희
//점수 : 54

//학번 : [002]
//이름 : 장동건
//점수 : 100

//***학생 정보 출력***
//=====================
//학번	이름	점수
//---------------------
//1		김태희	54
//2		장동건	100
//=====================
//	struct student st1, st2;
	St st1, st2;
	St * ptr;
	St sArray[2];
	int i;

	ptr = &st1;

	printf("***학생 정보 입력***\n");
	for(i=0; i<2; i++){
		printf("학번 : [000]\b\b");
		scanf("%d", &sArray[i].no);

		fflush(stdin);
		printf("이름 : ");
		scanf("%s", sArray[i].name);

		printf("점수 : ");
		scanf("%d", &sArray[i].score);
	}

	printf("학번 : [000]\b\b");
	scanf("%d", &ptr->no);

	fflush(stdin);
	printf("이름 : ");
	scanf("%s", ptr->name);

	printf("점수 : ");
	scanf("%d", &ptr->score);

	st2 = st1;

	printf("\t***학생 정보 출력***\n");
	linePrint('=', 30);
	printf("%-5s%-20s%-4s\n", "학번", "이름", "점수");
	linePrint('-', 30);

	for(i=0; i<2; i++){
		printf("%-5d%-20s%-4d\n", sArray[i].no, sArray[i].name, sArray[i].score);
	}
	printf("%-5d%-20s%-4d\n", ptr->no, ptr->name, ptr->score);
	printf("%-5d%-20s%-4d\n", st2.no, st2.name, st2.score);
	linePrint('=', 30);

	//struct Data d1 = {10, 3.14, 'A'};
	//struct Data * ptr;

	//ptr = &d1;
	//printf("d1.a=%d / ", d1.a);
	//printf("ptr->a=%d\n", ptr->a);
	//printf("d1.d=%.2lf / ", d1.d);
	//printf("ptr->d=%.2lf\n", ptr->d);
	//printf("d1.c=%c / ", d1.c);
	//printf("ptr->c=%c\n", ptr->c);

}

void linePrint(char ch, int repeat){
	int i;

	for(i=0; i<repeat; i++){
		printf("%c", ch);
	}
	printf("\n");
}
