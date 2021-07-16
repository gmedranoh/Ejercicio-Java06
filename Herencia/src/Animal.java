
public abstract class Animal {

	String nombre;
	int edad=0;
	
	//ponemos un constructor
	// lo usamos para inicializar el objeto
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
	//clases padre
	public abstract String comer();
	
	public abstract String dormir() ;
}
