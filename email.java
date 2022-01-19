package emailap;

public class email {
	 String firstName;
	 String lastName;
	 String email;
	 String password;
	 int mailboxcapacity =100;
	 int defaultPasswordLength =10;
	 String alternateEmail;
	 String mailSuffix = "gmail.com";
	 
	 //Constructor to receive the first name and last name
	public email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED:" +this.firstName+" "+this.lastName);	
		
	
	
	
	//Element generate to email
	email = firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+ mailSuffix;	
	System.out.println("EMAIL ID:"+email);
	//method that  returns a random password
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("PASSWORD:"+this.password);
	}
	String randomPassword(int length) {
		String passwordSet = "ABCDHJ12345";
		char[] password = new char[length];
		for(int i=0;i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		
		return new String(password);
		
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password =password;
	}
	
	public int getMailboxcapacity() { return mailboxcapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String  getPassword() {return password;}
	
	
	public String userAdditionalInfo() {
		return "Alternate Email:" + alternateEmail+ 
				"\nMAIL BOX CAPACITY:"+ mailboxcapacity +"mb";
		
	}
	 
	 

}
