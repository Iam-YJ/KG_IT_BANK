package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ���� 1 - ����Ʈ�� ��ü �����ؼ� ���� ����ϱ�
		// name telecom price
		// [1] g6 lg 70��

//		System.out.println("\t"+"name"+"\t"+"telecom"+"\t"+"price");
//		
//		Phone p1 = new Phone(1,"G6","LG",70);
//		p1.display();
//		
//		Phone p2= new Phone(2,"������7","KT",85);
//		p2.display();
//
//		Phone p3 = new Phone(3,"Note10","SKT",95);
//		p3.display();

////������ ����1 Ǯ��
//		Mobile m1 = new Mobile("G6","LGT",70);
//		Mobile m2 = new Mobile("������7","KT",85);
//		Mobile m3 = new Mobile("Note10","SKT",95);
//		
//		Mobile [] arr = {m1,m2,m3};
//		System.out.println("\tname\ttelecom\tprice");
//		for(int i=0; i<arr.length; i++) {
//			arr[i].display(i+1);
//		}
//		

//������ ����2 - ����� �����ϸ� ������ ü���� �� ���ݷ¸�ŭ ����
		// id attack hp target
		// 1 �Ƿη� 10 100 Ÿ��
		// 2 Ÿ�� 15 95 �Ƿη�
//		
//		Game p1 = new Game(1,"�Ƿη�",10,100,"Ÿ��");
//		Game p2 = new Game(2,"Ÿ��",15,95,"�Ƿη�");
//		Game p3 = new Game(3,"��ġ",20,90,"�Ѹ�");
//		Game p4 = new Game(4,"�Ѹ�",30,85,"��ġ");
//		
//		Game [] arr = {p1,p2,p3,p4};
//		System.out.println("\tid\tattack\thp\ttarget");
//		for(int i=0; i<arr.length; i++) {
//		arr[i].display(i+1);
//		}
//		System.out.println();
//		
//		System.out.println();
//		p1.attack("�Ƿη�","Ÿ��");

// ������ ���� 2 Ǯ��
//		Player p1 = new Player("�Ƿη�",10,100);
//		p1.display();
//		System.out.println();
//		
//		Player p2 = new Player("Ÿ��",15,900);
//		p2.display();
//		System.out.println();
//		
//		p1.setTarget(p2);
//		p1.attack();
//		p1.attack();		
//		p2.display();

		// ������ ���� 3 - ��Ż� ��������(���� 1) > �̸� ���� �Ұ��� , ��Ż糪 ������ ���� ����, ���� ������ 90����,
		// �� ��ǰ ���� ���ݺ�, note10�� ���������� ��ο� (���. ���ݺ� ���)
//		Scanner scan = new Scanner(System.in);
//
//		
//		Mobile[] arr = new Mobile[3];
//		arr[0] = new Mobile("G6");
//		arr[1] = new Mobile("������7");
//		arr[2] = new Mobile("Note10");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + "�� ��Ż�� � ���� ���Ͻðڽ��ϱ�?");
//			String t = scan.nextLine();
//			arr[i].setTelecom(t);
//			System.out.println(arr[i] + "�� ������ �󸶸� ���Ͻðڽ��ϱ�?");
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

// ������ ���� 3 Ǯ��
//		Mobile m1 = new Mobile("G6", "LGT", 70);
//		Mobile m2 = new Mobile("������7", "KT", 85);
//		Mobile m3 = new Mobile("Note10", "SKT", 95);
//
//		Mobile[] arr = { m1, m2, m3 };
//		Mobile.display(arr);
//
//		m1.compare(m2);
//		
//		Mobile.compare(m1,m2); //static���� �����ؼ� class�� �����ؾߵ�
//		Mobile.compare(m3,m2);

//������ �ʱ�ȭ
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

