package MenuManager_v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	
	public static String getCurrentFilePath() {
		return System.getProperty("user.dir");
	}
	
	public static ArrayList<Entree> getEntrees(String filePath){
		ArrayList<Entree> entreeList = new ArrayList<Entree>();
		try {
			String fullPath = getCurrentFilePath() + "\\" + filePath;
			System.out.println(fullPath);
			FileReader fr = new FileReader(fullPath);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				String[] temp = line.split("@@");
				String entreeName = temp[0];
				String entreeDescription = temp[1];
				int calories = Integer.parseInt(temp[2]);
				double price = Double.parseDouble(temp[3]);
				Entree e = new Entree(entreeName, entreeDescription, calories, price);
				entreeList.add(e);
			}
			
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entreeList;
		
	}
}
