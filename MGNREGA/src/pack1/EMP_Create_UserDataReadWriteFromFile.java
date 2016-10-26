package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EMP_Create_UserDataReadWriteFromFile
{

	

	

	
	
		public static ArrayList<EMP_Registration> readDataFromFile()
		{
			ArrayList<EMP_Registration> list4;
			try
			{
			   FileInputStream fin=new FileInputStream("Regi_EMP.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list4=(ArrayList<EMP_Registration>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}catch(Exception e)
			 {
				 list4=new ArrayList<EMP_Registration>();
			 }
			 
			return list4;
		}
		
		public static void writeDatatoFile(ArrayList<EMP_Registration> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("Regi_EMP.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}
	
	
	

