

//perro va a heredar de animal
public class Perro extends Animal implements Mascota, Cuidados{

	String raza = "";
	String color = "";
	float peso = 0;
	
	public Perro (String nombre, int edad) {
		super (nombre, edad);
	}
	
	
	public String ladrar() {
		return "Guaf";
	}
	
	
	//usando polimorfismo, reemplazamos comer por comiendo croquetas
	@Override //indica que se esta aplicando polimorfismo sobre este metodo
	public String comer() {
		return "Comiendo croquetas";
	}


	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "Duuuurmiendo Zzzzzzzzzzzzzzz";
	}
	
	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Me da la pata";
	}
	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Se gano un hueso";
	}
	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Corremos juntas";
	}


	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Revisiones";
	}


	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Paseos";
	}


	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return "Cor";
	}
}
