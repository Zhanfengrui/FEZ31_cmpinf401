package FEZ31_MenuManager_v3;

public final class Salad extends MenuItem {

public Salad (String name, String description, int calories, double price){
super(name, description, calories, price);
}

private String name = null;
private String description = null;
private int calories = 0;

public Salad ()
{
this.name = null;
this.description = null;
this.calories = 0;
}

public Salad (String name, String description, int calories)
{
this.name = name;
this.description = description;
this.calories = calories;
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

}
