package pack1;

	


	import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

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






public class Empdetails_Page1 extends JFrame
	{
		  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
		  private JTextField tid;
		 
		   private JButton submit, bclearall;
		
		  
		
		  private final JMenuBar jmenubar;
	      private final JMenu jmenu,jmenu1,jmenu2;
	    //  private final JMenuItem jmenuregister,jmenushowall,jmenusearch,jmenuupdate;
			
		  public Empdetails_Page1(String title)
		  {
			  super(title);
		  
			  Container c=getContentPane();
			  c.setLayout(new GridLayout(10,2));
					
			  tid=new JTextField(20);
			  
		
					
		    submit=new JButton("ENTER");
			submit.addActionListener((e) ->
	            							{
	            							  JOptionPane.showMessageDialog(this,"PLEASE WAIT,WE ARE PROCESSING");
	            							
	           	
	            							}
											);
			
				
				bclearall = new JButton("Reset All");
				bclearall.addActionListener((e) ->
	            							{
	            								resetAll();
	            							}
											);

			
				
			
				
				Font f=new Font("Arial",Font.BOLD,20);
				l1=new JLabel("PLEASE ENTER PROJECT ID FOR ALL EMPLOYEE DETAILS");
	            l1.setFont(f);
				l1.setForeground(Color.BLUE);
					
				Font f1=new Font("comic sans ms",Font.BOLD,14);
				l2=new JLabel("PROJECT ID");
				l2.setFont(f1);
				l2.setForeground(Color.RED);
					
	

				c.add(l1);c.add(new JLabel(""));
				c.add(l2);c.add(tid);
			
				c.add(bclearall);
				c.add(submit);
				
				
				
			                
			    jmenubar = new JMenuBar();
			                
			    jmenu = new JMenu("OPTION");
			    jmenu.setMnemonic(KeyEvent.VK_O);
			    
			    jmenu1 = new JMenu("EDIT");
			    jmenu1.setMnemonic(KeyEvent.VK_E);
			    
			    jmenu2 = new JMenu("BACK");
			    jmenu2.setMnemonic(KeyEvent.VK_B);
			    jmenu2.setToolTipText("Back to previous page");
			     
			                
			    
			     
			                
			     jmenubar.add(jmenu);
			     jmenubar.add(jmenu1);
			     jmenubar.add(jmenu2);
			     
			     setJMenuBar(jmenubar);
			                
				 setSize(460, 500);
				 setLocation(200,200);
				 //setResizable(false);
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setVisible(true);	
		   }

		  
		 void resetAll()
		   {
			   dispose();
			   new Empdetails_Page1("Register gram panchayat member...");
			   
		   }
		   



/*public static void main(String args[])
{
	 new Empdetails_Page1("Register an employee...");	
}*/
}