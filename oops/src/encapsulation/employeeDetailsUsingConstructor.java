package encapsulation;

public class employeeDetailsUsingConstructor {

	private long empId;
	private String name;
	private String emailId;
	private String cityName;
	private String companyName;

	public employeeDetailsUsingConstructor(long empId, String name, String emailId, String cityName,
			String companyName) {
		this.empId = empId;
		this.name = name;
		this.emailId = emailId;
		this.cityName = cityName;
		this.companyName = companyName;
	}

	public void displayDetails() {
		System.out.println("Employee Id   : " + empId);
		System.out.println("Name          : " + name);
		System.out.println("Email Id      : " + emailId);
		System.out.println("City Name     : " + cityName);
		System.out.println("Company Name  : " + companyName);
	}

	public static void main(String[] args) {
		employeeDetailsUsingConstructor emp1 = new employeeDetailsUsingConstructor(77170032L, "Rahul Verma",
				"rahul@gmail.com", "Jaipur", "Regex Software Service");

		emp1.displayDetails();
	}
}
