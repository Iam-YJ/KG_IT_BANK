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
//			System.out.println("i��" + i);
//			System.out.println("sum��" + sum);
//			
//		}
//		System.out.println("out of while loop");
//
//	
//	}

// while���� �̿��ؼ� 2�ܺ��� 9�ܱ��� ������ ���
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

// ���� - �� ���� 1~100�� ���� ���� ������ ����� ���
		// sum + �� = ��
//		int i = 0;
//		int sum = 0;
//
//		while ((sum+i) < 100 ) {
//			i++;
//			sum += i;
//			System.out.println(sum);
//			
//		}

// ���� - ����ڰ� Ʋ�� ������ ������ ������(2~19) ����
		// 3�� Ʋ���� ���� ����/ ����10�� ����-5�� ���ʽ�5��(11�� �̻� ���� ������ ��)
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
//			System.out.println("������ �����մϴ�.");
//			System.out.println(i + " * " + j + "=");
//			int a = scan.nextInt();
//
//			if (a == (i * j)) {
//				System.out.println("�����Դϴ� +10��");
//				score += 10;
//				System.out.println("���� : " + score);
//				if (i >= 11) {
//					System.out.println("�����Դϴ� +5��");
//					score += 5;
//					System.out.println("���� : " + score);
//				}
//			} else if (a != (i * j)) {
//				System.out.println("�����Դϴ� -5��");
//				System.out.println("����" + t + "�� �����Դϴ� " + (3 - t) + "�� �����̽��ϴ�.");
//				score -= 5;
//				System.out.println("���� : " + score);
//				t++;
//			}
//
//		}

		// ����� Ǯ��
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
//			System.out.println("���� �Է��ϼ��� ");
//			System.out.println(mPlicand + " * " + mPlier + "=");
//			int answer = sc.nextInt();
//
//			if (answer == result) {
//				System.out.println("�����Դϴ�." + rScore + "�� ȹ���߽��ϴ�");
//				tScore += rScore;
//				rCount++;
//				if (mPlicand >= 11) {
//					System.out.println(bScore + "�� �߰� ȹ��");
//					tScore += bScore;
//				}
//			} else {
//				System.out.println("�����Դϴ�");
//				tScore -= wScore;
//				wCount++;
//				if (wCount >= 3) {
//					System.out.println(wCount + "�� Ʋ�� ������ �����մϴ�");
//					flag = false;
//				}
//			}
//
//		}
//		System.out.println("���� Ƚ�� : " + rCount);
//		System.out.println("���� ���� : " + tScore);

		// do-while
//		int input;
//		System.out.println("�����Ϸ��� 'q'�� �Է��ϼ���");
//		System.out.println("������ �Է��ϼ���");
//		do {
//			input = System.in.read();
//			if(input=='x') {
//				System.out.println("x�� �����մϴ�");
//				break; //���ǿ� �����ϴ�(x)���� ������ �� ���ǹ� ������ ������ 
//			}
//			if(input >= 'a' && input <= 'z') {
//				continue; // ���ǿ� �����ϴ�(�ҹ���)���� ������ �� ���ǹ� ���� �ö�.
//			}
//			
//			System.out.print((char)input);
//		}while(input != 'q');
//		System.out.println("���α׷� ����");
//		

		// ���� - 1~100���� ¦���� ���� ���ϼ���
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

		// ���� Ǯ��
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
//		System.out.println("���α׷� ����");

		// for��
//		int sum = 0;
//		for(int i = 0; i<=10; i++) {
//			sum += i;
//			System.out.println(sum);
//			
//		}

//		//for�� 3�� ����� ���ϱ�
//		int sum = 0;
//		for(int i=3; i<=100; i+=3) {
//			if(i%3 ==0) {
//				System.out.println(sum+"+"+i+"="+(sum+i));
//				sum += i;
//			}
//		}System.out.println(sum);

//		// ����1 - 1~100���� ���� ���
//		System.out.println("����1");
//		for (int i = 0; i <= 100; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		
//		// ����2 -53~25���� ���� ���
//		System.out.println("����2");
//		for (int j = 53; j >= 25; j--) {
//			System.out.print(j + " ");
//		}
//
//		
//		// ����3 - 30���� 60���� Ȧ�� ���
//		System.out.println("����3");
//		for (int k = 30; k <= 60; k++) {
//			if (k % 2 == 1) {
//				System.out.print(k + " ");
//			}
//		}
//		System.out.println();
//
//		
//		//����4 - A���� Z���� ���ĺ� ���
//		System.out.println("����4");
//		for (int l = 65; l <= 90; l++) { //���⿡ ���� ��� 'A'�� �־��
//			char c;
//			c = (char) l;
//			System.out.print(c + " ");
//		}
//		System.out.println();
//
//		
//		// ���� 5- ���� 1���� �Է¹޾� 1���� �ش������ Ȧ�� ���
//		System.out.println("����5");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		for (int m = 1; m <= num; m++) {
//			if (m % 2 == 1) {
//				System.out.print(m + " ");
//			}
//		}
//		System.out.println();

//����
		// 1�� ������ ���� �Է� ���� 2��
		// 30�ϵ��� ������ �� ���ΰ�? , 40�ϵ��� ������ �� ���ΰ�?

		//����1
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

		
//���� Ǯ��	
//		long balance=1;
//		long sum=1;
//		
//		for(int i=2; i<=40; i++) {
//			balance*=2;
//			sum+=balance;
//			System.out.println(i+"��"+balance);
//			System.out.println(sum);
//			
//			if(i ==30) {
//				String won = String.format("%,d", sum);
//				System.out.println("30�� �����ݾ� : "+sum);
//			}
//		
//		}
//		String won = String.format("%,d", sum);
//		System.out.println("40�� �����ݾ�" + sum);
		
	}
}
