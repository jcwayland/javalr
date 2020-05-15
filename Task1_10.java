public class Task1_10{
	public static void main(String[] args){
		System.out.println(addUpTo(5,3,4));
	}
	public static boolean addUpTo(int a, int b, int c){
		for (int i = 0; i <= b; i++) {
			a = a + a;
		}
		return (a % c == 0);
	}
}