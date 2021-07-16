
public class Gato extends Animal implements Mascota, Cuidados{
	
	int num_bigotes;
	String nombre;
	String color;
	int vidas_disponibles = 9;
	
	public Gato(String nombre, int edad, String color) {
		super(nombre, edad); // hace referencia al constructor padre
		this.color = color;
		
	}
		
	
	@Override // referencia a que el metodo se esta sobreescribiendo
	public String comer () {
		return "Comiendo atun";
	}
	
	public String dormir () {
		return "Zzzzz";
	}


	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Salta";
	}


	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Se gano una pelota";
	}


	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Juega con el laser";
	}


	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Vacunas";
	}


	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Al parque Gatito";
	}


	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return "Rasguños";
	}

	
}
