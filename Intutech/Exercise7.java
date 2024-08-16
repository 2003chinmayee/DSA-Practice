class Student {
    private String name;
    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

class Info extends Student {
    public Info(String name, int rollno) {
        super(name, rollno); 
    }

    public void callby(String name) {
        setName(name);
        System.out.println(getName()); 
    }

    public void callby(int rollno) {
        setRollno(rollno); 
        System.out.println(getRollno()); 
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Info info1 = new Info("rohan", 34);

        info1.callby("rohan");
        info1.callby(34);
    }
}
