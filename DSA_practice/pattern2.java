import java.util.*;
public class pattern2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int n=sc.nextInt();
        System.out.println("enter the number of col");
        int m=sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
