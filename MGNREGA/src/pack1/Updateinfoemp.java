package pack1;
import java.util.ArrayList;

public class Updateinfoemp 
{
	public static void UpdateInfodata(EMP_Registration rg,int index)
		{
			ArrayList<EMP_Registration> list1;
			
			list1=EMP_Create_UserDataReadWriteFromFile.readDataFromFile();
			
			list1.set(index, rg);
			 
			EMP_Create_UserDataReadWriteFromFile.writeDatatoFile(list1);
		}
	}
	
	
	
	
	
