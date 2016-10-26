package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Create_GPM_UserDataReadWriteFromFile 
{
	
	
	
   public static ArrayList<Registration_GPM> readDataFromFile()
	{
		ArrayList<Registration_GPM> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("Regi.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Registration_GPM>)oin.readObject();
		   
		   oin.close();
		   fin.close();
	
		}catch(Exception e)
		 {
			 list4=new ArrayList<Registration_GPM>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<Registration_GPM> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("Regi.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}


