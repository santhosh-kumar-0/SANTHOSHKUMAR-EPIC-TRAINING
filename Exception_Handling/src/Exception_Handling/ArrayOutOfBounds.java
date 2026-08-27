package Exception_Handling;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		try {
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			arr = new int[10];
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println("this is not working");
		}

	}

}