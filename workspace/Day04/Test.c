#include <stdio.h>
#include <math.h>


typedef struct student{ 
char name[10];
int kor, eng, math;

}STUDENT, STU; //구조체 정의

typedef struct{
	int x,y;
	
}point;

struct point {
	int xpos;
	int ypos;
	struct point* ptr;
};

struct circle {
	double radius;
	struct point* center;
};

typedef struct {
	int num1, num2;
	double num3;

}s;

typedef union {
	int num1, num2;
	double num3;
	char ch;
	short n1;
	int n2;

}u;

int main() {

	//구조체
	
	//struct student stu; //구조체 변수 선언
	//STU stu;

	//구조체 변수 선언 case 1
	/*strcpy(stu.name, "박유진");
	stu.kor = 100;
	stu.eng = 99;
	stu.math = 98;*/

	//구조체 변수 선언 case2
	/*struct student stu = { "박유진",100,99,98 };
	printf("%s %d %d %d\n",stu.name, stu.kor, stu.eng, stu.math);*/


	//문제1 - 입력받은 두 점 사이의 거리를 구하세요 
	//point p1, p2;
	//double d;

	//printf("거리를 구할 점 1의 x,y좌표를 입력하세요 : ");
	//scanf("%d %d", &p1.x,&p1.y);

	//printf("거리를 구할 점 2의 x,y좌표를 입력하세요 : ");
	//scanf("%d %d", &p2.x, &p2.y);

	//d = sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	//printf("Distance : %f\n", d);


	//포인터변수를 선언해서 구조체 멤버에 접근
	//point *p = &p1;
	//(*p).x = 5;
	//(*p).y = 6;
	//p->x = 5;
	//p->y = 6;


	//예제 1 - 입력 후 그림으로 표현
	//struct point cen = { 2,7 };
	//double red = 5.5;
	//struct circle ring = { red, &cen };
	//printf("원의 반지름 : %g\n", ring.radius);
	//printf("원의 중심 [%d, %d]\n", (ring.center)->xpos, (ring.center)->ypos);

	//예제2 - 구조체 변수의 각 멤버에 접근하여 출력. 예제 완성 후 그림으로 표현
	/*struct point pos1 = { 1,1 };
	struct point pos2 = { 2,2 };
	struct point pos3 = { 3,3 };

	pos2.ptr = &pos1;
	pos3.ptr = &pos2;
	pos1.ptr = &pos3;

	printf("%p\n", pos2.ptr);
	printf("%p\n", pos3.ptr);
	printf("%p\n", pos1.ptr);*/


	//공용체
	/*printf("구조체의 크기 : %d byte\n", sizeof(s));
	printf("공용체의 크기 : %d byte\n", sizeof(u));*/

	//s str;
	//u uni;
	//printf("%p %p %p \n", &str.num1, &str.num2, &str.num3);
	//printf("%p %p %p \n", &uni.num1, &uni.num2, &uni.num3);


	//u uni;
	//uni.num1 = 10;
	//printf("%d\n", uni.num2); //10나옴
	//printf("%f\n", uni.num3);//이상한 수 나옴 

	u uni;
	uni.n2 = 0x12345678;
	printf("0x%x\n", uni.n2);
	printf("0x%x\n", uni.n1);
	printf("0x%x\n", uni.ch);
	printf("%d\n", sizeof(uni));


	return 0;
}