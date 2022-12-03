import java.util.ArrayList;

public class Menu {

	private String name;
	private ArrayList<Entree> entree = new ArrayList<>();
	private ArrayList<Side> side = new ArrayList<>();
	private ArrayList<Salad> salad = new ArrayList<>();
	private ArrayList<Dessert> dessert = new ArrayList<>();

	public Menu (String name, String dataFile)
	{
		this.name = name;
		ArrayList<MenuItem> dishes = FileManager.readDishes(dataFile);
		for(MenuItem dish : dishes) {
			if(dish instanceof Entree){
				entree.add((Entree) dish);
			}
			else if(dish instanceof Side) {
				side.add((Side) dish);
			}
		}
	}

	
	public ArrayList<Entree> getEntree(){
		return this.entree;
	}
	public int totalCalories (){
		//return entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
		return 0;
	}

	public double totalPrice (){
		//return entree.getPrice() + side.getPrice() + salad.getPrice() + dessert.getPrice();
		return 0;
	}

	public String descriptionOfMeal () {
		/*
		return "The meal " + this.name + " consists of: "
				+ "\nEntree: " + entree.getName() + ". " + entree.getDescription()
				+ "\nSalad: " + salad.getName() + ". " + salad.getDescription()
				+ "\nSide: " + side.getName() + ". " + side.getDescription()
				+ "\nDessert: " + dessert.getName() + ". " + dessert.getDescription();
				*/
		return "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return getName();
	}

}