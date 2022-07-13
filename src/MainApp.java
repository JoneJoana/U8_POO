
public class MainApp {

	public static void main(String[] args) {
		
		// --- CLASS PERSONA ----
		
		System.out.println("CLASS PERSONA");
		
		//creamos personas con los distintos constructores
		Persona person1 = new Persona();		
		Persona person2 = new Persona("joana",33,'H');		
		Persona person3 = new Persona("Oscar",34,'H',"46991350G",78,180);
		
		System.out.println("Imprimimos persona 1 tal cual ha sido creada:"); 
		System.out.println(person1.toString()); 
		
		//modificamos datos a person1
		person1.setName("Marta");
		person1.setDni("47777777G"); 
		
		System.out.println("Imprimimos persona 1 despues de haberle dado nombre y dni:"); 
		System.out.println(person1.toString()); 
		
		System.out.println("Mostramos datos persona 2");
		System.out.println(person2.toString()); 
		
		System.out.println("Mostramos datos persona 2 habiendole cambiado el genero"); //comprobamos que no nos deja ponerle un dato incorrecto
		person2.setGender('P');
		System.out.println(person2.toString()); 
	
		System.out.println("Le damos valor correcto a genero");
		person2.setGender('M');
		System.out.println(person2.toString());
		
		System.out.println(person3.toString()); 
		
		
		// ---- CLASS PASSWORD ----
		
		System.out.println("\nCLASS PASSWORD");
		
		//creamos password con el constructor por defecto, y luego le generamos contraseña llamando al metodo de la clase
		Password passwd1 = new Password();
		passwd1.setPasswdRandom(passwd1.generatePasswd(passwd1.getLength()));
		
		System.out.println(passwd1.getLength()+" "+passwd1.getPasswdRandom());
		
		//instanciamos un objeto tipo password que nos genere una contraseña de 5 caracteres
		Password passwd2 = new Password(5);
		System.out.println(passwd2.getLength()+" "+passwd2.getPasswdRandom());
		
		
		
		
		// TODO ---- CLASS ELECTRODOMESTICO ----
		System.out.println("\nCLASS ELECTRODOMESTICO");
		
		Electrodomestico electro1 = new Electrodomestico();
		
		
		
		
		// TODO ---- CLASS SERIE ---- 
		
		
	}

}