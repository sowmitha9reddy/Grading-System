package grade_system;

public class Subject {
    int subjectId;
    String subjectName;
	public int length;

    Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }
}


