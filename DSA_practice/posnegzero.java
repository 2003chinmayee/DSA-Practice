import java.util.*;
public class posnegzero {
    //write a program till the user want to enter  and at the end it should display the count of positive ,nrgative and zero enterred
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number you want to input");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        
        int pos=0;
        int neg=0;
        int zero=0;

        for (int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        for (int i=0;i<=numbers.length;i++){
            if(numbers[i]>0){
                pos++;
            }
            if(numbers[i]<0){
                neg++;
            }
            if(numbers[i]==0){
                zero++;
            }
        }
        System.out.println("positive number"+pos);
        System.out.println("negative number"+neg);
        System.out.println("zero number"+zero);

    }
    
}
