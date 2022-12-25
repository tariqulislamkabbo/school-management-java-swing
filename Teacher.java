import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;

public class Teacher extends JFrame implements ActionListener, MouseListener
{
	ImageIcon img;
	JLabel hLabel,l1,l2,l3,l4,l5,l6,l7,tLabel,imgLabel ;
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7;
	JButton b1,b2,b3,backBtn,searchBtn;
	JPanel panel;
	Color myColor;
	Font myFont;
	Selection sl;
	Account1 accounts [] = new Account1[3] ;
	Account1 acc;
	
	public Teacher(Selection sl)
	{
		super ("Teacher Operations");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this. sl = sl;
		myColor = new Color(210,210,210);
		myFont = new Font("Cambria",Font.PLAIN,22);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		hLabel = new JLabel("MANAGEMENT SECTION");
		hLabel.setBounds(50,10,300,100);
		hLabel.setForeground(Color.BLUE);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		

		l1 = new JLabel("Add new Teacher");
		l1.setBounds(50,100,150,50);
		l1.setBackground(Color.GREEN);
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		
		l2 = new JLabel("Teacher Name: ");
		l2.setBounds(50,150,100,50);
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		tx1 = new JTextField("");
		tx1.setBounds(150,165,100,30);
		panel.add(tx1);
		
		l3 = new JLabel("Subject :");
		l3.setBounds(50,200,100,50);
		l3.setForeground(Color.BLACK);
		panel.add(l3);
		
		tx2 =  new JTextField();
		tx2.setBounds(150,215,100,30);
		panel.add(tx2);


		l7 = new JLabel("Salary :");
		l7.setBounds(50,250,100,50);
		l7.setForeground(Color.BLACK);
		panel.add(l7);
		
		tx7 =  new JTextField();
		tx7.setBounds(150,265,100,30);
		panel.add(tx7);
		
		b1 = new JButton("ADD ");
		b1.setBounds(70,320,100,50);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.WHITE);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		l4 = new JLabel("Remove Teacher");
		l4.setBounds(300,100,150,50);
		l4.setBackground(Color.BLUE);
		l4.setForeground(Color.BLACK);
		panel.add(l4);
		
		l5 = new JLabel("Teacher Name :");
		l5.setBounds(300,150,100,50);
		l5.setForeground(Color.BLACK);
		panel.add(l5);
		
		
		tx3 = new JTextField("");
		tx3.setBounds(400,160,100,30);
		panel.add(tx3);
		
		b2 = new JButton("REMOVE");
		b2.setBounds(300,280,150,50);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		l6 = new JLabel("Search Teacher: ");
		l6.setBounds(500,100,200,50);
		l6.setForeground(Color.BLACK);
		panel.add(l6);
		
		tx4 = new JTextField();
		tx4.setBounds(600,110,100,30);
		panel.add(tx4);
		
		searchBtn = new JButton("Search");
		searchBtn.setBounds(600,180,150,50);
		searchBtn.setBackground(Color.BLUE);
		searchBtn.setForeground(Color.WHITE);
		searchBtn.addMouseListener(this);
		searchBtn.addActionListener(this);
		panel.add(searchBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(600,280,70,50);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		
		img = new ImageIcon("2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,1200,675);
		panel.add(imgLabel);
		this.add(panel);
		
		
		
		
	}
	
	public void addTeacher(String a)
	{
		int flag = 0;
		acc = new Account1(a);
		for(int i = 0; i<accounts.length;i++)
		{
			if(accounts[i] == null)
			{
				accounts[i]=acc;
				flag = 1;
				break;
			}
		}
		if(flag == 1){JOptionPane.showMessageDialog(null,"Insertion Complete");}
		else{JOptionPane.showMessageDialog(null,"Insertion Failed!!!");}
	}
	public void removeTeacher(String a)
	{
		int flag = 0;
		try{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i].getAccountHolderName().equals(a))
			{
				accounts[i] = null;
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
	public void getTeacher(String a)
	{
		Account1 t1 = null;
		for(int i=0;i<accounts.length;i++)
	{
		if(accounts[i]!=null)
		{
			if(accounts[i].getAccountHolderName().equals(a))
			{
				t1=accounts[i];
				break;
			}
		}
	}
	if(t1!=null)
	{
		showMessageDialog(null,"Teacher founded!");
	}
	else
	{
		showMessageDialog(null,"Can not found Teacher");
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
		String s3 = tx4.getText();
		if(ae.getSource() == b1)
		{
			addTeacher(s1);
		}
		else if (ae.getSource() == b2)
		{
			removeTeacher(s2);
		}
		else if(ae.getSource()==searchBtn)
	{
		getTeacher(s3);
	}
		else if (ae.getSource() == backBtn)
		{
		sl.setVisible(true);
        this.setVisible(false);		
		}
		else{}
	}
	
	
	
	
	
	
	
}
