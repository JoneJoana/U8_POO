
public class Electrodomestico {
	
	private String colours[] = {"blanco","negro","azul","gris"};
	private char optionsEnergIntake[]  = {'A','B','C','D','E','F'};
	
	private final String COLOUR_DEFAULT = colours[0];
	private final char INTAKE_DEFAULT = 'F'; //optionsEnergIntake[optionsEnergIntake.length-1]; lo complica en exceso
	private final double PRICE_DEFAULT = 100;
	private final double WEIGHT_DEFAULT = 5;

	//protected para que sean heredables
	protected String product; //añadimos atributo para identificarlo
	protected double price;
	protected String colour;
	protected char energIntake;//letras entre A y F
	protected double weight;
	
	
	public Electrodomestico() {
		this.product = "";
		this.price = PRICE_DEFAULT;
		this.colour = COLOUR_DEFAULT;
		this.energIntake = INTAKE_DEFAULT;
		this.weight = WEIGHT_DEFAULT;
	}
	
	public Electrodomestico(String product,double price,double weight) { //añadimos product para identificacion
		this.product = product;
		this.price = price;
		this.colour = COLOUR_DEFAULT;
		this.energIntake = INTAKE_DEFAULT;
		this.weight = weight;
	}
	
	public Electrodomestico(String product,double price,String colour,char energ,double weight) {
		this.product = product;
		this.price = price;		
		this.weight = weight;	
		
		for(String color: colours) {
			if(color.equalsIgnoreCase(colour)) {
				this.colour = colour;
			}else{
				System.out.println("Introduce color vàlido");
			}
		}
		
		for(char e: optionsEnergIntake) {
			if(e == energ) {
				this.energIntake = energ;
			}else{
				System.out.println("Introduce consumo energetico vàlido");
			}			
		}		
			
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		for(String color: colours) {
			if(color.equalsIgnoreCase(colour)) {
				this.colour = colour;
			}else{
				System.out.println("Introduce color vàlido");
			}
		}
	}

	public char getEnergIntake() {
		return energIntake;
	}

	public void setEnergIntake(char energIntake) {
		for(char e: optionsEnergIntake) {
			if(e == energIntake) {
				this.energIntake = energIntake;
			}else{
				System.out.println("Introduce consumo energetico vàlido");
			}			
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {	
		return "\nDatos del electrodomestico\n "
				+ "Producto: "+this.product
				+"\n Color: "+this.colour
				+"\n Consumo energetico: "+this.energIntake
				+"\n Peso: "+this.weight
				+"\n";		
	}	
}
