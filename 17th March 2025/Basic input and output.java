//Input various kinds of datatypes
/*
String 
Integer
Double 
Float 
Char
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();
        double z = sc.nextDouble();
        String str = sc.nextLine();
        sc.next().charAt(0);
        char c = sc.next().charAt(0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(str);
        System.out.println(c);
	}
}
