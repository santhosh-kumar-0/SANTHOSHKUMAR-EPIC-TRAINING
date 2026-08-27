package inheritance;

class classA{
	int a =10 ;
	void printData(int a,int b) {
		System.out.println("Class A");
	}
}
class classB extends classA{
	int b =20;
	void printData(int a) {
		System.out.println("Class B");
	}
}

public class single_inherit {
	public static void main(String[] args) {
		classB bobj = new classB();
		System.out.println(bobj.a);
		bobj.printData(10);
	}

}
