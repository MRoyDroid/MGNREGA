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

public class Delete_GMP_Page1 extends JFrame
	{
		private JLabel l1,l3,l5,l7;
		private JTextField gpmid;
		private JButton sub;
		public  Delete_GMP_Page1()
		{
			super();
			
			Container c= getContentPane();
			c.setLayout(new GridLayout(5,2));
			
			
			 
			  
			  Registration_GPM r;


			gpmid = new JTextField(20);
			
			
			sub = new JButton("DELETE");
			sub.addActionListener((e)->
			{
				JOptionPane.showMessageDialog(sub,"checking whether ID exists or not");
				
				
                int idfoundpos = Search_GPM_Result_Page.searchId(gpmid.getText().trim());
                if(idfoundpos >= 0)
                {
              	//  new Search_GPM_Result_Display_Page(idfoundpos);
              	  
              	JOptionPane.showMessageDialog(sub,"ID FOUND!!..");
            	JOptionPane.showMessageDialog(sub,"DELETING...");
              	Delete_a_GPM.deleteInfoDataGPM(idfoundpos);
              	JOptionPane.showMessageDialog(sub,"GMP SUCESSFULLY DELETED !!..");
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
			l1=new JLabel("DELETE GPM");
			l1.setFont(f);
			l1.setForeground(Color.GRAY);
			
		Font f1 = new Font("arial",Font.PLAIN,15);
		/*    l3=new JLabel("PROJECT ID ");
			l3.setFont(f1);
		    l3.setForeground(Color.BLUE);
		  */  
		    l5=new JLabel("GPM ID ");
			l5.setFont(f1);
		    l5.setForeground(Color.BLUE);
		    
		  /*  l7=new JLabel("GPM ID ");
			l7.setFont(f1);
		    l7.setForeground(Color.BLUE);
		    */
		    
		    c.add(l1);c.add(new JLabel(""));
		//    c.add(l3);c.add(proid);
		    c.add(l5);c.add(gpmid);
		    
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
			   new Delete_GMP_Page1();
			   
		   }	
	

}
