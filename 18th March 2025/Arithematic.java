import java.util.*;
public class Arithematic{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two operands: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Addition: "+ (a+b));
	System.out.println("Substraction: "+ (a-b));
	System.out.println("Muitiplication: "+ (a*b));
	System.out.println("Division: "+ (a/b));
	System.out.println("Modulo Division: "+ (a%b));
	}
}