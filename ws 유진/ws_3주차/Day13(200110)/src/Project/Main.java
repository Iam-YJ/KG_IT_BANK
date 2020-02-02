package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//상속 1		
//		Child c = new Child();
//		Child2 c2 = new Child2();
//		
////		c.lastName = "Kim";
////		c2.lastName = "Kim";
////		
////		System.out.println("c의 성 : " + c.lastName);
////		System.out.println("c1의 성 : " + c2.lastName);
//		c.message();
	
		
//상속2
//		People p = new People("박유진",25);
//		p.display();
//		System.out.println();
//		Student s = new Student("박준형",23,4.4,122);
//		s.display();
//		System.out.println();
//		Worker w = new Worker("일꾼",55,150,22);
//		w.display();
		
		//final 1
//		FinalEx fe = new FinalEx();
//		CFinalEx cfe = new CFinalEx();
//		
//		fe.setScale(1000);
//		System.out.println("Scale : "+fe.getScale());
//		cfe.setScale(100);
//		System.out.println("Scale : "+cfe.getScale());
		
		
//final 2
//		Scanner scan = new Scanner (System.in);
//		
//		Area a = new Area();
//		
//		System.out.println("넓이를 입력하세요 : ");
//		double w = scan.nextDouble();
//		System.out.println("높이를 입력하세요 : ");
//		double h = scan.nextDouble();
//		
//		a.readArea(w,h);
//		System.out.println();
//		a.cheakArea(w, h);

		//final2 - 풀이
//		AreaEx ae = new AreaEx();
//		ae.setHeight(30);
//		ae.setArea(ae.getWIDTH(),ae.getHeight());
//		ae.disp();

		
//final 3
//		Scanner sc = new Scanner (System.in);
//		Key k = new Key();
//		System.out.println("키 입력 : ");
//		String key = sc.next();
//		key = key.toLowerCase();
//		switch(key) {
//		case Key.SKILL1 : 
//			System.out.println("skill 1");
//			break;
//			
//		default:
//			System.out.println("잘못 입력");
//		}
		
		CAbsEx cae = new CAbsEx();
		cae.absMethod();
		
		
	}

}

//상속 1
//class Parent{
//	String lastName="Kim";
//	void message() {
//		System.out.println("Parent");
//	}
//}
//
//class Child extends Parent{		
////	String lastName="KimC";
//	void message() {
//		String lastName="KimGC";
//		System.out.println("lastName : "+lastName); //먼저 블록에서 찾아서 출력
//		System.out.println("this.lastName : "+this.lastName); //인스턴스에 대한 주소 찾아서 출력
//		System.out.println("super.lastName : "+super.lastName);
//	}
//}
//
//class Child2 extends Parent{
//	
//}


//상속 2
//class People{
//	
//	private String name;
//	private int age;
//	
//	People(){ //아무것도 가지지 않는 생성자... 사용자가 people만 했을 때 이게 없다면 실행이 안된다
//		
//	}
//	
//	People(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void display() {
//		System.out.println("이름 : "+ name);
//		System.out.println("나이 : "+age);
//	}
//}
//
//
//class Student extends People{
//	private double grade;
//	private int sNum;
//	
//	Student(){
//		this.grade = grade;
//		this.sNum = sNum;
//	}
//	
//	Student(String name, int age,double grade, int sNum){
//		super.setName(name);
//		super.setAge(age);
//		this.grade = grade;
//		this.sNum = sNum;
//	}
//	
//	
//	public double getGrade() {
//		return grade;
//	}
//
//	public void setGrade(double grade) {
//		this.grade = grade;
//	}
//
//	public int getsNum() {
//		return sNum;
//	}
//
//	public void setsNum(int sNum) {
//		this.sNum = sNum;
//	}
//
//	public void display() {
//		super.display();
//		System.out.println("학점 : "+grade);
//		System.out.println("학번 : "+sNum);
//	}
//	
//}
//
//
//class Worker extends People{
//	private double height;
//	private double weight;
//	
//	Worker(){
//		
//	}
//
//	Worker(String name, int age,double height, double weight){
//		super.setName(name);
//		super.setAge(age);
//		this.height = height;
//		this.weight = weight;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//
//	public  void display() {
//		super.display();
//		System.out.println("키 : "+ height);
//		System.out.println("몸무게 : "+weight);
//	}
//}


//final
//class FinalEx{
//	final int defaultScale = 100000;
//	int scale;
//	
//	void setScale(int scale) {
//		int level = 1;
//		this.scale = defaultScale / (scale * level);
//	}
//
//	public int getScale() {
//		return scale;
//	}
//}
//
//class CFinalEx extends FinalEx{
//	void setScale(int scale) {
//		int level = 1;
//		this.scale = defaultScale / (scale * level);
//	}
//}


//final2 - 면적 구하기 area = wide * height
//class Area{
//	
//	double width;
//	double height;
//	
//	Area(){
//		
//	}
//	
//	final public void cheakArea(double width, double height) {
//		 double area = width * height;
//		System.out.println(width+"와"+ height+"의 넓이는 "+area+"입니다");
//	}
//	
//	public void readArea(double width, double height){
//		System.out.println("입력하신 넓이는"+width);
//		System.out.println("입력하신 높이는"+height+"입니다.");
//	}
//	
//}

//final 2 - 풀이
//class AreaEx{
//	private final int WIDTH;
//	private int height;
//	private int area;
//	
//	AreaEx(){
//		WIDTH = 10;
//	}
//	
//	AreaEx(int width, int height){
//		this.WIDTH = width;
//		this.height = height;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//	public int getArea() {
//		return area;
//	}
//
//	final public void setArea(int width, int height) {
//		this.area = width * height * 1000;
//	}
//
//	public int getWIDTH() {
//		return WIDTH;
//	}
//	
//	public void disp() {
//		System.out.println("넓이 : "+getWIDTH());
//		System.out.println("높이 : "+getHeight());
//		System.out.println("면적 : "+getArea());
//	}
//	
//}

//final 3
//class Key{
//	final static public String SKILL1 = "q";
//	final static public String SKILL2 = "w";
//	final static public String SKILL3 = "e";
//	final static public String SKILL4 = "r";
//	
//}


//추상 클래스
abstract class AbsEx{
	abstract void absMethod();	
}

class CAbsEx extends AbsEx{
	void absMethod() {
		System.out.println("CAbsEx");
	}
}
