
public class Persona {
	
	private final char WOMAN = 'M';
	private final char MAN = 'H';
		
	private String name;
	private int age;
	private String dni;
	private char gender;
	private double weight;
	private int height;
	
	//todos los atributos por defecto menos dni (se pasara con setDni durante la ejecucion del programa
	public Persona() {  
		this.name = "";
		this.age = 0;
		this.gender = MAN;		
		this.weight = 0;
		this.height = 0;			
	}	
	
	//por parametro name,age,gender - lo demas por defecto (entiendo que incluido dni)
	public Persona(String name,int age,char gender) {		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dni = "";
		this.weight = 0;
		this.height = 0;	
	}

	//constructor con todos los atributos
	public Persona(String name,int age,char gender,String dni,double weight,int height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dni = dni;
		this.weight = weight;
		this.height = height;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if(gender == WOMAN || gender == MAN) {
			this.gender = gender;
		}else {
			System.out.println("Introduce valor valido: M o H");
		}		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {	
		return "\nDatos de la persona\n "
				+ "Nombre: "+this.name
				+"\n Edad: "+this.age
				+"\n Genero: "+this.gender
				+"\n DNI: "+this.dni
				+"\n Peso: "+this.weight
				+"\n Altura (cm): "+this.height
				+"\n";		
	}
}
