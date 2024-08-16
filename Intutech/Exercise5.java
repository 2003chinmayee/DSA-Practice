class Student {
    String name;
    int rollno;
 
}
class Info extends Student {
    public void callby(String name) {

       System.out.println(name);
    }

    public void callby(int rollno) {
      
        System.out.println(rollno);
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Info info1 = new Info(); 

        info1.callby("rohan"); 
        info1.callby(34); 
    }
}
