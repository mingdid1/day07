package random;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

//		1. 가위바위보 게임
//		ㄴ 1. 가위 2.바위 3.보에서 번호를 입력하고,
//		    random으로 나오는 값(1.가위 2.바위 3.보)과 비교하여 이겼는지, 비겼는지, 졌는지 출력하시오.
//		
//		2. 업다운 게임
//		ㄴ 1. easy(0 ~ 10) 2. normal(0 ~ 50) 3. hard(0 ~ 100) 4. exit 중에서 1개를 선택하고
//		    값을 입력한 후, random으로 나오는 값과 비교하여 적으면 "다운!", 높으면 "업!"이 출력되도록 하고
//		    다시 값을 입력하여 random값과 일치할때까지 반복하도록 만드시오.
//		
//		3. 산수 문제
//		ㄴ random으로 2개의 값을 구하고 "r1 + r2 = "라는 질문이 나오고 이 2 값의 합을 직접 입력하여
//		    입력한 값과 2값을 더한 값이 맞으면 맞았다고 나오고 맞은 횟수를 1더해준다. 틀렸다면 틀린 횟수에 1을
//		    더해준 다음, 총 5문제를 풀면 끝났다고 알림과 동시에 몇 문제를 맞추고, 틀렸는지 출력한다.
//		
//		4. map을 이용하여 본인이 위 3개의 게임을 총 몇번 했는지 출력하시오.
//		ex)
//		가위 바위 보 : 3
//		업 다운 게임 : 2
//		랜덤합&입력 비교 : 4
// 		
//		5. 프로그램 종료


public class TestClass02 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> chk = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		
		chk.put("가위 바위 보", a); // a
		chk.put("업 다운 게임", b); // b
		chk.put("랜덤 더하기 문제", c); // c
		
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 가위 바위 보");
			System.out.println("2. 업 다운 게임");
			System.out.println("3. 랜덤 더하기 문제");
			System.out.println("4. 전체 게임 횟수 확인");
			System.out.println("5. 종료");
			System.out.println("=====================");
			System.out.print(">>> ");
			int n = sc.nextInt();
			
			switch (n) {
				case 1: 
					double rand = Math.random() * 3;
					int sys = (int)rand + 1;
					
					System.out.println("1.가위 2.바위 3.보");
					System.out.print(">>> ");
					int play = sc.nextInt();
				
					if (sys == 1) {
						if (play == 1) {
							System.out.println("상대방이 가위를 냈습니다. 비겼습니다");
						}else if (play == 2) {
							System.out.println("상대방이 가위를 냈습니다. 이겼습니다");
						}else if (play == 3) {
							System.out.println("상대방이 가위를 냈습니다. 졌습니다");
						}
					}else if (sys == 2) {
						if (play == 1) {
							System.out.println("상대방이 바위를 냈습니다. 졌습니다");
						}else if (play == 2) {
							System.out.println("상대방이 바위를 냈습니다. 비겼습니다");
						}else if (play == 3) {
							System.out.println("상대방이 바위를 냈습니다. 이겼습니다");
						}
					}else if (sys == 3) {
						if (play == 1) {
							System.out.println("상대방이 보를 냈습니다. 이겼습니다");
						}else if (play == 2) {
							System.out.println("상대방이 보를 냈습니다. 졌습니다");
						}else if (play == 3) {
							System.out.println("상대방이 보를 냈습니다. 비겼습니다");
						}
					}
					chk.put("가위 바위 보", ++a);	
				break;
	// case 1. 가위바위보---------------------------------------------------------------------------		
			case 2: 
				Random r1 = new Random();
				int num, ans, su, mi, ma;
				while(true) {
					System.out.println("==========");
					System.out.println("1. EASY");
					System.out.println("2. NORMAL");
					System.out.println("3. HARD");
					System.out.println("4. EXIT");
					System.out.println("==========");
					
					System.out.print(">>>");
					num = sc.nextInt();
					switch(num) {
						case 1 :
							ma = 10;
							mi = 0;
							ans = r1.nextInt(10)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
							 		}else if(su < ans) {
										System.out.println("업!!");
										mi = su+1;
									}else {
										System.out.println("정답입니다.");
										break;
									}	
								}
							}break;	
						case 2 :
							ma = 50;
							mi = 0;
							ans = r1.nextInt(50)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
									}else if(su < ans) {
										System.out.println("업!!");
										mi = su+1;
									}else {
										System.out.println("정답입니다.");
										break;
									}
								}
							}break;
						case 3 :
							ma = 100;
							mi = 0;
							ans = r1.nextInt(100)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
									}else if(su < ans) {
										System.out.println("업!!");
										mi = su+1;
									}else {
										System.out.println("정답입니다.");
										break;
									}
								}
							}break;
						case 4 : break;
						
						default :
							System.out.println("다시 입력");
							break;
						}
					break;
					}
				chk.put("업 다운 게임", ++b);
				break;
	// case 2. 업다운게임---------------------------------------------------------------------------			
			case 3: 
				Random r2 = new Random();
				int i, n3 , n4 = 0, n5 = 0;
				String str1 = "정답입니다";
				String str2 = "오답입니다";
				for(i = 0; i <= 4; i++) {
					int n1 = r2.nextInt(100);
					int n2 = r2.nextInt(100);
					
					System.out.print(n1 + " + " + n2 + " = ");
					int sum = n1 + n2;
					n3 = sc.nextInt();
					if(n3 == sum) {
						System.out.println(str1);
						n4++;
					}else {
						System.out.println(str2);
						n5++;
					}
						
					if(i == 4) {
						System.out.println("-----------------");
						System.out.println("끝났습니다\n"+"맞춘문제 : "+ n4 +"개 틀린문제 : " + n5 + "개");	
					}
				}
				chk.put("랜덤 더하기 문제", ++c);
				break;
	// case 3. 랜덤 더하기 문제---------------------------------------------------------------------------		
			case 4:
				Iterator<String> it = chk.keySet().iterator();
				System.out.println("");
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key + " : " + chk.get(key));
				}
				System.out.println("");
				break;
			case 5:
				System.exit(0);
			}
		}		
	}
}