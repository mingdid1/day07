package string;

public class TestClass02 {
	public static void main(String[] args) {
		
		String str = "test";
		System.out.println(str);
		
		System.out.println(str.charAt(0));	// t
		System.out.println(str.charAt(1));	// e
		System.out.println(str.charAt(2));	// s
		System.out.println(str.charAt(3));	// t
		
		char ch = str.charAt(1);
		System.out.println(ch);		// e
		
		
		System.out.println(ch == 'e');
		
		
	}
}
