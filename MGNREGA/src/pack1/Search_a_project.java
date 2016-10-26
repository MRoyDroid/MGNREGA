package pack1;
import java.util.ArrayList;
public class Search_a_project
{


		public static String searchId(String id)
			{
				ArrayList<Project_Create_BDO_Registration> list2;
				String s="";
				try
				{
					list2=Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
					
					for(int p=0; p<list2.size(); p++)
					{
						if(id.equals(list2.get(p).getProjid()))
						{
							
							 s= list2.get(p).getNo_emp();
			
						}	
					}
					 
					return(s);
				}catch(Exception e)
				{
					System.out.println(e);
					return("");
				}
		 	}
		}
		
		


	

