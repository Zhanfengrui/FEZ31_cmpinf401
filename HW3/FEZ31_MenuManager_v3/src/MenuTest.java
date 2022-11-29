package FEZ31_MenuManager_v3;

public class MenuTest {

	public static void main(String[] args) {

		Entree steak = new Entree("Steak", "beaf", 900);
		Entree fish = new Entree("Fish", "salmon", 500);
		Side potato = new Side("Potato", "Mashed potato", 300);
		Side potato2 = new Side("Potato,", "boiled potato", 200);
		Salad potatoSalad = new Salad("Potato salad", "potato salad", 200);
		Salad greenSalad = new Salad("Green salad", "Mixed vegetables", 100);
		Dessert cake = new Dessert("Cake", "Chocolate cake", 1000);
		Dessert iceCream = new Dessert("Ice Cream", "Mango", 700);

		Menu water = new Menu("Water only");
		Menu steakAndPotatoMeal = new Menu("Steak and Potato", steak, potato);
		Menu fishMeal = new Menu("Fish dinner", fish, potato2, greenSalad, cake);

		Menu cakeOnly = new Menu("Cake dinner");
		cakeOnly.setDessert(cake);
		Menu iceCreamOnly = new Menu("Ice cream dinner", new Entree("Steak", "beaf", 900),
				new Side("Potato", "Mashed potato", 300), new Salad("Potato salad", "potato salad", 200), iceCream);

		System.out.println(steakAndPotatoMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + steakAndPotatoMeal.totalCalories() + "\n");

		System.out.println(fishMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + fishMeal.totalCalories() + "\n");

		System.out.println(water.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + water.totalCalories() + "\n");

		System.out.println(cakeOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + cakeOnly.totalCalories() + "\n");

		System.out.println(iceCreamOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + iceCreamOnly.totalCalories() + "\n");

		Menu fishAndPotatos = new Menu("Fish and potato salad", fish, potato, potatoSalad, cake);
		fishAndPotatos.setDessert(new Dessert("Cake", "Real cake", 311));
		System.out.println(fishAndPotatos.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + fishAndPotatos.totalCalories() + "\n");
		iceCreamOnly.setSide(potato);
		steakAndPotatoMeal.setEntree(new Entree("Steak", "beaf", 600));
		steakAndPotatoMeal.setName("Potato only. Steak is unavailable today. ");
		System.out.println(iceCreamOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + iceCreamOnly.totalCalories() + "\n");
		System.out.println(steakAndPotatoMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + steakAndPotatoMeal.totalCalories() + "\n");

	}

}