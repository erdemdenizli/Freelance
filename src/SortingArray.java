import java.util.Arrays;

public class SortingArray {
	
	public static void sortArray(int[] arr) {
		
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,1,6,9,0};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
