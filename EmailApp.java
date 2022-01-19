package emailap;

public class EmailApp {

	public static void main(String[] args) {
		email em1 = new email("Shivam","Mehta");
		
		em1.setAlternateEmail("mehtashivam@gmmail.com");
		//System.out.println("ALTERNATE EMAIL:"+em1.getAlternateEmail());
		System.out.println(em1.userAdditionalInfo());

	}

}
