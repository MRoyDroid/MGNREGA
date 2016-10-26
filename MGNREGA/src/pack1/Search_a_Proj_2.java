package pack1;
import java.util.ArrayList;
public class Search_a_Proj_2
{

	
		public static int searchId(String id)
		{
			ArrayList<Project_Create_BDO_Registration> list2;
			int f = -1;
			try
			{
				list2=Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
				
				for(int p=0; p<list2.size(); p++)
				{
					if(id.equals(list2.get(p).getProjid()))
					{
					   f = p;
					   break;
					}	
				}
				 
				return(f);
			}catch(Exception e)
			{
				System.out.println(e);
				return(-2);
			}
	 	}
	}
	
	

