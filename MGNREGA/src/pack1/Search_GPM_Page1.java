package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
//import java.pack1.Create_GPM;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Search_GPM_Page1 extends JFrame
{
	private JLabel l1,l3,l5,l7;
	private JTextField proid,gpmid;
	private JButton sub,rst;
	public Search_GPM_Page1()
	{
		super(" ");
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		
		 
		  
		  Registration_GPM r;

	//	proid = new JTextField(20);
		gpmid = new JTextField(20);
		
		
		
		
		
		
		
		
		sub = new JButton("SEARCH");
		sub.addActionListener((e)->
		{
			JOptionPane.showMessageDialog(sub,"please wait while we are processing");
			
			
                int idfoundpos = Search_GPM_Result_Page.searchId(gpmid.getText().trim());
                if(idfoundpos >= 0)
                {
              	  new Search_GPM_Result_Display_Page(idfoundpos);
                }
                else
                {
              	  JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
                }
         }
			 );

           
		

		
		
		
		
		rst = new JButton("RESET");
		rst.addActionListener((e)->
		{
			reset_all();
		}
		);
		Font f= new Font("arial",Font.BOLD,25);
		l1=new JLabel("SEARCH GPM");
		l1.setFont(f);
		l1.setForeground(Color.GRAY);
		
		Font f1 = new Font("arial",Font.PLAIN,15);
	    l3=new JLabel("PROJECT ID ");
		l3.setFont(f1);
	    l3.setForeground(Color.BLUE);
	    
	    l5=new JLabel("GPM ID ");
		l5.setFont(f1);
	    l5.setForeground(Color.BLUE);
	    
	    l7=new JLabel("GPM ID ");
		l7.setFont(f1);
	    l7.setForeground(Color.BLUE);
	    
	    c.add(l1);c.add(new JLabel(""));
	//    c.add(l3);c.add(proid);
	    c.add(l5);c.add(gpmid);
	    
	    c.add(rst);c.add(sub);
		
		setSize(400,200);
		setLocation(20,20);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	public void reset_all()
	{
		dispose();
		new Search_GPM_Page1();
	}
	/*public static void main(String arg[])
	{
		new Aas_Emp();
	}*/
	

}
