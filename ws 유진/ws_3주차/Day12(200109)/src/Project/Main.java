package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자 예시 1 - 스마트폰 객체 생성해서 정보 출력하기
		// name telecom price
		// [1] g6 lg 70만

//		System.out.println("\t"+"name"+"\t"+"telecom"+"\t"+"price");
//		
//		Phone p1 = new Phone(1,"G6","LG",70);
//		p1.display();
//		
//		Phone p2= new Phone(2,"아이폰7","KT",85);
//		p2.display();
//
//		Phone p3 = new Phone(3,"Note10","SKT",95);
//		p3.display();

////생성자 예시1 풀이
//		Mobile m1 = new Mobile("G6","LGT",70);
//		Mobile m2 = new Mobile("아이폰7","KT",85);
//		Mobile m3 = new Mobile("Note10","SKT",95);
//		
//		Mobile [] arr = {m1,m2,m3};
//		System.out.println("\tname\ttelecom\tprice");
//		for(int i=0; i<arr.length; i++) {
//			arr[i].display(i+1);
//		}
//		

//생성자 예시2 - 상재방 공격하면 상대방의 체력이 내 공격력만큼 감소
		// id attack hp target
		// 1 뽀로로 10 100 타요
		// 2 타요 15 95 뽀로로
//		
//		Game p1 = new Game(1,"뽀로로",10,100,"타요");
//		Game p2 = new Game(2,"타요",15,95,"뽀로로");
//		Game p3 = new Game(3,"또치",20,90,"둘리");
//		Game p4 = new Game(4,"둘리",30,85,"또치");
//		
//		Game [] arr = {p1,p2,p3,p4};
//		System.out.println("\tid\tattack\thp\ttarget");
//		for(int i=0; i<arr.length; i++) {
//		arr[i].display(i+1);
//		}
//		System.out.println();
//		
//		System.out.println();
//		p1.attack("뽀로로","타요");

// 생성자 예시 2 풀이
//		Player p1 = new Player("뽀로로",10,100);
//		p1.display();
//		System.out.println();
//		
//		Player p2 = new Player("타요",15,900);
//		p2.display();
//		System.out.println();
//		
//		p1.setTarget(p2);
//		p1.attack();
//		p1.attack();		
//		p2.display();

		// 생성자 예시 3 - 통신사 예제에서(예시 1) > 이름 변경 불가능 , 통신사나 가격은 변경 가능, 최저 가격은 90만원,
		// 두 제품 간에 가격비교, note10이 아이폰보다 비싸요 (출력. 가격비교 기능)
//		Scanner scan = new Scanner(System.in);
//
//		
//		Mobile[] arr = new Mobile[3];
//		arr[0] = new Mobile("G6");
//		arr[1] = new Mobile("아이폰7");
//		arr[2] = new Mobile("Note10");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + "의 통신사는 어떤 것을 택하시겠습니까?");
//			String t = scan.nextLine();
//			arr[i].setTelecom(t);
//			System.out.println(arr[i] + "의 가격은 얼마를 택하시겠습니까?");
//			int p = scan.nextInt();
//			arr[i].setPrice(i);
//			System.out.println(arr[i]);
//		}
//		System.out.println("");
//
//		
//		System.out.println("\tname\ttelecom\tprice");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].display(i + 1);
//		}
//		System.out.println();

// 생성자 예시 3 풀이
//		Mobile m1 = new Mobile("G6", "LGT", 70);
//		Mobile m2 = new Mobile("아이폰7", "KT", 85);
//		Mobile m3 = new Mobile("Note10", "SKT", 95);
//
//		Mobile[] arr = { m1, m2, m3 };
//		Mobile.display(arr);
//
//		m1.compare(m2);
//		
//		Mobile.compare(m1,m2); //static으로 선언해서 class로 접근해야됨
//		Mobile.compare(m3,m2);

//생성자 초기화
//		System.out.println("InitEx.staticVal = "+InitEx.staticVal);
//		InitEx ie = new InitEx();
//		System.out.println("ie.instanceVal = "+ie.instanceVal);
//		System.out.println("InitEx.staticVal = "+InitEx.staticVal);
//		System.out.println(Arrays.toString(ie.arr));
//		
//		InitEx iee = new InitEx();
//		System.out.println("ie.instanceVal = "+iee.instanceVal);
//		System.out.println("InitEx.staticVal = "+InitEx.staticVal);
//		System.out.println(Arrays.toString(iee.arr));

