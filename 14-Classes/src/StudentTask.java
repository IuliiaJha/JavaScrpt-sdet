
public class StudentTask {

	public static void main(String[] args) {
		Student student1 = new Student("Mike", 17, "Male", 2016, "Java");
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();
		Student student2 = new Student("Karl", 18, "Male", 2016, "JavaScript");
		student2.attendLecture();
		student2.attendLab();
		student2.submitAssignment();
		Student student3 = new Student("John", 19, "Male", 2016, "TypeScript");
		student3.attendLecture();
		student3.attendLab();
		student3.submitAssignment();
	}

}


