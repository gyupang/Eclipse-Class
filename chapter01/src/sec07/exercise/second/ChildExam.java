package sec07.exercise.second;

public class ChildExam {

	public static void main(String[] args) {
		Child child = new Child();

//		Child 객체를 생성하는 과정에서 호출되는 각 클래스의 생성자 순서는 다음과 같습니다.
//
//		Child() 생성자 호출
//		Child(String name) 생성자 호출
//		Parent() 생성자 호출
//		Parent(String nation) 생성자 호출
//		따라서, 출력 결과는 다음과 같습니다.
//
//		Parent(String nation) call
//		Parent() call
//		Child(String name) call
//		Child() call

	}

}
