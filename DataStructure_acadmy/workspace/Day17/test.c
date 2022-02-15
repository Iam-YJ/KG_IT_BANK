//#include <stdio.h>
//#include <stdlib.h>
//#include <limits.h>
//
////INT_MAX; //int 형으로 표현할 수 있는 최대값
////INT_MIN; //int 형으로 표현할 수 있는 최솟값 
//int a[] = { 10, 98, 26, 32, 55, 121, 395, 33, 90, 27 };
//
//void Swap(int* a, int* b) {
//	int tmp = *a;
//	*a = *b;
//	*b = tmp;
//
//}
//
//void Print() {
//	int i = 0;
//
//	for (i = 0; i < 10; i++) {
//		printf("%d ", a[i]);
//	}printf("\n");
//}
//
//void Selection() {
//	int idx, min;
//
//	for (int i = 0; i < 10; i++) {
//		min = INT_MAX;
//		for (int j = i; j < 10; j++) {
//			if (min > a[j]) {
//				min = a[j];
//				idx = j;
//			}
//		}
//		Swap(&a[i], &a[idx]);
//		printf("%d 회전 : ", i + 1);
//		Print();
//	}
//}
//
//void Insertion() {
//
//	for (int i = 0; i < 9; i++) {
//		for (int j = i; j >= 0; j--) {
//			if (a[j] > a[j + 1]) {
//				Swap(&a[j], &a[j + 1]);
//			}
//		}
//		printf("%d 회전 : ", i + 1);
//		Print();
//	}
//
//}
//
//
//void Insertion2() {
//
//	for (int i = 0; i < 9; i++) {
//			
//	while (a[i] > a[i + 1]) {
//				Swap(&a[i], &a[i + 1]);
//				i--;
//			}
//	
//		printf("%d 회전 : ", i + 1);
//		Print();
//	}
//
//}
//
//
//int main(void) {
//	int i = 0;
//
//	//Selection();
//
//	Insertion();
//
//	//Insertion2();
//
//
//
//
//	return 0;
//}