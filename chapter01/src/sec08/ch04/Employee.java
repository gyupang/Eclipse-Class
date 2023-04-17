package sec08.ch04;

public class Employee {
//필드
	private String name;
	private String jobTitle;

	// 생성자
	public Employee(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("|");
		sb.append(jobTitle);
		return sb.toString();
	}
}
