import java.util.Scanner;

public class CharIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter something starts with a number, ends with an uppercase letter!");
		Scanner input = new Scanner(System.in);
		String str = input.next();

		OUTER: for (char i = '0'; i <= '9'; i++) {
			if (str.charAt(0) == i) {
				for (char j = 'A'; j <= 'Z'; j++) {
					if (str.charAt(str.length() - 1) == j) {
						System.out.println("Gotcha!");
						break OUTER;
					}
				}
			}
			System.out.println("Couldn't make it!");
		}
	}

}
