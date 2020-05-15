import java.lang.Math;
public class Task1_5{
	public static void main(String[] args){
		System.out.println(operation(6,2,3));
	}
	public static String operation(double N, double a, double b){
		if ((a/b == N)||(b/a == N)){
			return ("Деление");
		}
		if (a*b == N){
			return ("Умножение");
		}
		if (a + b == N){
			return("Сложение");
		}
		if ((a-b == N)||(b-a == N)) {
			return("Вычитание");
		}
		else {
			return("None");
		}
	}
}
