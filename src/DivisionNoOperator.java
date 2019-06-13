
public class DivisionNoOperator {
	
	public static int divide(int a, int b) {
		
		if(b==0) {
			System.out.println("Invalid value");
		}
		
		int quot = 0;
		
		int a1 = (Math.abs(a)+a==0)?-1:1;
		int b1 = (Math.abs(b)+b==0)?-1:1;
		
		a *= a1;
		b *= b1;
		
		while(a>=b) {
			a -= b;
			quot++;
		}
		
		return a1*b1*quot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(0,0));
	}

}
