import java.util.ArrayList;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums=new ArrayList<>();
		Random ran=new Random();
		for(int i=0; i<5; i++)
			nums.add(ran.nextInt());		
		System.out.println(nums);

	}

}