//생산된 제품의 제품 번호와 총 생산량 출력 예시
		// P1의 제품 번호 : 1
		// P2의 제품 번호 : 1
		// P3의 제품 번호 : 3
		// 총 제품 수 : 3
		
		//예시
		//thing t = new thing();
		
		//예시 풀이
		product p1 = new product(); //객체 생성
		product p2 = new product(); 
		product p3 = new product(); 

		product [] pArr = {p1,p2,p3};
	
		product.disp(pArr);
		System.out.println();
	}

}

//생성자 예시1
class Phone {
	private int num;
	private String name;
	private String telecom;
	private int price;
	
	Phone(){
		
	}
	
	Phone(int num, String name, String telecom, int price){
		this.num = num;
		this.name = name;
		this.telecom = telecom;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelecom() {
		return telecom;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.print("["+num+"]\t");
		System.out.print(name+"\t");
		System.out.print(telecom+"\t");
		System.out.print(price+"\t");
		System.out.println();
	}
	
	
	
	
}

//생성자 예시1 풀이
//class Mobile{
//	private String name;
//	private String telecom;
//	private int price;
//	
//	Mobile(){
//		
//	}
//	
//	Mobile(String name){
//		this.name = name;
//	}
//	
//	Mobile(String name, String telecom, int price){
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTelecom() {
//		return telecom;
//	}
//	public void setTelecom(String telecom) {
//		this.telecom = telecom;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
//	public void setData(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//	
//	public void display() {
//		System.out.println("이름 : "+this.name);
//		System.out.println("통신사 : "+this.telecom);
//		System.out.println("가격 : "+this.price + "만원");
//	}
//	
//	public void display(int num) {
//		System.out.println("["+num+"]\t"+name+"\t"+telecom+"\t"+price+"만원");
//		
//	}
//}

//생성자 예시2 
//class Game{
//	private int num;
//	private String id;
//	private int attack;
//	private int hp;
//	private String target;
//	
//	Game(){
//		
//	}
//	
//	Game(int num, String id, int attack, int hp, String target){
//		this.num = num;
//		this.id = id;
//		this.attack = attack;
//		this.hp = hp;
//		this.target = target;
//	}
//	
//	
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	public int getAttack() {
//		return attack;
//	}
//	public void setAttack(int attack) {
//		this.attack = attack;
//	}
//	public int getHp() {
//		return hp;
//	}
//	public int setHp(int hp) {
//		this.hp = hp;
//		return hp;
//	}
//	public String getTarget() {
//		return target;
//	}
//	public void setTarget(String target) {
//		this.target = target;
//	}
//	
//
//
//public void display(int num) {
//	System.out.println("["+num+"]\t"+id+"\t"+attack+"\t"+hp+"\t"+target);
//	
//}
//	
//	public void attack(String id,String target) {
//		this.id = id;
//		this.target = target;
//		
//		if(this.target == getTarget()) {
//			System.out.println(this.id +"가 "+this.target +"을 공격중입니다");
//		int nHp = setHp(getHp()-getAttack());
//			System.out.println(this.target+"의 hp가"+nHp+" 남았습니다");
//		}
//	}
//	
//	
//}

//생성자 예시 2 풀이
//class Player {
//	private String id;
//	private int attack, hp;
//	private Player target;
//
//	Player() {
//
//	}
//
//	Player(String id, int attack, int hp) {
//		this.setId(id);
//		this.setAttack(attack);
//		this.setHp(hp);
//	}
//
//	Player(String id, int attack, int hp, Player target) {
//		this.setId(id);
//		this.setAttack(attack);
//		this.setHp(hp);
//		this.setTarget(target);
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public int getAttack() {
//		return attack;
//	}
//
//	public void setAttack(int attack) {
//		this.attack = attack;
//	}
//
//	public int getHp() {
//		return hp;
//	}
//
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//
//	public Player getTarget() {
//		return target;
//	}
//
//	public void setTarget(Player target) {
//		this.target = target;
//	}
//
//	public void attack() {
//		System.out.println(target.id + "를 공격합니다");
//		target.hp -= this.attack;
//		System.out.println(target.id + " : " + target.hp);
//	}
//
//	public void display() {
//		if (target != null) {
//			System.out.println(id + "\t" + attack + "\t" + hp + "\t" + target.id);
//		}
//		else {
//			System.out.println(id + "\t" + attack + "\t" + hp);
//			
//		}
//	}
//
//}

//생성자 예시 3
//class Mobile {
//	private String name;
//	private String telecom;
//	private int price;
//	private Mobile nN;
//
//	Mobile() {
//
//	}
//
//	Mobile(String name) {
//		this.name = name;
//	}
//
//	Mobile(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getTelecom() {
//		return telecom;
//	}
//
//	public void setTelecom(String telecom) {
//		this.telecom = telecom;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		while (true) {
//			if (price < 90) {
//				System.out.println("핸드폰은 90만원보다 비싸야 합니다");
//			} else {
//				this.price = price;
//			}
//		}
//	}
//
//	public void setData(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//
//
//
//	public void display() {
//		System.out.println("이름 : " + this.name);
//		System.out.println("통신사 : " + this.telecom);
//		System.out.println("가격 : " + this.price + "만원");
//	}
//
//	public void display(int num) {
//		System.out.println("[" + num + "]\t" + name + "\t" + telecom + "\t" + price + "만원");
//
//	}
//
//	public void pP() {
//		
//		
//	}
//
//}

//생성자 예시 3 풀이
//class Mobile {
//	private String name;
//	private String telecom;
//	private int price;
//
//	Mobile() {
//
//	}
//
//	Mobile(String name) {
//		this.name = name;
//	}
//
//	Mobile(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//
//	public String getName() {
//		return name;
//	}
//
////public void setName(String name) {
////	this.name = name;
////}
//	public String getTelecom() {
//		return telecom;
//	}
//
//	public void setTelecom(String telecom) {
//		this.telecom = telecom;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		if (price < 90) {
//			price = 0;
//		}
//		this.price = price;
//	}
//
//	public void setData(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//	}
//
//	public void display() {
//		System.out.println("이름 : " + this.name);
//		System.out.println("통신사 : " + this.telecom);
//		System.out.println("가격 : " + this.price + "만원");
//	}
//
//	public void display(int num) {
//		System.out.println("[" + num + "]\t" + name + "\t" + telecom + "\t" + price + "만원");
//
//	}
//	
//	public static void display(Mobile [] arr) {
//		System.out.println("\tname\ttelecom\tprice");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].display(i + 1);
//		}
//	}
//
//	public void compare(Mobile m) {
//		if (this.price < m.price) {
//			System.out.println(m.getName() + "이" + this.getName() + "보다 더 비싸요");
//		} else if(this.price == m.price) {
//			System.out.println(m.getName() + "이" + this.getName() + "과 가격이 같아요");
//		}
//		
//		else {
//			System.out.println(m.getName() + "이" + this.getName() + "보다 더 싸요");
//		}
//	}
//	
//	public static void compare(Mobile m1, Mobile m2) {
//		if (m1.price < m2.price) {
//			System.out.println(m2.getName() + "이" + m1.getName() + "보다 더 비싸요");
//		} else if(m1.price == m2.price) {
//			System.out.println(m2.getName() + "이" + m1.getName() + "과 가격이 같아요");
//		}
//		
//		else {
//			System.out.println(m1.getName() + "이" + m1.getName() + "보다 더 싸요");
//		}
//	}
//	
//
//}

//생성자 초기화
//	class InitEx{
//		int instanceVal;
//		static int staticVal;
//		int [] arr = new int [10];
//		
//		static {
//			System.out.println("Static{}");
//			staticVal = 10;
//		}
//		
//		{
//			System.out.println("Instance{}");
//			instanceVal = 10;
//			staticVal ++;
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = (int)(Math.random()*100)+1;
//			}
//		}
//		InitEx(){
//			System.out.println("생성자 ()");
//		}
//		
//	}

//예시
//class thing {
//	static int [] arr = {1,2,3};
//	int count = 0;
//
//	static {
//		
//	}
//
//	thing() {
//		for (int i = 0; i < 3; i++) {
//			System.out.print("P" + i + "의 제품 번호 : ");
//			System.out.println(arr[i]);
//			count++;
//		}System.out.print("총 제품 수 : ");
//		System.out.println(count);
//	}
//
//}


//예시 풀이 
class product{
	private static int count; //static으로 누적 가능
	private int serialNum; //인스턴스 변수 - count에 대한 정보 누적 못함
	{
		count++;
		serialNum = count; //시리얼 넘을 가진 것으로 새롭게 생성
	}
	
	product(){ //default 생성자는, 생성자가 없을 때만 생성
		
	} 

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		product.count = count;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public static void disp(product [] pArr) {	
		for(int i=0; i<pArr.length; i++) {
			System.out.println("["+i+"]"+"제품 번호 : "+pArr[i].serialNum);
	}
		System.out.println("총 제품 수 : "+product.getCount());
		
	}
	
}

