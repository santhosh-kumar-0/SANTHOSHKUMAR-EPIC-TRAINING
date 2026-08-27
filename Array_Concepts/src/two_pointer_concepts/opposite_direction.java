package two_pointer_concepts;

public class opposite_direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {10,20,30,40,50,25,80};
			
			int left = 0;
			int right = arr.length-1;
			
			while(left<right) {
				int temp =arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] +" ");
			}
	}

}
