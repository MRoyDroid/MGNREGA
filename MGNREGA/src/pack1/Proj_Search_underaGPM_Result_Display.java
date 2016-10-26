package pack1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Proj_Search_underaGPM_Result_Display extends JFrame
{
		private static final long serialVersionUID = 1L;

		public Proj_Search_underaGPM_Result_Display (ArrayList<Project_Create_BDO_Registration> list6)
		{
			super();
			String heading[]={"PROJID","PROJNAME","PROJDURATION","START_DT","END_DATE","NO. OF EMP","PROJ COST","GPMID"};
			String data[][] = new String[5][12];;
		//	ArrayList<Project_Create_BDO_Registration> list6;
			try
			{
				//list6 = Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
				int r = 0;			
			//	Project_Create_BDO_Registration re = list6.get(index);
			for(Project_Create_BDO_Registration re:list6)	
			{
				
				data[r][0]=re.getProjid();
				data[r][1]=re.getProjname();
				data[r][2]=re.getProjduration();
				data[r][3]=re.getStart_date();
				data[r][4]=re.getEnd_date();
				data[r][5]=re.getNo_emp();
				data[r][6]=re.getWage_emp();
				data[r][7]=re.getGPMID();
				r++;
				/*data[r][8]=re.getDob();
				data[r][9]=re.getInterests();
				data[r][10]=re.getDate();
				data[r][11]=re.getTime();
					*/	
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




