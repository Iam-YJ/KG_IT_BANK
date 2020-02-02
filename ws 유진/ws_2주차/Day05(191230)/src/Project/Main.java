package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//난수 발생
//		double r= Math.random();
//		System.out.println("r은" + r);
//		int iRandom =(int) (Math.random() * 5);
//		System.out.println("iRandom은" + iRandom);

//중첩 if 문제1
		// 주사위 2개 던져서,
		// 1. 합이 짝수일 경우 : 짝수입니다
		// 2. 합이 홀수일경우 : 홀수입니다 출력
		// 3. 두 수가 같은 경우 : 더블 출력 - 두수의 합이 짝수이다
//		int r = (int) (Math.random() * 6) + 1;
//		int s = (int) (Math.random() * 6) + 1;
//		int sum = r + s;
//
//		System.out.println("주사위를 던지겠습니다.");
//		System.out.println("첫번째 주사위 : "+ r);
//		System.out.println("두번째 주사위 : "+ s);
//		
//		if (sum % 2 == 1) {
//			System.out.println("주사위의 합이 홀수입니다");
//		} else if (sum % 2 == 0) {
//			if (r == s) {
//				System.out.println("주사위의 합이 더블입니다");
//			}
//			else{
//				System.out.println("주사위의 합이 짝수입니다");
//			}
//		} else {
//			System.out.println("오류입니다");
//		}

//다중if문
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요 : ");
//		int score = scan.nextInt();
//		char grade = ' ';
//		
//		if(score >= 90)
//			grade = 'A';
//		else if(score>=80)
//			grade = 'B';
//		else if(score>=70)
//			grade = 'C';
//		else if(score>=60)
//			grade = 'D';
//		else 
//			grade = 'F';
//		
//		
//		System.out.println("당신의 학점은 " + grade + " 입니다");
//		

// 중화요리 주문 문제
		// 짜장면 5000원 짬뽕 6000원
		// 5그릇 이상 주문 - 3천원 할인 / 10그릇 이상 주문 10% 할인
		// 중복 할인 없다

		// 스캐너로 숫자 받기 > 짜 짬 > 이프 합 5개면 할인 > 이프 10개면 할인
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("주문할 짜장면, 짬뽕 수를 입력하세요 (ex 1 1)");
//		int a = scan.nextInt(); // 짜장
//		int b = scan.nextInt(); // 짬뽕
//		int sum = a + b;
//		int totalPrice = a * 5000 + b * 6000;
//
//		if (sum >= 5 && sum < 10) {
//			System.out.println(sum + "그릇 주문하셨습니다.");
//			System.out.println("가격은 " + totalPrice + "원 입니다");
//			System.out.print("현재 5그릇 이상 구매시 ");
//			System.out.println("3000원 할인 행사중입니다 ");
//			System.out.println("지불할 금액은 " + (totalPrice - 3000) + "원 입니다");
//		} else if (sum >= 10) {
//			System.out.println(sum + "그릇 주문하셨습니다.");
//			System.out.println("가격은 " + totalPrice + "원 입니다");
//			System.out.print("현재 10그릇 이상 구매시 ");
//			System.out.println("10% 할인 행사중입니다 ");
//			System.out.println("지불할 금액은 " + (totalPrice) * 0.9 + "원 입니다");
//		} else {
//			System.out.println(sum + "그릇 주문하셨습니다.");
//			System.out.println("가격은 " + totalPrice + "원 입니다");
//
//		}

//SWITCH CASE
//		char grade = (char) (Math.random() * 26 + 65);
//		int score = 0;
//		
//		switch(grade) {
//		case 'A':
//			score = 90;
//			break;
//		case 'B' :
//			score = 80;
//			break;
//		case 'C' :
//			score = 70;
//			break;
//		case 'D' :
//			score = 60;
//			break;
//		default:
//			grade = 'F';
//			score = 0;
//		}
//		System.out.print("당신의 성적은 " + grade +" 이고, ");
//		System.out.println("당신의 점수는 "+ score + "점 이상 입니다.");

//SWITCH 예시
		// 보너스 점수 100점 자전거 , 200점 티비, 300점 노트북
//		
//		int score = (int) (Math.random()*10)+1;
//		score *= 100;
//		String coupon = "";
//	
//		
//		switch(score) {
//	
//		case 800:
//			coupon = "자전거";
//			break;
//		case 900:
//			coupon = "TV";
//			break;	
//		case 1000:
//			coupon = "노트북";
//			break;
//		default :
//			System.out.println("꽝");
//			coupon = "볼펜";
//			break;
//		}
//		System.out.println("당신의 점수는 "+ score + "점 입니다");
//		System.out.println(coupon+"을 드립니다");

//switch 예시
		// 사용자에게 여행가고 싶은 달을 숫자로 입력받아 계절에 맞게 선물 증정
		// 봄-황사마스크 / 여름- 모기퇴치약 / 가을 - 선글라스 / 겨울 - 머플러

//		Scanner scan = new Scanner(System.in);
//		System.out.println("언제 여행을 떠나고 싶나요? [ex 1 (월)] : ");
//		int travel = scan.nextInt();
//		String month = "";
//		String gift = "";
//
//		switch (travel) {
//		
//		case 3:
//		case 4:
//		case 5:
//			gift = "황사마스크";
//			month = "봄";
//			break;
//			
//		case 6:
//		case 7:
//		case 8:
//			gift = "모기퇴치약";
//			month = "여름";
//			break;
//			
//		case 9:
//		case 10:
//		case 11:
//			gift = "선글라스";
//			month = "가을";
//			break;
//			
//		case 12:
//		case 1:
//		case 2:
//			gift = "머플러";
//			month = "겨울";
//			break;
//			
//		default:
//			gift = "행운";
//			month = "존재하지 않는 달";
//
//		}
//		System.out.println(travel + "달에 여행을 떠나고 싶으신가요?");
//		System.out.println("계절은 "+ month + "이고, ");
//		System.out.println("선물은 " + gift + " 입니다");

		
		
	}

}
