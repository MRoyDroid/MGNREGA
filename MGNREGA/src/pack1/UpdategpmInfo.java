package pack1;
import java.util.ArrayList;
public class UpdategpmInfo 
{

	public static void UpdateInfodata(Registration_GPM rg,int index)
		{
			ArrayList<Registration_GPM> list1;
			
			list1=Create_GPM_UserDataReadWriteFromFile.readDataFromFile();
			
			list1.set(index, rg);
			 
			Create_GPM_UserDataReadWriteFromFile.writeDatatoFile(list1);
		}
	}
	

