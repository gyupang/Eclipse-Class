package sec07;

public class ManagerB extends Employee {
//필드

	private String manageJob;

	public String getManageJob() {
		return manageJob;
	}

	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName()); // private라 getName()으로 가져옴
		sb.append("|");
		sb.append(this.getJobTitle());
		sb.append("|");
		sb.append(manageJob);

		return sb.toString();
	}

}
