package icehs.science.chapter09;

public class Person {
	private String name;
	private String phone;
	
	public Person() {
		this.name = "����";
		this.phone = "��ȭ��ȣ ����";
	}
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void eat() {
		System.out.println("����� ���� �Դ�.");
	}
	
	public void sleep() {
		System.out.println("���ڴ�");
	}

}
