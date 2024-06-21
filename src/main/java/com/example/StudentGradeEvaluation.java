

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String A = scanner.nextLine();
        System.out.print("Enter your age: ");
        int b = scanner.nextInt();
        System.out.print("Enter your exam score: ");
        int c = scanner.nextInt();
        String grade="";

        if(c>90 )
        {
            grade = "A";
        }
        else if(c < 89 && c > 80){
            grade = "B";
        }
        else if(c<69 && c>60){
            grade = "C";
        }
        else{
            grade = "F";
        }




        System.out.println(" Name: "+ A);
        System.out.println(" Age: "+b);
        System.out.println(" Score: "+c);
        System.out.println("Grade: "+grade);
        }
       
        
        

        // Determine the grade
        
        
        
        
        

        // Print the student's details
        

    }  
    

