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
public class CreateProject_BDO extends JFrame
{
	
  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
  private JTextField ProId,ProName,EmpNo,EmpWg,gpmid;
  private JComboBox day,month,year,day1,month1,year1,proDuration;
  private JButton Submit,valp;
  
  

      	ArrayList<Project_Create_BDO_Registration> userlist;
	  
		Project_Create_BDO_Registration r;
	

	public CreateProject_BDO (String title)
	 {
		 super(title);
		 
			
		 Container c=getContentPane();
		 c.setLayout(new GridLayout(12,2));
		 
		
		 
		 ProId=new JTextField(10);
		 ProId.setToolTipText(" MIN 4 & MAX 7 letters must contain PRO");
		 ProName = new JTextField(20);
		 ProName.setToolTipText("ALPHABETS ONLY");
		 
		 //ProDuration = new JTextField(20);
		 
		 String pd[] = new String[11];
		 int ct=0;
		 for(int i=90;i<=100;i++)
		 {
			 pd[ct]=String.valueOf(i);
			 ct++;
		 }
		 
		 proDuration=new JComboBox(pd);
		 
		 JPanel cpanel2=new JPanel();
		 cpanel2.add(proDuration);
		 
		 String date[] = new String[31];
		 for(int i=0;i<=30;i++)
		 {
			 date[i]=String.valueOf(i+1);
		 }
		 day = new JComboBox(date);
		 
		 String mnth[] = new String[12];
		 for(int i=0;i<=11;i++)
		 {
			 mnth[i]=String.valueOf(i+1);
		 }
		 month = new JComboBox(mnth);
		 
		String yr[] = new String[21];
		int cnt=0;
		 for(int i=2000;i<=2020;i++)
		 {
			 yr[cnt]=String.valueOf(i);
			 cnt++;
		 }
		year = new JComboBox(yr);
		 
		 JPanel cpanel=new JPanel();
		 cpanel.add(day);
		 cpanel.add(month);
		 cpanel.add(year);
		 
		 String date1[] = new String[31];
		 for(int i=0;i<=30;i++)
		 {
			 date1[i]=String.valueOf(i+1);
		 }
		 day1 = new JComboBox(date1);
		 
		 String mnth1[] = new String[12];
		 for(int i=0;i<=11;i++)
		 {
			 mnth1[i]=String.valueOf(i+1);
		 }
		 month1 = new JComboBox(mnth1);
		 
		String yr1[] = new String[21];
		int cnt1=0;
		 for(int i=2000;i<=2020;i++)
		 {
			 yr1[cnt1]=String.valueOf(i);
			 cnt1++;
		 }
		year1 = new JComboBox(yr1);
		 
		 JPanel cpanel1=new JPanel();
		 cpanel1.add(day1);
		 cpanel1.add(month1);
		 cpanel1.add(year1);
				
		 EmpNo = new JTextField(20);
		 EmpWg = new JTextField(20);
		 gpmid=new JTextField(20);
		 Submit =  new JButton("CREATE PROJECT");
		 Submit.addActionListener((e) ->
			                             {
			                            	addInformation();
			                            	
			                              }
			                            );

			  

		 valp = new JButton("RESET ALL");
		 valp.addActionListener((l)->
				 {
			 			resetFrame();
				 }
				 );
		 
		 	Font f=new Font("Batang",Font.BOLD,20);
		 	
			l1=new JLabel("  CREATE PROJECT..");
			l1.setFont(f);
			l1.setForeground(Color.RED);
			
			Font f1=new Font("arial",Font.BOLD,14);
			
			l2=new JLabel("     PROJECT ID");
			l2.setFont(f1);
			l2.setForeground(Color.BLACK);
				
			l3=new JLabel("     PROJECT NAME");
			l3.setFont(f1);
			l3.setForeground(Color.BLACK);
			
			l4 = new JLabel("     PROJECT DURATION");
			l4.setFont(f1);
			l4.setForeground(Color.BLACK);
			
			l8 = new JLabel("     STARTING DATE");
			l8.setFont(f1);
			l8.setForeground(Color.BLACK);
			
			l5 = new JLabel("     FINISHING DATE");
			l5.setFont(f1);
			l5.setForeground(Color.black);
			
			l6 = new JLabel("     NUMBER OF EMPLOYEE");
			l6.setFont(f1);
			l6.setForeground(Color.BLACK);
			
			l7 = new JLabel("    COST OF PROJECT");
			l7.setFont(f1);
			l7.setForeground(Color.black);
			
			l9 = new JLabel(" ASSIGNED TO GRAMPANCHAYET");
			l9.setFont(f1);
			l9.setForeground(Color.black);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);c.add(ProId);
			c.add(l3);c.add(ProName);
			c.add(l4);c.add(proDuration);
			c.add(l8);c.add(cpanel);
			c.add(l5);c.add(cpanel1);
			c.add(l6);c.add(EmpNo);
			c.add(l7);c.add(EmpWg);
			c.add(l9);c.add(gpmid);
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(Submit);c.add(valp);
			
		

             
		 setSize(450, 600);
		 setLocation(200,200);
		 setResizable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);	

	}
	
	
	
	 public boolean dataValidation()
	   {
		   boolean namevalidation = nameCheck();
		   boolean idvalidation = idcheck();
		   if (namevalidation && idvalidation)
			   return true;
		   
		   return false;
	   }
	   
	   public boolean nameCheck()
	   {
		  boolean namevalid = true;
	      String namepattern = "^[A-Z a-z]{3,30}$";
	    	
	      Scanner sc1 = new Scanner(ProName.getText().trim());
	    	
	      String match = sc1.findInLine(namepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "Invalid Name..Please Enter Another Name");
	    	  ProName.setText("");
	    	  ProName.setBackground(Color.RED);
	       	  namevalid = false;
	      }
	      return namevalid;
	   }
	   
	   public boolean idcheck()
	    {
		    boolean idvalid = true;
	    	String idepattern = "^PRO[0-9]{4,7}$";
	    	
	    	Scanner sc2 = new Scanner(ProId.getText().trim());
	    	
	    	String match1 = sc2.findInLine(idepattern);
	    	
	    	if (match1 == null)
	    	{
	    	   JOptionPane.showMessageDialog(this, "Invalid Id..Please Enter MIN 4 & MAX 7 letters");
	    	   ProId.setText("");
	    	   ProId.setBackground(Color.RED);
		       idvalid = false;
	    	}
	    	
	    	return idvalid;
	    }
	
	
    public void addInformation()
    {
  	boolean isdatavalidate = dataValidation(); 
    	if(isdatavalidate)
    	{
    	
   	   createRegObj();
   	   

   	  int gpmidfound=Search_GPM_Result_Page.searchId(gpmid.getText().trim());
   	  if(gpmidfound>=0)
   	  {
     int idfoundpos = Proj_Search.searchId(r);
    	
    	   if(idfoundpos >= 0)
    	   {
    		   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
    	   }
    	   else
    	   {
    	       int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
			       if(con==JOptionPane.YES_OPTION)
			       {
			       
				      userlist = Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
				      userlist.add(r);
				      Project_Create_BDO_UserDataReadWriteFromFile.writeDatatoFile(userlist);
				      JOptionPane.showMessageDialog(this, "project creation Successful...");
				    
				      resetFrame();
			       }
    	    }
   	  }
   	  else
   	  {
	      JOptionPane.showMessageDialog(this, "GPM DOES'T EXIST,FIRST CREATE GMP");  
   	  }
    	}
    }
  

	
    
	   public void createRegObj()
	   {
		    String id,name,dura,num_emp,empwage,st_dt,en_dt,gid;
		    
			
			id=ProId.getText().trim();
			//pass=tpass.getText().trim();
			name = ProName.getText().trim();
			dura=(String)proDuration.getSelectedItem();
			num_emp = EmpNo.getText().trim();
			empwage=EmpWg.getText().trim();
			gid=gpmid.getText().trim();
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			st_dt=d + "-" + m + "-" + y;
			

			String d1=(String)day1.getSelectedItem();
			String m1=(String)month1.getSelectedItem();
			String y1=(String)year1.getSelectedItem();
			en_dt=d1 + "-" + m1 + "-" + y1;
			
			
			
			r=new Project_Create_BDO_Registration(id,name,dura,st_dt,en_dt,num_emp,empwage,gid);
		 }

	
	
	 void resetFrame()
	   {
		   dispose();
		   new CreateProject_BDO ("");
		   
	   }
	 
	 
	 

	public static void main(String[] args)
	{
		
		
		new CreateProject_BDO("GOVERNMENT OF INDIA");
	}
}