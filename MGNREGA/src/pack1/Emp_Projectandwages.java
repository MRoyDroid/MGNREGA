package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Emp_Projectandwages extends JFrame {
	private JLabel l1,l2,l3,l4,l5;
	private JButton jreset,jsubmit;
	private TextField tne,twa;
	
	public Emp_Projectandwages()
	{
		Container c= getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		Font f = new Font("Batang",Font.BOLD,28);
		
		l1=new JLabel("    GOVERNMENT");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		l5=new JLabel("OF INDIA");
		l5.setFont(f);
		l5.setForeground(Color.BLUE);
		
		Font f1 = new Font("Batang",Font.BOLD,15);
		
		l2=new JLabel("   100 days of paid work");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		Font f3 = new Font("Batang",Font.BOLD,15);
		
		l3=new JLabel("   TOTAL NO. OF EMPLOYEE");
		l3.setFont(f3);
		l3.setForeground(Color.BLACK);
		
		l4=new JLabel("   WAGES OF EMPLOYEE");
		l4.setFont(f3);
		l4.setForeground(Color.BLACK);
		
		tne= new TextField();
		twa= new TextField();
		
		jreset= new JButton("RESET");
		jreset.addActionListener((e) ->
		{
			resetAll();
		}
		);

		jsubmit= new JButton("SUBMIT");
		jsubmit.addActionListener((e) ->
		{
			  JOptionPane.showMessageDialog(this,"SUCESSFULLY SUBMITTED");
			

			}
			);
		
		c.add(l1);c.add(l5);
		c.add(l2);c.add(new JLabel(""));
		c.add(l3);c.add(tne);
		c.add(l4);c.add(twa);
		c.add(jreset);c.add(jsubmit);
		
		
		setSize(572,200 );
		setLocation(20,20);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//c.setBackground(Color.green);
	}
	void resetAll()
	   {
		   dispose();
		   new Emp_Projectandwages();
		   
	   }

	public static void main(String argu[]){
		
		new Emp_Projectandwages();
		
	}

}
