#include <stdio.h>
#include <math.h>


typedef struct student{ 
char name[10];
int kor, eng, math;

}STUDENT, STU; //����ü ����

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

	//����ü
	
	//struct student stu; //����ü ���� ����
	//STU stu;

	//����ü ���� ���� case 1
	/*strcpy(stu.name, "������");
	stu.kor = 100;
	stu.eng = 99;
	stu.math = 98;*/

	//����ü ���� ���� case2
	/*struct student stu = { "������",100,99,98 };
	printf("%s %d %d %d\n",stu.name, stu.kor, stu.eng, stu.math);*/


	//����1 - �Է¹��� �� �� ������ �Ÿ��� ���ϼ��� 
	//point p1, p2;
	//double d;

	//printf("�Ÿ��� ���� �� 1�� x,y��ǥ�� �Է��ϼ��� : ");
	//scanf("%d %d", &p1.x,&p1.y);

	//printf("�Ÿ��� ���� �� 2�� x,y��ǥ�� �Է��ϼ��� : ");
	//scanf("%d %d", &p2.x, &p2.y);

	//d = sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	//printf("Distance : %f\n", d);


	//�����ͺ����� �����ؼ� ����ü ����� ����
	//point *p = &p1;
	//(*p).x = 5;
	//(*p).y = 6;
	//p->x = 5;
	//p->y = 6;


	//���� 1 - �Է� �� �׸����� ǥ��
	//struct point cen = { 2,7 };
	//double red = 5.5;
	//struct circle ring = { red, &cen };
	//printf("���� ������ : %g\n", ring.radius);
	//printf("���� �߽� [%d, %d]\n", (ring.center)->xpos, (ring.center)->ypos);

	//����2 - ����ü ������ �� ����� �����Ͽ� ���. ���� �ϼ� �� �׸����� ǥ��
	/*struct point pos1 = { 1,1 };
	struct point pos2 = { 2,2 };
	struct point pos3 = { 3,3 };

	pos2.ptr = &pos1;
	pos3.ptr = &pos2;
	pos1.ptr = &pos3;

	printf("%p\n", pos2.ptr);
	printf("%p\n", pos3.ptr);
	printf("%p\n", pos1.ptr);*/


	//����ü
	/*printf("����ü�� ũ�� : %d byte\n", sizeof(s));
	printf("����ü�� ũ�� : %d byte\n", sizeof(u));*/

	//s str;
	//u uni;
	//printf("%p %p %p \n", &str.num1, &str.num2, &str.num3);
	//printf("%p %p %p \n", &uni.num1, &uni.num2, &uni.num3);


	//u uni;
	//uni.num1 = 10;
	//printf("%d\n", uni.num2); //10����
	//printf("%f\n", uni.num3);//�̻��� �� ���� 

	u uni;
	uni.n2 = 0x12345678;
	printf("0x%x\n", uni.n2);
	printf("0x%x\n", uni.n1);
	printf("0x%x\n", uni.ch);
	printf("%d\n", sizeof(uni));


	return 0;
}