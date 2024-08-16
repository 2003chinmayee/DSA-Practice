// class Student {
//     String name;
//     int rollno;

//     public Student(String name, int rollno) {
//         this.name = name;
//         this.rollno = rollno;
//     }
// }

// class Info {
//     Student student;

//     public Info(String name, int rollno) {
//         student = new Student(name, rollno);
//     }

//     public void callby(String name) {
//         student.name = name;
//         System.out.println(name);
//     }

//     public void callby(int rollno) {
//         student.rollno = rollno;
//         System.out.println(rollno);
//     }
// }

// public class Exercise6 {
//     public static void main(String[] args) {
//         Info info1 = new Info("rohan", 34);

//         info1.callby("rohan");
//         info1.callby(34);
//     }
// }


class Student {
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

class Info extends Student {
    public Info(String name, int rollno) {
        super(name, rollno); // Calls the constructor of the Student class
    }

    public void callby(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void callby(int rollno) {
        this.rollno = rollno;
        System.out.println(rollno);
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Info info1 = new Info("rohan", 34);

        info1.callby("rohan");
        info1.callby(34);
    }
}

