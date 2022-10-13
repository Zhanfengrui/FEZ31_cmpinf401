package MenuManager;
import MenuManager.entree;
import MenuManager.side;
import MenuManager.salad;
import MenuManager.dessert;
import MenuManager.Menu;
/**
 * Class MenuTest
	 * author : Tom
 * created: 10/11/2022
 */

public class MenuTest{

    public static void main(String[] args) {
    	entree entree1 = new entree("entree1 name","entree1 desc",100000);
        entree entree2 = new entree("entree2 name","entree2 desc",834320);
        side side = new side("side name","side desc",184912);
        salad salad1 = new salad("salad1 name","salad1 desc",412531);
        salad salad2 = new salad("salad2 name","salad2 desc",536274);
        dessert dessert = new dessert("dessert name","dessert desc",643789);
        Menu menu1= new Menu("Menu1 name",entree1,dessert);
        System.out.println(menu1.description());
        System.out.println(menu1.totalcalories());
        
        Menu menu2 = new Menu("Menu2 name",entree2,side,salad2,dessert);
        System.out.println(menu2.description());
        System.out.println(menu2.totalcalories());
    }
    }

    