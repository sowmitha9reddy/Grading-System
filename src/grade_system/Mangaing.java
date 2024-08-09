package grade_system;

import java.util.Scanner;



public class Mangaing {
	public static void main(String[] args) {
		
   	 Scanner scanner = new Scanner(System.in);
   	 StudentManagement s=new StudentManagement();
   	 while (true) {
   		    System.out.println("\nStudent Management System");
   		    System.out.println("1. Add Student");
   		   
   		    System.out.println("2. Report of Students");
   		
   		    System.out.println("3. Update the Student Details");
   		    System.out.println("4. Search Student");
   		    System.out.println("5.Update Student Grades");
   		    System.out.println("6.Remove a Student");
   		    
   		   System.out.println();
   		    System.out.print("Enter your choice: ");
   		
           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   s.addStudent();
                 
                   break;
             
               case 2:
            	   s.reportGeneration();
            	   break;
               case 3:
                  s.updateStudent();
                   break;
               case 4:
               	s.searchStudent();
               	
               	break;
               case 5:
            	   s.updatingGrades();
            	   break;
               case 6:
            	   s.removeStudent();
            	   break;
               default:
                   System.out.println("Invalid choice");
           }
       }
}
}
