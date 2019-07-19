package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String alternatemail;
	private String email;
	private int mailboxCapacity=500;
	private int defaultpasswordlength=10;
	private String suffix="anycompany.com";
	
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("email created"+this.firstname+" "+this.lastname);
		
		this.department=setDepartment();
		System.out.println("department:"+this.department);
		
		this.password=randomPassword(defaultpasswordlength);
		System.out.println("Your password is:"+this.password);
		
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+suffix;
		System.out.println("your mail is:"+email);
		
	}
	private String setDepartment() {
		System.out.println("Enter the department\n 1.sales\n 2.development\n 3.accounting\n 0.none\nEnter department code:");
		Scanner in=new Scanner(System.in);
		int deptchoice=in.nextInt();
		if(deptchoice==1) {return "sales";}
		else if(deptchoice==2) {return "development";}	
		else if(deptchoice==3) {return "accounting";}
		else {return "";}
		
		}
		private String randomPassword(int length) {
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$";
			char[] password =new char[length];
			for(int i=0;i<length;i++)
			{
				int rand=(int)(Math.random() *passwordSet.length());
				password[i]=passwordSet.charAt(rand);
				
			}
			return new String(password);
		}
		public void mailboxcapacity(int capacity) {
			this.mailboxCapacity=capacity;
		}
		public void setAlternateEmail(String altmail)
		{
			this.alternatemail=altmail;
		}
		public void changepass(String password) {
			this.password=password;
		}
		public int getmailboxCapacity() {return mailboxCapacity;}
		public String getalternalemail() {return alternatemail;}
		public String getpassword() {return password;}
		public String showinfo() {
			return "DISPLAY NAME:"+firstname+" "+lastname +
			"\nCOMPANY MAIL:"+email+ "\nMAILBOX CAPACITY :"+mailboxCapacity+"mb";
		}
	}
	


