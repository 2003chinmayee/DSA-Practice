
    import java.util.*;

public class A {
    String name;
    

    int age;
    String address;
    int rollno;
    

    // Methods
    public void method1(String name) {
        System.out.println(name);
    }

    public void method2(int age) {
        System.out.println(age);
    }

    public void method3(String address, boolean isAddress) {
        System.out.println(address);
    }

    public void method4(String name, String address) {
        System.out.println(name + ", " + address);
    }

    public void method5(int rollno) {
        System.out.println(rollno);
    }

    public void method6(int age, int rollno) {
        System.out.println(age + ", " + rollno);
    }

    public void method7(int age, String name) {
        System.out.println(age + ", " + name);
    }

    public void method8(int rollno, String address) {
        System.out.println(rollno + ", " + address);
    }
}

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A a1 = new A();
        
        a1.name = "rohan";
        a1.age = 20;
        a1.address = "kolhapur";
        a1.rollno = 15;

        a1.method1(a1.age);
        a1.method1(a1.name);
        a1.method1(a1.address, true);
        a1.method1(a1.rollno);
        a1.method1(a1.name, a1.address);
        a1.method1(a1.age, a1.rollno);
        a1.method1(a1.age, a1.name);
        a1.method1(a1.rollno, a1.address);
    }
}

    

