package array_concepts;

public class descending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50,60};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int array : arr) {
			System.out.print(array +" ");
		}
		
	}

}
