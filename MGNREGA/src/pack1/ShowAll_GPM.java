package pack1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

public class ShowAll_GPM extends JFrame
{

private static final long serialVersionUID = 1L;

		public ShowAll_GPM()
		{
			super();
			String heading[]={"ID","Name","Password","MobNo","Address","Gender","DOB"};
			String data[][];
			ArrayList<Registration_GPM> list;
			try
			{
				list =Create_GPM_UserDataReadWriteFromFile.readDataFromFile();
				
				data = new String[list.size()][12];
				
				int r=0;
				for(Registration_GPM re : list)
				{
					data[r][0]=re.getId();
					data[r][1]=re.getName();
					data[r][2]=re.getPassword();
					
					data[r][3]=re.getMobno();
					data[r][4]=re.getAddress();
					//data[r][6]=re.getCity();
					data[r][5]=re.getGender();
					data[r][6]=re.getDob();
				//	data[r][9]=re.getInterests();
				//	data[r][10]=re.getDate();
				//	data[r][11]=re.getTime();
					r++;
				}
				
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data, heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				
				setSize(850, 300);
				
				setLocation(200, 200);
				setVisible(true);
			
		
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
	}

	
}	

