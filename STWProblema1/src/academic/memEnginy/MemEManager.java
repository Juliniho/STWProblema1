package academic.memEnginy;

import java.util.ArrayList;
import java.util.List;

import academic.Person;

public class MemEManager implements Person {
	private static MemEManager INSTANCE = new MemEManager();
	
	ArrayList <Person> attendants=new ArrayList <Person>() ;

	// El constructor privado no permite que se genere un constructor por defecto.
	MemEManager() {};
	public static MemEManager getInstance() {
    	if (INSTANCE == null){
    		INSTANCE = new MemEManager();}
        return INSTANCE;
    }
	
	public void AddAttendant(Person person) {
		attendants.add(person);
	}
	
	public void printattendants() {
		for(Person run:attendants) {
			System.out.println(run);
		}
	}
	
}
