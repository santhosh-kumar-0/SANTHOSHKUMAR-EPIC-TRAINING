package array_concepts;

public class rev_two_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,70};
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int temp=arr[left];
			arr[left] = arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
	}

}
