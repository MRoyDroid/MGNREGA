package pack1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

public class Project_Create_BDO_ShowAll extends JFrame
{
		private static final long serialVersionUID = 1L;

		public Project_Create_BDO_ShowAll()
		{
			super();
			String heading[]={"PROJID","PROJNAME","PROJ_DURATION","SRT_DATE","END_DATE","NO_EMP","PROJ COST","GPMID"};
			String data[][];
			ArrayList<Project_Create_BDO_Registration> list;
			try
			{
				list = Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
				
				data = new String[list.size()][12];
				
				int r=0;
				for(Project_Create_BDO_Registration re : list)
				{
					data[r][0]=re.getProjid();
					data[r][1]=re.getProjname();
					data[r][2]=re.getProjduration();
					data[r][3]=re. getStart_date();
					data[r][4]=re.getEnd_date() ;
					data[r][5]=re.getNo_emp();
					data[r][6]=re.getWage_emp();	
					data[r][7]=re.getGPMID();
				    r++;
				}
				
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data, heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("All Project Created"),BorderLayout.NORTH);
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


