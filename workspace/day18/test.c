//#include <stdio.h>
//#include <stdlib.h>
//#include <limits.h>
//
//
//int a[] = { 5, 4, 3, 8, 9, 6, 7, 1, 10, 2 };
//
//void Print() {
//	int i = 0;
//
//	for (i = 0; i < 10; i++) {
//		printf("%d ", a[i]);
//	}printf("\n");
//}
//
//void Swap(int *a, int *b) {
//	int tmp = *a;
//	*a = *b;
//	*b = tmp;
//
//}
//
//void Quick(int start, int end) {
//
//	if (start >= end) {
//		return;
//	}
//	int key = start, i = start + 1, j = end;
//
//	while (i <= j) {
//		while (i <= end && a[i] <= a[key]) {
//			i++;
//		}
//		while (j > start&& a[j] >= a[key]) {
//			j--;
//		}
//		if (i > j) {
//			Swap(&a[key], &a[j]);
//		}
//		else {
//			Swap(&a[i], &a[j]);
//	}
//	Quick(start,j-1);
//	Quick(j+1,end);
//
//}
//
////내가 짜다만 quick
////void Quick() {
////	int* min, max, tmp;
////
////	for (int i = 0; i < 9; i++) {
////		int fi = &a[i];
////
////		for (int j = 1; j < 9; j++) {
////			if (fi < &a[j]) {
////				max = &a[j];
////				printf("%d \n", max);
////				j = 10;
////			}
////
////
////		}
////
////		for (int k = 9; k > 0; k--) {
////			if (fi > a[k]) {
////				min = a[k];
////				printf("%d \n", min);
////				return;
////			}
////
////		}
////		tmp = min;
////		min = max;
////		max = tmp;
////
////
////
////		//printf("%d \n", min);
////
////
////	}
//
//
//
//
//
//int main(void) {
//
//	Quick(0,9);
//	Print();
//
//
//	return 0;
//}