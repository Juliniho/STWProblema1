package academic;

public class Student extends PersonalData{
	
	Student (String student){};
	Student(int i, String student){};
	
	public String toString(){
		return PersonalData.class.toString();
	};
}
