
public class Student {

	public String name;
	public int age;
	public String gender;
	public int year;
	public String course;
	public static String university = "Cybertek";
	
	

	public Student(String name, int age, String gender, int year, String course) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}

	public void attendLecture() {
		System.out.println(name+" attended lecture in " + university);
	}
	public void submitAssignment() {
		System.out.println(name+" submitted assignment");
	}
	public void attendLab() {
		System.out.println(name+" attended lab");
	}

	}
	
	
	
	

