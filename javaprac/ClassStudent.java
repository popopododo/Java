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
		StudentInfo.studentname= "�赿��";
		StudentInfo.address= "����� ���ı�";
		StudentInfo.showStudentInfo();
	}
}

