package pack1;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Afterlogin_BDO extends JFrame
{
	private JLabel l1,l2,l3,l4;
	private JButton cpro,vpro,cgp,emp,subm,view_allemp_under_proj,search_gpm,del_gpm,viewprojundergpm,updategpm;
	
	
	Project_Create_BDO_Registration r;

	
	public Afterlogin_BDO()
	{
		super("MGNAREGA");
		
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(6,2));
		
		
		
		view_allemp_under_proj=new JButton("VIEW ALL EMPLOYEE UNDER A PROJECT");
		cpro = new JButton("CREATE PROJECT");
		vpro = new JButton("VIEW LIST OF PROJECT");
		cgp = new JButton("CREATE GRAM PANCHAYET");
		//vagp = new JButton("VIEW ALL PROJECT");
	//	allopro = new JButton("ALLOCATE PROJECT TO G.P.");
		search_gpm=new JButton("SEARCH A GPM");
		del_gpm=new JButton("DELETE A GPM");
		updategpm=new JButton("UPDATE A GPM");
		viewprojundergpm=new JButton("VIEW ALL PROJECT UNDER A GPM");
		
		vpro.addActionListener((e)->
		{
		    new	Project_Create_BDO_ShowAll();
		}
		);
		
		
		
		del_gpm.addActionListener((e)->
		{
			new Delete_GMP_Page1();
		}
		);
		
		
		search_gpm.addActionListener((e)->
		{
		    new	Search_GPM_Page1();
		}
		);
		emp= new JButton("VIEW ALL EMPLOYEES");
		emp.addActionListener((e)->
				{
					new EMP_ShowALL();
				}
				);
		 
		subm = new JButton("VIEW ALL GPM");
		
		subm.addActionListener((e) ->
		                           {
		                           	   new ShowAll_GPM();
		                           }
								  );
			

		cpro.addActionListener((e)->
				{
					
					new CreateProject_BDO("");
				}
				);
	
		cgp.addActionListener((m)->
		       {
			         new Create_GMP("");
		       }
				);
		
		viewprojundergpm.addActionListener((e)->
		{
			
			new Proj_Search_Page1();
		}
		);

		view_allemp_under_proj.addActionListener((e)->
		{
			new EMP_Search_underaPROJ_Page1();
			
		}
		);
	
		updategpm.addActionListener((e) -> 
		{
			
			new UpdateGPM("UPDATE GPM");

});

		
				
		
		 Font f=new Font("Batang",Font.BOLD,30);
		 l1=new JLabel("        WELCOME TO ");
		 l1.setFont(f);
	     l1.setForeground(Color.RED);
		
		
	     l2=new JLabel("B.D.O. PAGE");
		 l2.setFont(f);
	     l2.setForeground(Color.RED);
		
		 l3=new JLabel("");
		 l4=new JLabel("");
		 
		 
		 c.add(l1);c.add(l2); 
		 c.add(cpro);c.add(vpro); 
	     c.add(cgp);c.add(subm);
	     c.add(emp); c.add(view_allemp_under_proj);
	     c.add(search_gpm); c.add(del_gpm);
	     c.add(updategpm);c.add(viewprojundergpm);
	     	
	     
	     setSize(700,400);
		 setLocation(20,20);
		 setResizable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		c.setBackground(Color.YELLOW);
	}


	public static void main(String[] args) 
	{
		new Afterlogin_BDO();


	}

}
