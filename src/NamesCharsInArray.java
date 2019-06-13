import java.util.Arrays;
import java.util.Scanner;

public class NamesCharsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		char[] letters = new char[name.length()];
		
		for(int i=0; i<name.length(); i++) {
			letters[i] = name.charAt(i);
		}
		
		System.out.println(Arrays.toString(letters));

	}

}
