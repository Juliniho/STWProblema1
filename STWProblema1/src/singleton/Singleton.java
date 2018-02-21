package singleton;

public class Singleton {
	private static Singleton INSTANCE = new Singleton();

	// El constructor privado no permite que se genere un constructor por defecto.
	private Singleton() {};
	public static Singleton getInstance() {
    	if (INSTANCE == null){
    		INSTANCE = new Singleton();}
        return INSTANCE;
    }
}