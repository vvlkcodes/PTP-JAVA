public class LoopsDemo{
	public static void main(String[] args){
		int x = 1;
		do{
			System.out.println(x);
			x++;
		}while(x<=10);
	}
}
//do while first executes the block and check for the condition from the next iteration 
//but in while the conditions gets checked first and then the execution starts.