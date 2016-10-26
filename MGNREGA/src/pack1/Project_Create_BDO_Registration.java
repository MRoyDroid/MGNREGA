package pack1;

import java.io.Serializable;
public class Project_Create_BDO_Registration implements Serializable 
{

		private static final long serialVersionUID = 1L;
		
		private String projid;
		//private String password;
		private String projname;
		private String projduration;
		private String start_date;
	    private String end_date;
		private String no_emp;
		private String wage_emp;
		private String GPMID;

		//private String dob;
		//private String interests;
		//private String date;
		//private String time;
		
		public Project_Create_BDO_Registration(String projid,String projname,String projduration,
				String start_date, String end_date, String no_emp, String wage_emp,String GPMID) 
		{
			super();
			this.projid = projid;
			this.projname = projname;
			this.projduration= projduration;
			this.start_date =start_date;
			this.end_date = end_date;
			this.no_emp = no_emp;
			this.wage_emp = wage_emp;
			this.GPMID=GPMID;
			
		}
		
		
		public Project_Create_BDO_Registration()
		{
			
		}
		public String getProjid() {
			return projid;
		}

		public void setProjid(String projid) {
			this.projid = projid;
		}

		public String getProjname() {
			return projname;
		}

		public void setProjname(String projname) {
			this.projname = projname;
		}

		public String getProjduration() {
			return projduration;
		}

		public void setProjduration(String projduration) {
			this.projduration = projduration;
		}

		public String getStart_date() {
			return start_date;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		public String getEnd_date() {
			return end_date;
		}

		public void setEnd_date(String end_date) {
			this.end_date = end_date;
		}

		public String getNo_emp() {
			return no_emp;
		}

		public void setNo_emp(String no_emp) {
			this.no_emp = no_emp;
		}

		public String getWage_emp() {
			return wage_emp;
		}

		public void setWage_emp(String wage_emp) {
			this.wage_emp = wage_emp;
		}

		

		public String getGPMID() {
			return GPMID ;
		}
		

		public void setGPMID(String wage_emp) {
			this.GPMID =GPMID;
		}	

	
	
}
