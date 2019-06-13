
public class ReversingNumbers {
	public static int reverseNumber(int num) {

		int newNum = 0;

		while (num != 0) {
			newNum = newNum * 10 + num % 10;
			num /= 10;
		}

		return newNum;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int x = 987;
		
		System.out.println(reverseNumber(x));
		
	}

}
