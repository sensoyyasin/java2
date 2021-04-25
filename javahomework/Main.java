package javahomework;

public class Main {


	public static void main(String[] args) {
		Course course1 = new Course(1,"C# Dersi");
		Course course2 = new Course(2,"Java + React Dersi");
		Course course3 = new Course(3,"Introduction to Programming");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
	}

}