//����� ��ǰ�� ��ǰ ��ȣ�� �� ���귮 ��� ����
		// P1�� ��ǰ ��ȣ : 1
		// P2�� ��ǰ ��ȣ : 1
		// P3�� ��ǰ ��ȣ : 3
		// �� ��ǰ �� : 3
		
		//����
		//thing t = new thing();
		
		//���� Ǯ��
		product p1 = new product(); //��ü ����
		product p2 = new product(); 
		product p3 = new product(); 

		product [] pArr = {p1,p2,p3};
	
		product.disp(pArr);
		System.out.println();
	}

}

//������ ����1
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

//������ ����1 Ǯ��
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
//		System.out.println("�̸� : "+this.name);
//		System.out.println("��Ż� : "+this.telecom);
//		System.out.println("���� : "+this.price + "����");
//	}
//	
//	public void display(int num) {
//		System.out.println("["+num+"]\t"+name+"\t"+telecom+"\t"+price+"����");
//		
//	}
//}

//������ ����2 
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
//			System.out.println(this.id +"�� "+this.target +"�� �������Դϴ�");
//		int nHp = setHp(getHp()-getAttack());
//			System.out.println(this.target+"�� hp��"+nHp+" ���ҽ��ϴ�");
//		}
//	}
//	
//	
//}

//������ ���� 2 Ǯ��
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
//		System.out.println(target.id + "�� �����մϴ�");
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

//������ ���� 3
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
//				System.out.println("�ڵ����� 90�������� ��ξ� �մϴ�");
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
//		System.out.println("�̸� : " + this.name);
//		System.out.println("��Ż� : " + this.telecom);
//		System.out.println("���� : " + this.price + "����");
//	}
//
//	public void display(int num) {
//		System.out.println("[" + num + "]\t" + name + "\t" + telecom + "\t" + price + "����");
//
//	}
//
//	public void pP() {
//		
//		
//	}
//
//}

//������ ���� 3 Ǯ��
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
//		System.out.println("�̸� : " + this.name);
//		System.out.println("��Ż� : " + this.telecom);
//		System.out.println("���� : " + this.price + "����");
//	}
//
//	public void display(int num) {
//		System.out.println("[" + num + "]\t" + name + "\t" + telecom + "\t" + price + "����");
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
//			System.out.println(m.getName() + "��" + this.getName() + "���� �� ��ο�");
//		} else if(this.price == m.price) {
//			System.out.println(m.getName() + "��" + this.getName() + "�� ������ ���ƿ�");
//		}
//		
//		else {
//			System.out.println(m.getName() + "��" + this.getName() + "���� �� �ο�");
//		}
//	}
//	
//	public static void compare(Mobile m1, Mobile m2) {
//		if (m1.price < m2.price) {
//			System.out.println(m2.getName() + "��" + m1.getName() + "���� �� ��ο�");
//		} else if(m1.price == m2.price) {
//			System.out.println(m2.getName() + "��" + m1.getName() + "�� ������ ���ƿ�");
//		}
//		
//		else {
//			System.out.println(m1.getName() + "��" + m1.getName() + "���� �� �ο�");
//		}
//	}
//	
//
//}

//������ �ʱ�ȭ
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
//			System.out.println("������ ()");
//		}
//		
//	}

//����
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
//			System.out.print("P" + i + "�� ��ǰ ��ȣ : ");
//			System.out.println(arr[i]);
//			count++;
//		}System.out.print("�� ��ǰ �� : ");
//		System.out.println(count);
//	}
//
//}


//���� Ǯ�� 
class product{
	private static int count; //static���� ���� ����
	private int serialNum; //�ν��Ͻ� ���� - count�� ���� ���� ���� ����
	{
		count++;
		serialNum = count; //�ø��� ���� ���� ������ ���Ӱ� ����
	}
	
	product(){ //default �����ڴ�, �����ڰ� ���� ���� ����
		
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
			System.out.println("["+i+"]"+"��ǰ ��ȣ : "+pArr[i].serialNum);
	}
		System.out.println("�� ��ǰ �� : "+product.getCount());
		
	}
	
}

