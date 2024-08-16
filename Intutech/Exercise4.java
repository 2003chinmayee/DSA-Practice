

class A{
	
	String name;
	String place;
	int age;
	int marks;
	char grade;
	
	public A(String name,String place,int age,int marks,char grade) {
		this .name=name;
		this.place=place;
		this.age=age;
		this.marks=marks;
		this.grade=grade;
		
	}
	
	public void printout(String name) {
		System.out.println("name:"+name);
	}
	public void printout(String name,String place) {
		System.out.println("name:"+name+ " "+ "place:"+ place);
	}
	public void printout(int marks,int age) {
		System.out.println("name:"+marks+ " "+ "place:"+ age);
	}
	public void printout(char grade,int marks) {
		System.out.println("name:"+grade+ " "+ "place:"+ marks);
	}
	
	
	
}
class Test{
	String office;
	String location;
	int age;
	int salary;
	
	
	public Test(String office,String location,int age,int salary) {
		this .office=office;
		this.location=location;
		this.age=age;
		this.salary=salary;
	
		
	}
	
	public void printout(String office) {
		System.out.println("name:"+office);
	}
	public void printout(String office,String location) {
		System.out.println("name:"+office+ " "+ "place:"+ location);
	}
	public void printout(int salary,int age) {
		System.out.println("name:"+salary+ " "+ "place:"+ age);
	}
	public void printout(String location,int salary) {
		System.out.println("name:"+location+ " "+ "place:"+ salary);
	}
	
}

public class Exercise4 {

	public static void main(String[] args) {
		A a1=new A("rohan","kolhapur",20,87,'A');
		a1.printout(a1.name);
		a1.printout(a1.name,a1.place);
		a1.printout(a1.marks,a1.age);
		a1.printout(a1.grade,a1.marks);
		
	
		Test t1=new Test("indra","pune",22,500000);
		t1.printout(t1.office);
		t1.printout(t1.office,t1.location);
		t1.printout(t1.salary,t1.age);
		t1.printout(t1.location,t1.salary);
		
		

	}
		// TODO Auto-generated method stub

	}



