package flowcontrol;

public class ConditionalApp2 {

	public static void main(String[] args) {
		
        int salad_portions = 5;
        float salad_price = 25.0f;
        System.out.println("You have ordered "+salad_portions+" portions od salad"+"\n"
                            +"Price of one portion "+salad_price+"\n"
        		            +"total cost "+(salad_portions * salad_price));
  final float LIMIT = 300.0f;   
		if(salad_portions * salad_price >= LIMIT){
                  			
			    System.out.println("Доставка Бесплатная");
		}	
		 else {System.out.println("Доставка 50 лей");
		}
		
	}

}
