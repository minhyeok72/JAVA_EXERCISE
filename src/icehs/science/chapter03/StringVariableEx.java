package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String mathScore = "96";
		int engScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("�̸� : " + name);
		System.out.println("���� ���� : " + mathScore);
		System.out.println("���� ���� : " + engScore);
		System.out.println("---------------");
		System.out.println(mathScore + engScore);
		System.out.println(parseMathScore + engScore);
		
		System.out.println("�հ����� : " + (parseMathScore + engScore));
		
	}

}
