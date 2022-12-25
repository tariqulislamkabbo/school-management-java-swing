import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img;
	JLabel loginLb,passLb,success,imgLabel,name,pass;
	JTextField loginTF;
    JPasswordField passWord;
    JButton loginBtn, exitBtn;
    JPanel panel;
	Color myColor;
	Font myFont,myFont1;
public Login()
{
	super("AIUB");
	this.setSize(1580,1051);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		myFont1 = new Font("Cambria", Font.PLAIN, 12);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.YELLOW);
		
		name = new JLabel("Welcome to AIUB");
		name.setBounds(400,180,360,80);
		name.setForeground(Color.BLUE);
		name.setFont(myFont);
		panel.add(name);
		
		loginLb = new JLabel("User Name : ");
		loginLb.setBounds(400, 280, 180, 30);
		loginLb.setFont(myFont);
		panel.add(loginLb);
		
		loginTF = new JTextField ();
		loginTF.setBounds(580, 280, 100, 30);
		panel.add(loginTF);
		
		passLb = new JLabel("Password   :");
		passLb.setBounds(400, 330, 180, 30);
		passLb.setFont(myFont);
		panel.add(passLb);
		
		pass = new JLabel("*8 characters or more needed");
		pass.setBounds(560, 365, 280, 12);
		pass.setFont(myFont1);
		pass.setForeground(Color.WHITE);
		panel.add(pass);
		
		passWord = new JPasswordField();
		passWord.setBounds(580,330,100,30);
		passWord.setEchoChar('*');
		panel.add(passWord);
		
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(400, 400, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		exitBtn = new JButton("Leave");
		exitBtn.setBounds(520, 400, 80, 30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
		
		
		img = new ImageIcon("school.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,1580,1051);
		panel.add(imgLabel);
		this.add(panel);
}
		public void mouseClicked(MouseEvent me){}
	    public void mousePressed(MouseEvent me){}
	    public void mouseReleased(MouseEvent me){}
	    public void mouseEntered(MouseEvent me)
		{
			
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{
		
			String s1 = loginTF.getText();
			String s2 = passWord.getText();
			try
			{
				if(s2.length()<8) 
				{
					throw new PassException();
				}
			}
				catch (PassException pe)
            {
                showMessageDialog(null, "Password needs to be atleast 8 characters.");
            }
			
			if((s1.equals("Kabbo") || s1.equals("Jakaria") 
				||s1.equals("Soham") || s1.equals("Rabbi")) && s2.equals("kabbo123"))
			{
			
				//showMessageDialog(null, "valid Username and password.");
			
				Selection sf = new Selection(s1, this);
				sf.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				showMessageDialog(null, "Invalid Username or password!!");
			}
		}
        else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		
		else
		{
			
		}
	}		
	
	
}