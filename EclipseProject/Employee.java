package EclipseProject;

public class Employee {

	// TODO Auto-generated method stub
	String Name;
	int Year;
	String Address;
    public Employee(String n, int y, String a){
		Name = n;
		Year = y;
		Address = a;
		System.out.println(n+"\t" + y+"\t" + a);
    }
	public static void main(String[] args) {
		
		
		System.out.println("Name\t"+"YEAR\t"+"Address\t");
        Employee e1 = new Employee("Robert",2020,"64C-WallStreet");
		Employee e2 = new Employee("Sam",2000,"68D-WallsStreet");
		Employee e3 = new Employee("John",1999,"26B-WallsStreet");
	}

}
