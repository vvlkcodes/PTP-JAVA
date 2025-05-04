//using swith case in java.
//To create a simple calculator.
//for determining the power of a number we use --> Math.pow(a,b);
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator: ");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case '+': 
                System.out.print("Adding both numbers we get: "+(a+b));
                break;
            case '-': 
                System.out.println("Substracting both the numbers, we get: "+(a-b));
                break;
            case '*':
                System.out.println("Multiplying both the numbers, we get: "+(a*b));
                break;
            case '/':
                System.out.println("Dividing both the numbers, we get: "+(a/b));
                break;
            case '%':
                System.out.println("The reminder we get by modulo division with both the numbers is : "+(a%b));
                break;
            case '^':
                System.out.println("The value a power b we get is: "+(Math.pow(a,b)));
                break;
            default: System.out.println("Please Enter a Valid Number or Operator!");
            }
    }
}
