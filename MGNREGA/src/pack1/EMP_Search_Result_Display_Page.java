package pack1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EMP_Search_Result_Display_Page extends JFrame 
{
	
		private static final long serialVersionUID = 1L;

		public EMP_Search_Result_Display_Page (int index)
		{
			super("Search Window");
		    String heading[]={"ID","Name","Password","MobNo","Address","District","Gender","DOB","PROJID"};;
			String data[][] = new String[5][12];;
	
				ArrayList<EMP_Registration> list;
				try
				{
					list = EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
				
					
					EMP_Registration re = list.get(index);
					
				//	data = new String[list.size()][12];
				
					int r=0;
			
					{
						data[r][0]=re.getId();
						data[r][1]=re.getName();
						data[r][2]=re.getPassword();
						//data[r][3]=re.getEmailid();
						data[r][3]=re.getMobno();
						data[r][4]=re.getAddress();
						data[r][5]=re.getdistrict();
						data[r][6]=re.getGender();
						data[r][7]=re.getDob();
						data[r][8]=re.getProid();
						//data[r][10]=re.getDate();
						//data[r][11]=re.getTime();
						
					
						
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data, heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("Information Details"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				
				setSize(850, 300);
				
				setLocation(200, 200);
				setVisible(true);
					
			}
					
				}
					catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}



