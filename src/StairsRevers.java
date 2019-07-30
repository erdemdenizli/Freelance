
public class StairsRevers extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "*****";
		int last = str.length();

		while (last > 0) {

			str = str.substring(0, last);
			System.out.println(str);
			last--;
		}
	}

}
