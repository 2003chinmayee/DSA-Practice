import java.util.*;
//print a number if it is prime or not take input from the user
public class findprime {

    public static void checkPrime(int n){
        if(n<=1){
            System.out.println("is not prime");
            return;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println("is not prime");
                return;
            
            }else{
                System.out.println("its prime");
                return;
            }
            
        } 

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check prime or not");
        int n=sc.nextInt();
        checkPrime(n);
       




       


    }
    
}
// Math.sqrt(n):
// The condition i <= Math.sqrt(n) ensures that we only check divisibility up to the square root of n.
// This reduces the number of iterations, making the algorithm more efficient.
// It covers all possible divisors because if a number has a divisor greater than its square root, it must also have a corresponding divisor smaller than its square root