package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//���� 1
//		MethodEx me = new MethodEx();
//		Main m = new Main();
//
//		int result = me.add(3, 4);
//		int result1 = MethodEx.add(3, 4);
//		System.out.println("result�� " + result);
//
//		int[] arr = { 0, 0 };
//		m.setResult(arr);
//		System.out.println(Arrays.toString(arr));
//		me.addArray(3, 4, arr);
//		System.out.println(Arrays.toString(arr));
//
//	}
//
//	void setResult(int[] arr) {
//		arr[0] = 10;
//		arr[1] = 20;
//	}

//Ŭ���� ����2  - ���� ���꿡 ���� ��Ģ����� �����غ�����
//		Calculator c = new Calculator();
//		c.Plus(3,4);
//		c.Minus(10, 2);
//		c.Multiply(10, 2);
//		c.Division(10, 2);
//		
//		
//		System.out.println("������ �Ͻðڽ��ϱ� ?");
//		
//		System.out.println("1���ϱ� 2���� 3���ϱ� 4������");
//		int answer = sc.nextInt();
//		sc.nextLine();
//		System.out.println("����ϰ� ���� ���� �� ���� �Է��ϼ���");
//		
//		int fNum = sc.nextInt();
//		sc.nextLine();
//		int sNum = sc.nextInt();
//		
//		switch(answer) {
//		
//		case 1 :
//			Calculator.Plus(fNum, sNum);
//			System.out.println(Calculator.Plus(fNum, sNum)); //Ŭ���� �޼ҵ�� ����ϸ� Ŭ�����̸�.�Լ� ����Ѵ�
//			break;
//		
//		case 2 :
//			Calculator.Minus(fNum, sNum);
//			System.out.println(Calculator.Minus(fNum, sNum));
//			break;
//		
//		case 3 :
//			Calculator.Multiply(fNum, sNum);
//			System.out.println(Calculator.Multiply(fNum, sNum));
//			break;
//		
//		case 4 :
//			Calculator.Division(fNum, sNum);
//			System.out.println(Calculator.Division(fNum, sNum));
//			break;
//			
//		default:
//			System.out.println("�޴� ������ ������ϴ�");
//			break;
//		}

//���� 3
//		YJ me = new YJ();
//		me.setName("������");
//		me.setAge(25);
//		System.out.println("�̸� : "+me.getName() + "���� : "+me.getAge());

		// ���� 4 - �ð� ������ �Է� �޾Ƽ� �Է� ���� �ð��� ���� �Ŀ� �޽��� ���
		// timer ��ü �����ؼ� setter getter ����

		// ����4
		Timer t = new Timer();
		Scanner scan = new Scanner(System.in);

		int h = 0, m = 0, s = 0, realTime = 0;

		System.out.println("�ð� ������ �Է��ϼ���(�� �� ��) : ");

		h = scan.nextInt();
		t.setMinute(h);
		scan.nextLine();

		m = scan.nextInt();
		t.setMinute(m);
		scan.nextLine();

		s = scan.nextInt();
		t.setSecond(s);
		scan.nextLine();

//		t.setTime(h, m, s);
//		t.setHour(h);
//		t.setMinute(m);
//		t.setSecond(s);

//		t.getTime();

		for (int j = t.getMinute(); j > 0; j--) {
			System.out.println(j + "�� ���ҽ��ϴ�");
			for (int k = t.getSecond(); k > 0; k--) {
				Thread.sleep(100);
				System.out.println(k + "�� ���ҽ��ϴ�");
				
			}
		}
		
		
		System.out.println("����ؿ� �ڹ�!");

		// ���� 4 ���� Ǯ��
//		Timer2 t = new Timer2();
//		t.dispTime();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("�ð� �Է� : ");
//		int hour = sc.nextInt();
//
//		System.out.println("�� �Է� : ");
//		int minute = sc.nextInt();
//		minute = hour * 60 + minute;
//
//		System.out.println("�� �Է� : ");
//		int second = sc.nextInt();
//		second = minute * 60 + second;
//
//		for (int i = hour; i >= 0; i--) {
//			t.setHour(i);
//			for (int j = minute % 60; j >= 0; j--) {
//				t.setMinute(j);
//				for (int k = second % 60; k >= 0; k--) {
//					t.setSecond(k);
//					t.dispTime();
//					Thread.sleep(1);
//					second--;
//				}
//				minute--;
//			}
//		}
//		System.out.println("����ؿ� �ڹ�!");
//	}
//}

	}
}
//���� 1 - Ŭ����
//class MethodEx {
//	static int add(int a, int b) {
//		return a + b;
//	}
//
//	void addArray(int a, int b, int[] result) {
//		result[0] = a;
//		result[1] = b;
//	}
//}

//Ŭ���� ����2  - ���� ���꿡 ���� ��Ģ����� �����غ�����
//class Calculator {
//
//	static int Plus(int a, int b) {
//		return a + b;
//	}
//
//	static int Minus(int a, int b) {
//		if (a > b) {
//			return a - b;
//		} else {
//			return b - a;
//		}
//
//	}
//
//	static int Multiply(int a, int b) {
//		return a * b;
//	}
//
//	static int Division(int a, int b) {
//		if (a > b) {
//			return a / b;
//		} else {
//			return b / a;
//		}
//	}
//}

//Ŭ���� ���� 3 - get set
//	class YJ{
//		private String name;
//		private int age;
//		
//		public void setName(String name1){
//			name = name1;
//			
//		}
//		
//		public String getName() {
//			return name;
//		}
//		
//		public void setAge(int age) {
//			int age1 = 0;
//			if(age1<1 || age1>40) {
//				age1 = 00;
//			}
//				age = age1;
//		}
//		
//		public int getAge() {
//			return age;
//		}
//		
//	}

//����4
class Timer {
	private int time;
	// ��ĵ�޾ƾߵǴµ�.. �׷����� ����
	private int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
		time = s + (m * 60) + (h * 60 * 60);
	}

	public int getTime() {
		return time;
	}

	public void setHour(int h) {
		time = h;
	}

	public int getHour() {
		return time;
	}

	public void setMinute(int m) {
		time = m;
	}

	public int getMinute() {
		return time;
	}

	public void setSecond(int s) {
		time = s;
	}

	public int getSecond() {
		return time;
	}

}

//���� Ǯ��
//class Timer2 {
//	private int hour;
//	private int minute;
//	private int second;
//
//	public void setHour(int hour1) {
//		hour = hour1;
//	}
//
//	public int getHour() {
//		return hour;
//	}
//
//	public void setMinute(int minute1) {
//		minute = minute1;
//	}
//
//	public int getMinute() {
//		return minute;
//	}
//
//	public void setSecond(int second1) {
//		second = second1;
//	}
//
//	public int getSecond() {
//		return second;
//	}
//
//	public void dispTime() {
//		System.out.print(getHour() + "�ð�");
//		System.out.print(getMinute() + "��");
//		System.out.println(getSecond() + "��");
//
//	}
//
//}