package week3.day1assignment;

public class Students {

	public void getStudentInfo(int id) {

		System.out.println("Printing the ID info "  +id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("Student id is "+id+" and Name is "+name+"");
	}

	public void getStudentInfo(String email, int phoneNumber) {

		System.out.println("Email id is  "+email+" and Phone number is "+phoneNumber+"");
	}

	public static void main(String[] args) {

		Students stu = new Students();
		
		stu.getStudentInfo(544005);
		stu.getStudentInfo(12343, "Priya");
		stu.getStudentInfo("priya@gmail.com", 1234567890);
	}

}
