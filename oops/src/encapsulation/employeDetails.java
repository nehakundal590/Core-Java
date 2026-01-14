package encapsulation;

public class employeDetails {

	private long empId;
	private String name;
	private String emailId;
	private String cityName;
	private String companyName;

	// using setter and getter (encapsulation)

	public void setDetails(long empId, String name, String emailId, String cityName, String companyName) {
		this.empId = empId;
		this.name = name;
		this.emailId = emailId;
		this.cityName = cityName;
		this.companyName = companyName;
	}

	public long getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getCityName() {
		return cityName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public static void main(String[] args) {
		employeDetails s1 = new employeDetails();
		s1.setDetails(77170032L, "Rahul Verma", "rahul@gmail.com", "Jaipur", "Regex Software service");
		System.out.println("Employee Id: " + s1.getEmpId());
		System.out.println("Name: " + s1.getName());
		System.out.println("Email Id: " + s1.getEmailId());
		System.out.println("City Name: " + s1.getCityName());
		System.out.println("Company Name: " + s1.getCompanyName());

	}

}
