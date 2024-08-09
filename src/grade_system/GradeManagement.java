package grade_system;
import java.util.Scanner;
public class GradeManagement {
	 
	
	void updateGrade(Student[] students) {
    Scanner scan = new Scanner(System.in);	    
        String[] gradings = new String[3];
        System.out.print("Enter student id to update: ");
        int studentId = scan.nextInt();
      
        scan.nextLine();
        for (int j = 0; j < StudentManagement.subjects.length; j++) {
            System.out.println("Enter the grade of subject Ex.(A,B,C,D,E): " + StudentManagement.subjects[j].getSubjectName());
            gradings[j] = scan.nextLine();
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == studentId) {
            	String name=students[i].getName();
            	
                students[i] = new Student(studentId,name,gradings);
                return;
            }
        }
	}
}



