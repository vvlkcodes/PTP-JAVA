//Relational Operators [<, >, >=, <=, ==, !=]
import java.util.*;
public class Relational{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two operands: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a Greater than b? "+(a>b));
		System.out.println("a Less than b? "+ (a<b));
		System.out.println("a greater than or equal to b? "+ (a>=b));
		System.out.println("a less than or equal to b? "+ (a<=b));
		System.out.println("a equal to b? "+ (a==b));
		System.out.println("a not equal to b? "+ (a!=b));
	}
}
