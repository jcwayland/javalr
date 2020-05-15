public class Task1_4{
	public static void main(String[] args){
		System.out.println(profitableGamble(0.9,4,2));
	}
	public static boolean profitableGamble(double prob, double prize, double pay){
		if (prob*prize > pay) {
			return(true);
		}
		else {
			return(false);
		}
	}
}