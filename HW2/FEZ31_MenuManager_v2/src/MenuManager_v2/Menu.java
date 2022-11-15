package MenuManager_v2;

/**
 * Class Menu
 * author : Tom
 * @created: 11/04/2022
 */


public class Menu {

	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	public Menu (String name)
	{
		this.name = name;
		this.entree = new Entree("Steak", "Steak", 800); 
		this.side = new Side ("Potato", "Mashed potato", 380);
		this.salad = new Salad("Chicken salad", "Salad", 380);
		this.dessert = new Dessert ("Chocolate Cake", "cake", 1000);
	}

	public Menu (String name, Entree entree, Side side)
	{
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = new Salad("Chicken salad", "Salad", 380);
		this.dessert = new Dessert ("Chocolate Cake", " cake", 1000);
	}

	public Menu (String name, Entree entree, Side side, Salad salad, Dessert dessert)
	{
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}

	public int totalCalories (){
		return entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
	}

	public double totalPrice (){
		return entree.getPrice() + side.getPrice() + salad.getPrice() + dessert.getPrice();
	}

	public String descriptionOfMeal () {
		return "The meal " + this.name + " consists of: "
				+ "\nEntree: " + entree.getName() + ". " + entree.getDescription()
				+ "\nSalad: " + salad.getName() + ". " + salad.getDescription()
				+ "\nSide: " + side.getName() + ". " + side.getDescription()
				+ "\nDessert: " + dessert.getName() + ". " + dessert.getDescription();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}


	public String toString() {
		return getName();
	}

}