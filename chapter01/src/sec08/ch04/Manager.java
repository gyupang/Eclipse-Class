package sec08.ch04;

public class Manager extends Employee {
	private String managerJob;

	public Manager(String name, String jobTitle, String manageJob) {
		super(name, jobTitle);
		managerJob = manageJob;
	}


	public String getManagerJob() {
		return managerJob;
	}

	public void setManagerJob(String managerJob) {
		this.managerJob = managerJob;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" | ");
		sb.append(this.getJobTitle());
		sb.append(" | ");
		sb.append(managerJob);
		
		return sb.toString();
	}
}
