//Understanding arrays 
import java.util.Scanner;
public class Arrays3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] a = {1,2,3,4,5};
		int b[] = new int[n];
		int c[] = new int[]{1,5,2};
		int d[] = new int[b.length];
		for(int i=0;i<d.length;i++){
			d[i] = i+3;
		} 
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
		for(int i=0;i<a.length;i++){
			a[i] = i+3;
			System.out.print(a[i]+" "+b[i]+" "+c[i]+" "+d[i]+"--------------");
		}System.out.println("");
		for(int i=0;i<b.length;i++){
			b[i] = i+3;
			System.out.print(a[i]+" "+b[i]+" "+c[i]+" "+d[i]+"--------------");
		}System.out.println("");
		for(int i=0;i<c.length;i++){
			c[i] = i+3;
			System.out.print(a[i]+" "+b[i]+" "+c[i]+" "+d[i]+"--------------");
		}System.out.println("");
		for(int i=0;i<d.length;i++){
			d[i] = i+3;
			System.out.print(a[i]+" "+b[i]+" "+c[i]+" "+d[i]+"--------------");
		}System.out.println("");
		for(int i=0;i<c.length;i++){
			System.out.print(a[i]+" "+b[i]+" "+c[i]+" "+d[i]+"--------------");
		}System.out.println("");
		for(int element: a){
			System.out.print(element+" ");
		}
	}
}