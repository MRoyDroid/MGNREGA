package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Welcome_Gpm extends JFrame{
	
	private JLabel l1,l2,l3,l4,l5;
	private JButton cemp,vemp,aemp,demp,wemp,uemp,vallemp,srchemp;
	
	public Welcome_Gpm()
	{
		super("                                                                       GOVERNMENT OF INDIA");
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(7,2));
		
		Font f = new Font("Batang",Font.BOLD,40);
		
		l1 = new JLabel("       WELCOME");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		l3 = new JLabel("TO G.P.M.");
		l3.setFont(f);
		l3.setForeground(Color.BLUE);
		
		
		Font f1 = new Font("Batang",Font.BOLD,20);
		
		l2 = new JLabel("                           100 days of");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l4 = new JLabel("paid works");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		l5 = new JLabel(" ");
		
		cemp = new JButton("CREATE EMPLOYEE");
		vemp = new JButton("VIEW  ALL  EMPLOYEE  DETAILS UNDER A PROJECT");
		aemp = new JButton("VIEW MY PROJECTS");
		demp = new JButton("DELETE AN EMPLOYEE ");
	//	wemp = new JButton("WAGES OF EMPLOYEE");
		uemp = new JButton("UPDATE AN EMPLOYEE");
		vallemp=new JButton("VIEW ALL CREATED EMPLOYEE");
		srchemp=new JButton("SEARCH AN EMPLOYEE");
		cemp.addActionListener((e)->
		{
			new Create_Emp_Page("");
		}
				);
		
		vemp.addActionListener((e)->
		{
			new EMP_Search_underaPROJ_Page1();
		}
				);
		
		aemp.addActionListener((e)->
		{
			
			new Proj_Search_Page1();
			
		}
				);
		
		
		
		demp.addActionListener((e)->
		{
			
			new 	EMP_Delete_Page1();
			
		}
				);
	

		uemp.addActionListener((e)->
		{
			new Update_emp("");

		}
				);
		
	
		vallemp.addActionListener((e)->
		{
			new EMP_Search_underaPROJ_Page1();
		}
				);
		
		
		srchemp.addActionListener((e)->
		{
			new EMP_Search_Page1();
		}
				);
		
		c.add(l1);c.add(l3);
		c.add(l2);c.add(l4);
		c.add(cemp);c.add(vemp);
		c.add(aemp);c.add(demp);
		c.add(vallemp);c.add(uemp);
		c.add(l5);c.add(srchemp);
		
	
		
		setSize(700,300);
		setLocation(20,20);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
		
	}
/*	public static void main(String argu[])
	{
		new Welcome_Gpm();
	}
*/
}
