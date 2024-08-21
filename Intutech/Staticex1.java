  class Hero{
    int a;
    int b;
    String name;

  

    static void show(int a,int b,String name){
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }

   

}


public class Staticex1 {
    //static keyword for variable

    public static void main(String arg[]){
       Hero.show(45,78,"tyui");




        //here we can call the ekement directly by class without creating a object of class

    }
    
}
