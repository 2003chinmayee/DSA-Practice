import java.util.*;
//make a menu driven progrm the user can enter  2 number 1 or 0 
//  if the user enteer 1 then keep taking input from the user for students 
//  marks out of 100 if he or she scores marks>=90 print very good if 89>= print good 
//  if 59> keep dowing use do while loop


public class menudriven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("Very good!");
                } else if (marks >= 60) {
                    System.out.println("Good.");
                } else if (marks >= 40) {
                    System.out.println("Keep improving.");
                } else {
                    System.out.println("Needs improvement.");
                }
            }
        } while (choice != 0);

        System.out.println("Thank you for using the program!");
    }
}


    