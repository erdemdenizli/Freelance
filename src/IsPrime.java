

public class IsPrime {
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(1));
		
	}
	
	
	public static boolean isPrime(int n) {
		
		
		if(n<=1) {
			return false;
		} else {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
}
