package pack1;

import java.util.ArrayList;

public class Delete_a_GPM
{

	


	
		public static void deleteInfoDataGPM(int index)
		{
			ArrayList<Registration_GPM> list1;
			
			list1=Create_GPM_UserDataReadWriteFromFile .readDataFromFile();
			
			list1.remove(index);
			 
			Create_GPM_UserDataReadWriteFromFile .writeDatatoFile(list1);
		}
	}

