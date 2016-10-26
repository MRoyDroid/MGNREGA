package pack1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EMP_Search_underaPROJ_Result_Display extends JFrame
{
	
		private static final long serialVersionUID = 1L;

		public  EMP_Search_underaPROJ_Result_Display(ArrayList<EMP_Registration> list6)
		{
			super("Search Window");
			String heading[]={"ID","Name","Password","MobNo","Address","District","Gender","DOB","PROJID"};;
			String data[][] = new String[5][12];;
		//	ArrayList<EMP_Registration> list6;
			try
			{
				//list6 =EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
					int r=0;	
			//	EMP_Registration re = list6.get(index);
				
				for(EMP_Registration re:list6)	
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
				r++;
				}
						
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data, heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("Information Details"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				
				setSize(850, 300);
				
				setLocation(200, 200);
				setVisible(true);
					
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}




	


