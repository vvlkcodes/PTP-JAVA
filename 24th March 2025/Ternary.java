//Identify if the number is positive or negative using ternary operator.
import java.util.*;
public class Ternary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to check: ");
		int a = sc.nextInt();
		String str = (a>0) ? "positive" : "negative";
		System.out.println(str);
	}
}