package icehs.science.chapter10.animals;

public class Animal {
	private String kind;
	private int age;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

}
