public class Task1_8{
	public static void main(String[] args){
		System.out.println(nextEdge(8,3));
	}
	public static int nextEdge(int a, int b){
		int c = a+b-1;
		return c;
	}
}