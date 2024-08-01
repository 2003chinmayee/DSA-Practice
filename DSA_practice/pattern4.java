import java.util.*;
public class pattern4 {
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.err.println();

    }

}
    
}
