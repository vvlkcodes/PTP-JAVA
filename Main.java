import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	sc.nextLine();
	String b = sc.nextLine();
	double c = sc.nextDouble();
	//the below method helps in covering the residue in the memory.And hence runs the code successfully
	sc.nextLine();
	String d = sc.nextLine();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}