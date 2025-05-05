//Write a java program to sort a numeric array (Static manner)
public class Exam{
	public static void main(String[] args){
		//Input an array first.
		int[] arr = new int[]{12,15,8,11,7,1};
		//Sorting the array here
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					//Swapping the smaller number with the larger number
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//Printing the array that is ready and sorted
		System.out.println("The sorted array of the given elements is: ");
		//Using the for-each loop to print the elements of the sorted array
		for(int element : arr){
			System.out.print(" "+element);
		}
	}
}