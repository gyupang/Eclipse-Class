package chapter01;

public class varableScopeExam {

	public static void main(String[] args) {
	int v1=9;
	int v2;
	if(v1>10) {
		v2=v1 -10;
	}
	int v3 =v1+v2+5;
	}

}
//v2변수는 사용불가능하여 컴파일 에러 발생
