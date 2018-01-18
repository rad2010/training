package assignment;

public class database {

	public static void main(String[] args) {
		
		user user1 = new user("Ashok", "adfasfhah");
		

	}
}

	class user{
		
	
	String name;
	String SSN;
		

	public user(String name, String SSN){
		System.out.println("heeloo");
		String userid = (name + SSN + "@uni.com");
		System.out.println(userid);
		userCredit();
		
	}
	
	public void userCredit() {
		System.out.println("hello agian");
	}
	
	}
	
