package sec07;

public class Ch3Student extends Ch3People {

	public int StudentNo;
	
	//생성자
	public Ch3Student(String name, String ssn, int StudentNo) {
		super(name, ssn);
		this.StudentNo = StudentNo;
		System.out.println("학생객체 생성완료");
	}
}
