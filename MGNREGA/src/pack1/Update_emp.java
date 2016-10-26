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


public class Update_emp extends JFrame
{

	
		 private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
		  private JTextField tid,tname,tmobno,pid;
		  private JPasswordField tpass;
		  private JTextArea tadd;
		  private JComboBox day,month,year,district;
		
		  private JRadioButton rmale,rfemale;
		  private JButton bcreate, bclearall,bupdate;
		
		  private String sysdate,systime;
		
		  
	     
		  ArrayList<EMP_Registration> userlist;
		  
		  EMP_Registration r;
		
			
		  public Update_emp(String title)
		  {
			  super(title);
		  
			  Container c=getContentPane();
			  c.setLayout(new GridLayout(15,2));
					
			  tid=new JTextField(20);
			  tpass=new JPasswordField(20);
			  tname = new JTextField(20);
			 
			  tmobno = new JTextField(20);
			  pid = new JTextField(20);
			  
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
				
				
				 String dtvalue[]={"KOLKATA","BARDWAN","NADIA","HOOGLY"};
				  district=new JComboBox(dtvalue);
					
		
					
				bcreate =new JButton("Update");
				bcreate.addActionListener((e) ->
	           							{
	           								updateInformation();
	  			                 
	           							
	          	
	           							}
											);
			
				
				bclearall = new JButton("Reset All");
				bclearall.addActionListener((e) ->
	           							{
	           								resetFrame();
	           							}
											);

				Font f=new Font("URW Chancery L",Font.BOLD,20);
				l1=new JLabel("UPDATE EMPLOYEE DETAILS..");
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
					
				l9=new JLabel("Select DOB");
				l9.setFont(f1);
				l9.setForeground(Color.RED);
				Font f2=new Font("Arial",Font.BOLD,14);
				l13 = new JLabel("Enter New Details of Employee");
				l13.setFont(f2);
				l13.setForeground(Color.BLACK);
				
				l8=new JLabel("Enter Projectid");
				l8.setFont(f1);
				l8.setForeground(Color.RED);
				

				c.add(l1);c.add(new JLabel(""));
				c.add(l2);c.add(tid);
				c.add(l13);c.add(new JLabel(""));
				c.add(l4);c.add(tname);
				c.add(l5);c.add(tmobno);
				c.add(l6);c.add(tapan);
				c.add(l3);c.add(district);
				c.add(l7);c.add(gpanel);
				c.add(l9);c.add(cpanel);
				c.add(l8);c.add(pid);
				c.add(bclearall);
				c.add(bcreate);
			                
				 setSize(460, 500);
				 setLocation(200,200);
				 //setResizable(false);
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setVisible(true);	
		   }

		  
		  
		   public void createRegObj()
		   {
			    String id,pass,name,emailid,mobno,add,dt,gn,dob,pd;
				
				id=tid.getText().trim();
				pass=tpass.getText().trim();
				name = tname.getText().trim();
				//emailid = temailid.getText().trim();
				mobno = tmobno.getText().trim();
				add=tadd.getText().trim();
				dt=(String)district.getSelectedItem();
				pd=pid.getText().trim();
				
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
				r=new EMP_Registration(id, name,pass,mobno, add, dt, gn, dob,pd );
			 }
		
		   
		   
		   public boolean dataValidation()
		   {
			   boolean namevalidation = nameCheck();
		//	   boolean idvalidation = idcheck();
			   boolean mobnovalidation = mobnocheck();
			   if (namevalidation && mobnovalidation)
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
		   
	/*	   public boolean idcheck()
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
		    */
		
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
		    
	  
		   public void updateInformation()
		     {
			   
			   boolean isdatavalidate = dataValidation(); 
	       	 
			   int idfoundpos = EMP_Search_Result_Page.searchempid(tid.getText().trim());
                int found=Search_a_Proj_2.searchId(pid.getText().trim());
		             if(idfoundpos >= 0 && found>=0)
		             {
		            	 
		            	 if(isdatavalidate)
		 	         	{
		            		
		            	createRegObj();
		            	
		            	/*
		            	String z=Search_a_project.searchId(pid.getText().trim());
				    	   int b=Integer.parseInt(z);
				    	   int num= EMP_Search_Result_forprojid_Page.searchprojidforemp(pid.getText().trim());
				    	   if(num>=b)
				    	   {
				  
				    		   JOptionPane.showMessageDialog(this, "EMPLOYEE EXCEEDING FOR SPECIFIC PROJECT,PLEASE ASSIGN THIS EMPLOYEE TO ANOTHER PROJECT");  
				    	   }
				    	*/
				    	   //else
				    	   //{
		            	Updateinfoemp.UpdateInfodata(r, idfoundpos);
		                JOptionPane.showMessageDialog(this, "Information Updated...");
		                
		                resetFrame();
		                   
		             }
		             }
		             else
		             {
		                JOptionPane.showMessageDialog(this, "EMPID OR PROJID NOT FOUND..PLEASE ENTER ANOTHER ID...");
		             }
			     }
		       
		 void resetFrame()
		   {
			   dispose();
			   new Update_emp("Update Employee Details.");
			   
		   }
		   
	public static void main(String args[])
	{
	new Update_emp("Update an employee");	
	}
	}
		



	
	
	
