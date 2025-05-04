//Switch cases
//Using the yield keyword.
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
		char ch = sc.next().charAt(0);
		int result = switch(ch){
            		    case '+' ->{
            		        yield x+y;
            		    }
            		    case '-' ->{
            		        yield x-y;
            		    }
            		    case '*' ->{
            		        yield x*y;
            		    }
            		    case '/' ->{
            		        yield x/y;
            		    }
            		    default ->{
            		        yield 0;
            		    }
            		};
        System.out.println(result);
	}
}
