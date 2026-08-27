package inheritance;



	class clsA{
		int a =10 ;
		void printData(String a) {
			System.out.println("Class A");
		}
	}
	class clsB extends clsA{
		int b =20;
		void printData(String a, String b) {
			System.out.println("Class B");
		}
	}
	
	class clsC extends clsB{
		int c = 30;
		void printData(String a,String b,String c) {
			System.out.println("class C");
		}
	}

	public class multilevel_inherit {
		public static void main(String[] args) {
			clsC cobj = new clsC();
			System.out.println(cobj.a);
			System.out.println(cobj.b);
			cobj.printData("hi","hello","welcome");
			cobj.printData("hi");
			cobj.printData("hi","hello");


		}

	}
