
public class PalindromeWord {

	public static boolean isPalindrome(String check) {
		check = check.toLowerCase().replaceAll(" ", "");

		for (int i = 0; i < check.length() / 2; i++) {
			if (check.charAt(i) != check.charAt(check.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "race car";
		
		System.out.println(isPalindrome(word));

	}

}
