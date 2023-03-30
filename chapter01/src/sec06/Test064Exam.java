package sec06;

public class Test064Exam {

	public static void main(String[] args) {
		Test064 obj1 = Test064.getInstance();
		Test064 obj2 = Test064.getInstance();
		if(obj1 == obj2){
		System.out.println("같은 Test064 객체 입니다.");
		} else {
		System.out.println("다른 Test064 객체 입니다.");
		}

	}

}
