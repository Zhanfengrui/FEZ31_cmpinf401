import java.util.ArrayList;

public class MenuTest {

	public static void main(String[] args) {

		
		
		Menu m = new Menu("Hello", "data\\dishes.txt");
		System.out.println(m.getEntree().get(0).getName());
	}

}