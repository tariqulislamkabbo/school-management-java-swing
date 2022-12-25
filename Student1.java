import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Student1 
{
	private String name;
	private String cls;
	private String section;
	private int age;

	public Student1(){}
	public Student1(String name, String cls, String section, int age){
		this.name = name;
		this.cls = cls;
		this.section = section;
		this.age = age;

		try{
			Scanner sc = new Scanner(System.in);
			FileWriter file = new FileWriter("./record/student.txt", true);  
			System.out.println(file);
			file.write(this.name + " " + this.cls + " " + this.section + " " + this.age );
			file.write(System.lineSeparator());
			file.close(); 
		}

		catch(Exception ex)
		{
			System.out.println("An error has just occured! :(" + ex);
		}
	}
	public void setName(String name)
	{this.name = name;}
	public String getName(){return name;}
	public void setCls(String cls){this.cls = cls;}
	public String getCls(){return cls;}
	
	public void setSection(String section){this.section = section;}
	public String getSection(){return section;}
	
}