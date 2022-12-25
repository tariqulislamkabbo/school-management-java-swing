import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;

public class Student extends JFrame implements ActionListener, MouseListener
{
	ImageIcon img;
	JLabel hLabel,l1,l2,l3,l4,l5,l6,l7,tLabel,imgLabel ;
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7;
	JButton b1,b2,b3,searchBtn,backBtn;
	JPanel panel;
	Color myColor;
	Font myFont,myFont1;
	Selection sl;
	Student1 student [] = new Student1[4] ;
	Student1 st;
	
	public Student(Selection sl)
	{
		super ("Student Operations");
		this.setSize(1580,980);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this. sl = sl;
		myColor = new Color(210,210,210);
		myFont = new Font("Cambria",Font.PLAIN,22);
		myFont1 = new Font("Cambria",Font.BOLD,22);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		hLabel = new JLabel("MANAGEMENT SECTION");
		hLabel.setBounds(50,10,250,70);
		hLabel.setBackground(Color.WHITE);
		hLabel.setOpaque(true);
		hLabel.setForeground(Color.BLUE);
		hLabel.setFont(myFont1);
		panel.add(hLabel);
		
		l1 = new JLabel(" Add new Student");
		l1.setBounds(50,100,150,40);
		l1.setBackground(Color.CYAN);
		l1.setOpaque(true);
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		
		l2 = new JLabel("Student Name: ");
		l2.setBackground(Color.CYAN);
		l2.setOpaque(true);
		l2.setBounds(50,160,100,30);
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		tx1 = new JTextField();
		tx1.setBounds(150,160,100,30);
		panel.add(tx1);
		
		l3 = new JLabel("Class :");
		l3.setBackground(Color.CYAN);
		l3.setOpaque(true);
		l3.setBounds(50,210,100,30);
		l3.setForeground(Color.BLACK);
		panel.add(l3);
		
		tx2 =  new JTextField();
		tx2.setBounds(150,210,100,30);
		panel.add(tx2);
		
		l4 = new JLabel("Section :");
		l4.setBackground(Color.CYAN);
		l4.setOpaque(true);
		l4.setBounds(50,260,100,30);
		l4.setForeground(Color.BLACK);
		panel.add(l4);
		
		tx4 = new JTextField();
		tx4.setBounds(150,260,100,30);
		panel.add(tx4);
		
		l7 = new JLabel("Age :");
		l7.setBackground(Color.CYAN);
		l7.setOpaque(true);
		l7.setBounds(50,310,100,30);
		l7.setForeground(Color.BLACK);
		panel.add(l7);
		
		tx7 = new JTextField();
		tx7.setBounds(150,310,100,30);
		panel.add(tx7);



	    b1 = new JButton("ADD ");
		b1.setBounds(50,400,100,50);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.WHITE);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		l4 = new JLabel(" Remove Student");
		l4.setBounds(300,100,150,40);
		l4.setBackground(Color.CYAN);
		l4.setOpaque(true);
		l4.setForeground(Color.BLACK);
		panel.add(l4);
		
		l5 = new JLabel("Student Name :");
		l5.setBounds(300,160,100,30);
		l5.setBackground(Color.CYAN);
		l5.setOpaque(true);
		l5.setForeground(Color.BLACK);
		panel.add(l5);
		
		tx3 = new JTextField();
		tx3.setBounds(400,160,100,30);
		panel.add(tx3);
		
		b2 = new JButton("REMOVE");
		b2.setBounds(300,400,150,50);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		l6 = new JLabel("Search Student: ");
		l6.setBounds(700,100,100,30);
		l6.setBackground(Color.CYAN);
		l6.setOpaque(true);
		l6.setForeground(Color.BLACK);
		panel.add(l6);
		
		tx5 = new JTextField();
		tx5.setBounds(800,100,100,30);
		panel.add(tx5);
		
		searchBtn = new JButton("Search");
		searchBtn.setBounds(700,180,150,50);
		searchBtn.setBackground(Color.BLUE);
		searchBtn.setForeground(Color.WHITE);
		searchBtn.addMouseListener(this);
		searchBtn.addActionListener(this);
		panel.add(searchBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(700,400,70,50);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		
		img = new ImageIcon("3.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,1580,980);
		panel.add(imgLabel);
		this.add(panel);
		
		
		
		
	}
	
	public void addStudent(String a)
	{
		int flag = 0;
		st = new Student1(a);
		for(int i = 0; i<student.length;i++)
		{
			if(student[i] == null)
			{
				student[i]=st;
				flag = 1;
				break;
			}
		}
		if(flag == 1){JOptionPane.showMessageDialog(null,"Insertion Complete");}
		else{JOptionPane.showMessageDialog(null,"Insertion Failed!!!");}
	}
	public void removeStudent(String a)
	{
		int flag = 0;
		try{
		for(int i=0; i<student.length; i++)
		{
			if(student[i].getName().equals(a))
			{
				student[i] = null;
				flag = 1;
				break;
			}
		}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception : Null Pointer Exception");
		}
		if(flag == 1){JOptionPane.showMessageDialog(null, "Removed Complete!");}
		else {JOptionPane.showMessageDialog(null, "Unsuccesful operation!!!");}
	}
	public void getStudent(String a)
	{
		Student1 st1 = null;
		for(int i=0;i<student.length;i++)
	{
		if(student[i]!=null)
		{
			if(student[i].getName().equals(a))
			{
				st1=student[i];
				break;
			}
		}
	}
	if(st1!=null)
	{
		showMessageDialog(null,"Student founded!");
	}
	else
	{
		showMessageDialog(null,"Sorry!!Can not found Student");
	}
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){} 
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.WHITE);
			
		}
	
	
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.GREEN);
			b1.setForeground(Color.BLACK);
		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1 = tx1.getText();
		String s2 = tx3.getText();
		String s3 = tx5.getText();
		if(ae.getSource() == b1)
		{
			addStudent(s1);
		}
		else if (ae.getSource() == b2)
		{
			removeStudent(s2);
		}
		else if(ae.getSource()==searchBtn)
	{
		getStudent(s3);
	}
		else if (ae.getSource() == backBtn)
		{
		sl.setVisible(true);
        this.setVisible(false);		
		}
		else{}
	}
	
	
	
	
	
	
	
}