package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//오버로딩 예시1		
//		Data d = new Data();
//		Main m = new Main();
//		
//		d.x = 10;
//		System.out.println("main d.x :  "+ d.x);
//		
//		int[] ax = {10};
//		System.out.println("ax[o] : "+ ax[0]);
//		
//		m.change(ax);
//		System.out.println("after change.x"+ax[0]);
//		
//	}
//	
//	void change(int [] ax) {
//		ax[0]=1000;
//		System.out.println("change().x"+ax[0]);
//	}

//오버로딩 예시 2		
//		double fN, sN;
//		double res = 0;
//		Cal c = new Cal();
//
////		case 1 스캐너 > String > charat 으로 비교 
////		case 2 int temp 만들어서 > 입력수랑 temp 비교 > 입력수가 정수형이면 왜곡 ㄴㄴ, 더블형이면 왜곡 ㅇㅇ
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 번째 숫자를 입력하세요 : ");
//		String fN = scan.nextLine();

//		System.out.println("add(3,4) : "+c.add(3,4) );
//		System.out.println("minus(3.5,5) : "+c.minus(3.5,5) );
//		System.out.println("mul(3.5,4.1) : "+c.mul(3.5,4.1) );
//		System.out.println("div(3,4.1) : "+c.div(3,4.1) );
//		//여기서 근데 스캐너로 하는 법은 없나?

//생성자 예시 1
//		ConstEx ce = new ConstEx();
//		ConstEx cee = new ConstEx(20);		
//		ConstEx1 ce1 = new ConstEx1();
//		
//		System.out.println("cee.val : "+ cee.val);
//		System.out.println("ce1.val : "+ ce1.val);
//		
//		ConstEx ce21 = new ConstEx();
//		ConstEx ce22= new ConstEx();
//		ce.setVal(100);

//this 예시 1
//		Info in = new Info();
//		Info in1 = new Info();
//		
//		in.setName("박유진");
//		in.setAge(25);
//		in.dispInfo();
//		System.out.println();
//		
//		in1.setName("박준형");
//		in.setAge(23);
//		in1.dispInfo();

//this 과제1 - [car1의 정보] color 빨강 geatType manual door 2
		// [car2의 정보] color 빨강 geatType manual door 2
//
//		Car c = new Car("빨간색", "manual", 4); // 인스턴스 생성하면서 초기화하고 있는중..
//		System.out.println("[car 1의 정보]");
//		c.display();
//		System.out.println();
//
//		Car c1 = new Car("파란색", "auto", 2);
//		System.out.println("[car 2의 정보]");
//		c1.setDoor(4);
//		c1.display();

		//생성자 오버로딩 예시 - Info
		Info in1 = new Info();
		Info in2 = new Info("박유진");
		Info in3 = new Info("박준형" , 23);
		
		in1.dispInfo();
		System.out.println();
		in2.dispInfo();
		System.out.println();
		in3.dispInfo();
		
	}

}

//오버로딩 예시 1
//class Data{
//	int x;
//	int add(int a, int b) {
//		return a+b;
//	}
//	
//	long add(int x, long y) {
//		return x+y;
//	}
//	
//	long add(long x, long y) {
//		return x+y;
//	}
//	
//	long add(long [] x, int y) {
//		x[0] = y;
//		return x[0];
//	}
//
//}

//오버로딩 예시 2
//class Cal {
//
//	long add(long X,long Y) {
//		return X + Y;
//	}
//	
//	long minus(long X, long Y) {
//		if (X > Y) {
//			return X - Y;
//		}
//		return Y - X;
//	}
//	
//	long mul(long X, long Y) {
//		return X * Y;
//	}
//	
//	long div(long X, long Y) {
//		if (X > Y) {
//			return X / Y;
//		}
//		return Y / X;
//	}
//	
//	
//	double add(double X, double Y) {
//		return X + Y;
//	}
//	
//	double minus(double X, double Y) {
//		if (X > Y) {
//			return X - Y;
//		}
//		return Y - X;
//	}
//	
//	double mul(double X, double Y) {
//		return X * Y;
//	}
//	
//	double div(double X, double Y) {
//		if (X > Y) {
//			return X / Y;
//		}
//		return Y / X;
//	}
//	
//}

//생성자 예시1
//class ConstEx{
//	int val;
//	int count;
//	
//	ConstEx(){
//	}
//	
//	ConstEx(int val1){
//		val = val1;
//	}
//	
//	void setVal(int val1) {
//		int temp;
//		
//		temp = val1 * val;
//		val = temp;
//		
//		
//	}
//}

//생성자 예시 1
//class ConstEx1{
//	int val;
//	
//	ConstEx1(){
//		val = 100;
//	}
//}

//this 예시 1
class Info{
	private String name="ddd"; //name - heap 영역
	private int age=20;

	Info(){
		
	}
	
	Info(String name){
		this.name = name;
	}
	
	Info(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	public void setName(String name){ //name - stack 영역
		this.name = name; // heap 영역의 name은 stack 영역을 쓸꺼다.. 주소값으로 
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void dispInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
	}
}

//this 과제1
class Car {
	private String color;
	private String gearType;
	private int door;

	Car(String color, String gearType, int door) { // 스택 영역에 변수 생성
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(){
		
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return this.door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public void display() {
		System.out.println("color\t : " + this.color);
		System.out.println("gearType : " + this.gearType);
		System.out.println("door\t : " + this.door);
	}

}
