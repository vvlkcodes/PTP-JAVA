//to find the quadratic roots of the given equation.
import java.util.*;
public class Quadratic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients of x, y and constant term: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//finding the discriminent.
		double d = Math.sqrt((b*b)-(4*a*c));
		//checking the conditions of discrimient.
		if(d>0) System.out.println("two distinct real roots");
		else if(d<0) System.out.println("imaginary roots");
		else if(d==0) System.out.println("two real and equal roots");
		//finding the roots.
		double root1 = (-b+d)/(2*a);
		double root2 = (-b-d)/(2*a);

		System.out.println(root1);
		System.out.println(root2);
	}
}