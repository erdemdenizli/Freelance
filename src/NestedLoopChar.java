
public class NestedLoopChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char c = 'A'; c <= 'Z'; c++) {

			for (char j = 'A'; j <= c; j++) {

				System.out.print(j);

			}
			System.out.println();
		}
	}

}
