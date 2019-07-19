package emailapp;

import java.util.Scanner;

public class emailapp {
     public static void main(String[] args) {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("enter firstname and lastname of new worker");
    	 //String em1=scan.nextLine();
    	 Email em1=new Email(scan.nextLine(),scan.nextLine());
    	 System.out.println(em1.showinfo());
     }
}
