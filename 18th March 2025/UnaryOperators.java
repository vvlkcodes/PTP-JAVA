import java.util.*;
public class UnaryOperators{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		//Pre Increment
	int a = 10;
	System.out.println("Pre inc:"+ (++a + a));
		//Post Increment
	a = 10;
		//using class Integer.subtract(int,int);
	System.out.println("Post inc:"+ (a+++a));
	a = 10;
	System.out.println("Sum is: "+ Integer.sum(++a,a));
		//Pre Decrement
	a = 10;
	System.out.println("Pre dec: "+(--a +a));
		//Post Decrement
	a = 10;
	System.out.println("Post dec:"+(a--+a));
		//using class Integer.subtract(int,int);
	a = 10;
	System.out.println("Difference is:"+ Integer.sum(--a,a));

	
	}
}