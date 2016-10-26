package pack1;

	


	import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.Scanner;




import javax.swing.ButtonGroup;
import javax.swing.JButton;
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






public class Create_Emp_Page extends JFrame
	{
		  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
		  private JTextField tid,tname,tmobno,proid;
		  private JPasswordField tpass;
		  private JTextArea tadd;
		  private JComboBox day,month,year,district;
		
		  private JRadioButton rmale,rfemale;
		  private JButton bcreate, bclearall,bupdate;
		
		 
		  
		
		  private final JMenuBar jmenubar;
	      private final JMenu jmenu;
	      private final JMenuItem jmenuregister,jmenushowall,jmenusearch,jmenuupdate;
	      
	      
		  ArrayList<EMP_Registration> userlist;
		  
		  EMP_Registration r;
		  
		
			
		  public Create_Emp_Page(String title)
		  {
			  super(title);
		  
			  Container c=getContentPane();
			  c.setLayout(new GridLayout(11,2));
					
			  tid=new JTextField(20);
			  tpass=new JPasswordField(20);
			  tname = new JTextField(20);
			 
			  tmobno = new JTextField(20);
			  proid=new JTextField(20);
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
					
			   String yvalue[]=new String[29];
			   int cnt=0;
			   for(int i=1987;i<=2015;i++)
			   {
					yvalue[cnt]=String.valueOf(i);
					cnt++;	
			   }
			   year=new JComboBox(yvalue);
				
			    JPanel cpanel=new JPanel();
			    cpanel.add(day);
				cpanel.add(month);
				cpanel.add(year);
				
				
				 String dtvalue[]={"KOLKATA","BARDWAN","NADIA","HOOGLY"};
				  district=new JComboBox(dtvalue);
					
		
					
				bcreate =new JButton("CREATE");
				bcreate.addActionListener((e) ->
	            							{
	   			                            	addInformation();
	   			                            }
											);
			
				
				bclearall = new JButton("Reset All");
				bclearall.addActionListener((e) ->
	            							{
	            								resetFrame();
	            							}
											);

			
				
			
				
				Font f=new Font("URW Chancery L",Font.BOLD,20);
				l1=new JLabel("CREATE EMPLOYEE");
	            l1.setFont(f);
				l1.setForeground(Color.BLUE);
					
				Font f1=new Font("comic sans ms",Font.BOLD,14);
				l2=new JLabel("Enter employee Id");
				l2.setFont(f1);
				l2.setForeground(Color.RED);
					
			l3=new JLabel("District");
				l3.setFont(f1);
				l3.setForeground(Color.RED);
				
				l4=new JLabel("Enter Name of employee");
				l4.setFont(f1);
				l4.setForeground(Color.RED);
				
		
				
				l5=new JLabel("Enter Mob No");
				l5.setFont(f1);
				l5.setForeground(Color.RED);
					
				l6=new JLabel("Enter Address");
				l6.setFont(f1);
				l6.setForeground(Color.RED);
				
			
					
				l7=new JLabel("Select Gender");
				l7.setFont(f1);
				l7.setForeground(Color.RED);
				
				l8=new JLabel("Assign Project_id");
				l8.setFont(f1);
				l8.setForeground(Color.RED);
					
				l9=new JLabel("Select DOB");
				l9.setFont(f1);
				l9.setForeground(Color.RED);
				

				c.add(l1);c.add(new JLabel(""));
				c.add(l2);c.add(tid);
				//c.add(l3);c.add(tpass);
				c.add(l4);c.add(tname);
				c.add(l5);c.add(tmobno);
				c.add(l6);c.add(tapan);
				c.add(l3);c.add(district);
				c.add(l7);c.add(gpanel);
			
				c.add(l9);c.add(cpanel);
				c.add(l8);c.add(proid);
		
				c.add(bclearall);
				c.add(bcreate);
				
				
				
			                
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
				 //setResizable(false);
			//	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setVisible(true);	
		   }

		  
		  
		   public void createRegObj()
		   {
			    String id,pass,name,emailid,mobno,add,dt,gn,dob,pid;
				
				id=tid.getText().trim();
				pass=tpass.getText().trim();
				name = tname.getText().trim();
				pid=proid.getText().trim();
				//emailid = temailid.getText().trim();
				mobno = tmobno.getText().trim();
				add=tadd.getText().trim();
				dt=(String)district.getSelectedItem();
				
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
				
			/*	ins="";
				if(cmo.isSelected())
				{
					ins="Movie ";
				}
				if(cmu.isSelected())
				{
					ins = ins + "Music ";
				}
				if(cco.isSelected())
				{
					ins = ins + "Computer";
				}
	*/			
				r=new EMP_Registration(id, name,pass,mobno, add, dt, gn, dob,pid );
			 }
		   

		   
		   
		   
		   
		   public boolean dataValidation()
		   {
			   boolean namevalidation = nameCheck();
			   boolean idvalidation = idcheck();
			   boolean mobnovalidation = mobnocheck();
			   if (namevalidation && idvalidation && mobnovalidation)
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
		    	String idepattern = "^EMP[a-z0-9]{4,10}$";
		    	
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
		    
	     
		  
		   
		   
		     public void addInformation()
		     {
		    	 
		    	 
		    	boolean isdatavalidate = dataValidation(); 
	         	if(isdatavalidate)
	     {
		    	   createRegObj();
		    
		    	   int foundpos = Search_a_Proj_2.searchId(proid.getText().trim());
	         	   int idfoundpos = EMP_Search_Result_Page.searchempid(tid.getText().trim());
	   //   try{   	   
	         	if(foundpos>=0)
	         	{
	         	   if((idfoundpos >= 0))
	         	   {
	         		   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST.ENTER ANOTHER ID...");
	         	   }
	         	   
	         	   else
	         {
	         	       int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
	  			       if(con==JOptionPane.YES_OPTION)
	  			  { 
	  			       
		    	   
		    	      String z=Search_a_project.searchId(proid.getText().trim());
		    	      int b=Integer.parseInt(z);
		    	      int num= EMP_Search_Result_forprojid_Page.searchprojidforemp(proid.getText().trim());
		    	      if(num>=b)
		    	      {
		    		   JOptionPane.showMessageDialog(this, "EMPLOYEE EXCEEDING FOR SPECIFIC PROJECT,PLEASE ASSIGN THIS EMPLOYEE TO ANOTHER PROJECT");  
		    	      }
		    	        else
		    		   {
		    		   userlist = EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
	  				      userlist.add(r);
	  				    EMP_Create_UserDataReadWriteFromFile.writeDatatoFile(userlist);
	  				      JOptionPane.showMessageDialog(this, " Successfully created...");
	  				      resetFrame();
		    		   }
	  				      
	  			   }
	         }
	         	} //if(foundpos completed)
	         	else
	         	   {
	         		  JOptionPane.showMessageDialog(this, "THIS PROJECT DOESN'T EXIST..."); 
	         	   }
	     // }
	   /*   catch(Exception e)
	      {
	    	  System.out.println("U DON'T HAVE THE AUTHORITY TO ASSIGN THIS PROJECT");
	    	  resetFrame();
	      }*/
	         }// akdm first er if complete
	      
		    
		     } //method end

		  
		 void resetFrame()
		   {
			   dispose();
			   new Create_Emp_Page("Register gram panchayat member...");
			   
		   }
		   



/*public static void main(String args[])
{
	 new Create_Emp_Page("Register an employee...");	
}*/
}