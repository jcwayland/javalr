public class Palindrome {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) { 
			String s = args[i];
			System.out.println(s+" = "+isPalindrome(s));
		}
	} 
	
	public static String reverseString(String s) {
		String s1 ="";
		for (int i = 0; i < s.length(); i++) {
			s1 = s1 + s.charAt(s.length()-1-i);
		}
		return s1;
	}
	
	public static boolean isPalindrome(String s) {
		return(s.equals(reverseString(s)));
	}
}