import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(greaterThanFive(5));
		
		System.out.println(isEnes("Enes"));
		System.out.println(isEnes("eNeS"));
		
	}
	
	public static boolean greaterThanFive(int n) {
		
		return n>5;
		
	}
	
	public static boolean isEnes(String name) {
		
		return name.equalsIgnoreCase("enes");
		
	}
	
}