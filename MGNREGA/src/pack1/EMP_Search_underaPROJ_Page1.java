package pack1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;



import java.util.ArrayList;



//import java.pack1.Create_GPM;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EMP_Search_underaPROJ_Page1  extends JFrame
{

			private JLabel l1,l3,l5,l7;
			private JTextField projectid;
			private JButton sub;
			  Project_Create_BDO_Registration r;
			
	public EMP_Search_underaPROJ_Page1()
	{
				super(" ");
				
				Container c= getContentPane();
				c.setLayout(new GridLayout(5,2));
				
				projectid = new JTextField(20);
				
				

	sub = new JButton("VIEW");
				sub.addActionListener((e)->
				{
					//JOptionPane.showMessageDialog(sub,"please wait while we are processing");
					
					ArrayList<EMP_Registration> idfoundpos = EMP_Search_underaPROJ_Result_Page.empsearchunderproj(projectid.getText().trim());
 
 
					if(idfoundpos.size() > 0)
	                {
	                	
						new EMP_Search_underaPROJ_Result_Display(idfoundpos);
	                }
					
	                else
	                {
	              	  JOptionPane.showMessageDialog(this, "PROJECTID NOT FOUND..OR NO EMPLOYEE UNDER THIS PROJECT HAS BEEN ASSIGNED...");
	                }
					
				}
						);		
			/*	rst = new JButton("RESET");
				rst.addActionListener((e)->
				{
					reset_all();
				}
				
				);*/
				
				Font f= new Font("arial",Font.BOLD,25);
				l1=new JLabel("VIEW ALL EMPLOYEE");
				l1.setFont(f);
				l1.setForeground(Color.GRAY);
				
				Font f1 = new Font("arial",Font.PLAIN,15);
			    /*l3=new JLabel("PROJECT ID ");
				l3.setFont(f1);
			    l3.setForeground(Color.BLUE);
			    */
			    l5=new JLabel("PROJECT ID ");
				l5.setFont(f1);
			    l5.setForeground(Color.BLUE);
			       
			   c.add(l1);c.add(new JLabel(""));
			   c.add(l5);c.add(projectid);
		
			    
			  //  c.add(rst);
			    c.add(sub);
				
				setSize(400,200);
				setLocation(20,20);
			//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				

			}
			
		/*	public static void main(String arg[])
			{
				new Proj_Search_Page1 ();
			}
			*/
			

			
	}
	
	

