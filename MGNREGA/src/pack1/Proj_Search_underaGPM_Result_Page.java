package pack1;
import java.util.ArrayList;
public class Proj_Search_underaGPM_Result_Page 
{

	
	
			public static ArrayList<Project_Create_BDO_Registration> searchprojId(String id)
			{
				ArrayList<Project_Create_BDO_Registration> list2;
				ArrayList<Project_Create_BDO_Registration> list3 = new ArrayList<Project_Create_BDO_Registration>();
				
				
				




//ArrayList<Registration_GPM> list2;
int f = -1;
try
{
	list2=Project_Create_BDO_UserDataReadWriteFromFile.readDataFromFile();
	
	for(int p=0; p<list2.size(); p++)
	{
		if(id.equals(list2.get(p).getGPMID()))
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