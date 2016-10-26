	
	package pack1;
	import java.io.Serializable;

	public class EMP_Registration implements Serializable 
	{
		
		private static final long serialVersionUID = 1L;
			
			private String id;
			private String password;
			private String name;
			//private String emailid;
			private String mobno;
		    private String address;
			private String district;
			private String gender;
			private String dob;
			private String proid;
			//private String date;
			//private String time;
			
			public EMP_Registration(String id,String name, String password,String mobno, String address,
					String district,String gender, String dob,String proid) 
			{
				super();
				this.id = id;
				this.password = password;
				this.name = name;
				//this.emailid = emailid;
				this.mobno = mobno;
				this.address = address;
				this.district = district;
				//this.city = city;
				this.gender = gender;
				this.dob = dob;
				this.proid = proid;
				//this.date = date;
				//this.time = time;
			}
			
			

			public EMP_Registration()
			{
				
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			/*public String getEmailid() {
				return emailid;
			}

			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}
	*/
			public String getMobno() {
				return mobno;
			}

			public void setMobno(String mobno) {
				this.mobno = mobno;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getdistrict() {
				return district;
			}

			public void setdistrict(String district) {
				this.district = district;
			}
			
			

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getDob() {
				return dob;
			}

			public void setDob(String dob) {
				this.dob = dob;
			}

		
			public String getProid() {
				return proid;
			}

			public void setProid(String proid) {
				this.proid = proid;
			}
			/*public void setInterests(String interests) {
				this.interests = interests;
			}

			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String getTime() {
				return time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			*/
		
	
	}

		
		
		
		



	
	

