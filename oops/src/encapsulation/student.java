package encapsulation;

public class student {
	private int sid;
	private String sName;

	// using setter and getter (encapsulation)

	public void setSid(int sid, String sName) {
		this.sid = sid;
		this.sName = sName;

	}

	public int getSid() {
		return sid;
	}

	public String getsName() {
		return sName;
	}

	public static void main(String[] args) {
		student s1 = new student();
		s1.setSid(15, "Rahul");
		System.out.println(s1.getSid() + " " + s1.sName);
	}

}
