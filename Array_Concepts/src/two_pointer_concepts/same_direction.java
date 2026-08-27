package two_pointer_concepts;

public class same_direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,3,3,4,4,5,5};
		
		int slow=0;
		
		for(int fast=1;fast<arr.length;fast++) {
			if(arr[slow]!=arr[fast]) {
				slow++;

			arr[slow]=arr[fast];
			}
		}
		
		for(int i=0;i<=slow;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
