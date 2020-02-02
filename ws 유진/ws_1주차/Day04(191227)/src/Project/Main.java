package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	산술 연산자	
//		float pi = 3.141592f;
//		float shortPi = pi * 1000/1000;
//		System.out.println("shortPi는 " + shortPi);
//		
//		float roundPi = Math.round(pi*1000);
//		System.out.println("roundPi는 "+roundPi);
//		
//		int share = 10 /8 ;
//		int remain = 10%8;
//		System.out.println("10/8은 "+share);
//		System.out.println("10%8은 "+remain);
//		System.out.println("-10%8은 " + -10%8);
//		System.out.println("-10%-8은 "+ -10%-8);
//		System.out.println("10%-8은 "+10%-8);
//		//%(모듈러)는 계산하고 나서 좌측의 피연산자의 기호를 붙임 
//		

		
//비교연산자
//		System.out.println("10 : 10.0 은 " + (10==10.0f));
//		System.out.println("0 : 0 은" + ('0'==0));
//		//비교연산자 이후에 생성되는 데이터는 논리데이터만 생성한다.
//		
//		System.out.println("A : 65 는" + ('A'==65));
//		float f = 0.1f;
//		double d = 0.1;
//		double df = (double)f;
//		System.out.println("10.0 : 10.0f은 "+ (10.0==10.0f));
//		System.out.println("10.1 : 10.1f은 "+ (10.1==10.1f));
//		System.out.println("f : d은 "+ (d==f));
//		System.out.println("d : df은 "+ (df==d));
//		System.out.println("f : df은 "+ (df==f));
//		
//		String str = "Hello World";
//		String str1 = "Hello JAVA";
//		System.out.println("str : str1은 "+(str==str1));
//		
//		boolean flag=str.equals(str1);
//		System.out.println("str.equals(str1)은 "+ flag);

		
//논리연산자
		// (L value, 공간 )a=a+b (R value, 값)
//		char ch;
//
//		ch = (char) (Math.random() * 128);
//		if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {
//			System.out.println("ch는 알파벳 " + ch + "입니다.");
//		} else {
//			System.out.println("ch는 알파벳이 아닙니다.");
//		}

		
//증감연산자
//		int su1;
//		float su2;
//		
//		su1 = 5; //6
//		++su1;
//		System.out.println("su1는 " + su1);
//		
//		su1 = 5; //6
//		su1++;
//		System.out.println("su1는 "+ ++su1);
//		
//		su2 = 12.3f; //13.3
//		System.out.println("su2는 "+ ++su2);
//		
//		su2 = 12.3f; 
//		System.out.println("su2는 "+ su2++); //12.3 
//		System.out.println("su2는 "+ su2++); //13.3

		
//조건 연산자
//		int x = 10;
//		int y = -10;
//		
//		int absX = (x>=0) ? x : -x ;
//		int absY = (y>=0) ? y : -y ;
//		
//		System.out.println("x의 절대값" + absX);
//		System.out.println("y의 절대값" + absY);

		
//제어문 1
//		int visitCount = 1;
//
//		if (visitCount == 0) {
//			System.out.println("처음 오셨네요.. 반갑습니다. ");
//
//		} else {
//			visitCount++;
//			System.out.println(visitCount + "번째 오셨네요. 반갑습니다.");
//		}

		
//조건문 1
//		Scanner scan = new Scanner(System.in);
//		System.out.println("어떤 과목을 들으실건가요? (1.자바 2.씨) : ");
//		int answer = scan.nextInt();
//
//		if (answer == 1) {
//			System.out.println("자바 과목이 정상적으로 수강신청 되었습니다.");
//		} else if (answer == 2) {
//			System.out.println("씨 과목이 정상적으로 수강신청 되었습니다.");
//
//		} else if ((answer != 1) && (answer != 2)) {
//			System.out.println("올바르지 않은 선택입니다. ");
//		}
//
//	}

		
//조건문 2		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("의류코너 방문을 환영합니다.");
//		System.out.println("성별을 선택해주세요. (남, 여) : ");
//		String people = scan.nextLine();
//
//		if (people.equals("남")) {
//			System.out.println("반갑습니다. ");
//			System.out.println("12층으로 이동하세요.");
//
//		} else if (people.equals("여")) {
//
//			System.out.println("반갑습니다. ");
//			System.out.println("2층으로 이동하세요.");
//		} else if ((!people.equals("남")) && (!people.equals("여"))) {
//			System.out.println("올바르지 않은 입력입니다.");
//			System.out.println("남 / 여 로 입력해주세요");
//		}

		
//		long current = System.currentTimeMillis();
//		// 시간을 밀리세컨 단위로 반환한다.
//		//long 형으로 준다
//		
//		current/=1000;
//		System.out.println("초단위" + current);
//		
//		current/=60;
//		System.out.println("분단위" + current);
//		
//		current/= 60;
//		System.out.println("시간단위" + current);
//		
//		current/= 24;
//		System.out.println("달 단위" + current);
//		
//		current/= 365;
//		System.out.println("년 단위" + current);
		
		
//실습		
		//사용자에게 출생년도 4자리 입력받아서 나이 꼐산 
		//20살 이상이면 성인입니다 그아래는 미 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("출생년도를 입력하세요 (ex 2000) : ");
		int birth = scan.nextInt();
		
		long current = System.currentTimeMillis();
		
		current/=1000;
		current/=60;
		current/= 60;
		current/= 24;
		current/= 365;
		current+=1970;
		int now = (int) (current-1);
		
		System.out.println("현재"+now+"년 입니다.");
		if(current-birth >=20) {
			System.out.println("당신은"+(current-birth)+"세로 성인입니다.");
		} else if(current-birth <=19) {
			System.out.println("당신은"+(current-birth)+"세로 미성년자입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
	

		
		
	
		
	}
}
