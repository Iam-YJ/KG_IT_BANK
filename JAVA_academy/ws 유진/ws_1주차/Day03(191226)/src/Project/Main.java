package Project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//ǥ�� ��� ����
//		int i = 10;
//		float f = 10.1f;
//		char c = 'A';
//		String str = "Hello World";
//		
//		System.out.println("i\r�� "+i);
//		System.out.print("f�� "+f+"\n");
//		// ��������(\) ������ ���� ���ڴ� ��ǻ�Ϳ��� ���� ����� �Ҳ��� �о��.. ��� ��
//		System.out.println("c\t�� "+c);
//		System.out.println("str�� "+str);
//		System.out.println("Hello JAVA");
		
		
//		System.out.print("Hello\t World!!!\n");
//		System.out.print("Program is\t my Life.\n");
//		System.out.println("Hello \rWorld!!! \rProgram is my Life.\n");
//		System.out.println("Hello \tWorld!!!\tProgram is my Life.\n");
//
		
		//print f ����
//		System.out.printf("i�� %d\n",i);
//		System.out.printf("i�� %d\n",22);
//		System.out.printf("f�� %.2f\n",f);
//		System.out.printf("c�� %c\n",c);
//		System.out.printf("string�� %s\n",str);
//		System.out.printf("message�� %s\n","Program is my Life");

		
		
		//�Է��Լ� ����
//		int data;
//		System.out.print("�Է� : ");
//		data = System.in.read();
//		System.out.printf("���(printf): %c\n",(char)data);
//		System.out.println("���(println):"+ (char)data);
	
		//�Է�(Scanner) ����
//		String message;
//		Scanner str = new Scanner(System.in);
//		System.out.print("�޼����� �Է� : ");
//		message = str.next();
//		System.out.println("message: " + message);
//		message = str.next();
//		System.out.println("message: " + message);
//		
		
		//����� ���� 2
//		Scanner scan = new Scanner(System.in);
//		int age;
//		String name;
//		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		age = scan.nextInt();
//		scan.nextLine();
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		name = scan.nextLine();
//		
//		
//		System.out.println("�̸��� " + name);
//		System.out.println("���̴� " + age);
		
		//����_01 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�ڹ� ���� �Է� : ");
//		int javaS = scan.nextInt();
//		System.out.println("C��� ���� �Է� : ");
//		int cS = scan.nextInt();
//		scan.nextLine();
//		System.out.println("�̸� �Է� : ");
//		String name = scan.nextLine();
//		
//		System.out.println("================");
//		System.out.println("["+name+"���� ����]");
//		System.out.println("�ڹ� ���� : "+javaS);
//		System.out.println("c��� ���� : "+cS);
//		System.out.println("�հ� = "+ (javaS+cS)+"��");
//		System.out.println("��� = "+(double)(javaS+cS)/2 +"��");
		
		//��� ������
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a+b);
		
		System.out.println("c��" + c);
		
		int d = 1000000;
		int e = 2000000;
		long f = (long)d * e;
		long g = (long)(d*e);
		//g�� d*e�� int�� ���Ǿ > �̹� int�� �Ѿ�� > �� ��ü�� long���� �Ǿ���.
		System.out.println("f��" + f);
		System.out.println("g��" + g);
		
		int dd = (int) ((long)100000*1000000/1000000);
		int ee = 1000000/1000000*1000000;
		
		System.out.println("dd��"+dd);
		System.out.println("ee��"+ee);
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';	
		int i = c1 + 1;
		//c1 �� char ���� int�� �ٲ� 97 +1 �̵ȴ�
		System.out.println(i);
		
		c3 = (char) (c1+1);
		c3 = 'a'+1;
		System.out.println(c3);
	
		char lower = 'a';
		char upper = (char) (lower - 32);
		System.out.println("upper��" + upper);
		
	}

}
