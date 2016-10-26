package pack1;


import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Search_GPM_Result_Display_Page extends JFrame 
{

		private static final long serialVersionUID = 1L;

		public Search_GPM_Result_Display_Page(int index)
		{
			super("Search Window");
			String heading[]={"ID","Name","Password","MobNo","Address","Gender","DOB"};
			String data[][] = new String[5][12];;
			ArrayList<Registration_GPM> list6;
			try
			{
				list6 = Create_GPM_UserDataReadWriteFromFile.readDataFromFile();
						
				Registration_GPM re = list6.get(index);
				
				int r = 0;
				data[r][0]=re.getId();
				data[r][1]=re.getName();
				data[r][2]=re.getPassword();
				//data[r][3]=re.getEmailid();
				data[r][3]=re.getMobno();
				data[r][4]=re.getAddress();
				//data[r][6]=re.getCity();
				data[r][5]=re.getGender();
				data[r][6]=re.getDob();
			//	data[r][9]=re.getInterests();
			//	data[r][10]=re.getDate();
			//	data[r][11]=re.getTime();
						
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



