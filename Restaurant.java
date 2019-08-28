import java.util.HashSet;

public class Restaurant {
	public String name;
	
	HashSet<Food> menu;

	public Restaurant(String name) {
		this.name = name;
		
		this.menu = new HashSet<Food>();
		
	}
	public void addFood(Food f){
		if(this.menu.contains(f)){
			System.out.println("alreadyexists");
		}
		else{this.menu.add( f );}
		
	}
	@Override
	public String toString() {
		return "Restaurant \"" + name + "\" \n\n" + menu.toString()
		                                                .replaceAll(",","")
		                                                .replaceAll("\\[","")//regex
		                                                .replaceAll("\\]","");
	}
	public Float getPriceof(String food_name){
		
		for (Food food : menu) {
    if (food.name.equals(food_name)){
    	//ignore case /chiastichnoe sovpadenie v texte
    	return food.price;
    }
		}
		

		
		return null;
		
	}
	//public Float getCheapestFood(){
		//принцип поиска минимума
	//}
	//public Float getExpensiveFood(){
		//принцип поиска максимума
	//}
	
	
}
