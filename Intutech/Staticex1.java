  class Hero{
    int a;
    int b;
    String name;

    public Hero(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }

     static class Hero2{
        int g=8;
        String name="uiop";

        public void show(){
            System.out.println(g);
            System.out.println(name);
        }
     }

}


public class Staticex1 {
    //static keyword for variable

    public static void main(String arg[]){
        Hero h1 = new Hero ( 56 ,67 ,"rihan");

        Hero.Hero2 r1=new  Hero.Hero2();
        r1.show();



        //here we can call the ekement directly by class without creating a object of class

    }
    
}
