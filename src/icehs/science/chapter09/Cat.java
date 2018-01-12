package icehs.science.chapter09;

public class Cat extends Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Cat() {
		
	}

	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("�㸦 �����ž�!!");
	}
	
	public void play() {
		System.out.println("��� ���̰� ���ƿ�~");
	}

}
