package MenuManager;
/**
 * Class salad
	 * author : Tom
 * created: 10/11/2022
 */


public class salad {
	String name;
	String description;
	int calories;
    public salad(String name, String description, int calories) {
    	this.name = name;
    	this.description = description;
    	this.calories = calories;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
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
}


