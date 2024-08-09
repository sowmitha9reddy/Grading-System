package grade_system;

public class Student {
    int id;
    String name;
    String[] grades;
  

    Student(int id, String name,String[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   

	
	  public String[] getGrades() {
	        return grades;
	    }

	
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	public void setName(String newName) {
	this.name=newName;
		
	}


}

