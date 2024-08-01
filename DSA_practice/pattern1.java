import java.util.*;
public class pattern1 {
    public static void mian(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number rows");
        int n= sc.nextInt();
        System.out.println("enter the number of columns");
        int m= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
        }
        System.out.println();

    }
    
}
