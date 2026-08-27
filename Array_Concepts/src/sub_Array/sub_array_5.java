package sub_Array;

public class sub_array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,1,1,2,2,3,1};
		int k=3;
		int tar=4;
		
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				if(arr[i]+arr[j]==tar) {
					sum+=arr[j];
				}
			}
			System.out.println();

		}

	}

}
