package sec03;

public class CastingExam {

	public static void main(String[] args) {
int intValue = 103029770;
byte byteValue = (byte)intValue;
System.out.println(byteValue);
// 강제 형변환 시키면 값이 10만 나옴

intValue = 65;
char charValue = (char) intValue;
System.out.println(charValue); //A출력

double doubleValue = 3.14;
intValue = (int)doubleValue;
System.out.println(intValue); // 정수 부분만 저장 3

byte result = 10+30; 	//성능 향상을 위해 컴파일 단계에서 리터럴계산식은 미리 수행한다
System.out.println(result); 

float result = 1.2f +3.4f  // float result = 4.6f;  계산 미리 수행
double result = 1.2f+3.4 //더블타입

int intValue = 10;
double doubleValue = 5.5;
double result = intValue + doubleValue;  // 10.0 + 5.5 로 변환되어 출력
int result = intValue + (int)doubleValue; // 더블을 int로 변환시키면 int 값 가능

int x = 1;
int y = 2;
double result = x / y;  // 0 정수형 계산은 int로 저장됨
double result = (double) x / (double) y;  // 더블로 계산해야 0.5 출력


	}

}
