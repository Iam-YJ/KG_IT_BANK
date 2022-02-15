package Project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 타이머 만들기
//				for (int h = 0; h < 24; h++) {
//					for (int m = 0; m < 60; m++) {
//						for (int s = 0; s < 60; s++) {
//							System.out.println(h + "시" + m + "분" + s + "초");
//							Thread.sleep(1000);
//						}
//					}
//				}

		// 과제
//				Scanner scan = new Scanner(System.in);
//				System.out.println("메뉴 수를 입력하세요 : ");
		//
//				int user = scan.nextInt();
//				scan.nextLine();
		//
//				int r = (int) (Math.random() * user);
//				if (r < user) {
		//
//					String[] food = new String[user];
		//
//					for (int i = 0; i < food.length; i++) {
//						System.out.println("먹고 싶은 음식을 입력하세요 : ");
//						food[i] = scan.nextLine();
//					}
		//
//					for (int i = 0; i < food.length; i++) {
//						System.out.println("항목 : " + food[i]);
		//
//					}
//					System.out.println();
//					System.out.println("추첨중입니다");
//					Thread.sleep(2000);
//					System.out.println("추첨된 항복은 " + food[r] + "입니다");
//				}

		// 초기화
////				int [] score = new int[5];
////				int [] score = {1,2,3,4,5};
//				int [] score = new int[] {6,7,8,9,10};
//				int [] bScore = new int[score.length];
//				
//				for(int i=0; i<score.length; i++) {
//					System.out.println("score["+i+"]"+"은 "+score[i]);
//				}
//				
//				for(int i=0; i<score.length; i++) {
//					bScore[i] = score[i];
//				}
//				for(int i=0; i<bScore.length; i++) {
//					System.out.println("bScore["+i+"]"+"은 "+bScore[i]);
//				}
//				
//				//bScore = score; //이 경우는 주소값을 복사하는 것이다. 결국 값은 같은게 나옴
//				
//				System.arraycopy(score, 0, bScore, 0, score.length);
//				
//				for(int i=0; i<score.length; i++) {
//					System.out.println("score["+i+"]"+"은 "+score[i]);
//				}
//				
		//
//				for(int i=0; i<bScore.length; i++) {
//					System.out.println("bScore["+i+"]"+"은 "+bScore[i]);
//				}

		// 문제 - 79 88 91 33 100 55 95 위 데이터의 최소값과 최대값 구하시오

//				int[] arr = new int[] { 79, 88, 91, 33, 100, 55, 95 };
//				for (int i = 1; i < arr.length; i++) {
//						if (arr[i-1] > arr[i]) {
//							int max = arr[i-1];
//							System.out.println("max" + max);
//							i++;
//							continue;
//						} else {
		//
//							
//						}
//					
//				}
//				for (int i = 0; i < arr.length; i++) {
//					System.out.println(arr[i]);
		//
//				}

		// 강사
//				int[] score = { 79, 88, 91, 33, 100, 55, 95 };
//				int max = score[0];
//				int min = score[0];
//				
//				for(int i=1; i<score.length; i++) {
//					if(score[i]>max) {
//						max = score[i];
//					}
//					if(score[i]<min) {
//						min = score[i];
//					}
//					
//				}
//				
//				System.out.println("max는"+max);
//				System.out.println("min은"+min);

		// 참조형 초기화
//				String [] name = new String[3];
//				name[0] = new String("Kim");
//				name[1] = new String("Lee");
//				name[2] = new String("Park");

//				String [] name = {new String("kim"),new String("lee"),new String("park")};
//				String [] name = new String[] {new String("kim"), new String("lee")};
//				String[] name = {"kim","lee","park"};

//				for(int i=0; i<name.length; i++) {
//					System.out.println(name[i]);
//				}

		// 다차원 배열
		// int [][] arr = new int [3][5];
//				int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
//				
//				int[][] arr = new int[3][];
//				arr[0] = new int[4];
//				arr[1] = new int[2];
//				arr[2] = new int[8];
//				
		//
//				int count = 0;
//				
//				for(int i=0; i<arr.length; i++) { // arr.length는 3개
//					for(int j=0; j<arr[i].length; j++) {
//						arr[i][j] = ++ count;
//					}System.out.println();
//				}
		//
		//
//				for(int i=0; i<arr.length; i++) { // arr.length는 3개
//					for(int j=0; j<arr[i].length; j++) {
//						System.out.print(arr[i][j]);
//					}System.out.println();
//				}

		// 문제 - 행정보, 열정보 받아서 값을 순차적으로 채워서 출력
//				Scanner scan = new Scanner(System.in);
//				
//				int count = 0;
//				
//				System.out.println("행을 입력하세요 : ");
//				int row = scan.nextInt(); // 행 가로 row
//				System.out.println("열을 입력하세요 : ");
//				int col = scan.nextInt(); // 열 세로 col
//				
//				int [][] arr = new int[row][col]; 
//				
//				for(int i=0; i<arr.length; i++) {
//					for(int j=0; j<arr[i].length; j++) {
//						arr[i][j] = ++ count;
//					}
//				} 
//				
//				for(int i=0; i<arr.length; i++) {
//					for(int j=0; j<arr[i].length; j++) {
//						System.out.print(arr[i][j]+"\t");
//					}System.out.println();
//				} 
//				//행렬 채우는거랑 출력하는거랑 따로 나눠서 쓰기!!

		// 문제 - 가로3 세로 5
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };

		int[] ave = new int[5];
		int[] subSum = new int[3];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				ave[i] = score[i][j] * 3;

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < subSum.length; j++) {
				subSum[j] += score[i][j];
			}
		}
		
		//여기까지 배열에 넣기

		//아래부터 출력하기
		System.out.println("번호" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.println("========================================");
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1));
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("\t" + score[i][j]);

			}
			System.out.print("\t" + ave[i]);
			System.out.println("\t" + (ave[i] / 3.0));
			System.out.println();

		}
		System.out.println("========================================");
		System.out.print("총점 : ");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i]+" ");
		}

// 강사 풀이
		//
//				int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		//
//				int kor = 0, eng = 0, math = 0;
		//
//				System.out.println("번호 국어 영어 수학 총점 평균");
//				System.out.println("======================");
		//
//				for (int i = 0; i < score.length; i++) {
//					int sum = 0;
//					kor += score[i][0];
//					eng += score[i][1];
//					math += score[i][2];
//					System.out.print(" " + (i+1) + " ");
//					for(int j=0; j<score[i].length; j++) {
//						sum += score[i][j];
//						System.out.print(score[i][j] + " ");
//					}System.out.println(sum + " " + sum/(float)score[i].length);
//				}
//				System.out.println("======================");
//				System.out.println("총 점 : "+kor+" " +eng+" "+math);
	}

}
