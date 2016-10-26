package pack1;

import java.util.ArrayList;
public class EMP_Search_underaPROJ_Result_Page
{

		public static ArrayList<EMP_Registration> empsearchunderproj(String id)
		{
			//ArrayList<Project_Create_BDO_Registration> list2;
			//ArrayList<Project_Create_BDO_Registration> list3 = new ArrayList<Project_Create_BDO_Registration>();
			
			ArrayList<EMP_Registration> list2;
			ArrayList<EMP_Registration> list3 = new ArrayList<EMP_Registration>();
			
			int f = -1;
			try
			{
				list2=EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
				
				
				for(int p=0; p<list2.size(); p++)
				{
					if(id.equals(list2.get(p).getProid()))
					{
						list3.add(list2.get(p));
					  // f = p;
					  // break;
					}	
				}
	 
			return(list3);
			}catch(Exception e)
			{
				System.out.println(e);
				return(list3);
			}
	 	}
	}
	
	
	

