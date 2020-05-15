public class Task1_7{
	public static void main(String[] args){
		System.out.println(addUpTo(8));
	}
	public static int addUpTo(int a){
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum+i;
		}
		return sum;
	}
}