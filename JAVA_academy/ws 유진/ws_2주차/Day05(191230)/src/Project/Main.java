package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//���� �߻�
//		double r= Math.random();
//		System.out.println("r��" + r);
//		int iRandom =(int) (Math.random() * 5);
//		System.out.println("iRandom��" + iRandom);

//��ø if ����1
		// �ֻ��� 2�� ������,
		// 1. ���� ¦���� ��� : ¦���Դϴ�
		// 2. ���� Ȧ���ϰ�� : Ȧ���Դϴ� ���
		// 3. �� ���� ���� ��� : ���� ��� - �μ��� ���� ¦���̴�
//		int r = (int) (Math.random() * 6) + 1;
//		int s = (int) (Math.random() * 6) + 1;
//		int sum = r + s;
//
//		System.out.println("�ֻ����� �����ڽ��ϴ�.");
//		System.out.println("ù��° �ֻ��� : "+ r);
//		System.out.println("�ι�° �ֻ��� : "+ s);
//		
//		if (sum % 2 == 1) {
//			System.out.println("�ֻ����� ���� Ȧ���Դϴ�");
//		} else if (sum % 2 == 0) {
//			if (r == s) {
//				System.out.println("�ֻ����� ���� �����Դϴ�");
//			}
//			else{
//				System.out.println("�ֻ����� ���� ¦���Դϴ�");
//			}
//		} else {
//			System.out.println("�����Դϴ�");
//		}

//����if��
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ��� : ");
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
//		System.out.println("����� ������ " + grade + " �Դϴ�");
//		

// ��ȭ�丮 �ֹ� ����
		// ¥��� 5000�� «�� 6000��
		// 5�׸� �̻� �ֹ� - 3õ�� ���� / 10�׸� �̻� �ֹ� 10% ����
		// �ߺ� ���� ����

		// ��ĳ�ʷ� ���� �ޱ� > ¥ « > ���� �� 5���� ���� > ���� 10���� ����
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("�ֹ��� ¥���, «�� ���� �Է��ϼ��� (ex 1 1)");
//		int a = scan.nextInt(); // ¥��
//		int b = scan.nextInt(); // «��
//		int sum = a + b;
//		int totalPrice = a * 5000 + b * 6000;
//
//		if (sum >= 5 && sum < 10) {
//			System.out.println(sum + "�׸� �ֹ��ϼ̽��ϴ�.");
//			System.out.println("������ " + totalPrice + "�� �Դϴ�");
//			System.out.print("���� 5�׸� �̻� ���Ž� ");
//			System.out.println("3000�� ���� ������Դϴ� ");
//			System.out.println("������ �ݾ��� " + (totalPrice - 3000) + "�� �Դϴ�");
//		} else if (sum >= 10) {
//			System.out.println(sum + "�׸� �ֹ��ϼ̽��ϴ�.");
//			System.out.println("������ " + totalPrice + "�� �Դϴ�");
//			System.out.print("���� 10�׸� �̻� ���Ž� ");
//			System.out.println("10% ���� ������Դϴ� ");
//			System.out.println("������ �ݾ��� " + (totalPrice) * 0.9 + "�� �Դϴ�");
//		} else {
//			System.out.println(sum + "�׸� �ֹ��ϼ̽��ϴ�.");
//			System.out.println("������ " + totalPrice + "�� �Դϴ�");
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
//		System.out.print("����� ������ " + grade +" �̰�, ");
//		System.out.println("����� ������ "+ score + "�� �̻� �Դϴ�.");

//SWITCH ����
		// ���ʽ� ���� 100�� ������ , 200�� Ƽ��, 300�� ��Ʈ��
//		
//		int score = (int) (Math.random()*10)+1;
//		score *= 100;
//		String coupon = "";
//	
//		
//		switch(score) {
//	
//		case 800:
//			coupon = "������";
//			break;
//		case 900:
//			coupon = "TV";
//			break;	
//		case 1000:
//			coupon = "��Ʈ��";
//			break;
//		default :
//			System.out.println("��");
//			coupon = "����";
//			break;
//		}
//		System.out.println("����� ������ "+ score + "�� �Դϴ�");
//		System.out.println(coupon+"�� �帳�ϴ�");

//switch ����
		// ����ڿ��� ���డ�� ���� ���� ���ڷ� �Է¹޾� ������ �°� ���� ����
		// ��-Ȳ�縶��ũ / ����- �����ġ�� / ���� - ���۶� / �ܿ� - ���÷�

//		Scanner scan = new Scanner(System.in);
//		System.out.println("���� ������ ������ �ͳ���? [ex 1 (��)] : ");
//		int travel = scan.nextInt();
//		String month = "";
//		String gift = "";
//
//		switch (travel) {
//		
//		case 3:
//		case 4:
//		case 5:
//			gift = "Ȳ�縶��ũ";
//			month = "��";
//			break;
//			
//		case 6:
//		case 7:
//		case 8:
//			gift = "�����ġ��";
//			month = "����";
//			break;
//			
//		case 9:
//		case 10:
//		case 11:
//			gift = "���۶�";
//			month = "����";
//			break;
//			
//		case 12:
//		case 1:
//		case 2:
//			gift = "���÷�";
//			month = "�ܿ�";
//			break;
//			
//		default:
//			gift = "���";
//			month = "�������� �ʴ� ��";
//
//		}
//		System.out.println(travel + "�޿� ������ ������ �����Ű���?");
//		System.out.println("������ "+ month + "�̰�, ");
//		System.out.println("������ " + gift + " �Դϴ�");

		
		
	}

}
