import java.util.*;
public class pattern5 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
         for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

         }

    }
    
}
