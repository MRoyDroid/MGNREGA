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




public class Create_GMP  extends JFrame
	{
		  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
		  private JTextField tid,tname,tmobno;
		  private JPasswordField tpass;
		  private JTextArea tadd;
		  private JComboBox day,month,year;
		
		  private JRadioButton rmale,rfemale;
		  private JButton bcreate, bclearall;
		
				
		  private final JMenuBar jmenubar;
	      private final JMenu jmenu;//, jmenu1;
	      private final JMenuItem jmenuregister,jmenushowall,jmenusearch,jmenuupdate;
	      
	      
		  ArrayList<Registration_GPM> userlist;
		  
		  Registration_GPM r;
		

			
		  public Create_GMP(String title)
		  {
			  super(title);
		  
			  Container c=getContentPane();
			  c.setLayout(new GridLayout(9,2));
					
			  tid=new JTextField(20);
			  tid.setToolTipText(" MIN 4 & MAX 7 letters");
			  tpass=new JPasswordField(20);
			  tpass.setToolTipText("enter any alphabet or 0-9 or speial character(_@#$&");
			  tname = new JTextField(20);
			  tname.setToolTipText("ALPHABETS ONLY");
			  tmobno = new JTextField(20);
			  tmobno.setToolTipText(" 10 NUMERIC VALUES");
			  tadd=new JTextArea(5,20);
			  JScrollPane tapan=new JScrollPane(tadd);
					
			 
			 				
			  rmale=new JRadioButton("Male");
			  rfemale=new JRadioButton("Female");
			 
			   ButtonGroup rgroup=new ButtonGroup();
			   rgroup.add(rmale);
			   rgroup.add(rfemale);
			   
			   JPanel gpanel=new JPanel();
			   gpanel.add(rmale);
			   gpanel.add(rfemale);
				
			   String dvalue[]=new String[31];
			   for(int i=0;i<=30;i++)
			   {
					dvalue[i]=String.valueOf(i+1);
			   }
			   day=new JComboBox(dvalue);
					
			   String mvalue[]=new String[12];
			   for(int i=0;i<=11;i++)
			   {
					mvalue[i]=String.valueOf(i+1);
			   }
			   month=new JComboBox(mvalue);
					
			   String yvalue[]=new String[12];
			   int cnt=0;
			   for(int i=2000;i<=2011;i++)
			   {
					yvalue[cnt]=String.valueOf(i);
					cnt++;	
			   }
			   year=new JComboBox(yvalue);
				
			    JPanel cpanel=new JPanel();
			    cpanel.add(day);
				cpanel.add(month);
				cpanel.add(year);
					
		
					
				bcreate =new JButton("CREATE");
				bcreate.addActionListener((e) ->
	            							{
	            								
	            								addInformation();

	            							
	            							
	           	
	            							}
											);
			
				
				bclearall = new JButton("RESET ALL");
				bclearall.addActionListener((e) ->
	            							{
	            								resetAll();
	            							}
											);

				
				
			
				
				Font f=new Font("Batang",Font.BOLD,15);
				
				l1=new JLabel("    CREATE GRAMPANCHAYAT");
				l1.setFont(f);
				l1.setForeground(Color.BLUE);
				
				l12=new JLabel("MEMBER");
				l12.setFont(f);
				l12.setForeground(Color.BLUE);
					
				Font f1=new Font("Batang",Font.BOLD,14);
				l2=new JLabel(" Enter Grampanchayat Id");
				l2.setFont(f1);
				l2.setForeground(Color.RED);
					
				l3=new JLabel(" create Pasword");
				l3.setFont(f1);
				l3.setForeground(Color.RED);
				
				l4=new JLabel(" Enter Name");
				l4.setFont(f1);
				l4.setForeground(Color.RED);
				
		
				
				l5=new JLabel(" Enter Mob No");
				l5.setFont(f1);
				l5.setForeground(Color.RED);
					
				l6=new JLabel(" Enter Address");
				l6.setFont(f1);
				l6.setForeground(Color.RED);
				
			
					
				l7=new JLabel(" Select Gender");
				l7.setFont(f1);
				l7.setForeground(Color.RED);
					
				l9=new JLabel(" Select DOB");
				l9.setFont(f1);
				l9.setForeground(Color.RED);
				

				c.add(l1);c.add(l12);
				c.add(l2);c.add(tid);
				c.add(l3);c.add(tpass);
				c.add(l4);c.add(tname);
				c.add(l5);c.add(tmobno);;
				c.add(l6);c.add(tapan);
				c.add(l7);c.add(gpanel);
			
				c.add(l9);c.add(cpanel);
				c.add(bcreate);
				c.add(bclearall);
				
				
			                
			    jmenubar = new JMenuBar();
			                
			    jmenu = new JMenu("OPTION");
			    jmenu.setMnemonic(KeyEvent.VK_O);
			    
			    //jmenu1 = new JMenu("EDIT");
			                
			     jmenuregister = new JMenuItem("Register");
			     jmenuregister.setMnemonic(KeyEvent.VK_R);
			     jmenuregister.setToolTipText("Registration...");
			     
			                
			     jmenushowall = new JMenuItem("Show All");
			     jmenushowall.setMnemonic(KeyEvent.VK_A);
			    
			                
			     jmenusearch = new JMenuItem("Search");
			     jmenusearch.setMnemonic(KeyEvent.VK_S);
			    
			                
			     jmenuupdate = new JMenuItem("Update");
			     jmenuupdate.setMnemonic(KeyEvent.VK_U);
			     
			                
			     jmenu.add(jmenuregister);
			     jmenu.add(jmenushowall);
			     jmenu.add(jmenusearch);
			     jmenu.add(jmenuupdate);
			                
			     jmenubar.add(jmenu);
			     //jmenubar.add(jmenu1);
			     
			     setJMenuBar(jmenubar);
			                
				 setSize(460, 500);
				 setLocation(200,200);
				 setResizable(false);
				 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setVisible(true);	
				 c.setBackground(Color.YELLOW);
		   }

		  
		  void resetAll()
		   {
			   dispose();
			   new Create_GMP("Register gram panchayat member...");
			   
		   }


		   public void createRegObj()
		   {
			    String id,name,mobno,pass,gn,add,dob;
				
				id=tid.getText().trim();
				pass=tpass.getText().trim();
				name = tname.getText().trim();
				
				mobno = tmobno.getText().trim();
				add=tadd.getText().trim();
				
				
				gn="";
				if(rmale.isSelected())
				{
					gn="Male";
				}
				else if(rfemale.isSelected())
				{
					gn="Female";
				}
				
				String d=(String)day.getSelectedItem();
				String m=(String)month.getSelectedItem();
				String y=(String)year.getSelectedItem();
				dob=d + "-" + m + "-" + y;
			
				r=new Registration_GPM(id,name,pass,mobno, add,gn, dob);
			 }

		     public void resetFrame()
		     {
		    	 this.dispose();
	        	 new Create_GMP("Registration...");
		     }
		     
		     
		     
		     
			   public boolean dataValidation()
			   {
				   boolean namevalidation = nameCheck();
				   boolean idvalidation = idcheck();
				   boolean passvalidation = passcheck();
				   boolean mobnovalidation = mobnocheck();
				   if (namevalidation && idvalidation && mobnovalidation &&  passvalidation)
					   return true;
				   
				   return false;
			   }
			   
			   public boolean nameCheck()
			   {
				  boolean namevalid = true;
			      String namepattern = "^[a-z A-Z]{3,30}$";
			    	
			      Scanner sc1 = new Scanner(tname.getText().trim());
			    	
			      String match = sc1.findInLine(namepattern);
			    	
			      if (match == null)
			      {
			    	  JOptionPane.showMessageDialog(this, "Invalid Name..Please Enter Another Name");
			    	  tname.setText("");
			    	  tname.setBackground(Color.RED);
			       	  namevalid = false;
			      }
			      return namevalid;
			   }
			   
			   public boolean idcheck()
			    {
				    boolean idvalid = true;
			    	String idepattern = "^GPM[a-z0-9]{4,10}$";
			    	
			    	Scanner sc2 = new Scanner(tid.getText().trim());
			    	
			    	String match1 = sc2.findInLine(idepattern);
			    	
			    	if (match1 == null)
			    	{
			    	   JOptionPane.showMessageDialog(this, "Invalid Id..Please Enter MIN 4 & MAX 7 letters");
				       tid.setText("");
				      tid.setBackground(Color.RED);
				       idvalid = false;
			    	}
			    	
			    	return idvalid;
			    }
			
			   public boolean mobnocheck()
			   {
				   boolean mobilenovalid = true;
				   
				   String mobnopattern = "^[0-9]{10}$";
			    	
			       Scanner sc3 = new Scanner(tmobno.getText().trim());
			    	
			       String match2 = sc3.findInLine(mobnopattern);
			    	
			    	if (match2 == null)
			    	{
			    		 JOptionPane.showMessageDialog(this, "Invalid Mobno..Please Enter Another MobNo");
					     tmobno.setText("");
					    tmobno.setBackground(Color.RED);
					     mobilenovalid = false;
			    	}
				   	return mobilenovalid;
			    }
			    
		     
			   public boolean passcheck()
			   {
				   boolean passvalid = true;
				   
				   String passpattern = "^[A-Z@#$&*_a-z0-9]{4,16}$";
			    	
			       Scanner sc3 = new Scanner(tpass.getText().trim());
			    	
			       String match2 = sc3.findInLine(passpattern);
			    	
			    	if (match2 == null)
			    	{
			    		 JOptionPane.showMessageDialog(this, "Invalid password,enter any alphabet or 0-9 or speial character(_@#$&");
					     tpass.setText("");
					     tpass.setBackground(Color.RED);
					     passvalid = false;
			    	}
				   	return passvalid;
			    }	     
		     
		     public void addInformation()
		     {
		    	boolean isdatavalidate = dataValidation(); 
	         	if(isdatavalidate)
	         	{
		    	 
	         		createRegObj();
		    	
	         	   int idfoundpos = Search_GPM_Result_Page.searchId(tid.getText().trim());
	         	
	         	   if(idfoundpos >= 0)
	         	   {
	         		   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
	         	   }
	         	   else
	         	   {
	         	       int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
	  			       if(con==JOptionPane.YES_OPTION)
	  			       {
	  			       
	  				      userlist = Create_GPM_UserDataReadWriteFromFile.readDataFromFile();
	  				      userlist.add(r);
	  				    Create_GPM_UserDataReadWriteFromFile.writeDatatoFile(userlist);
	  				      JOptionPane.showMessageDialog(this, "Registration Successful...");
	  				    
	  				      resetFrame();
	  			       }
	         	    }
	         	}
		     }
		   

/*
public static void main(String args[])
{
	 new Create_GMP("Register gram panchayat member...");	
}
*/
}