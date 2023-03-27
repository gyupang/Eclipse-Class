package chapter10;

public class SingletonExam {

	public static void main(String[] args) {
//		Singleton obj = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1==obj2) {
			System.out.println("같은 singletone 객체");
		}else {
			System.out.println("다른 singletone 객체");
		}
		
		
	}

}
