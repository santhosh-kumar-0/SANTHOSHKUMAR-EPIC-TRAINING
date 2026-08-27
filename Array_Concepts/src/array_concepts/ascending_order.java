package array_concepts;

public class ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {90,80,70,60,50,40};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int array :arr) {
			System.out.println(array);
		}
	}

}
