package pack1;

import java.awt.event.KeyEvent;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;


import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JFrame;
//import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class F_Page extends JFrame
{
	
	private JLabel l1,l2,l3,l4,l5;
	private JButton submit1;
	private final JMenuBar jmenubar;
	private JRadioButton rbdo,rgpm;
	private final JMenu jmenu,jmenu1,jmenu2,jmenu3;
	

	public F_Page(String s1)
	{ 
		super(s1);
		Container c= getContentPane();
		
		c.setLayout(new GridLayout(15,0));
		
		rbdo = new JRadioButton("BLOCK DEVLOPMENT OFFICER");
		rgpm = new JRadioButton("GRAM PANCHAYAT MEMBER");
		
		ButtonGroup rg= new  ButtonGroup();
		rg.add(rbdo);
		rg.add(rgpm);
		
		JPanel ipanel = new JPanel();
		ipanel.add(rbdo);
		ipanel.add(rgpm);
		
		submit1 = new JButton("SUBMIT");
		
		submit1.addActionListener((e)->
				{
					checkBdoorGram();
				}
				);
		c.add(submit1);
		submit1.setBackground(Color.cyan);
		
		
		Font f = new Font("Batang",Font.BOLD,30);
		l1 = new JLabel("  WELCOME TO MGNREGA");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		
		Font f1 = new Font("Batang",Font.BOLD,15);
		Font f2 = new Font("Batang",Font.BOLD,12);
		
		l5 = new JLabel(" The Mahatma Gandhi National Rural Employment Guarantee Act");
		l5.setFont(f2);
		l5.setForeground(Color.red);
		
		l2 = new JLabel("                      100 DAYS OF PAID WORK");
		l2.setFont(f1);
		l2.setForeground(Color.BLACK);
		
		l3 = new JLabel("                prestented by Government of India");
		l3.setFont(f1);
		l3.setForeground(Color.BLACK);
		
		l4 = new JLabel("                                OPTIONS");
		l4.setFont(f1);
		l4.setForeground(Color.BLACK);
		
		c.add(new JLabel(""));c.add(l1);
		c.add(l5);
		c.add(new JLabel(""));c.add(l2);
		c.add(l4);
		c.add(new JLabel(""));c.add(ipanel);
		c.add(submit1);
		
		
		
		c.add(l3);
		
		
		
		jmenubar = new JMenuBar();
		
	    jmenu = new JMenu("HOME");
		jmenu.setMnemonic(KeyEvent.VK_H);
		
		jmenu1 = new JMenu("ABOUT US");
		jmenu1.setMnemonic(KeyEvent.VK_A);
		
		jmenu2 = new JMenu("PROJECT");
		jmenu2.setMnemonic(KeyEvent.VK_P);
		
		jmenu3 = new JMenu("CONTECT US");
		jmenu3.setMnemonic(KeyEvent.VK_C);
		
		jmenubar.add(jmenu);
		jmenubar.add(jmenu1);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);
		
		setJMenuBar(jmenubar);
		
		setSize(472,525);
		setLocation(25,25);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		c.setBackground(Color.yellow);
	}
	
	
	public void checkBdoorGram()
	
	{
		
		if(rbdo.isSelected())
		{
			new BDO1_Page("");
		}
		else if(rgpm.isSelected())
		{
			new Gmp1_Page("");
		}
		else
		{
			JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY OPTION");
		}
	}
	
	public static void main(String argu[])
	{
		new F_Page("                                A GOVERNMENT OF INDIA PROJECT");
	}
}
