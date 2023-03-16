package sec02_2;

public class VariableExam02 {

	public static void main(String[] args) {
		/*
		리터럴 3,5를 대입하여 3시간 5분 출력
위 3시간 5분은 총 몇분인지 출력
	
				*/
int h =3;
int m =5;
		
		System.out.println(h+"시간" +m+"분");
		long totalM=(h*60)+m;
		System.out.println("총"+totalM+"분");
		
//0b1011, 0206, 365, 0xb3
		
		int a = 0b1011; // 2진수는 0b, 0B
		int b = 0206;		// 8 진수는 0
		int c = 365;		
		int d = 0xb3;		//16진수는 앞에 0x, 0X
		long e = 3000000000l; // long타입 선언시 int 한도를 넘는 수는 뒤에 l, L을 붙인다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//정밀도 확인
		
	float var1 = 0.123456789123456789f; //유효 소수점 7개
	double var2 = 0.123456789123456789; //유효 소수점 15개
	System.out.println(var1);
	System.out.println(var2);
	
	//숫자
	
	double var3 = 3e6; //지수와 가수 3 × 10^6 
	float var4 = 3e6F;
	double var5=2e-3; // 2 × 10^(-3)
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	
	//불리언타입
	int num =10;
	boolean rs =(num==20);
	System.out.println(rs);
	
	//문자열타입
	String name = "홍길동";
	String job = "프로그래머";
	System.out.println(name+job);
				//출력 연습// 홍길동은 "자바"를 잘 합니다.  
	System.out.println(name+"은 "+"\"자바\"를 잘 합니다.");
	
	String str2 = "번호\t이름\t직업";
	System.out.println(str2);
	
	String str3 = "자바\n스크립트";
			System.out.println(str3);
	
	//텍스트블럭
			
			String str4="""
					{
					"id":"winter",\
					"name":"눈송이"
					}
					""";
			System.out.println(str4);
			
			
			
	}


}
