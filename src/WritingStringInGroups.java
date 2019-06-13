import java.util.Scanner;

public class WritingStringInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    String str = scanner.next(); ;
	    
	    int num = scanner.nextInt();
	    
	    int remaining = str.length()%num;
	    
	    for (int i = 0; i <= str.length()-(remaining+num); i+=num) {

	        System.out.print(str.substring(i, i+num) + " ");

	    }
	    
	    System.out.print(str.substring(str.length()-remaining, str.length()));

	}

}
