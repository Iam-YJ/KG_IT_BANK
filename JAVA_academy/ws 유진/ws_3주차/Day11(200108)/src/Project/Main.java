package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//�����ε� ����1		
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

//�����ε� ���� 2		
//		double fN, sN;
//		double res = 0;
//		Cal c = new Cal();
//
////		case 1 ��ĳ�� > String > charat ���� �� 
////		case 2 int temp ���� > �Է¼��� temp �� > �Է¼��� �������̸� �ְ� ����, �������̸� �ְ� ����
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ù ��° ���ڸ� �Է��ϼ��� : ");
//		String fN = scan.nextLine();

//		System.out.println("add(3,4) : "+c.add(3,4) );
//		System.out.println("minus(3.5,5) : "+c.minus(3.5,5) );
//		System.out.println("mul(3.5,4.1) : "+c.mul(3.5,4.1) );
//		System.out.println("div(3,4.1) : "+c.div(3,4.1) );
//		//���⼭ �ٵ� ��ĳ�ʷ� �ϴ� ���� ����?

//������ ���� 1
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

//this ���� 1
//		Info in = new Info();
//		Info in1 = new Info();
//		
//		in.setName("������");
//		in.setAge(25);
//		in.dispInfo();
//		System.out.println();
//		
//		in1.setName("������");
//		in.setAge(23);
//		in1.dispInfo();

//this ����1 - [car1�� ����] color ���� geatType manual door 2
		// [car2�� ����] color ���� geatType manual door 2
//
//		Car c = new Car("������", "manual", 4); // �ν��Ͻ� �����ϸ鼭 �ʱ�ȭ�ϰ� �ִ���..
//		System.out.println("[car 1�� ����]");
//		c.display();
//		System.out.println();
//
//		Car c1 = new Car("�Ķ���", "auto", 2);
//		System.out.println("[car 2�� ����]");
//		c1.setDoor(4);
//		c1.display();

		//������ �����ε� ���� - Info
		Info in1 = new Info();
		Info in2 = new Info("������");
		Info in3 = new Info("������" , 23);
		
		in1.dispInfo();
		System.out.println();
		in2.dispInfo();
		System.out.println();
		in3.dispInfo();
		
	}

}

//�����ε� ���� 1
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

//�����ε� ���� 2
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

//������ ����1
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

//������ ���� 1
//class ConstEx1{
//	int val;
//	
//	ConstEx1(){
//		val = 100;
//	}
//}

//this ���� 1
class Info{
	private String name="ddd"; //name - heap ����
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
	
	
	
	public void setName(String name){ //name - stack ����
		this.name = name; // heap ������ name�� stack ������ ������.. �ּҰ����� 
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
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
	}
}

//this ����1
class Car {
	private String color;
	private String gearType;
	private int door;

	Car(String color, String gearType, int door) { // ���� ������ ���� ����
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
