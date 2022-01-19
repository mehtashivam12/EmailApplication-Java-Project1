package signinsignup;

import java.util.Scanner;

public class EmailApplication {
	String email;
	String name;
	String alternate_email;
	String password;
	String change_pass;
	String security_quest;
	int MailBoxCapacity = 100;

	public EmailApplication(String email, String name, String alternate_email, String password, String change_pass,
			String security_quest, Integer MailBoxCapacity) {
		super();
		this.email = email;
		this.name = name;
		this.alternate_email = alternate_email;
		this.password = password;
		this.change_pass = change_pass;
		this.security_quest = security_quest;
		this.MailBoxCapacity = MailBoxCapacity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternate_email() {
		return alternate_email;
	}

	public void setAlternate_email(String alternate_email) {
		this.alternate_email = alternate_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getChange_pass() {
		return change_pass;
	}

	public void setChange_pass(String change_pass) {
		this.change_pass = change_pass;
	}

	public String getSecurity_quest() {
		return security_quest;
	}

	public void setSecurity_quest(String security_quest) {
		this.security_quest = security_quest;
	}

	public Integer getMailBoxCapacity() {
		return MailBoxCapacity;
	}

	public void setMailBoxCapacity(Integer MailBoxCapacity) {
		this.MailBoxCapacity = MailBoxCapacity;
	}

	Scanner scanner = new Scanner(System.in);

	@Override
	public String toString() {
		return "EmailApplication [email=" + email + ",name=" + name + ", alternate_email=" + alternate_email
				+ ", password=" + password + ", change_pass=" + change_pass + ", security_quest=" + security_quest
				+ ",MailBoxCapacity=" + MailBoxCapacity + "]";
	}

	public EmailApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	EmailApplication addMember() {
		System.out.println("Email id");
		String email = scanner.next();

		System.out.println("FULL NAME");

		String name = scanner.next();

		System.out.println("Alternate Email");
		String alternate_email = scanner.next();
		
		System.out.println("Password");
		String password = scanner.next();
		System.out.println("What is Your First School Name?");
		String security_quest = scanner.next();

		return new EmailApplication(email, name,alternate_email,password,security_quest, security_quest, MailBoxCapacity);

	}

/*	EmailApplication addMember1() {
		System.out.println("Email");
		String email = scanner.next();
		System.out.println("NEW PASSWORD");
		String password = scanner.next();
		System.out.println("What Is Your First School Name?");
		String security_quest = scanner.next();
		return new EmailApplication(email, password, change_pass, security_quest, security_quest, security_quest,
				MailBoxCapacity);

	}*/

}
