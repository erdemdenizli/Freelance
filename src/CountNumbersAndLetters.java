import java.util.Scanner;

public class CountNumbersAndLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter a random string of characters:");
	    String sentence = scan.nextLine();
	    int length = sentence.length()-1;
	    int x = 0;
	    String numbers = "";
	    String letters = "";
	    int count = 0;
	    
	    while(x<=length) {
	    	if(sentence.charAt(x)>='0' && sentence.charAt(x)<='9') {
	    		numbers += sentence.charAt(x) + "-";
	    	} else if((sentence.charAt(x)>='A' && sentence.charAt(x)<='Z') || (sentence.charAt(x)>='a' && sentence.charAt(x)<='z')) {
	    		letters += sentence.charAt(x) + "-";
	    	}
	    	if(sentence.charAt(x)>='a' && sentence.charAt(x)<='z') {
	    		count++;
	    	}
	    	x++;
	    }
	    System.out.println("Numbers used are: " + numbers.substring(0, numbers.length()-1));
	    System.out.println("Letters used are: " + letters.substring(0, letters.length()-1));
	    System.out.println("Letters from \"a\" to \"z\" are used \"" + count + "\" times.");
	}

}
