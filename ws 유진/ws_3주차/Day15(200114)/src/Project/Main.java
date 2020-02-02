package Project;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	//예외처리
//		ExceptionEx eex = new ExceptionEx();
////		eex.method();
////		eex.throwMethod();
//		eex.method1();
//		System.out.println("프로그램 종료");
		
		//List 예시
//		ListEx le = new ListEx();
//		le.methodList();
		
		HashMapEx hm = new HashMapEx();
		hm.identity();
		
		
	}
}


//예외처리
//class ExceptionEx{
//	void method1() { 
//	try {
//		method2();
//		} catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e+"method1()에서 예외 처리");
//		}
//	}
//	void method2()throws Exception {method3();}
//	void method3() throws Exception{
//		try {
//		Exception e = new Exception("method3()에서 예외 발생");
//		throw e;
//		} catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e+"method3()에서 예외 처리");
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
//			System.out.println("throwMethod()에서 예외 처리");
//		}finally {
//			System.out.println("finally 실행");
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
//				//System.out.println("0으로 나눌 수 없습니다.");
//			}finally {
//				System.out.println("finally 실행");
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


//List 예시
//class ListEx{
//	void methodList() {
//	ArrayList<Integer> list1 = new ArrayList<Integer>(10); //아무것도 주지 않으면 기본이 10개 이다.
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
//	list2.add(3,"a");//데이터 특정 위치에 넣기 + 뒤에 있는 데이터 뒤로 민다
//	System.out.println("list 1 = "+list1);
//	System.out.println("list 2 = "+list2);
//	
//	list2.set(3, "aa");//데이터 특정 위치에 넣기
//	System.out.println("list 2 = "+list2);
//	
//	list2.remove(3); //삭제 + 뒤에 있는 데이터 앞으로 땡김
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
				System.out.println("아이디를 입력하세요 : ");
				String id = scan.nextLine().trim();
				System.out.println("패스워드를 입력하세요 : ");
				String password = scan.nextLine().trim();
				
				if(!map.containsKey(id)) {
					System.out.println("id가 존재하지 않습니다");
					continue;
				}else {
					if(!map.get(id).equals(password)) {
						System.out.println("비밀번호가 틀렸습니다.");
					}else {
						System.out.println("환영합니다");
						break;
					}
				}
				
			}
			
	}
	
}