import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public  class Account1{ 
	private String accountHolderName;
	private String subject;
	public Account1(){}
	public Account1(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setSubject(String subject){this.subject = subject;}
	
	public String getAccountHolderName(){return accountHolderName;}
	public String getSubject(){return subject;}
}