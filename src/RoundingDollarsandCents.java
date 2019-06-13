
public class RoundingDollarsandCents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10.9567;
		
		int dollars = (int)Math.round(x*100)/100;
		
		int cents = (int)Math.round(x*100)%100;
		
		System.out.println(dollars+"$");
		System.out.println(cents+"cents");

	}

}
