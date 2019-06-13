
import java.util.*;

class NumberRepeatedMostInArray {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
		//		input.nextInt(), input.nextInt() };

		int[] nums = {1, 1, 2, 6, 5, 4, 3, 4, 6, 7, 3, 4, 2, 7,7,7,7,7, 6,6,6,6,6,5,5,5,5,5,1,1,1,1,9,9,9,4,4,4,9,9,7,7,7,7,9,9,9,9,8,8,4,4,4,6,8,8,7,7,7,6,8,8,8,5,4,4,8,8,8,2, 3, 4, 4, 4, 8, 9, 9};
		
		// TODO: write your code below
		
		int maxNum = 0;
		int count = 0;
		int maxCount=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count > maxCount) {
				maxCount = count;
				maxNum = nums[i];
			}
			count = 0;
		}
		System.out.println(maxNum);
	}

}
