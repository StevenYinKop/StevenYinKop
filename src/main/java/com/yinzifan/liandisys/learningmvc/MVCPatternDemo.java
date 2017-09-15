package com.yinzifan.liandisys.learningmvc;
public class MVCPatternDemo {
	public static void main(String[] args) {
		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();
		// Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		// update model data
		controller.setStudentName("John");
		controller.updateView();
	}
	/**
	 * 模拟从数据库中拿到数据的过程
	 * @return
	 */
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
