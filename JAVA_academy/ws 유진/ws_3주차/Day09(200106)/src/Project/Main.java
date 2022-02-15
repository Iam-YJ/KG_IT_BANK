package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//과제 - 빙고판
//		int count = 0;
//		int r = 0;
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("가로(행)을 입력하세요 : ");
//		int row = scan.nextInt(); // 행 가로 row
//		System.out.println("세로(열)을 입력하세요 : ");
//		int col = scan.nextInt(); // 열 세로 col
//
//		int num = row * col;
//
//		int[][] bingo = new int[row][col]; // 빙고판때기
//		int[] random = new int[num + 1]; // 랜덤 수 저장용
//		boolean[] rCheck = new boolean[num + 1]; // 랜덤수 확인용
//
//		for (int i = 0; i < num; i++) { // 랜덤수 뽑는 코드
//			r = (int) (Math.random() * num + 1); // 랜덤수 뽑았다..
//			count++; // 뽑은 숫자수도 증가시킬꺼고
//			if (rCheck[r] == false) {
//				rCheck[r] = true;
//				random[i] = r;
//			} else {
//				i--;
//			}
//
//		}
//
//		for (int i = 0; i < num; i++) { // 랜덤수 확인용 출력
//			System.out.print(random[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < bingo.length; i++) { // 빙고판에 넣는 중
//			for (int j = 0; j < bingo[i].length; j++) {
//				bingo[i][j] = random[i * bingo[i].length + j];
//
//			}
//		}
//
//		for (int j = 0; j < col; j++) {
//			for (int i = 0; i < row; i++) { // 출력하는중
//				System.out.print(bingo[i][j] + " \t");
//
//			}
//			System.out.println();
//		}

		// 강사 풀이
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		
//		System.out.println("가로열 갯수 : ");
//		int row = sc.nextInt();
//		System.out.println("세로열 갯수 : ");
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
//						break;//생성한 수가 중복된 경우에 break로 나감 
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

		// class 예시
		// class는 사용자 정의 데이터 타입이다
		// 객체는 명사화 시킬 수 있는 모든 것이다. / 클래스 정의 후 공간을 확보한 상태/ =instance

//		String name = new String ("박유진");
//		int age = 25;

//		Info member = new Info();
//		member.name = "박유진.클래스";
//		member.age = 25;
//
//		System.out.println("이름 : " + member.name);
//		System.out.println("나이 : " + member.age);
//
//		member.setData("박유진", 25);
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
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : " + age);
//	}

// 예시 - tv 색상, 전원, 채널을 변경할 수 있는 기능 가진 tv 객체만들기
//내가 만든 예시
//		TV tv = new TV();
//		tv.setTv("파랑");
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
////		tv.setTv("빨강",true,1);
//		tv.showTV();

		TV mytv = new TV();
		mytv.dispInfo();
		mytv.setColor("파랑");
		mytv.powerOn();
		mytv.setChannel(115);
//		mytv.dispInfo();
		for (int i = 0; i < 10; i++) {
			mytv.channelUp(10);
		}
		for (int i = 0; i < 10; i++) {
			mytv.channelDown(10);
		}
		System.out.println("자바 공부할 시간입니다.");
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
//			System.out.println("전원이 켜졌습니다.");
//		} else {
//			System.out.println("전원이 꺼졌습니다.");
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
//		System.out.println("현재 tv 색상은 " + color + " 입니다");
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
//		System.out.println("전원을 키려면 1번 끄러면 2번을 입력하세요");
//		System.out.println("현재 tv 전원은 " + power + " 입니다");
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
//			System.out.println("채널을 올리려면 1번 내리려면 2번을 입력하세요");
//			System.out.println("현재 tv 채널은 " + channel + " 입니다");
//			System.out.println();
//		} else {
//			System.out.println("전원이 꺼져있습니다");
//			System.out.println();
//		}
//
//	}
//	
//	
//예시 내가 만든 것
//	void showTV() {
//		System.out.println("현재 tv 상태입니다");
//		System.out.println("현재 tv 색상은 " + color + " 입니다");
//		System.out.println();
//
//		System.out.println("전원을 키려면 1번 끄러면 2번을 입력하세요");
//		System.out.println("현재 tv 전원은 " + power + " 입니다");
//		System.out.println();
//
//		System.out.println("채널을 올리려면 1번 내리려면 2번을 입력하세요");
//		System.out.println("현재 tv 채널은 " + channel + " 입니다");
//}

class TV {
	String color = "검은색";
	int channel;
	boolean power = false;

	void setColor(String color1) {
		color = color1;

	}

	void dispInfo() {
		System.out.println("색상 : " + color);
		System.out.println("현재 채널 : " + channel);
		if (power) {
			System.out.println("전원이 켜져있습니다");
			System.out.println("전원 : " + power);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
		System.out.println();
	}

	void setChannel(int channel1) {
		if (power) {
			if (channel < 0 || channel > 120) {
				channel1 = channel1;
				System.out.println("잘못된 채널 범위입니다.");
			}
			channel = channel1;
			System.out.println("현재 채널 : " + channel);
		}
		System.out.println();
	}

	void channelUp(int channel1) {
		if (power) {
			if (channel > 120) {
				System.out.println("잘못된 채널 범위입니다.");
				channel = 0;
			}
			channel++;
			System.out.println("현재 채널 : " + channel);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
		System.out.println();
	}

	void channelDown(int channel1) {
		if (power) {
			if (channel < 0) {
				System.out.println("잘못된 채널 범위입니다.");
				channel = 120;
			}
			channel--;
			System.out.println("현재 채널 : " + channel);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
		System.out.println();
	}

	void powerOn() {
		power = !power;
		if (power) {
			System.out.println("전원이 켜졌습니다.");
			System.out.println("현재 채널 : " + channel);
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
		System.out.println();
	}

}