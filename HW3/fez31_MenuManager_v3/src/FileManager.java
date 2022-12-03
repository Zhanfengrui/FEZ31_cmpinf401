

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

	final static String SPLIT = "@@";

	public static ArrayList<MenuItem> readDishes(String fileName) {

		ArrayList<MenuItem> dishes = new ArrayList<MenuItem>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				// Split the string into an array based on "@@" delimiter
				String[] data = line.split(SPLIT);
				
				String name =  data[0];
				String menuItemType = data[1];
				String descr = data[2];
				int calories = Integer.parseInt(data[3]);
				double price = Double.parseDouble(data[4]);
				
				if(menuItemType.equalsIgnoreCase("entree")) {
					dishes.add(new Entree(name, descr, calories, price));
				}
				else if(menuItemType.equalsIgnoreCase("side")) {
					dishes.add(new Side(name, descr, calories, price));
				}
				else if(menuItemType.equalsIgnoreCase("salad")) {
					dishes.add(new Salad(name, descr, calories, price));
				}
				else if(menuItemType.equalsIgnoreCase("dessert")) {
					dishes.add(new Dessert(name, descr, calories, price));
				}
				
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dishes;
	}

}

