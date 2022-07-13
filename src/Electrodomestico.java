
public class Electrodomestico {
	
	private String colours[] = {"blanco","negro","azul","gris"};
	private char optionsEnergIntake[]  = {'A','B','C','D','E','F'};
	
	private final String COLOUR_DEFAULT = colours[0];
	private final char INTAKE_DEFAULT = 'F'; //optionsEnergIntake[optionsEnergIntake.length-1]; lo complica en exceso
	private final double PRICE_DEFAULT = 100;
	private final double WEIGHT_DEFAULT = 5;

	//protected para que sean heredables
	protected double price;
	protected String colour;
	protected char energIntake;//letras entre A y F
	protected double weight;
	
	
	public Electrodomestico() {
		this.price = PRICE_DEFAULT;
		this.colour = COLOUR_DEFAULT;
		this.energIntake = INTAKE_DEFAULT;
		this.weight = WEIGHT_DEFAULT;
	}
	
	public Electrodomestico(double price,double weight) {		
		this.price = price;
		this.colour = COLOUR_DEFAULT;
		this.energIntake = INTAKE_DEFAULT;
		this.weight = weight;
	}
	
	public Electrodomestico(double price,String colour,char energ,double weight) {
		this.price = price;
		this.colour = colour;
		this.energIntake = energ;
		this.weight = weight;		
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
		this.colour = colour;
	}

	public char getEnergIntake() {
		return energIntake;
	}

	public void setEnergIntake(char energIntake) {
		this.energIntake = energIntake;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
