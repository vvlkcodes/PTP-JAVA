//SELF PROBLEM STATEMENT
//The maximum and minimum of an array.(Static program manner) 
public class Exam2{
	public static void main(String[] args){
		//Initialization of the array
		int[] arr = new int[]{12,15,8,11,7,1};
		int min = 0;
		int max = 0;
		//Comparision of the elements to find out the maximum and minimum.
		for(int i=0;i<arr.length;i++){
				if(arr[i]>arr[max])
					max = i;
				if(arr[i]<arr[min])
					min = i;
		}
		//Printing the minimum and maximum numbers of the given array.
		System.out.println("The maximum element of the given array is: "+arr[max]);
		System.out.println("The minimum element of the given array is: "+arr[min]);

	}
}