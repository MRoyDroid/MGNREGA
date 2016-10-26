package pack1;
	import java.util.ArrayList;

public class Search_GPM_Page_Passwrd
{




		

		public static int searchpass(String psswrd)
			{
				ArrayList<Registration_GPM> list2;
				int f = -1;
				try
				{
					list2=Create_GPM_UserDataReadWriteFromFile.readDataFromFile();
					
					for(int p=0; p<list2.size(); p++)
					{
						if(psswrd.equals(list2.get(p).getPassword()))
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
	

