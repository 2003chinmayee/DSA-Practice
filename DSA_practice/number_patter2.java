import java.util.*;
public class number_patter2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();

        }

    }
    
}
