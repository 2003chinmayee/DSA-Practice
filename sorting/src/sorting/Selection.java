package sorting;
import java.util.*;

public class Selection {
	
	
	public static void SelectionSort(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]);
		 }
		 System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the limit of array");
		 int n= sc.nextInt();
		 int myarray[]=new int[n];
		 System.out.println("enter the array element");
		 
		 for(int i=0;i<n;i++){
			 myarray[i]=sc.nextInt();
			 
		 }
		 for(int i=0;i<myarray.length;i++) {
			 System.out.print(myarray[i]);
		 }
		 for(int i=0;i<(myarray.length-1);i++) {
			 int first=i;
			 for(int j=i+1;j<(myarray.length);j++) {
				 if(myarray[j]<myarray[first]) {
					 first=j;
					 
				 }
				 
			 }
					 int temp=myarray[first];
					 myarray[first]= myarray[i];
					 myarray[i]=temp;
					 
					 
					 
				
				 
				 
			
			 
			 
			 
			 
		 }
		 System.out.println("sorted array");
		 SelectionSort(myarray);
		 
		 
		 
		 
		 
		
		// TODO Auto-generated method stub

	}

}
