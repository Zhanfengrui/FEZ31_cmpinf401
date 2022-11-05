package MenuManager_v2;
import MenuManager_v2.entree;
import MenuManager_v2.side;
import MenuManager_v2.salad;
import MenuManager_v2.dessert;
/**
 * Class Menu
	 * author : Tom
 * @created: 11/04/2022
 */


public class Menu {

private String name;
private entree entree;
private Side side;
private salad salad;
private dessert dessert;

public Menu (String name)
{
this.name = name;
this.entree = new entree("Steak", "Steak", 800); 
this.side = new Side ("Potato", "Mashed potato", 380);
this.salad = new salad("Chicken salad", "Salad", 380);
this.dessert = new dessert ("Chocolate Cake", "cake", 1000);
}

public Menu (String name, entree entree, Side side)
{
this.name = name;
this.entree = entree;
this.side = side;
this.salad = new salad("Chicken salad", "Salad", 380);
this.dessert = new dessert ("Chocolate Cake", " cake", 1000);
}

public Menu (String name, entree entree, Side side, salad salad, dessert dessert)
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

public entree getEntree() {
return entree;
}

public void setEntree(entree entree) {
this.entree = entree;
}

public Side getSide() {
return side;
}

public void setSide(Side side) {
this.side = side;
}

public salad getSalad() {
return salad;
}

public void setSalad(salad salad) {
this.salad = salad;
}

public dessert getDessert() {
return dessert;
}

public void setDessert(dessert dessert) {
this.dessert = dessert;
}


public String toString() {
return getName();
}

}