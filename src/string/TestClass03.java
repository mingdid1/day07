package string;

public class TestClass03 {
	public static void main(String[] args) {
		
		String str = "test";
		String str2 = "   test    ";
		
		System.out.println(str + ".");
		System.out.println(str2 + ".");
		System.out.println(str2.trim() + ".");	// trim() : 양쪽에 있는 공백을 삭제
		
		System.out.println("str == str2 : " + str.equals(str2));		// false
		System.out.println("str == str2 : " + str.equals(str2.trim()));	// true
		
		
		String addr = "051245/서울 종로구/단성사 4층";
		String[] s_addr = addr.split("/");			// split() : '/'를 중심으로 단어를 나눔
		
		// for (String ss: s_addr) {}
		for(int i = 0; i <s_addr.length; i++) {
			System.out.println(s_addr[i]);
		}
		
		
		String result = addr.replace("/", ":");		// replace() : '/'를 ':'로 변경
		String aaa = addr.replace("4", "aa");
		System.out.println(result);
		System.out.println(aaa);
		
		
		
		
		
	}
}
