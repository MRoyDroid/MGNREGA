package pack1;

import java.awt.Color;
import javax.swing.JMenuItem;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;



import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
//import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BDO1_Page extends JFrame {
	
	private JLabel l1,l2,l3,l4,l6,l7;
	private JTextField bid;
	private JButton bloging;
	private JPasswordField bpass;
	private final JMenu jmenu,jmenu2,jmenu3;
	private final JMenuBar jmenubar;

    private final JMenuItem jmenupreviouspage;
		

	public BDO1_Page(String s1)
	{
		
		super(s1);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(10,2));
		
		bid=new JTextField(20);
		bpass = new JPasswordField(20);
		Font f = new Font("Batang",Font.BOLD,18);
		
		l4=new JLabel("              GOVERNMENT");
		l4.setFont(f);
		l4.setForeground(Color.BLACK);
		
		l6=new JLabel("OF INDIA");
		l6.setFont(f);
		l6.setForeground(Color.BLACK);
		
		
		l1=new JLabel("        LOGIN FOR BLOCK");
		l1.setFont(f);
		l1.setForeground(Color.blue);
		
		l7=new JLabel("DEVLOPMENT OFFICER");
		l7.setFont(f);
		l7.setForeground(Color.blue);
		
		Font f1 = new Font("Batang",Font.BOLD,17);
		l2=new JLabel(" ENTER USER ID");
		l2.setFont(f1);
		l2.setForeground(Color.red);
		
		l3=new JLabel(" ENTER PASSWORD");
		l3.setFont(f1);
		l3.setForeground(Color.red);
		
		
		bloging = new JButton("LOGIN");
		bloging.addActionListener((e)->
		{
			if(bid.getText().trim().equals("admin") && bpass.getText().trim().equals("pass"))
			{
				new Afterlogin_BDO();
			}
			
			else
			{
				JOptionPane.showMessageDialog(bloging,"INCORRECT USER ID OR PASSWORD");
			}
}
);

         
		
		c.add(l4);c.add(l6);
		c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(  l1);c.add(l7);
		c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(l2);c.add(bid);
		c.add(l3);c.add(bpass);
		c.add(new JLabel(""));c.add(bloging);
		
		jmenubar = new JMenuBar();
		jmenu = new JMenu("HOME");
		jmenu.setMnemonic(KeyEvent.VK_H);
		jmenu.setToolTipText("GO BACK");
	   
		jmenupreviouspage = new JMenuItem("BACK TO PREVIOUS PAGE");
		jmenupreviouspage.setMnemonic(KeyEvent.VK_P);
		jmenupreviouspage.setToolTipText("");
		jmenupreviouspage.addActionListener((e) ->
                                          {
        	                               new  F_Page("");
           
                                          }

	);
		
		jmenu2 = new JMenu("PROJECT");
		jmenu2.setMnemonic(KeyEvent.VK_P);
	
		jmenu3 = new JMenu("CONTACT US");
		jmenu3.setMnemonic(KeyEvent.VK_C);
		
		jmenubar.add(jmenu);
		jmenu.add(jmenupreviouspage);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);
		
		setJMenuBar(jmenubar);
		
		
		
		setSize(500,360);
		setLocation(25,25);
		setResizable(false);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		c.setBackground(Color.YELLOW);
	}

	


	public static void main(String argu[])
	{
		new BDO1_Page("                                A GOVERNMENT OF INDIA PROJECT");
	}
}
