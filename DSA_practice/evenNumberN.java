import java.util.*;
public class evenNumberN {
    //print all even number till n
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number till you want to print the even number ");
        int n=sc.nextInt();
       

        for(int i=1;i<=n;i++){
            
            if(i%2==0){
               System.out.println(i);

               

            }
        }
        

    }
}
