public class Narrowing{
	public static void main(String[] args){
	double d = 112.112;
	float f =(float) d;
	long li =(long) f;
	int i =(int) li;
	short si =(short) i;
	byte b =(byte) si;
	System.out.println(d+"-"+f+"-"+li+"-"+i+"-"+si+"-"+b);
	}
}