package sec07.ch7_4;

public class Dog extends Animal {
public Dog() {
	this.kind = "개과 포유류";
}

@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
