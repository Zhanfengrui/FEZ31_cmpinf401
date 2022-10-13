package MenuManager;
import MenuManager.entree;
import MenuManager.side;
import MenuManager.salad;
import MenuManager.dessert;
/**
 * Class Menu
	 * author : Tom
 * created: 10/11/2022
 */


public class Menu {
	String name;
	entree entree;
	salad salad;
	side side;
	dessert dessert;
	public Menu(String name) {
		this.name = name;
		this.entree = null;
		this.dessert = null;
		this.salad = null;
		this.side = null;
	}
	public Menu(String name,entree entree,dessert dessert) {
		this.name= name;
        this.entree = entree;
        this.side = null;
        this.salad = null;
        this.dessert = dessert;
	}
	 public Menu(String name, entree entree, side side,salad salad, dessert dessert)
	    {
	        this.name= name;
	        this.entree = entree;
	        this.side =side;
	        this.salad = salad;
	        this.dessert = dessert;
	    }
	public int totalcalories() {
		 int totalCals=0;
	        if(this.entree!=null)
	        {
	            totalCals+=this.entree.getCalories();
	        }
	         if(this.side!=null)
	        {
	            totalCals+=this.side.getCalories();
	        }
	         if(this.salad!=null)
	        {
	            totalCals+=this.salad.getCalories();
	        }
	         if(this.dessert!=null)
	        {
	            totalCals+=this.dessert.getCalories();
	        }
	        return totalCals;
	    }
	public String description() {
		  String description = "";
	        description=this.name;
	        if(this.entree!=null)
	        {
	            description+="Entree:"+this.entree.getDescription();
	        }else
	        {
	            description+="Entree:N/A";
	        }
	         if(this.side!=null)
	        {
	            description+="Side:"+this.side.getDescription();
	        }else
	        {
	            description+="Side:N/A";
	        }
	         if(this.salad!=null)
	        {
	            description+="Salad:"+this.salad.getDescription();
	        }else
	        {
	            description+="Salad:N/A";
	        }
	         if(this.dessert!=null)
	        {
	            description+="Dessert:"+this.dessert.getDescription();
	        }else
	        {
	            description+="Dessert:N/A";
	        }
		return description;
	}
}


