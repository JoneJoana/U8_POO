
public class MainApp {

	public static void main(String[] args) {
		//instanciar las clases y probar constructors
		
		
		// --- CLASS PERSONA ----
		//creamos personas con los distintos constructores
		Persona person1 = new Persona();		
		Persona person2 = new Persona("joana",33,'M');		
		Persona person3 = new Persona("Oscar",34,'H',"46991350G",78,180);
		
		System.out.println("Imprimimos person 1 tal cual ha sido creada:"); //TODO corregir para q imprima bien
		System.out.println(person1.toString()); 
		
		person1.setDni("47777777G"); //le damos dni a person1
		
		System.out.println("Imprimimos person 1 despues de haberle dado dni:"); //TODO corregir para q imprima bien
		System.out.println(person1.toString()); 
		
		
		// ---- CLASS PASSWORD ----
		//creamos password con el constructor por defecto, y luego le generamos contraseña llamando al metodo de la clase
		Password passwd1 = new Password();
		passwd1.setPasswdRandom(passwd1.generatePasswd(passwd1.getLength()));
		
		System.out.println(passwd1.getLength()+" "+passwd1.getPasswdRandom());
		
		//instanciamos un objeto tipo password que nos genere una contraseña de 10 caracteres
		Password passwd2 = new Password(5);
		System.out.println(passwd2.getLength()+" "+passwd2.getPasswdRandom());
		
		
		// ---- CLASS ELECTRODOMESTICO ----
		Electrodomestico electro1 = new Electrodomestico();
		
		
		
		
		// TODO ---- CLASS SERIE ---- 
		
		
	}

}