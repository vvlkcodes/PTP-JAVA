//Switch cases
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		System.out.println("Enter a value: ");
		char exp = sc.next().charAt(0);
		int result = switch(exp){
            		    case '+' -> x+y;
            		    case '-' -> x-y;
            		    case '*' -> x*y;
            		    case '/' -> x/y;
            		    default -> 0;
            		};
        System.out.println(result);
        
	}
}
