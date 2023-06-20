package random;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double rand = Math.random() * 3;
		int sys = (int)rand + 1;
		
		// System.out.println((int)rand + 1);
		
		System.out.println("1.가위 2.바위 3.보");
		System.out.println(">>> ");
		int play = sc.nextInt();
		
		if (sys == 1) {
			if (play == 1) {
				System.out.println("비겼습니다");
			}else if (play == 2) {
				System.out.println("이겼습니다");
			}else if (play == 3) {
				System.out.println("졌습니다");
			}
		}else if (sys == 2) {
			if (play == 1) {
				System.out.println("졌습니다");
			}else if (play == 2) {
				System.out.println("비겼습니다");
			}else if (play == 3) {
				System.out.println("이겼습니다");
			}
		}else if (sys == 3) {
			if (play == 1) {
				System.out.println("이겼습니다");
			}else if (play == 2) {
				System.out.println("졌습니다");
			}else if (play == 3) {
				System.out.println("비겼습니다");
			}
		}
		
	}
}
