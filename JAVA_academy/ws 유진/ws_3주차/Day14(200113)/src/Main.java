
public class Main {

	public static void main(String[] args) {
//		FireCar fc = new FireCar();
//		Ambulance ac = new Ambulance();
//		Car c = new Car();
		
//		ac = (Ambulanc)fc;
//		fc = (FireCar)ac;
//		c = fc;
//		fc = (FireCar)c;
//		fc.drive(fc);
//		c = ac;
//		ac.drive(ac);
//		Car c = null;
//		Ambulance ac = new Ambulance();
//		c = (Car)ac;
//		System.out.println("c.door="+c.door);
//		c.message();
//		
//		Car c1 = null;
//		ac = (Ambulance)c1;
//		System.out.println("c.door="+c1.door);
//		c1.message();
//		
		Buyer b = new Buyer();
		Tv t = new Tv(100);
		Computer c = new Computer(300);
		Audio a = new Audio(200);
		
		b.buy(a);
		b.buy(c);
		b.buy(t);
		b.disp();
		
		
	}
}

class Product{
	private int price;
	private int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}

class Tv extends Product{
	Tv(int price){
		super(price);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	public String toString() {
		return "Computer";
	}
	
}
class Audio extends Product {
	Audio(int price){
		super(price);
	}
	public String toString() {
		return "Audio";
	}
	
}

class Buyer{
	private int money=1000;
	private int bonusPoint = 0;
	int index=0;
	Product[] list = new Product[10];

	Buyer(){}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	void buy(Product p) {
		if(this.money < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"�� ��� �����ϴ�.");
			return;
		}
		list[index++] = p;
		
		this.money -= p.getPrice();
		this.bonusPoint += p.getBonusPoint();
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void disp() {
		int sum=0;
		
		String itemList = "";
		
		for(int i=0; i<list.length; i++) {
			if(list[i]==null) break;
			itemList += list[i]+", ";
			sum += list[i].getPrice();
			index++;
		}
		System.out.println("�����Ͻ� ��ǰ�� "+itemList);
		System.out.println("�̰�, �� �ݾ��� "+sum+"���� �Դϴ�");
		System.out.println("���� ���� ���� "+getMoney()+"���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ "+getBonusPoint()+"�� �Դϴ�.");
	}
	
}

class Car{
	String color;
	int door=4;
	
	void message() {
		System.out.println("Car");
	}
	void drive(Car c) {

		if( c instanceof FireCar ) {
			FireCar fc = (FireCar)c;
			fc.water();
		}else if( c instanceof Ambulance ) {
			Ambulance ac = (Ambulance)c;
			ac.hospital();
		}
		System.out.println("���");
	}
	void park() {
		System.out.println("����");
	}
}

class FireCar extends Car{
	int door = 2;
	void message() {
		System.out.println("FireCar");
	}
	void water() {
		System.out.println("[�ҹ���]");
	}
}

class Ambulance extends Car{
	int door = 5;
	void message() {
		System.out.println("Ambulance");
	}
	void hospital() {
		System.out.println("[�ں深��]");
	}
}
























