
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cree objeto animal y bony
		//Animal Animals = new Animal(); //cuando ponemos una clase abstracta se comenta porque no admite objetos
		//System.out.println(animal.comer());
		
		Perro bony = new Perro("Bony", 3);
		System.out.println(bony.ladrar());
		System.out.println(bony.comer());
		System.out.println(bony.nombre);
		System.out.println(bony.edad);
		
		Gato pulgas = new Gato("bigotes", 2, "naranja");
		System.out.println(pulgas.comer());
		
	}

}
