/*
To print the below pattern
  *
 * *
*   *
 * *
  *
*/
//This code works only for the odd numbers since it is symmetric.
import java.util.Scanner;

public class Patterns12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any odd number: ");
        int n = sc.nextInt();
        //The below if block converts the even number into odd by subtracting 1 from it;
        if(n%2==0){
            n-=1;
        }
        int mid = n/2;
        for(int i=0;i<=mid;i++){
            for(int j=0;j<n;j++){
                if( j==mid-i || j==mid+i) System.out.print("*");
                else System.out.print(" ");
            }System.out.println("");
        }
        for(int i=mid-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if( j==mid-i || j==mid+i) System.out.print("*");
                else System.out.print(" ");
            }System.out.println("");
        }    
    }
}
