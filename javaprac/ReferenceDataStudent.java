package javaprac;

public class ReferenceDataStudent {

	int ID;
	String name;
	
	ReferenceDataSubject korean;
	ReferenceDataSubject math;
	ReferenceDataSubject english;
	
	
	
	public ReferenceDataStudent(int id, String name1) {
		ID=id;
		name=name1;
		korean = new ReferenceDataSubject();
		math = new ReferenceDataSubject();
		english = new ReferenceDataSubject();
	}
	public void setKoreaSub(String subname1, int subscore)
	{
		korean.subname=subname1;
		korean.score=subscore;
		//korean.subjectID=subID;
	}
	public void setMathSub(String subname1, int subscore, int subID)
	{
		math.subname=subname1;
		math.score=subscore;
		math.subjectID=subID;
	}
	public void setEnglishSub(String subname1, int subscore, int subID)
	{
		english.subname=subname1;
		english.score=subscore;
		english.subjectID=subID;
	}
	public static void main(String[] args) {
		ReferenceDataStudent student = new ReferenceDataStudent(24,"±èµ¿¿í");
		student.setKoreaSub("±¹¾î", 100);
	}
}
