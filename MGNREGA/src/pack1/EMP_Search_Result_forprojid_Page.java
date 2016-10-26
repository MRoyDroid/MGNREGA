package pack1;
import java.util.ArrayList;
public class EMP_Search_Result_forprojid_Page
{

	
		public static int searchprojidforemp(String projid)
			{
				ArrayList<EMP_Registration> list2;
				int f = 0;
				try
				{
					list2=EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
					
					for(int p=0; p<list2.size(); p++)
					{
						if(projid.equals(list2.get(p). getProid()))
						{
						   f ++;
						   //System.out.println(f);
						  
						}	
					}
					 
					return(f);
				}catch(Exception e)
				{
					System.out.println(e);
					return(-2);
				}
		 	}
		
		
	/* public static void main(String args[])
	 {
		 searchempid("ram");
	 }
	 */
	}
	
	
	
	

