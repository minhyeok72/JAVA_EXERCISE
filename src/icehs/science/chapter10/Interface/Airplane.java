package icehs.science.chapter10.Interface;

public class Airplane implements IFlyable {

	@Override
	public void fly() {
		System.out.println("���ƴٴմϴ�.");

	}
	
	public void landing() {
		System.out.println("�����մϴ�.");
	}

}
