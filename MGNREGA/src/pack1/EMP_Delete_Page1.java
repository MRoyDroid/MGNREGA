package pack1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EMP_Delete_Page1  extends JFrame
{

			private JLabel l1,l3,l5,l7;
			private JTextField empid;
			private JButton sub;
			public EMP_Delete_Page1()
			{
				super("DELETE AN EMPLOYEE");
				
				Container c= getContentPane();
				c.setLayout(new GridLayout(5,2));
				
				
				 
				  
				  EMP_Registration r;


				empid = new JTextField(20);
				
				
				sub = new JButton("DELETE");
				sub.addActionListener((e)->
				{
					JOptionPane.showMessageDialog(sub,"checking whether ID exists or not");
					
					
	                int idfoundpos = EMP_Search_Result_Page.searchempid(empid.getText().trim());
	                if(idfoundpos >= 0)
	                {
	              	//  new Search_GPM_Result_Display_Page(idfoundpos);
	              	  
	              	JOptionPane.showMessageDialog(sub,"ID FOUND!!..");
	            	JOptionPane.showMessageDialog(sub,"DELETING...");
	              	EMP_Delete.deleteInfoDataEMP(idfoundpos);
	              	JOptionPane.showMessageDialog(sub,"EMPLOYEE SUCESSFULLY DELETED !!..");
	              	resetFrame();
	                }
	                else
	                {
	              	  JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
	                }
	         }
				 );
					
		                
		       /*         if(idfoundpos >= 0)
		                {
		              	  new Search_GPM_Result_Display_Page(idfoundpos);
		                }
		                else
		                {
		              	  JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
		                }
		                */
		         

		       

		        	
				
				
				
			
				Font f= new Font("arial",Font.BOLD,25);
				l1=new JLabel("DELETE EMPLOYEE");
				l1.setFont(f);
				l1.setForeground(Color.GRAY);
				
			Font f1 = new Font("arial",Font.PLAIN,15);
			/*    l3=new JLabel("PROJECT ID ");
				l3.setFont(f1);
			    l3.setForeground(Color.BLUE);
			  */  
			    l5=new JLabel("EMP ID ");
				l5.setFont(f1);
			    l5.setForeground(Color.BLUE);
			    
			  /*  l7=new JLabel("GPM ID ");
				l7.setFont(f1);
			    l7.setForeground(Color.BLUE);
			    */
			    
			    c.add(l1);c.add(new JLabel(""));
			//    c.add(l3);c.add(proid);
			    c.add(l5);c.add(empid);
			    
			  //  c.add(rst);
			    c.add(sub);
				
				setSize(400,200);
				setLocation(20,20);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				
				
				
			}
			
		
			 void resetFrame()
			   {
				   dispose();
				   new EMP_Delete_Page1();
				   
			   }	
		

	}

	

