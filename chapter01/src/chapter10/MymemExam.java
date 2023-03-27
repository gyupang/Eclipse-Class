package chapter10;

public class MymemExam {

	public static void main(String[] args) {
		Mymember inst1 = Mymember.getInstance();
		Mymember inst2 = Mymember.getInstance();
		
		System.out.println(inst1); 
		System.out.println(inst2);
		
		System.out.println("인스턴스가 같은가?"); 
		System.out.println(inst1==inst2); 
		
//		getter setter 사용
		System.out.println(inst1.getId()); 
		System.out.println(inst1.getName()); 
		
		inst1.setId(2023);
		inst1.setName("악마처럼");
		
		System.out.println(inst1.getId());
		System.out.println(inst1.getName());
	}

}
