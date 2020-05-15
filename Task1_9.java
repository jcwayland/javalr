public class Task1_9{
	public static void main(String[] args){
		int[] c = {4,7,2,1};
		System.out.println(sumOfCubes(c));
	}
	public static int sumOfCubes(int[] c){
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += Math.pow(c[i], 3);
		}
		return sum;
	}
}