public class Widenning{
	public static void main(String[] args){
	byte b = 112;
	short  si = b;
	int i = si;
	long  li = i;
	float f = li;
	double d = f;
	System.out.println(b+'-'+si+'-'+li+'-'+f+'-'+d);
	
	}
}
//when i tried to assign long value to float, i didnt get any error, what is the reason?