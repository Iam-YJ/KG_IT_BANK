#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void func(char *str);
void happy(char *str);
void sCount (char *str, int *num);

void main(){
	

	//printf("%s\n","Happy Birthday"); //"~~" 
	//printf("%s\n","Happy Birthday"+1);
	//printf("%s\n","Happy Birthday"+6);
	//printf("%s\n","========================");

	//func("Happy Birthday");

//배열과 문자열
	//char str[] = {'H','a','a','p','p','y',' ','B','i','r','t','h','d','a','y','\0'};
//	char str[] = "Happy Birthday"; //이거는 주소값!

	//int i, size;
	//size = sizeof(str)/sizeof(str[0]);
	//for(i=0; i<size; i++){
	//	printf("%c", str[i]);
	//}printf("\n");
	//printf("%s\n",str);
	
	//문제 예시 1
	//printf("Before : %s\n",str);
	//happy(str);
	//printf("After : %s\n",str);

	//scanf 와 gets 차이점
	//char str[255];
	//
	//printf("scanf 문자열 입력 : ");
	//scanf("%s",str);
	//printf("scanf 입력 받은 문자열 : %s\n",str);

	//fflush(stdin);
	//printf("gets 문자열 입력 : ");
	//gets(str);
	//printf("gets 입력 받은 문자열 : %s\n",str);

//gets 문제 - 문자열을 입력받고, 입력 받은 문자열의 문자 갯수 확인하기
	//메인에서 함수 받아서 > 서브 함수 > 그 담에 출력
	//char str[255];
	//int num=0;

	//printf("문자열 입력 : ");
	//gets(str);
	//printf("입력된 문자열 : %s\n", str);

	//sCount(str, &num);
	//printf("문자열 길이 : %d\n", num);


//strlen 예시
	//char name[20];
	//int length = 0;

	//printf("이름 입력 : " );
	//gets(name);

	//length = strlen(name);
	//printf("문자의 길이 : %d\n",length);

//strcpy
	//char str[255] = "Happy BirthDay";
	//char copy_str[255];
	//int i;

	//printf("str : %s\n",str);
	//printf("before copy_str : %s\n",copy_str);

	//for(i=0; str[i] != '\0'; i++){
	//	copy_str[i] = str[i];
	//}
	//copy_str[i] = '\0';
	//printf("after copy_str : %s\n",copy_str);

//strcpy
	//char str[255] = "Happy BirthDay";
	//char copy_str[255];
	//int i;

	//printf("str : %s\n",str);
	//printf("before copy_str : %s\n",copy_str);

	//strcpy(copy_str,str);
	//printf("after copy_str : %s\n",copy_str);


//문자열 입력받고, 입력 받은 문자열의 공백을 제거하는 프로그램
	//char str[200];
	//char copy_str[200] ;
	//int i,ic=0;

	//printf("문자를 입력하세요 : \n");
	//gets(str);

	//printf("입력받은 문자열은 %s 입니다\n",str);
	//
	//for(i=0; str[i] != '\0'; i++){
	//	if(str[i] != ' '){
	//		copy_str[ic] = str[i];
	//		ic++;
	//	}
	//}copy_str[ic] = '\0';
	//printf("출력되는 문자열은 %s 입니다\n",copy_str);

//공백제거 - 풀이
	//char buf[255], copy[255];
	//int i,index=0,size;

	//printf("문자열 입력 : ");
	//gets(buf);
	//printf("입력된 물자열 : %s\n",buf);

	//size = strlen(buf);
	//for(i=0; i<size; i++){
	//	if(buf[i] != ' '){
	//		copy[index] = buf[i];
	//		index++;
	//	}
	//}copy[index] = '\0';
	//strcpy(buf,copy); //공백이 빠진 copy를 buf에 넣는다

	//printf("공백 제거된 문자열 %s\n",buf);

//strcat
	//char str1[20] = "Happy";
	//char str2[20] = "World";

	//printf("%s\n",str1);
	//strcat(str1,str2);
	//printf("%s\n",str1);


//strcat - 문제 // 파일 이름을 입력받아 ".txt"확장자를 붙이세요
	//char str1[20];
	//char str2[20] = ".txt";
	//
	//printf("파일 이름을 입력하세요 : ");
	//gets(str1);

	//strcat(str1,str2);
	//printf("%s\n",str1);
	//strcat(str1,".txt");

//strcmp 
	//char fStr[20] = "c language";
	//char sStr[20];
	//int flag = 1;

	//while(flag){
	//printf("현재 문자열 : %s\n",fStr);
	//printf("비교 문자열을 입력하세요 : ");
	//gets(sStr);

	//flag = strlen(sStr);
	//if(flag>10){
	//	printf("프로그램 종료");
	//	break;
	//}

	//if(strcmp(fStr,sStr)==1){
	//	printf("%s가 더 큽니다.\n",fStr);
	//}else if(strcmp(fStr,sStr)==0){
	//	printf("%s와 %s가 같습니다.\n",fStr,sStr);
	//}else {
	//	printf("%s가 더 큽니다. \n",sStr);
	//}
	//printf("\n");
	//system("pause");
	//system("cls");
	//}

//씨 과제 - 가위 바위 보를 선택한 후 조건에 따라 메세지 출력하기
//컴퓨터 -> 보 이면 , 
//가위 / 바위 / 보 선택 : 보
//--> 비겼습니다

}




//void func(char *str){
//	printf("%s\n",str);
//	printf("%s\n",str+1);
//	printf("%s\n",str+6);
//}


////문제 예시 1
////srt을 함수로 전달 > 함수 대소문자 변경 >> 변경된 것을 메인에서 출력
//void happy(char *str){
//
//	int i;
//	char n,o;
//
//	for(i=0; str[i] != '\0'; i++){ //a97 A65
//		if((str[i] >='a') && (str[i] <='z')){
//			str[i] -= 32;
//			
//		}else if((str[i] >='A') && (str[i] <= 'Z')){
//			str[i] += 32;
//		}else{
//			str[i] = str[i];
//		}
//}
//	
//}


//gets 문제 - 문자열을 입력받고, 입력 받은 문자열의 문자 갯수 확인하기
//void sCount (char *str, int *num){
//	int i=0;
//
//	while(str[i] != '\0'){
//		(*num)++;
//		i++;
//	}
//}
