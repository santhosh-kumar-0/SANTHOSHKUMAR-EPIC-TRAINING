package Exception_Handling;

class Employeee{
    private String name;
    private int id;
    
    Employeee(String n,int id){
        this.name = n;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
}
public class get_set_methods
{
	public static void main(String[] args) {
		Employeee emp = new Employeee("Dharaneesh",123);
		System.out.println(emp.getName());
		emp.setName("Naveen");
		System.out.println(emp.getName());
		
	}
}
