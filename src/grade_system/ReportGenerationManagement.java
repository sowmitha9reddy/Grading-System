package grade_system;

import java.util.Objects;

public class ReportGenerationManagement {
	
	 static public double calculateGPA(String[] grades) {
	        int totalPoints = 0;
	        int numGrades = 0;

	        for (String grade : grades) {
	            if (grade != null) {
	                totalPoints += convertGradeToPoint(grade);
	                numGrades++;
	            }
	        }

	        return numGrades == 0 ? 0.0 : (double) totalPoints / numGrades;
	    }

	    static private int convertGradeToPoint(String grade) {
	        switch (grade) {
	            case "A":
	                return 10;
	            case "B":
	                return 9;
	            case "C":
	                return 8;
	            case "D":
	                return 7;
	            case "F":
	                return 6;
	            default:
	                return 0;
	        }
	    }
	
    }

