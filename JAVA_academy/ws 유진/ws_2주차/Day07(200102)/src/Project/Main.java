package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//for�� ����
		// ����ڿ��� �ð�(��)�� ���� ���� �޾Ƽ� �ð��� ��� ���� �Ŀ�
		// Happy New Year �޼��� ���
//		
//		int min,mSec, second, sec = 60 ;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�� �Է� : ");
//		min = scan.nextInt();
//		mSec = min * sec;
//		
//		System.out.println("Ready...");
//		for(int i=mSec; i >=0; i--) {
//			min = i/sec;
//			second = i%sec;
//			System.out.println(min+"��"+second+"��");
//			Thread.sleep(100);
//		}
//		System.out.println("Happy New Year!");

		// ��ø for�� ����
		// ������ �����
//		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+" * "+ j+ " = "+(i*j));
//			}
//			System.out.println();
//		}

		// �ð� �����
		// _��_��_��
//����!!!!! 24�� ���ķ� �������
//		int h = 0, m = 0, s = 0;
//
//		for (int i = 0; i <= 59; i++) {
//
//			for (i = 0; i <= 59; i++) {
//
//				s++;
//				Thread.sleep(1);
//				System.out.println(h + "�� " + m + "�� " + s + "��");
//				if (s == 60) {
//					s = 0;
//					m++;
//					System.out.println(h + "�� " + m + "�� " + s + "��");
//					if (m == 60) {
//						m = 0;
//						h++;
//						System.out.println(h + "�� " + m + "�� " + s + "��");
//
//					}
//				}
//				break;
//
//			}
//		}

		// ���� Ǯ��
//		for (int h = 0; h < 24; h++) {
//			for (int m = 0; m < 60; m++) {
//				for (int s = 0; s < 60; s++) {
//					System.out.println(h+"�� "+m + "�� " + s + "�� ");
//					Thread.sleep(300);
//				}
//			}
//		}

		// �ٽ� ¥��
//		for (int h = 0; h < 24; h++) {
//			for (int m = 0; m <= 59; m++) {
//				for (int s = 0; s <= 59; s++) {
//					Thread.sleep(10);
//					System.out.println(h + "�� " + m + "�� " + s + "��");
//				}
//			}
//		}

		// �迭
//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("arr["+i+"] " + arr[i]);
//		}

// ī�带 �������� ����
		// ī�� ��ü 52�� > ������ �ε��� ��ġ ���ͼ� �̰Ÿ� ù��°�� ������ �ֱ� > �׸��� �� ���ͼ� ù����� �ٲٱ�

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

// ���� - �ֻ��� 10�� ���� �����
		// Ȧ���� ¦�� �����Ͽ� ���

//		int[] dice = new int[6];
//
//		for (int i = 0; i < 6; i++) {
//			dice[i] = i + 1;
//		} //�ֻ��� ���� 6��
//
//		int temp;
//		int index;
//		for (int i = 0; i < 10; i++) { //10�� ������
//			index = (int) (Math.random() * 6); //0~5���� ������
//			temp = dice[index]; //�ֻ��� �����迭�� ����   temp�� �ӽ� ����
//			System.out.println((i + 1) + "�� ° �����ϴ�"); //�� ��° ������ ���
//
//			if (temp % 2 == 0) { //���࿡ temp(�ֻ��� ���� �迭 ��) �� ¦���̸�
//				System.out.println("dice[" + (i+1) + "] �� ���� " + temp + "�� ¦���Դϴ�.");
//			} else {
//				System.out.println("dice[" + (i+1) + "] �� ���� " + temp + "�� Ȧ���Դϴ�.");
//			}
//			System.out.println();
//		}

		// ���� Ǯ��
//		int[] dice = new int[10];
//
//		for (int i = 0; i < dice.length; i++) {
//			dice[i] = (int) (Math.random() * 6) + 1;
//			System.out.println((i + 1) + "�� ° : " + dice[i] + " ");
//		}
//
//		for (int i = 0; i < dice.length; i++) {
//			if (dice[i] % 2 == 0) {
//				if (i == 0) {
//					System.out.print("¦���Դϴ�");
//				}
//				System.out.print(dice[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		for (int i = 0; i < dice.length; i++) {
//			if (dice[i] % 2 != 0) {
//				if (i == 1) {
//					System.out.print("Ȧ���Դϴ�");
//				}
//				System.out.print(dice[i] + " ");
//			}
//		}

// ���� - �ֻ����� 1000�� ������ ���� ������ ������ ���� Ƚ�� �����
		// �ֻ��� �迭 > 1000�� �ݺ� �ϴµ� math.random > ���� �� �ٸ� �迭�� �����ϱ� > ���
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
//		for (int i = 0; i < 1000; i++) { // õ�� �ݺ��Ҳ���
//			index = (int) (Math.random() * 6); // �ε����� 0~5���� 6���� ���ڸ� �����Ҳ���
//			temp = dice[index]; // dice�� �ش��ϴ� ������ - ���� - temp�� �����Ҳ���
//			diceNum[index]++;
//		}
//		
//		for (int i = 0; i < 6; i++) {
//			System.out.println("���� " + (i + 1) + " ���� Ƚ��" + diceNum[i]);
//		}
//		

		// ����Ǯ��
//		int[] dice = new int[6];
//		
//		for(int i=0; i<1000; i++) {
//			int num = (int)(Math.random()*6);
//			dice[num] ++;
//		}
//		for(int i=0; i<dice.length; i++) {
//			System.out.println("���� " + (i + 1) + " ���� Ƚ�� " + dice[i]);
//		}


	}

}
