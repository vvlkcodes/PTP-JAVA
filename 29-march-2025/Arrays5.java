//Demonstrate the elements that are repeating in the given array.
public class Arrays5{
	public static void main(String[] args){
		int[] arr = new int[]{10,4,5,87,34,4,11,4,10,11};
		
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int p = 0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j] && arr[i] != '*' && p==0){
					System.out.print(arr[i]+", ");
					arr[j] = '*';
					p++;
				}
			}
		}
	}	
}