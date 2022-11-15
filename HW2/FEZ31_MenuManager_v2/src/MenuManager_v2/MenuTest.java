package MenuManager_v2;

import java.util.ArrayList;

/**
 * Class MenuTest
 * author : Tom
 * @created: 11/04/2022
 */

public class MenuTest{


	public static void main(String[] args) {
		/*
		Entree entree1 = new Entree("entree1 name","entree1 desc",100000);
		Entree entree2 = new Entree("entree2 name","entree2 desc",834320);
		Side side = new Side("side name","side desc",184912);
		Salad salad1 = new Salad("salad1 name","salad1 desc",412531);
		Salad salad2 = new Salad("salad2 name","salad2 desc",536274);
		Dessert dessert = new Dessert("dessert name","dessert desc",643789);
		Menu menu1= new Menu("Menu1 name",entree1,side);
		System.out.println(menu1.descriptionOfMeal());
		System.out.println(menu1.totalCalories());

		Menu menu2 = new Menu("Menu2 name",entree2,side,salad2,dessert);
		System.out.println(menu2.descriptionOfMeal());
		System.out.println(menu2.totalCalories());
		*/
		
		ArrayList<Entree> entreeList = FileManager.getEntrees("data\\entree.txt");
	
		for(Entree e : entreeList) {
			System.out.println(e.getDescription());
		}

	}




}