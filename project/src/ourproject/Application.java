package ourproject;

public class Application {

	private String employeeid;
	private String Firstname;
	private String Middlename;
	private String Lastname;
	private String Email;
	private String Phonenumber;
	private String degree;
	private String degreemarks;
	private String inter;
	private String intermarks;
	private String tenth;
	private String tenthmarks;
	private String avialdate;
	private String jobslevel;
	private String jobstatus;
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getMiddlename() {
		return Middlename;
	}
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegreemarks() {
		return degreemarks;
	}
	public void setDegreemarks(String degreemarks) {
		this.degreemarks = degreemarks;
	}
	public String getInter() {
		return inter;
	}
	public void setInter(String inter) {
		this.inter = inter;
	}
	public String getIntermarks() {
		return intermarks;
	}
	public void setIntermarks(String intermarks) {
		this.intermarks = intermarks;
	}
	public String getTenth() {
		return tenth;
	}
	public void setTenth(String tenth) {
		this.tenth = tenth;
	}
	public String getTenthmarks() {
		return tenthmarks;
	}
	public void setTenthmarks(String tenthmarks) {
		this.tenthmarks = tenthmarks;
	}
	public String getAvialdate() {
		return avialdate;
	}
	public void setAvialdate(String avialdate) {
		this.avialdate = avialdate;
	}
	public String getJobslevel() {
		return jobslevel;
	}
	public void setJobslevel(String jobslevel) {
		this.jobslevel = jobslevel;
	}
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}
	public Application(String employeeid, String firstname, String middlename, String lastname, String email,
			String phonenumber, String degree, String degreemarks, String inter, String intermarks, String tenth,
			String tenthmarks, String avialdate, String jobslevel, String jobstatus) {
		super();
		this.employeeid = employeeid;
		Firstname = firstname;
		Middlename = middlename;
		Lastname = lastname;
		Email = email;
		Phonenumber = phonenumber;
		this.degree = degree;
		this.degreemarks = degreemarks;
		this.inter = inter;
		this.intermarks = intermarks;
		this.tenth = tenth;
		this.tenthmarks = tenthmarks;
		this.avialdate = avialdate;
		this.jobslevel = jobslevel;
		this.jobstatus = jobstatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
		result = prime * result + ((Middlename == null) ? 0 : Middlename.hashCode());
		result = prime * result + ((Phonenumber == null) ? 0 : Phonenumber.hashCode());
		result = prime * result + ((avialdate == null) ? 0 : avialdate.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((degreemarks == null) ? 0 : degreemarks.hashCode());
		result = prime * result + ((employeeid == null) ? 0 : employeeid.hashCode());
		result = prime * result + ((inter == null) ? 0 : inter.hashCode());
		result = prime * result + ((intermarks == null) ? 0 : intermarks.hashCode());
		result = prime * result + ((jobslevel == null) ? 0 : jobslevel.hashCode());
		result = prime * result + ((jobstatus == null) ? 0 : jobstatus.hashCode());
		result = prime * result + ((tenth == null) ? 0 : tenth.hashCode());
		result = prime * result + ((tenthmarks == null) ? 0 : tenthmarks.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Firstname == null) {
			if (other.Firstname != null)
				return false;
		} else if (!Firstname.equals(other.Firstname))
			return false;
		if (Lastname == null) {
			if (other.Lastname != null)
				return false;
		} else if (!Lastname.equals(other.Lastname))
			return false;
		if (Middlename == null) {
			if (other.Middlename != null)
				return false;
		} else if (!Middlename.equals(other.Middlename))
			return false;
		if (Phonenumber == null) {
			if (other.Phonenumber != null)
				return false;
		} else if (!Phonenumber.equals(other.Phonenumber))
			return false;
		if (avialdate == null) {
			if (other.avialdate != null)
				return false;
		} else if (!avialdate.equals(other.avialdate))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		if (degreemarks == null) {
			if (other.degreemarks != null)
				return false;
		} else if (!degreemarks.equals(other.degreemarks))
			return false;
		if (employeeid == null) {
			if (other.employeeid != null)
				return false;
		} else if (!employeeid.equals(other.employeeid))
			return false;
		if (inter == null) {
			if (other.inter != null)
				return false;
		} else if (!inter.equals(other.inter))
			return false;
		if (intermarks == null) {
			if (other.intermarks != null)
				return false;
		} else if (!intermarks.equals(other.intermarks))
			return false;
		if (jobslevel == null) {
			if (other.jobslevel != null)
				return false;
		} else if (!jobslevel.equals(other.jobslevel))
			return false;
		if (jobstatus == null) {
			if (other.jobstatus != null)
				return false;
		} else if (!jobstatus.equals(other.jobstatus))
			return false;
		if (tenth == null) {
			if (other.tenth != null)
				return false;
		} else if (!tenth.equals(other.tenth))
			return false;
		if (tenthmarks == null) {
			if (other.tenthmarks != null)
				return false;
		} else if (!tenthmarks.equals(other.tenthmarks))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Application [employeeid=" + employeeid + ", Firstname=" + Firstname + ", Middlename=" + Middlename
				+ ", Lastname=" + Lastname + ", Email=" + Email + ", Phonenumber=" + Phonenumber + ", degree=" + degree
				+ ", degreemarks=" + degreemarks + ", inter=" + inter + ", intermarks=" + intermarks + ", tenth="
				+ tenth + ", tenthmarks=" + tenthmarks + ", avialdate=" + avialdate + ", jobslevel=" + jobslevel
				+ ", jobstatus=" + jobstatus + "]";
	}
	
}
