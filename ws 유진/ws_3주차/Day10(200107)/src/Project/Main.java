package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//예시 1
//		MethodEx me = new MethodEx();
//		Main m = new Main();
//
//		int result = me.add(3, 4);
//		int result1 = MethodEx.add(3, 4);
//		System.out.println("result는 " + result);
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

//클래스 예시2  - 정수 연산에 대한 사칙연산기 생성해보세요
//		Calculator c = new Calculator();
//		c.Plus(3,4);
//		c.Minus(10, 2);
//		c.Multiply(10, 2);
//		c.Division(10, 2);
//		
//		
//		System.out.println("무엇을 하시겠습니까 ?");
//		
//		System.out.println("1더하기 2빼기 3곱하기 4나누기");
//		int answer = sc.nextInt();
//		sc.nextLine();
//		System.out.println("계산하고 싶은 숫자 두 개를 입력하세요");
//		
//		int fNum = sc.nextInt();
//		sc.nextLine();
//		int sNum = sc.nextInt();
//		
//		switch(answer) {
//		
//		case 1 :
//			Calculator.Plus(fNum, sNum);
//			System.out.println(Calculator.Plus(fNum, sNum)); //클래스 메소드로 사용하면 클래스이름.함수 써야한다
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
//			System.out.println("메뉴 범위를 벗어났습니다");
//			break;
//		}

//예제 3
//		YJ me = new YJ();
//		me.setName("박유진");
//		me.setAge(25);
//		System.out.println("이름 : "+me.getName() + "나이 : "+me.getAge());

		// 예제 4 - 시간 정보를 입력 받아서 입력 받은 시간이 지난 후에 메시지 출력
		// timer 객체 생성해서 setter getter 구현

		// 예제4
		Timer t = new Timer();
		Scanner scan = new Scanner(System.in);

		int h = 0, m = 0, s = 0, realTime = 0;

		System.out.println("시간 정보를 입력하세요(시 분 초) : ");

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
			System.out.println(j + "분 남았습니다");
			for (int k = t.getSecond(); k > 0; k--) {
				Thread.sleep(100);
				System.out.println(k + "초 남았습니다");
				
			}
		}
		
		
		System.out.println("사랑해요 자바!");

		// 예제 4 강사 풀이
//		Timer2 t = new Timer2();
//		t.dispTime();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("시간 입력 : ");
//		int hour = sc.nextInt();
//
//		System.out.println("분 입력 : ");
//		int minute = sc.nextInt();
//		minute = hour * 60 + minute;
//
//		System.out.println("초 입력 : ");
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
//		System.out.println("사랑해요 자바!");
//	}
//}

	}
}
//예시 1 - 클래스
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

//클래스 예시2  - 정수 연산에 대한 사칙연산기 생성해보세요
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

//클래스 예시 3 - get set
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

//예제4
class Timer {
	private int time;
	// 스캔받아야되는데.. 그러려면 세터
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

//강사 풀이
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
//		System.out.print(getHour() + "시간");
//		System.out.print(getMinute() + "분");
//		System.out.println(getSecond() + "초");
//
//	}
//
//}