package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//for문 예시
		// 사용자에게 시간(분)에 대한 정보 받아서 시간이 모두 지난 후에
		// Happy New Year 메세지 출력
//		
//		int min,mSec, second, sec = 60 ;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("분 입력 : ");
//		min = scan.nextInt();
//		mSec = min * sec;
//		
//		System.out.println("Ready...");
//		for(int i=mSec; i >=0; i--) {
//			min = i/sec;
//			second = i%sec;
//			System.out.println(min+"분"+second+"초");
//			Thread.sleep(100);
//		}
//		System.out.println("Happy New Year!");

		// 중첩 for문 예시
		// 구구단 만들기
//		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+" * "+ j+ " = "+(i*j));
//			}
//			System.out.println();
//		}

		// 시계 만들기
		// _시_분_초
//오류!!!!! 24시 이후로 멈춰야함
//		int h = 0, m = 0, s = 0;
//
//		for (int i = 0; i <= 59; i++) {
//
//			for (i = 0; i <= 59; i++) {
//
//				s++;
//				Thread.sleep(1);
//				System.out.println(h + "시 " + m + "분 " + s + "초");
//				if (s == 60) {
//					s = 0;
//					m++;
//					System.out.println(h + "시 " + m + "분 " + s + "초");
//					if (m == 60) {
//						m = 0;
//						h++;
//						System.out.println(h + "시 " + m + "분 " + s + "초");
//
//					}
//				}
//				break;
//
//			}
//		}

		// 강사 풀이
//		for (int h = 0; h < 24; h++) {
//			for (int m = 0; m < 60; m++) {
//				for (int s = 0; s < 60; s++) {
//					System.out.println(h+"시 "+m + "분 " + s + "초 ");
//					Thread.sleep(300);
//				}
//			}
//		}

		// 다시 짜기
//		for (int h = 0; h < 24; h++) {
//			for (int m = 0; m <= 59; m++) {
//				for (int s = 0; s <= 59; s++) {
//					Thread.sleep(10);
//					System.out.println(h + "시 " + m + "분 " + s + "초");
//				}
//			}
//		}

		// 배열
//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("arr["+i+"] " + arr[i]);
//		}

// 카드를 무작위로 섞기
		// 카드 전체 52장 > 임의의 인덱스 위치 빼와서 이거를 첫번째로 가져다 넣기 > 그리고 또 빼와서 첫번재랑 바꾸기

//		int[] card = new int[52];
//		for (int i = 0; i < card.length; i++) {
//			card[i] = i + 1;
//		}
//
//		int temp;
//		int index;
//		for (int i = 0; i < 100; i++) {
//			index = (int) (Math.random() * 52);
//			temp = card[index];
//			card[index] = card[0];
//			card[0] = temp;
//		}
//		for (int i = 0; i < 7; i++) {
//			System.out.print("card["+i+"] "+card[i]+" / ");
//		}

// 문제 - 주사위 10번 던진 결과를
		// 홀수와 짝수 구분하여 출력

//		int[] dice = new int[6];
//
//		for (int i = 0; i < 6; i++) {
//			dice[i] = i + 1;
//		} //주사위 숫자 6개
//
//		int temp;
//		int index;
//		for (int i = 0; i < 10; i++) { //10번 던진다
//			index = (int) (Math.random() * 6); //0~5까지 랜덤수
//			temp = dice[index]; //주사위 랜덤배열의 값을   temp에 임시 저장
//			System.out.println((i + 1) + "번 째 던집니다"); //몇 번째 던진다 출력
//
//			if (temp % 2 == 0) { //만약에 temp(주사위 랜덤 배열 값) 이 짝수이면
//				System.out.println("dice[" + (i+1) + "] 의 값은 " + temp + "로 짝수입니다.");
//			} else {
//				System.out.println("dice[" + (i+1) + "] 의 값은 " + temp + "로 홀수입니다.");
//			}
//			System.out.println();
//		}

		// 강사 풀이
//		int[] dice = new int[10];
//
//		for (int i = 0; i < dice.length; i++) {
//			dice[i] = (int) (Math.random() * 6) + 1;
//			System.out.println((i + 1) + "번 째 : " + dice[i] + " ");
//		}
//
//		for (int i = 0; i < dice.length; i++) {
//			if (dice[i] % 2 == 0) {
//				if (i == 0) {
//					System.out.print("짝수입니다");
//				}
//				System.out.print(dice[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		for (int i = 0; i < dice.length; i++) {
//			if (dice[i] % 2 != 0) {
//				if (i == 1) {
//					System.out.print("홀수입니다");
//				}
//				System.out.print(dice[i] + " ");
//			}
//		}

// 문제 - 주사위를 1000번 던져서 나온 각각의 눈금이 나온 횟수 세어보기
		// 주사위 배열 > 1000번 반복 하는데 math.random > 나온 수 다른 배열에 저장하기 > 출력
//		
//		int[] dice = new int[6];
//		int[] diceNum = new int[6];
//		int index, temp;
//
//		for (int i = 0; i < dice.length; i++) {
//			dice[i] = i + 1;
//
//		}
//
//		for (int i = 0; i < 1000; i++) { // 천번 반복할껀데
//			index = (int) (Math.random() * 6); // 인덱스는 0~5까지 6개의 숫자를 생성할껀데
//			temp = dice[index]; // dice에 해당하는 랜덤수 - 값을 - temp에 저장할꺼야
//			diceNum[index]++;
//		}
//		
//		for (int i = 0; i < 6; i++) {
//			System.out.println("숫자 " + (i + 1) + " 나온 횟수" + diceNum[i]);
//		}
//		

		// 강사풀이
//		int[] dice = new int[6];
//		
//		for(int i=0; i<1000; i++) {
//			int num = (int)(Math.random()*6);
//			dice[num] ++;
//		}
//		for(int i=0; i<dice.length; i++) {
//			System.out.println("숫자 " + (i + 1) + " 나온 횟수 " + dice[i]);
//		}


	}

}
