//Firstly identify the numbers that are repeated and store them into an array
public class Arrays7{
	public static void main(String[] args){
		int x = new int[]{10,4,5,87,34,4,11,4,10,11};
		int x1 = new int[x.length];
		for(int i=0;i<x.length;i++){
			int p=0;
			for(int j=i+1;j<x.length;j++){
				if(x[i] == x[j] && p == 0){
					x1[i] = x[j]; 
					p++;	
				}
			}
		}
	}
}