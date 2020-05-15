public class Task1_3{
	public static void main(String[] args){
		System.out.println(animals(5,4,6));
	}
	public static int animals(int chickens, int cows, int pigs){
		chickens = 2*chickens;
		cows = 4*cows;
		pigs = 4*pigs;
		return (chickens + cows + pigs);
	}
}