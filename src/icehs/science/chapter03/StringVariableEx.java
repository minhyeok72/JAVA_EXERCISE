package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String mathScore = "96";
		int engScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("영어 점수 : " + engScore);
		System.out.println("---------------");
		System.out.println(mathScore + engScore);
		System.out.println(parseMathScore + engScore);
		
		System.out.println("합계점수 : " + (parseMathScore + engScore));
		
	}

}
