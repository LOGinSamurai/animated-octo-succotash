
public class Example1App {

	public static void main(String[] args) {
	animal bear = new animal(1986,true);
	bear.eat();
	bear.breathing();
    bear.about();
    chiken chik = new chiken(1962,true);
    chik.about();
    fox red = new fox(1952,true);
    red.about();
	}

}
//   hierarchy

//superclass
 class animal{
	static int current_year = 2019 ; 
  int year ;
  boolean alive;
 
    public animal(){
  	
    }
    
    public animal(int year, boolean alive) {
		this.year = year;
		this.alive = alive;
	}  
     
    public void about(){
    	System.out.println("Is this animal alive ? "+alive+"\n"+
                           "       How old is it ? "+(current_year-year));
    	
    }
    ;
	public void eat(){
		System.out.println("Eating");
	
	}
	public void breathing(){
		//int a = 1;
		//while(a>0){
		System.out.println("air in");
		System.out.println("air out");
		//}
	}
	 
	
}
 //extended class
 class chiken extends animal{
	 int eggs;
	 //this class has 2 inherited methods and 2 of his own
	// public chiken(int eggs) {
			//this.eggs = eggs;
		//}
	 public chiken(int year, boolean alive) {
			super(year,alive);
		}  
	 public void speak(){
		 System.out.println("CO-CO");
	 }
	 
	 public void eat(){
			System.out.println("Eatin");
		
		}
	 
	public void makeEgg(){
		 eggs++;
		 System.out.println("ONE egg OUT "+"Total eggs: "+eggs);
	 }
	 
 }
  class fox extends animal{
	  
	  public fox(int year, boolean alive) {
		super(year,alive);
		prey=0;
	}
	int prey;
	 public void about(){
	    	System.out.println("Is this animal alive ? "+alive+"\n"+
	                          "       How old is it ? "+(current_year-year));
	    	
	    }
	  public void speak() {
		  System.out.println("Bark");}
	  public void hunt(chiken c){
		  prey++;
		  c.eggs--;
		  System.out.println("Killcount: "+prey);
	  
	  }	
	
	  
	  
	  
	  
	  
	  
  }