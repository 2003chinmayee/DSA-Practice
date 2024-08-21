class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
    }
}

class Child extends Parent {
    public Child(String name, int age) {
        super(name, age); // Correct way to initialize parent class fields
    }

    public void display() {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
    }
}

public class Superkey {
    public static void main(String[] args) {
        Child d = new Child("rohna", 34);
        d.display();
    }
}
