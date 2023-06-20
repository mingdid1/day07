package map;

public class TestClass05 {
	public static void main(String[] args) {
		
		float f1 = (float)1.11;
		int num = 100;
		
		String sNum = num + "";
		System.out.println(sNum + 100);	// 100100 (이어쓰기)
		System.out.println(num + 100);	// 200	  (숫자 연산)
		
		
		// 숫자형식의 문자열만 가능하다
		// "100" 가능 , "안녕" 변환안됨
		int n = Integer.parseInt(sNum);
		System.out.println(n + 123);	// 223
		
	}
}
