class Parent {
    int maxSpeed = 120;
}

class Child extends Parent {
    int maxSpeed = 180;

    void display() {
        System.out.println("Maximum Speed: " + super.maxSpeed); // Refers to Parent's maxSpeed
    }
}

public class Superexercise {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // Output: Maximum Speed: 120
    }
}

