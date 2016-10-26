package pack1;
import java.util.ArrayList;

public class EMP_Delete
{

	


		


		
			public static void deleteInfoDataEMP(int index)
			{
				ArrayList<EMP_Registration> list1;
				
				list1=EMP_Create_UserDataReadWriteFromFile .readDataFromFile();
				
				list1.remove(index);
				 
				EMP_Create_UserDataReadWriteFromFile .writeDatatoFile(list1);
			}
		}



