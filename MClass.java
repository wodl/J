package pjtTest;

public class MClass {
	public static void main(String[] args) {
		
		//특수문자 
		
		/*
		 * 원투뜨리~
		 * 원투뜨리~
		 * 드륑ㅋ~
		 * 
		 */
		
		
		System.out.println("Good \t\t\t Morning~");
		System.out.println("Good \n\n Morning~");
		System.out.println("\'Good  Morning~\'");
		System.out.println("\"Good Morning~\"");
		
		System.out.println("오늘의 날씨는 10도입니다,");
		System.out.printf("오늘의 날씨는 %d입니다.\n",10);
		
		char c1='a';
		char c2='A';
		
		System.out.println("소문자 'a'의 대문자는 'A'입니다");
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n",c1,c2);
		
		double d=1.123456d;
		System.out.printf("d=%f\n",d);
	}
}