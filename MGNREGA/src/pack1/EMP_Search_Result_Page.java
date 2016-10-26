package pack1;
import java.util.ArrayList;

public class EMP_Search_Result_Page
{
	


	public static int searchempid(String id)
		{
			ArrayList<EMP_Registration> list2;
			int f = -1;
			try
			{
				list2=EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
				
				for(int p=0; p<list2.size(); p++)
				{
					if(id.equals(list2.get(p). getId()))
					{
					   f = p;
					   
					   System.out.println(f);
					   break;
					}	
				}
				 
				return(f);
			}catch(Exception e)
			{
				//System.out.println(e);
				return(-2);
			}
			
			
			
	 	}
	
	
/* public static void main(String args[])
 {
	 searchempid("ram");
 }
 */
}