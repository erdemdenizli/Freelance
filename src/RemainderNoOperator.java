
public class RemainderNoOperator {
	
	public static int remainder(int a, int b) {
		
		if(b==0) {
			System.out.println("Invalid value");
		}
		
		int check = (a<0) ? -1:1;
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		while(a>=b) {
			a -= b;
		}
		
		return a*check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(remainder(-17, 5));
		System.out.println(-17%5);

	}

}
