package Project;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	//����ó��
//		ExceptionEx eex = new ExceptionEx();
////		eex.method();
////		eex.throwMethod();
//		eex.method1();
//		System.out.println("���α׷� ����");
		
		//List ����
//		ListEx le = new ListEx();
//		le.methodList();
		
		HashMapEx hm = new HashMapEx();
		hm.identity();
		
		
	}
}


//����ó��
//class ExceptionEx{
//	void method1() { 
//	try {
//		method2();
//		} catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e+"method1()���� ���� ó��");
//		}
//	}
//	void method2()throws Exception {method3();}
//	void method3() throws Exception{
//		try {
//		Exception e = new Exception("method3()���� ���� �߻�");
//		throw e;
//		} catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e+"method3()���� ���� ó��");
//			throw e;
//		}
//		
//	}
//	
//	void throwMethod() {
////		RuntimeException re = new RuntimeException();
////		throw re;
//		try {
//			Exception e = new Exception();
//			throw e;
//		}catch(Exception e) {
//			System.out.println("throwMethod()���� ���� ó��");
//		}finally {
//			System.out.println("finally ����");
//		}
//	}
//	
//	void method() {
//		int num = 100;
//		int result = 0;
//		
//		int i=0;
//		while(i<10) {
//			try {
//				result = num / (int)(Math.random()*10);
//				System.out.println( (i+1)+ " : " + result);
//				return;
//			}catch(ArithmeticException ae) {
//				ae.printStackTrace();
////				String msg = ae.getMessage();
////				System.out.println(msg);
//				//System.out.println("0���� ���� �� �����ϴ�.");
//			}finally {
//				System.out.println("finally ����");
//			}
//			
//			i++;
//		}
//	}
//	void exMethod() {
//		try {
//			
//		}catch(Exception e) {
//			
//		}
//		
//		try {
//			try {} catch(Exception e) {}
//		}catch(Exception e) {
//			try {}catch(Exception e1) {}
//		}
//		
//	}
//}


//List ����
//class ListEx{
//	void methodList() {
//	ArrayList<Integer> list1 = new ArrayList<Integer>(10); //�ƹ��͵� ���� ������ �⺻�� 10�� �̴�.
//	list1.add(new Integer(5));
//	list1.add(new Integer(4));
//	list1.add(new Integer(3));
//	list1.add(new Integer(2));
//	list1.add(new Integer(1));
//	list1.add(new Integer(0));
//	
//	ArrayList list2 = new ArrayList(list1.subList(1,4));
//	list2.add("b");
//	list2.add("c");
//	list2.add(3,"a");//������ Ư�� ��ġ�� �ֱ� + �ڿ� �ִ� ������ �ڷ� �δ�
//	System.out.println("list 1 = "+list1);
//	System.out.println("list 2 = "+list2);
//	
//	list2.set(3, "aa");//������ Ư�� ��ġ�� �ֱ�
//	System.out.println("list 2 = "+list2);
//	
//	list2.remove(3); //���� + �ڿ� �ִ� ������ ������ ����
//	System.out.println("list 2 = "+list2);
//	
//	Integer data = new Integer(0);
//	data = (Integer)list2.get(0);
//	data = list1.get(0);
//	System.out.println(data);
//	
//	Iterator it = list1.iterator();
//	System.out.print("Iterator : ");
//	while(it.hasNext() == true) {
//		System.out.print(it.next()+" ");
//	}
//	
	
	
	
	class HashMapEx{
		void identity() {
		
			HashMap map = new HashMap();
			map.put("p y j","1234");
			map.put("p y j 2", "5678");
			map.put("p y j 2","6789");
			
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.println("���̵� �Է��ϼ��� : ");
				String id = scan.nextLine().trim();
				System.out.println("�н����带 �Է��ϼ��� : ");
				String password = scan.nextLine().trim();
				
				if(!map.containsKey(id)) {
					System.out.println("id�� �������� �ʽ��ϴ�");
					continue;
				}else {
					if(!map.get(id).equals(password)) {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}else {
						System.out.println("ȯ���մϴ�");
						break;
					}
				}
				
			}
			
	}
	
}