package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//���� - ������
//		int count = 0;
//		int r = 0;
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("����(��)�� �Է��ϼ��� : ");
//		int row = scan.nextInt(); // �� ���� row
//		System.out.println("����(��)�� �Է��ϼ��� : ");
//		int col = scan.nextInt(); // �� ���� col
//
//		int num = row * col;
//
//		int[][] bingo = new int[row][col]; // �����Ƕ���
//		int[] random = new int[num + 1]; // ���� �� �����
//		boolean[] rCheck = new boolean[num + 1]; // ������ Ȯ�ο�
//
//		for (int i = 0; i < num; i++) { // ������ �̴� �ڵ�
//			r = (int) (Math.random() * num + 1); // ������ �̾Ҵ�..
//			count++; // ���� ���ڼ��� ������ų����
//			if (rCheck[r] == false) {
//				rCheck[r] = true;
//				random[i] = r;
//			} else {
//				i--;
//			}
//
//		}
//
//		for (int i = 0; i < num; i++) { // ������ Ȯ�ο� ���
//			System.out.print(random[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < bingo.length; i++) { // �����ǿ� �ִ� ��
//			for (int j = 0; j < bingo[i].length; j++) {
//				bingo[i][j] = random[i * bingo[i].length + j];
//
//			}
//		}
//
//		for (int j = 0; j < col; j++) {
//			for (int i = 0; i < row; i++) { // ����ϴ���
//				System.out.print(bingo[i][j] + " \t");
//
//			}
//			System.out.println();
//		}

		// ���� Ǯ��
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		
//		System.out.println("���ο� ���� : ");
//		int row = sc.nextInt();
//		System.out.println("���ο� ���� : ");
//		int col = sc.nextInt();
//		int bgBoard = row * col;
//		
//		int [][] aBingo = new int[row][col];
//		int []aBgNum = new int [bgBoard];
//		
//		for(int i=0; i<aBgNum.length; i++) {
//			int bgNum = (int)(Math.random()*bgBoard+1);
//			flag = true;
//			int j;
//			while(flag) {
//				for(j=0; j<i; j++) {
//					if(aBgNum[j]==bgNum) {
//						bgNum = (int)(Math.random()*bgBoard+1);
//						break;//������ ���� �ߺ��� ��쿡 break�� ���� 
//						
//					}
//					
//				}
//				if(i==j) {
//					flag = false;
//				}
//			}
//			aBgNum[i] = bgNum;
//		}
//		
//		int k = 0;
//		for(int j=0; j<aBingo[i].length; j++) {
//		for(int i=0; i<aBingo.length; i++) {
//				aBingo[i][j] = aBgNum[k];
//				k++;
//				System.out.print(aBingo[i][j]+"\t");
//			}System.out.println();
//		}

		// class ����
		// class�� ����� ���� ������ Ÿ���̴�
		// ��ü�� ���ȭ ��ų �� �ִ� ��� ���̴�. / Ŭ���� ���� �� ������ Ȯ���� ����/ =instance

//		String name = new String ("������");
//		int age = 25;

//		Info member = new Info();
//		member.name = "������.Ŭ����";
//		member.age = 25;
//
//		System.out.println("�̸� : " + member.name);
//		System.out.println("���� : " + member.age);
//
//		member.setData("������", 25);
//		member.disp();
//	}
//
//}
//
//class Info {
//	String name;
//	int age;
//	
//	void setData(String name1,int age1) {
//		name = name1;
//		age = age1;
//	}
//	
//	void disp() {
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : " + age);
//	}

// ���� - tv ����, ����, ä���� ������ �� �ִ� ��� ���� tv ��ü�����
//���� ���� ����
//		TV tv = new TV();
//		tv.setTv("�Ķ�");
//		
//		tv.setTv(true);
//		tv.setTv(1);
//		tv.setTv(1);
//		tv.setTv(2);
//		
//		tv.setTv(false);
//		tv.setTv(1);
//		tv.setTv(1);
//		tv.setTv(2);
//		
////		tv.setTv("����",true,1);
//		tv.showTV();

		TV mytv = new TV();
		mytv.dispInfo();
		mytv.setColor("�Ķ�");
		mytv.powerOn();
		mytv.setChannel(115);
