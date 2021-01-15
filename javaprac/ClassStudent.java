package javaprac;

public class ClassStudent {
	public int studentID;
	public String studentname;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID +", "+studentname+", "+ address);
	}
	public static void main(String[] args) {
		ClassStudent StudentInfo = new ClassStudent();
		StudentInfo.studentID= 201820982;
		StudentInfo.studentname= "김동욱";
		StudentInfo.address= "서울시 송파구";
		StudentInfo.showStudentInfo();
	}
}

