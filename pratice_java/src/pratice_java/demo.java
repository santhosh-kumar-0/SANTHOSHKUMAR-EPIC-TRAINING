package pratice_java;

public class demo {
		void greetings() 
		{
			System.out.println("vanakam");
			dummy();
		}
		void dummy(){
			System.out.print("i am dummy");
		}
		public static void main(String[]args) {
			demo obj1 = new demo();
			obj1.greetings();
			
		}
}
