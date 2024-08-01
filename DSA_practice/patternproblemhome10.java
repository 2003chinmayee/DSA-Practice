import java.util.*;
public class patternproblemhome10 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number  ");
        int n=sc.nextInt();
       

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                if (i==1||j==1||i==n||j==n){ 
                    System.out.print("*");


                }else{
                    System.out.print(" ");
                }
               

            }
            System.out.println();
        }
    }
}
