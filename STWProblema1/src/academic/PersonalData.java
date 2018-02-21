package academic;

public class PersonalData{
	
	int NIU;
	String fullName;
	String Female;
	
	public void setFemale(String female) {
		Female = female;
	}

	public void setMale(String male) {
		Male = male;
	}

	String Male;
	
	
	PersonalData(){
	}
	
	public String toString() {
		return "NIU: "+NIU +"NOMN: "+fullName;
	}
	
	public String genderToString () {
		return null;
	}
	
	
}
