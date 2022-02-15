package Project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//표준 출력 예제
//		int i = 10;
//		float f = 10.1f;
//		char c = 'A';
//		String str = "Hello World";
//		
//		System.out.println("i\r는 "+i);
//		System.out.print("f는 "+f+"\n");
//		// 역슬래쉬(\) 다음에 오는 문자는 컴퓨터에게 이제 명령을 할껀데 읽어라.. 라는 뜻
//		System.out.println("c\t는 "+c);
//		System.out.println("str는 "+str);
//		System.out.println("Hello JAVA");
		
		
//		System.out.print("Hello\t World!!!\n");
//		System.out.print("Program is\t my Life.\n");
//		System.out.println("Hello \rWorld!!! \rProgram is my Life.\n");
//		System.out.println("Hello \tWorld!!!\tProgram is my Life.\n");
//
		
		//print f 예시
//		System.out.printf("i는 %d\n",i);
//		System.out.printf("i는 %d\n",22);
//		System.out.printf("f는 %.2f\n",f);
//		System.out.printf("c는 %c\n",c);
//		System.out.printf("string은 %s\n",str);
//		System.out.printf("message은 %s\n","Program is my Life");

		
		
		//입력함수 예시
//		int data;
//		System.out.print("입력 : ");
//		data = System.in.read();
//		System.out.printf("출력(printf): %c\n",(char)data);
//		System.out.println("출력(println):"+ (char)data);
	
		//입력(Scanner) 예시
//		String message;
//		Scanner str = new Scanner(System.in);
//		System.out.print("메세지를 입력 : ");
//		message = str.next();
//		System.out.println("message: " + message);
//		message = str.next();
//		System.out.println("message: " + message);
//		
		
		//입출력 예시 2
//		Scanner scan = new Scanner(System.in);
//		int age;
//		String name;
//		
//		System.out.println("나이를 입력하세요 : ");
//		age = scan.nextInt();
//		scan.nextLine();
//		System.out.println("이름을 입력하세요 : ");
//		name = scan.nextLine();
//		
//		
//		System.out.println("이름은 " + name);
//		System.out.println("나이는 " + age);
		
		//과제_01 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("자바 점수 입력 : ");
//		int javaS = scan.nextInt();
//		System.out.println("C언어 점수 입력 : ");
//		int cS = scan.nextInt();
//		scan.nextLine();
//		System.out.println("이름 입력 : ");
//		String name = scan.nextLine();
//		
//		System.out.println("================");
//		System.out.println("["+name+"님의 성적]");
//		System.out.println("자바 점수 : "+javaS);
//		System.out.println("c언어 점수 : "+cS);
//		System.out.println("합계 = "+ (javaS+cS)+"점");
//		System.out.println("평균 = "+(double)(javaS+cS)/2 +"점");
		
		//산술 연산자
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a+b);
		
		System.out.println("c는" + c);
		
		int d = 1000000;
		int e = 2000000;
		long f = (long)d * e;
		long g = (long)(d*e);
		//g는 d*e가 int로 계산되어서 > 이미 int로 넘어가서 > 그 자체가 long으로 되었다.
		System.out.println("f는" + f);
		System.out.println("g는" + g);
		
		int dd = (int) ((long)100000*1000000/1000000);
		int ee = 1000000/1000000*1000000;
		
		System.out.println("dd는"+dd);
		System.out.println("ee는"+ee);
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';	
		int i = c1 + 1;
		//c1 은 char 여서 int로 바뀌어서 97 +1 이된다
		System.out.println(i);
		
		c3 = (char) (c1+1);
		c3 = 'a'+1;
		System.out.println(c3);
	
		char lower = 'a';
		char upper = (char) (lower - 32);
		System.out.println("upper는" + upper);
		
	}

}
