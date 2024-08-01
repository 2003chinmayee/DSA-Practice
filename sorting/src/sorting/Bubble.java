package sorting;
import java.util.*;

public class Bubble {

	
		
		public static void bubbleSort (int arr[]){
	        for (int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");

	        }
	        System.out.println();
	    }
		
		
		public static void main(String[] args) {
	   
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the array limit");
	        int n=sc.nextInt();
	        int number []=new int[n];
	        
	        System.out.println("enter the array elemts");
	        for (int i=0;i<n;i++){
	            number[i]=sc.nextInt();
	        }

	        System.out.println("the array is");
	        for (int i=0;i<number.length;i++){
	            System.out.print(number[i]+" ");
	        }

	        for(int i=0;i<(number.length-1);i++){
	            for(int j=0;j<(number.length-i-1);j++){
	                if(number[j]>number[j+1]){
	                    int temp=number[j];
	                    number[j]=number[j+1];
	                    number[j+1]=temp;


	                }
	            }
	        }

	        System.out.println("sorted array");
	        bubbleSort(number);



	        
	    
	    
	

		// TODO Auto-generated method stub

	}

}
