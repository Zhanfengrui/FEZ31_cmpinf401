package MenuManager_v2;

import MenuManager_v2.menuManager_v2.side.Appetizer;

public class menuManager_v2 {
	public class side{
		protected String name;
		protected String description;
		protected int calories;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
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
		side(String name,String description,int calories){
			this.name = name;
			this.description = description;
			this.calories = calories;
		}
		public class entree{
			protected String name;
			protected String description;
			protected int calories;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDescription() {
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
			entree(String name,String description,int calories){
				this.name = name;
				this.description = description;
				this.calories = calories;
			}
		}

		public class Appetizer{
			protected String name;
			protected String description;
			protected int calories;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDescription() {
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
			Appetizer(String name,String description,int calories){
				this.name = name;
				this.description = description;
				this.calories = calories;
			}
		}
	}
	public class Beer{
		protected String name;
		protected String description;
		protected int calories;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
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
		Beer(String name,String description,int calories){
			this.name = name;
			this.description = description;
			this.calories = calories;
	 }
}
	public class Menu{
		protected String name;
		protected entree entree;
		protected side side;
		protected Beer beer;
		protected Appetizer appetizer;
		
	Menu(String name){
		this.name = name;
		this.entree = null;
		this.side = null;
		this.appetizer = null;
		this.beer = null;
	}
		Menu(String name, entree entree, side side, Appetizer appetizer, Beer beer){
			this.name = name;
			this.entree = entree;
			this.side = side;
			this.appetizer = appetizer;
			this.beer = beer;
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
		public side getSide() {
			return side;
		}
		public void setSide(side side) {
			this.side = side;
		}
		public Beer getBeer() {
			return beer;
		}
		public void setBeer(Beer beer) {
			this.beer = beer;
		}
		public Appetizer getAppetizer() {
			return appetizer;
		}
		public void setAppetizer(Appetizer appetizer) {
			this.appetizer = appetizer;
		}
		int totalcalories() {
			return(side!= null?side.calories:0)+(appetizer!= null?appetizer.calories:0)+(entree!= null?entree.calories:0)+(beer!= null?beer.calories:0);
		}
		String description() {
			String D = "entree: " + (entree!=null? entree.description:"N/A") + "\n" + "Appetizer: " + (appetizer!=null? appetizer.description:"N/A") + "\n" + "side: " + (side!=null? side.description:"N/A") + "\n" + "Beer: " + (beer!=null? beer.description:"N/A") + "\n";
			return D;
		}
	}
	}