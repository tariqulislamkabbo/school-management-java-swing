import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.util.*;

public  class Account1{ 
	private String accountHolderName;
	private String subject;
	private String salary;
	public Account1(){}
	public Account1(String accountHolderName, String subject, String salary)
	{
		this.accountHolderName = accountHolderName;
		this.subject = subject;
		this.salary = salary;
		try{
			Scanner sc = new Scanner(System.in);
			FileWriter file = new FileWriter("./record/teacher.txt", true);  
			System.out.println(file);
			file.write(this.accountHolderName + " " + this.subject + " " + this.salary );

			file.write(System.lineSeparator());
			file.close(); 
		}

		catch(Exception ex)
		{
			System.out.println("An error has just occured! :(" + ex);
		}

	}
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setSubject(String subject){this.subject = subject;}
	
	public String getAccountHolderName(){return accountHolderName;}
	public String getSubject(){return subject;}
}