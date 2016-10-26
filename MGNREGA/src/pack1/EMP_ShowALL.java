package pack1;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

public class EMP_ShowALL  extends JFrame 
{


		private static final long serialVersionUID = 1L;

		public EMP_ShowALL()
		{
			super("Display All Employee");
			String heading[]={"ID","Name","Password","MobNo","Address","District","Gender","DOB","PROJID"};
			String data[][];
			ArrayList<EMP_Registration> list;
			try
			{
				list = EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
				
				data = new String[list.size()][12];
				
				int r=0;
				for(EMP_Registration re : list)
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

	
	

