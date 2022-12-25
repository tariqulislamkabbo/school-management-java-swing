import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Selection extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img1;
	JLabel hLabel , imgLabel1 ;
	JButton tBtn,stBtn,backBtn;
	JPanel panel1;
	Color myColor1;
	Font myFont1;
	Login lg;
	
	public Selection(String s1,Login lg)
	{
		super("WELCOME TO SELECTION PAGE");
		this.setSize(1580,1051);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.lg = lg;
		
		
		myColor1 = new Color(210,210,210);
		myFont1 = new Font("Cambria",Font.PLAIN,22);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(myColor1);
		
		hLabel = new JLabel("Select An Option : ");
		hLabel.setBounds(680,180,300,50);
		hLabel.setForeground(Color.BLACK);
		hLabel.setFont(myFont1);
		panel1.add(hLabel);
		
		tBtn = new JButton("A.TEACHER");
		tBtn.setBounds(680,250,150,50);
		tBtn.setBackground(Color.CYAN);
		tBtn.addMouseListener(this);
		tBtn.addActionListener(this);
		panel1.add(tBtn);
		
		
		stBtn = new JButton("B.STUDENT");
		stBtn.setBounds(680,350,150,50);
		stBtn.setBackground(Color.CYAN);
		stBtn.addMouseListener(this);
		stBtn.addActionListener(this);
		panel1.add(stBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(720,450,70,30);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel1.add(backBtn);
		//ImageIcon img1;
		img1 = new ImageIcon("1.jpg");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(0,0,1500,1050);
		panel1.add(imgLabel1);
		
		this.add(panel1);
		this.add(panel1);
	}	
	public void mouseClicked(MouseEvent me1){}
	    public void mousePressed(MouseEvent me1){}
	    public void mouseReleased(MouseEvent me1){}
	    public void mouseEntered(MouseEvent me1)
		{
			if(me1.getSource() == tBtn)
			{
				tBtn.setBackground(Color.GREEN);
				tBtn.setForeground(Color.WHITE);
			}
			else if(me1.getSource() == stBtn)
			{
				stBtn.setBackground(Color.GREEN);
				stBtn.setForeground(Color.WHITE);
			}
			else if (me1.getSource() == backBtn)
			{
				backBtn.setBackground(Color.RED);
				backBtn.setForeground(Color.WHITE);
				
			}
			else
			{
				
			}
		}
        public void mouseExited(MouseEvent me1)
		{
			if(me1.getSource() == tBtn)
			{
				tBtn.setBackground(Color.CYAN);
				tBtn.setForeground(Color.BLACK);
			}
			else if (me1.getSource() == stBtn)
			{
				stBtn.setBackground(Color.CYAN);
				stBtn.setForeground(Color.BLACK);
			}
			else if (me1.getSource() == backBtn)
			{
				backBtn.setBackground(Color.GREEN);
				backBtn.setForeground(Color.BLACK);
			}
			else{}
		}
		public void actionPerformed(ActionEvent af)
		{
		String command = af.getActionCommand();
		if(tBtn.getText().equals(command))
		{
			Teacher te = new Teacher(this);
			te.setVisible(true);
			this.setVisible(false);
			
		}
		else if(stBtn.getText().equals(command))
		{
			Student st1 = new Student(this);
			st1.setVisible(true);
			this.setVisible(false);
			
		}
		else if(backBtn.getText().equals(command))
		{
			
			lg.setVisible(true);
			this.setVisible(false);
		}
		else{}
        
		}		
		
		
			
}