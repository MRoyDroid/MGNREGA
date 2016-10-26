package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Wages_Emp extends JFrame {
	
	private JLabel l1,l2,l3;
	private TextField emp;
	private JButton l4;
	public Wages_Emp()
	{
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		Font f = new Font("Batang",Font.BOLD,30);
		
	    l1 = new JLabel("GOVERNMENT OF INDIA");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1 = new Font("Batang",Font.BOLD,20);
		
		 l2 = new JLabel("100 days of paid work");
		 l2.setFont(f1);
		 l2.setForeground(Color.RED);

		 Font f2 = new Font("Batang",Font.BOLD,20);
		 
		 l3 = new JLabel("WAGES OF EMPLOYEE");
		 l3.setFont(f2);
		 l3.setForeground(Color.BLACK);
		 
		 l4 = new JButton("SUBMIT");
		
		emp = new TextField();
		
		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(new JLabel(""));
		c.add(l3);c.add(emp);
		c.add(new JLabel(""));c.add(l4);
		
		
		setSize(500,250);
		setLocation(25,25);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String argu[])
	{
		new Wages_Emp();
	}

}
