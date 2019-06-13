import java.util.Scanner;

public class ReverseSentenceByWords {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();		
		int length = sentence.length();
		for (int i = length - 1; i >= 0; i--) {
			if (sentence.charAt(i) == ' ') {
				System.out.print(sentence.substring(i + 1) + " ");
				sentence = sentence.substring(0, i);
			}
		}
	}
}
