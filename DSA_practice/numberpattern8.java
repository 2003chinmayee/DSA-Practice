import java.util.*;
public class numberpattern8 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int count=1;
        System.out.println("enter the number of rows");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
                
            
            }
            System.out.println();
            


        }

    }
    
}
