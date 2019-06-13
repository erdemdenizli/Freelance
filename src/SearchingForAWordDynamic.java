import java.util.Scanner;

public class SearchingForAWordDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String target = scanner.next();
		
		int targetLen = target.length();
		
		int count = 0;
		
		for(int i = 0; i<=str.length()-targetLen; i++) {
			if(str.substring(i, i+targetLen).contains(target))
				count++;
		}
		System.out.println(count);
	}

}
