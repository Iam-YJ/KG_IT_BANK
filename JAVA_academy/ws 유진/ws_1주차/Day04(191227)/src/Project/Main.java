package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	��� ������	
//		float pi = 3.141592f;
//		float shortPi = pi * 1000/1000;
//		System.out.println("shortPi�� " + shortPi);
//		
//		float roundPi = Math.round(pi*1000);
//		System.out.println("roundPi�� "+roundPi);
//		
//		int share = 10 /8 ;
//		int remain = 10%8;
//		System.out.println("10/8�� "+share);
//		System.out.println("10%8�� "+remain);
//		System.out.println("-10%8�� " + -10%8);
//		System.out.println("-10%-8�� "+ -10%-8);
//		System.out.println("10%-8�� "+10%-8);
//		//%(��ⷯ)�� ����ϰ� ���� ������ �ǿ������� ��ȣ�� ���� 
//		

		
//�񱳿�����
//		System.out.println("10 : 10.0 �� " + (10==10.0f));
//		System.out.println("0 : 0 ��" + ('0'==0));
//		//�񱳿����� ���Ŀ� �����Ǵ� �����ʹ� �������͸� �����Ѵ�.
//		
//		System.out.println("A : 65 ��" + ('A'==65));
//		float f = 0.1f;
//		double d = 0.1;
//		double df = (double)f;
//		System.out.println("10.0 : 10.0f�� "+ (10.0==10.0f));
//		System.out.println("10.1 : 10.1f�� "+ (10.1==10.1f));
//		System.out.println("f : d�� "+ (d==f));
//		System.out.println("d : df�� "+ (df==d));
//		System.out.println("f : df�� "+ (df==f));
//		
//		String str = "Hello World";
//		String str1 = "Hello JAVA";
//		System.out.println("str : str1�� "+(str==str1));
//		
//		boolean flag=str.equals(str1);
//		System.out.println("str.equals(str1)�� "+ flag);

		
//��������
		// (L value, ���� )a=a+b (R value, ��)
//		char ch;
//
//		ch = (char) (Math.random() * 128);
//		if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {
//			System.out.println("ch�� ���ĺ� " + ch + "�Դϴ�.");
//		} else {
//			System.out.println("ch�� ���ĺ��� �ƴմϴ�.");
//		}

		
//����������
//		int su1;
//		float su2;
//		
//		su1 = 5; //6
//		++su1;
//		System.out.println("su1�� " + su1);
//		
//		su1 = 5; //6
//		su1++;
//		System.out.println("su1�� "+ ++su1);
//		
//		su2 = 12.3f; //13.3
//		System.out.println("su2�� "+ ++su2);
//		
//		su2 = 12.3f; 
//		System.out.println("su2�� "+ su2++); //12.3 
//		System.out.println("su2�� "+ su2++); //13.3

		
//���� ������
//		int x = 10;
//		int y = -10;
//		
//		int absX = (x>=0) ? x : -x ;
//		int absY = (y>=0) ? y : -y ;
//		
//		System.out.println("x�� ���밪" + absX);
//		System.out.println("y�� ���밪" + absY);

		
//��� 1
//		int visitCount = 1;
//
//		if (visitCount == 0) {
//			System.out.println("ó�� ���̳׿�.. �ݰ����ϴ�. ");
//
//		} else {
//			visitCount++;
//			System.out.println(visitCount + "��° ���̳׿�. �ݰ����ϴ�.");
//		}

		
//���ǹ� 1
//		Scanner scan = new Scanner(System.in);
//		System.out.println("� ������ �����ǰǰ���? (1.�ڹ� 2.��) : ");
//		int answer = scan.nextInt();
//
//		if (answer == 1) {
//			System.out.println("�ڹ� ������ ���������� ������û �Ǿ����ϴ�.");
//		} else if (answer == 2) {
//			System.out.println("�� ������ ���������� ������û �Ǿ����ϴ�.");
//
//		} else if ((answer != 1) && (answer != 2)) {
//			System.out.println("�ùٸ��� ���� �����Դϴ�. ");
//		}
//
//	}

		
//���ǹ� 2		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�Ƿ��ڳ� �湮�� ȯ���մϴ�.");
//		System.out.println("������ �������ּ���. (��, ��) : ");
//		String people = scan.nextLine();
//
//		if (people.equals("��")) {
//			System.out.println("�ݰ����ϴ�. ");
//			System.out.println("12������ �̵��ϼ���.");
//
//		} else if (people.equals("��")) {
//
//			System.out.println("�ݰ����ϴ�. ");
//			System.out.println("2������ �̵��ϼ���.");
//		} else if ((!people.equals("��")) && (!people.equals("��"))) {
//			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
//			System.out.println("�� / �� �� �Է����ּ���");
//		}

		
//		long current = System.currentTimeMillis();
//		// �ð��� �и����� ������ ��ȯ�Ѵ�.
//		//long ������ �ش�
//		
//		current/=1000;
//		System.out.println("�ʴ���" + current);
//		
//		current/=60;
//		System.out.println("�д���" + current);
//		
//		current/= 60;
//		System.out.println("�ð�����" + current);
//		
//		current/= 24;
//		System.out.println("�� ����" + current);
//		
//		current/= 365;
//		System.out.println("�� ����" + current);
		
		
//�ǽ�		
		//����ڿ��� ����⵵ 4�ڸ� �Է¹޾Ƽ� ���� ���� 
		//20�� �̻��̸� �����Դϴ� �׾Ʒ��� �� 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("����⵵�� �Է��ϼ��� (ex 2000) : ");
		int birth = scan.nextInt();
		
		long current = System.currentTimeMillis();
		
		current/=1000;
		current/=60;
		current/= 60;
		current/= 24;
		current/= 365;
		current+=1970;
		int now = (int) (current-1);
		
		System.out.println("����"+now+"�� �Դϴ�.");
		if(current-birth >=20) {
			System.out.println("�����"+(current-birth)+"���� �����Դϴ�.");
		} else if(current-birth <=19) {
			System.out.println("�����"+(current-birth)+"���� �̼������Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
	

		
		
	
		
	}
}
