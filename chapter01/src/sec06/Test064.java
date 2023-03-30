package sec06;

public class Test064 {
private static Test064 single = new Test064();

private Test064() {
}
	static Test064  getInstance() {
		return single;
	}
}

