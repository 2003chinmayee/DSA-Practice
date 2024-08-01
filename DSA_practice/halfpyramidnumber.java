import java.util.*;
public class halfpyramidnumber {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the number you want to input");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }


    }
    
}
