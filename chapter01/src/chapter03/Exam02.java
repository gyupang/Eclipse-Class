package chapter03;

public class Exam02 {

	public static void main(String[] args) {
int v1 = 10;
int v2 = ~v1; // v1의 이진수를 반전시켜서 10진수로 표현하면 -11이됨
int v3 = ~v1 +1;
System.out.println(v3);

int v4= -10;
int v5 =~v4;
int v6 = ~v4+1;

System.out.println(toBinaryString(v6));
	}

public static String toBinaryString(int value) {
    String str = Integer.toBinaryString(value);
    while(str.length() < 32) {
        str = "0" + str;
        
        
    }
    return str;
	}

}
