package Project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		int i = 1;
//		int sum = 0;
//		while(i<=100) {
//			sum += i;
//			i++;
//			System.out.println("i는" + i);
//			System.out.println("sum은" + sum);
//			
//		}
//		System.out.println("out of while loop");
//
//	
//	}

// while문을 이용해서 2단부터 9단까지 구구단 출력
//		int i = 2;
//		int j = 1;
//		
//		while(i<=9) {
//			while(j<=9 ) {
//				System.out.print(i);
//				System.out.print("*");
//				System.out.println(j);
//				j++;
//				
//			}
//			System.out.println();
//			j = 1;
//			i++;
//		}

// 문제 - 총 합이 1~100이 넘지 않을 때까지 연산식 출력
		// sum + 값 = 합
//		int i = 0;
//		int sum = 0;
//
//		while ((sum+i) < 100 ) {
//			i++;
//			sum += i;
//			System.out.println(sum);
//			
//		}

// 문제 - 사용자가 틀리 때까지 임의의 구구단(2~19) 출제
		// 3번 틀리면 게임 종료/ 정답10점 오답-5점 보너스5점(11단 이상 문제 맞췄을 때)
//		int i = 0;
//		int j = 0;
//		int t = 1;
//		int score = 0;
//
//		Scanner scan = new Scanner(System.in);
//
//		while (t <= 3) {
//			i = (int) (Math.random() * 19 + 1);
//			j = (int) (Math.random() * 9 + 1);
//
//			System.out.println("문제를 출제합니다.");
//			System.out.println(i + " * " + j + "=");
//			int a = scan.nextInt();
//
//			if (a == (i * j)) {
//				System.out.println("정답입니다 +10점");
//				score += 10;
//				System.out.println("총점 : " + score);
//				if (i >= 11) {
//					System.out.println("정답입니다 +5점");
//					score += 5;
//					System.out.println("총점 : " + score);
//				}
//			} else if (a != (i * j)) {
//				System.out.println("오답입니다 -5점");
//				System.out.println("현재" + t + "번 오답입니다 " + (3 - t) + "번 남으셨습니다.");
//				score -= 5;
//				System.out.println("총점 : " + score);
//				t++;
//			}
//
//		}

		// 강사님 풀이
//		Scanner sc = new Scanner(System.in);
//		int rScore = 10, wScore = 5, bScore = 5, tScore = 0;
//		int wCount = 0, rCount = 0;
//		boolean flag = true;
//
//		while (flag) {
//			int mPlicand = (int) (Math.random() * 19) + 1;
//			int mPlier = (int) (Math.random() * 9) + 1;
//			int result = mPlicand * mPlier;
//
//			System.out.println();
//			System.out.println("정답 입력하세요 ");
//			System.out.println(mPlicand + " * " + mPlier + "=");
//			int answer = sc.nextInt();
//
//			if (answer == result) {
//				System.out.println("정답입니다." + rScore + "점 획득했습니다");
//				tScore += rScore;
//				rCount++;
//				if (mPlicand >= 11) {
//					System.out.println(bScore + "점 추가 획득");
//					tScore += bScore;
//				}
//			} else {
//				System.out.println("오답입니다");
//				tScore -= wScore;
//				wCount++;
//				if (wCount >= 3) {
//					System.out.println(wCount + "번 틀려 게임을 종료합니다");
//					flag = false;
//				}
//			}
//
//		}
//		System.out.println("정답 횟수 : " + rCount);
//		System.out.println("현재 점수 : " + tScore);

		// do-while
//		int input;
//		System.out.println("종료하려면 'q'를 입력하세요");
//		System.out.println("문장을 입력하세요");
//		do {
//			input = System.in.read();
//			if(input=='x') {
//				System.out.println("x로 종료합니다");
//				break; //조건에 만족하는(x)것을 만났을 때 조건문 밖으로 나간다 
//			}
//			if(input >= 'a' && input <= 'z') {
//				continue; // 조건에 만족하는(소문자)것을 만났을 때 조건문 위로 올라감.
//			}
//			
//			System.out.print((char)input);
//		}while(input != 'q');
//		System.out.println("프로그램 종료");
//		

		// 문제 - 1~100까지 짝수의 합을 구하세요
//		int i = 0;
//		int sum = 0;
//
//		while (true) {
//			i++;
//			if (i % 2 == 0) {
//				sum += i;
//				System.out.println(sum);
//				if (i == 100) {
//					break;
//				}
//
//			} continue;
//
//		}
//		

		// 강사 풀이
//		int num = 0;
//		int sum = 0;
//
//		while (true) {
//			num++;
//			if (num > 100) {
//				break;
//			}
//			if (num % 2 != 0) {
//				continue;
//			}
//			sum += num;
//			System.out.println(sum);
//		}
//		System.out.println("프로그램 종료");

		// for문
//		int sum = 0;
//		for(int i = 0; i<=10; i++) {
//			sum += i;
//			System.out.println(sum);
//			
//		}

//		//for문 3의 배수만 더하기
//		int sum = 0;
//		for(int i=3; i<=100; i+=3) {
//			if(i%3 ==0) {
//				System.out.println(sum+"+"+i+"="+(sum+i));
//				sum += i;
//			}
//		}System.out.println(sum);

//		// 문제1 - 1~100까지 정수 출력
//		System.out.println("문제1");
//		for (int i = 0; i <= 100; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		
//		// 문제2 -53~25까지 정수 출력
//		System.out.println("문제2");
//		for (int j = 53; j >= 25; j--) {
//			System.out.print(j + " ");
//		}
//
//		
//		// 문제3 - 30부터 60까지 홀수 출력
//		System.out.println("문제3");
//		for (int k = 30; k <= 60; k++) {
//			if (k % 2 == 1) {
//				System.out.print(k + " ");
//			}
//		}
//		System.out.println();
//
//		
//		//문제4 - A부터 Z까지 알파벳 출력
//		System.out.println("문제4");
//		for (int l = 65; l <= 90; l++) { //여기에 숫자 대신 'A'로 넣어도됨
//			char c;
//			c = (char) l;
//			System.out.print(c + " ");
//		}
//		System.out.println();
//
//		
//		// 문제 5- 숫자 1개를 입력받아 1부터 해당수까지 홀수 출력
//		System.out.println("문제5");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		for (int m = 1; m <= num; m++) {
//			if (m % 2 == 1) {
//				System.out.print(m + " ");
//			}
//		}
//		System.out.println();

//과제
		// 1일 지나면 어제 입력 돈의 2배
		// 30일동안 저축한 돈 얼마인가? , 40일동안 저축한 돈 얼마인가?

		//문제1
//		long m1 = 1;
//		long sum1=0;
//		for (int d = 1; d <= 30; d++) {
//			m1 *= 2;
//			sum1 += m1;
//		}System.out.println(sum1+1);
//
//
//		
//		long m2 = 1;
//		long sum2=0;
//		for (int day = 1; day <= 40; day++) {
//			m2 *= 2;
//			sum2 += m2;
//		}System.out.println(sum2+1);

		
//강사 풀이	
//		long balance=1;
//		long sum=1;
//		
//		for(int i=2; i<=40; i++) {
//			balance*=2;
//			sum+=balance;
//			System.out.println(i+"일"+balance);
//			System.out.println(sum);
//			
//			if(i ==30) {
//				String won = String.format("%,d", sum);
//				System.out.println("30일 누적금액 : "+sum);
//			}
//		
//		}
//		String won = String.format("%,d", sum);
//		System.out.println("40일 누적금액" + sum);
		
	}
}
