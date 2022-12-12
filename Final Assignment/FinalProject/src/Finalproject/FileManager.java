package Finalproject;

import java.util.*;
import java.io.*;

public class FileManager {
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<MenuItem> menuItems=new ArrayList<MenuItem>();

		String s=null;

		try {
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			while((s=br.readLine())!=null) {
				list.add(s);
			}
			for(String line : list){
				String [] res = line.split("@@");

				if(res[1].equals("dessert")) {
					Dessert d=new Dessert(res[0],res[2],Integer.valueOf(res[3]),Double.valueOf(res[4]));
					menuItems.add(d);
				}else if(res[1].equals("entree")) {
					Entree e=new Entree(res[0],res[2],Integer.valueOf(res[3]),Double.valueOf(res[4]));
					menuItems.add(e);
				}else if(res[1].equals("salad")) {
					Salad sa=new Salad(res[0],res[2],Integer.valueOf(res[3]),Double.valueOf(res[4]));
					menuItems.add(sa);
				}else if(res[1].equals("side")) {
					Side si=new Side(res[0],res[2],Integer.valueOf(res[3]),Double.valueOf(res[4]));
					menuItems.add(si);
				}
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return menuItems;
	}


	public static void writeMenus(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).description()+"\n"+ "Total calories: "+menus.get(i).totalCalories()+"\n"+ "Total price: "+menus.get(i).totalPrice()+"\n");
				bw.newLine();
			}

			bw.close();
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}




