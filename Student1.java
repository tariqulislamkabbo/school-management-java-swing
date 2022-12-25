import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Student1 
{
	private String name;
	private String cls;
	private String section;
	
	public Student1(){}
	public Student1(String name){this.name = name;}
	public void setName(String name)
	{this.name = name;}
	public String getName(){return name;}
	public void setCls(String cls){this.cls = cls;}
	public String getCls(){return cls;}
	
	public void setSection(String section){this.section = section;}
	public String getSection(){return section;}
	
}