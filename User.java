import java.util.ArrayList;

public class User {
	
	public String name;
	public ArrayList<User> Friends;
    public User friend;
    
	public User(String name) {
		super();
		this.name = name;
		this.Friends = new ArrayList<User>();
	}
    
	public void addFriend(User u){
		this.Friends.add( u );
		
	}
    public void removeFriend(User u){
		this.Friends.remove( u );
	}

	@Override
	public String toString() {
		String out = "User (" + name + ")\n";
		if(this.Friends.isEmpty()){
			out += "[has no friends]\n";
		}else{out += "[has "+this.Friends.size()+" friends]\n";}
		return out;
		
	}
    
    
}
