package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Gmp1_Page extends JFrame {
	private JLabel l1,l2,l3,l4,l6,l7;
	private JTextField bid;
	private JButton bloging;
	private JPasswordField bpass;
	private final JMenu jmenu,jmenu2,jmenu3;
	private final JMenuBar jmenubar;
	public Gmp1_Page(String s1)
	{
		
		super(s1);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(10,3));
		
		bid=new JTextField(20);
		bpass = new JPasswordField(20);
		Font f = new Font("Batang",Font.BOLD,18);
	
		l4=new JLabel("             GOVERNMENT");
		l4.setFont(f);
		l4.setForeground(Color.BLACK);
		
		l6=new JLabel("OF INDIA");
		l6.setFont(f);
		l6.setForeground(Color.BLACK);
		
		
		l1=new JLabel("       LOGIN FOR GRAM");
		l1.setFont(f);
		l1.setForeground(Color.blue);
		
		l7=new JLabel("PANCHAYET MEMBER");
		l7.setFont(f);
		l7.setForeground(Color.blue);
		
		Font f1 = new Font("Batang",Font.BOLD,17);
		l2=new JLabel("USER ID");
		l2.setFont(f1);
		l2.setForeground(Color.red);
		
		l3=new JLabel("PASSWORD");
		l3.setFont(f1);
		l3.setForeground(Color.red);
		
		
		
		
		bloging = new JButton("LOGIN");
		bloging.addActionListener((e)->
	
		{
			//JOptionPane.showMessageDialog(bloging,"please wait while we are processing");
			
			
                int idfoundpos = Search_GPM_Result_Page.searchId(bid.getText().trim());
                int passfound=Search_GPM_Page_Passwrd.searchpass(bpass.getText().trim());
                if(idfoundpos >= 0 && passfound>=0)
                {
              	  new Welcome_Gpm();
                }
                else
                {
              	  JOptionPane.showMessageDialog(this, "Invalid ID or PASSWORD..PLEASE ENTER ANOTHER ID...");
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
		
		jmenu2 = new JMenu("PROJECT");
		jmenu2.setMnemonic(KeyEvent.VK_P);
		
		jmenu3 = new JMenu("CONTECT US");
		jmenu3.setMnemonic(KeyEvent.VK_C);
		
		jmenubar.add(jmenu);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);
		
		setJMenuBar(jmenubar);
		
		
		setSize(500,350);
		setLocation(25,25);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		c.setBackground(Color.YELLOW);
	}

	public static void main(String argu[])
	{
		new Gmp1_Page("");
	}
}


