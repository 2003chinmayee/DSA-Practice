

class B {
    String firstname;
    String secondname;
    String lastname;
    int age;
    int standard;
    int marks;
    float height;
    float distance;
    char grade;

    public B(String firstname, String secondname, String lastname, int age, int standard, int marks, float height, float distance, char grade) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.lastname = lastname;
        this.age = age;
        this.standard = standard;
        this.marks = marks;
        this.height = height;
        this.distance = distance;
        this.grade = grade;
    }

    public String printout(String firstname, String lastname) {
        String result = "name and surname: " + firstname + " " + lastname;
        System.out.println(result);
        return result;
    }

    public String printout(String firstname, String secondname, String lastname) {
        String result = "full name: " + firstname + " " + secondname + " " + lastname;
        System.out.println(result);
        return result;
    }

    public String printout(String secondname) {
        String result = "second name: " + secondname;
        System.out.println(result);
        return result;
    }

    public String printout(int age, int standard) {
        String result = "age and standard: " + age + " " + standard;
        System.out.println(result);
        return result;
    }

    public String printout(float distance, float height) {
        String result = "distance and height: " + distance + " " + height;
        System.out.println(result);
        return result;
    }

    public String printout(int marks, int age, int standard) {
        String result = "marks, age, and standard: " + marks + " " + age + " " + standard;
        System.out.println(result);
        return result;
    }

    public void printout(char grade, int standard) {
        System.out.println("grade and standard: " + grade + " " + standard);
    }

    public void printout(float distance, char grade) {
        System.out.println("distance and grade: " + distance + " " + grade);
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        B b1 = new B("rohan", "krishna", "patil", 20, 1, 344, 5.6f, 4.2f, 'A');
        b1.printout(b1.firstname, b1.lastname);
        b1.printout(b1.firstname, b1.secondname, b1.lastname);
        b1.printout(b1.age, b1.standard);
        b1.printout(b1.distance, b1.grade);
        b1.printout(b1.distance, b1.height);
        b1.printout(b1.grade, b1.standard);
        // TODO Auto-generated method stub
    }
}