//		mytv.dispInfo();
		for (int i = 0; i < 10; i++) {
			mytv.channelUp(10);
		}
		for (int i = 0; i < 10; i++) {
			mytv.channelDown(10);
		}
		System.out.println("�ڹ� ������ �ð��Դϴ�.");
		mytv.powerOn();

	}

}

//
//class TV {
//
//	String color;
//	boolean power = false;
//	int channel = 10;
//	int channel1;
//
//	void setTv(String color1, boolean power1, int channel2) {
//		color = color1;
//		power = power1;
//
//		if (power1 == true) {
//			System.out.println("������ �������ϴ�.");
//		} else {
//			System.out.println("������ �������ϴ�.");
//		}
//
//		channel1 = channel2;
//		if (channel1 == 1) {
//			channel += 1;
//		} else if (channel1 == 2) {
//			channel -= 1;
//		}
//
//	}
//	
//	void setTv(String color1) {
//		color = color1;
//		
//		System.out.println("���� tv ������ " + color + " �Դϴ�");
//		System.out.println();
//	}
//	
//	
//
//	void setTv(boolean power1) {
//		power = power1;
//
//		if (power1 == true) {
//			power1 = true;
//		} else {
//			power1 = false;
//		}
//		System.out.println("������ Ű���� 1�� ������ 2���� �Է��ϼ���");
//		System.out.println("���� tv ������ " + power + " �Դϴ�");
//		System.out.println();
//	}
//
//	void setTv(int channel2) {
//		if (power==true) {
//			channel1 = channel2;
//			if (channel1 == 1) {
//				channel += 1;
//			} else if (channel1 == 2) {
//				channel -= 1;
//			}
//			System.out.println("ä���� �ø����� 1�� �������� 2���� �Է��ϼ���");
//			System.out.println("���� tv ä���� " + channel + " �Դϴ�");
//			System.out.println();
//		} else {
//			System.out.println("������ �����ֽ��ϴ�");
//			System.out.println();
//		}
//
//	}
//	
//	
//���� ���� ���� ��
//	void showTV() {
//		System.out.println("���� tv �����Դϴ�");
//		System.out.println("���� tv ������ " + color + " �Դϴ�");
//		System.out.println();
//
//		System.out.println("������ Ű���� 1�� ������ 2���� �Է��ϼ���");
//		System.out.println("���� tv ������ " + power + " �Դϴ�");
//		System.out.println();
//
//		System.out.println("ä���� �ø����� 1�� �������� 2���� �Է��ϼ���");
//		System.out.println("���� tv ä���� " + channel + " �Դϴ�");
//}

class TV {
	String color = "������";
	int channel;
	boolean power = false;

	void setColor(String color1) {
		color = color1;

	}

	void dispInfo() {
		System.out.println("���� : " + color);
		System.out.println("���� ä�� : " + channel);
		if (power) {
			System.out.println("������ �����ֽ��ϴ�");
			System.out.println("���� : " + power);
		} else {
			System.out.println("������ �����ֽ��ϴ�.");
		}
		System.out.println();
	}

	void setChannel(int channel1) {
		if (power) {
			if (channel < 0 || channel > 120) {
				channel1 = channel1;
				System.out.println("�߸��� ä�� �����Դϴ�.");
			}
			channel = channel1;
			System.out.println("���� ä�� : " + channel);
		}
		System.out.println();
	}

	void channelUp(int channel1) {
		if (power) {
			if (channel > 120) {
				System.out.println("�߸��� ä�� �����Դϴ�.");
				channel = 0;
			}
			channel++;
			System.out.println("���� ä�� : " + channel);
		} else {
			System.out.println("������ �����ֽ��ϴ�.");
		}
		System.out.println();
	}

	void channelDown(int channel1) {
		if (power) {
			if (channel < 0) {
				System.out.println("�߸��� ä�� �����Դϴ�.");
				channel = 120;
			}
			channel--;
			System.out.println("���� ä�� : " + channel);
		} else {
			System.out.println("������ �����ֽ��ϴ�.");
		}
		System.out.println();
	}

	void powerOn() {
		power = !power;
		if (power) {
			System.out.println("������ �������ϴ�.");
			System.out.println("���� ä�� : " + channel);
		} else {
			System.out.println("������ �������ϴ�.");
		}
		System.out.println();
	}

}