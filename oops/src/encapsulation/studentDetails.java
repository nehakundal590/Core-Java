
package encapsulation;

public class studentDetails {
	private long phoneNumber;
	private String emailId;
	private String collegeName;
	private Long rollNo;

	// using setter and getter (encapsulation)

	public void setDetails(long phoneNumber, String emailId, String collegeName, Long rollNo) {
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.collegeName = collegeName;
		this.rollNo = rollNo;
	}

	public Long getPhNo() {
		return phoneNumber;
	}

	public String getEmailId() {
		return emailId;

	}

	public String getCollegeName() {
		return collegeName;
	}

	public Long getRollNo() {
		return rollNo;
	}

	public static void main(String[] args) {
		studentDetails s1 = new studentDetails();
		s1.setDetails(6006295290L, "rahulvearma17@gmail.com", "Engineering College Bikaner", 2021310513L);
		System.out.println("Phone Number: " + s1.getPhNo());
		System.out.println("Email Id: " + s1.getEmailId());
		System.out.println("Collage Name: " + s1.getCollegeName());
		System.out.println("Roll No: " + s1.getRollNo());
	}

}