

public class MenuItem {

	private String name = null;
	private String description = null;
	private int calories = 0;
	private double price = 0.0;


	public MenuItem () {
		this.name = null;
		this.description = null;
		this.calories = 0;
		this.price = 0.0;
	}

	public MenuItem (String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}

	public String getName() {
		if (this.name == null) this.name = "N/A";
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		if (this.description == null) this.description = "";
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice (double price){
		this.price=price;
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
