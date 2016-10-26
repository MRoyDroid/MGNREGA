package pack1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Project_Create_BDO_UserDataReadWriteFromFile
{
	
		public static ArrayList<Project_Create_BDO_Registration> readDataFromFile()
		{
			ArrayList<Project_Create_BDO_Registration> list4;
			try
			{
			   FileInputStream fin=new FileInputStream("Regi_project.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list4=(ArrayList<Project_Create_BDO_Registration>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}catch(Exception e)
			 {
				 list4=new ArrayList<Project_Create_BDO_Registration>();
			 }
			 
			return list4;
		}
		
		public static void writeDatatoFile(ArrayList<Project_Create_BDO_Registration> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("Regi_project.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}
	
	

