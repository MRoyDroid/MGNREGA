package pack1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
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

public class UpdateGPM  extends JFrame
{
	          private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
			  private JTextField tid,tname,tmobno;
			  private JPasswordField tpass;
			  private JTextArea tadd;
			  private JComboBox day,month,year;
			
			  private JRadioButton rmale,rfemale;
			  private JButton bupdate;  
		      
			  ArrayList<Registration_GPM> userlist;
			  
			  Registration_GPM r;
			
			  public UpdateGPM(String title)
			  {
				  super(title);
				  
			  
				  Container c=getContentPane();
				  c.setLayout(new GridLayout(15,2));
						
				  tid=new JTextField(20);
				  tpass=new JPasswordField(20);
				  tname = new JTextField(20);
				 
				  tmobno = new JTextField(20);
				  
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
						
			
						
					bupdate =new JButton("Update");
					bupdate.addActionListener((e) ->
		            							{
		            								
		            								updateInformation();

		            							 // JOptionPane.showMessageDialog(this,"SUCESSFULLY Updated");
		            							
		           	
		            							}
												);
				
					Font f=new Font("Batang",Font.BOLD,15);
					
					l1=new JLabel("    Update  GRAMPANCHAYAT");
					l1.setFont(f);
					l1.setForeground(Color.BLUE);
					
					l12=new JLabel("MEMBER");
					l12.setFont(f);
					l12.setForeground(Color.BLUE);
						
					Font f1=new Font("Batang",Font.BOLD,14);
					l2=new JLabel(" Enter GPM_ID to Update");
					l2.setFont(f1);
					l2.setForeground(Color.RED);
						
					l3=new JLabel(" Enter Pasword");
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
					l13 = new JLabel("Enter The New Details of GPM");
					

					c.add(l1);
					
					c.add(l12);
					c.add(l2);c.add(tid);
					c.add(l13);c.add(new JLabel(""));
					c.add(l3);c.add(tpass);
					c.add(l4);c.add(tname);
					c.add(l5);c.add(tmobno);;
					c.add(l6);c.add(tapan);
					c.add(l7);c.add(gpanel);				
					c.add(l9);c.add(cpanel);
					c.add(bupdate);
					
				          	                
					 setSize(460,500);
					 setLocation(200,200);
					 setResizable(false);
					 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 setVisible(true);	
					 c.setBackground(Color.YELLOW);
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

			 
			  
			   
			   public boolean dataValidation()
			   {
				   boolean namevalidation = nameCheck();
				  
				   boolean passvalidation = passcheck();
				   boolean mobnovalidation = mobnocheck();
				   if (namevalidation && mobnovalidation &&  passvalidation)
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
			   
			   
			   
			   
			   
			   
			   
			     public void resetFrame()
			     {
			    	 this.dispose();
		        	 new UpdateGPM("UPDATE AGAIN");
			     }

			  
			     public void updateInformation()
			     {
			 
			             int idfoundpos = Search_GPM_Result_Page.searchId(tid.getText().trim());
			             boolean isdatavalidate = dataValidation(); 
				         	if(isdatavalidate)
				         	{

			             if(idfoundpos >= 0)
			             {
			            	 
			            	createRegObj();
			            	
			            	
			            	UpdategpmInfo.UpdateInfodata(r, idfoundpos);
			                JOptionPane.showMessageDialog(this, "Information Updated...");
			                resetFrame();
			             }
			             else
			             {
			            	 JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
					    	  tid.setText("");
					    	  tid.setBackground(Color.RED);
			               
			             }
				         	}
				         	
				     }
		
			    
				     
		  			      // }
		         	    //}
		         	
			     //}
			   

	/*public static void main(String args[])
	{
		 new UpdateGPM("");	
	}*/
	}
	
	

