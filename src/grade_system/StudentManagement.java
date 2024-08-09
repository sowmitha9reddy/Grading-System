package grade_system;

import java.util.Scanner;

public class StudentManagement {
    static Scanner scan = new Scanner(System.in);

    static Student[] students;
    static Subject[] subjects = new Subject[3];
   
    static {
        subjects[0] = new Subject(0, "maths");
        subjects[1] = new Subject(1, "English");
        subjects[2] = new Subject(2, "Science");
    }



    void addStudent() {
        System.out.println("Enter the no.of students to be added");
        int n = scan.nextInt();
        students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the Id");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter student Name");
            String name = scan.nextLine();

            String[] grades = new String[3];
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter the grade Ex.(A,B,C,D,E) of subject: " + subjects[j].getSubjectName());
                grades[j] = scan.nextLine();
            }
           
            students[i] = new Student(id, name, grades);
        }
       
        System.out.println("Student added.");
    }

    void searchStudent() {
    	if(students==null) {
    		System.out.println("No student to search");
    	}
    	else {
        System.out.print("Enter the student id (to retrieve details): ");
        int studentId = scan.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == studentId) {
            	
                     System.out.println("Student ID: " + student.getId());
                     System.out.println("Name: " + student.getName());
                     for (int i = 0; i < subjects.length; i++) {
                         System.out.println(subjects[i].getSubjectName() + ": " + student.getGrades()[i]);
                     }
                     ReportGenerationManagement r=new ReportGenerationManagement();
                     System.out.println("GPA: " + r.calculateGPA(student.getGrades()));
               
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    	}
    }

    void updateStudent() {
    	if(students==null) {
    		System.out.println("No student to update");
    	}
    	else {
        System.out.print("Enter student id to update: ");
        int studentId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the new Name");
        String newName = scan.nextLine();


            boolean bool=false;
        for (int i = 0; i < students.length; i++) {
        	
                if (students[i].getId() == studentId) {
                    students[i].setName(newName);  // Update the name only
                    bool=true;
                    return;
                }
            }
        if(bool==false) {
        	System.out.println("Student no found");
        }
        
    	}
        
    }


    void reportGeneration() {
    	if(students==null) {
    		System.out.println("Students not found");
    	}
    	else {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i].getSubjectName() + ": " + student.getGrades()[i]);
            }  
           ReportGenerationManagement r=new ReportGenerationManagement();
            System.out.println("GPA: " + r.calculateGPA(student.getGrades()));
            
        }
    }
    }
    void updatingGrades() {
    	if(students==null) {
    		System.out.println("No student to update grades");
    	}else {
    	GradeManagement g=new GradeManagement();
    	g.updateGrade( students);
    	}
    }
    void removeStudent() {
    	if(students==null) {
    		System.out.println("No student to remove");
    	}
    	else {
        System.out.print("Enter student id to remove: ");
        int studentId = scan.nextInt();
        scan.nextLine();  

        int indexToRemove = -1;

      
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == studentId) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Student with ID " + studentId + " not found.");
            return;
        }

       
        Student[] newStudents = new Student[students.length - 1];

       int j=0;
        for (int i = 0 ; i < students.length; i++) {
            if (i != indexToRemove) {
                newStudents[j] = students[i];
                j++;
            }
        }

      
        students = newStudents;

        System.out.println("Student with ID " + studentId + " has been removed.");
    }
    }

	
}

