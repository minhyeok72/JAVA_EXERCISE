package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		iceCar.oilAmount = 5;
		iceCar.driveDistance = 140.0;
		
		iceCar.carInfo();
		
		iceCar.addOil(10);
		iceCar.carInfo();
		
		iceCar.driveCar("IT����", "��õ����", 10.17);
		iceCar.carInfo();
		
		iceCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		iceCar.carInfo();
		
		double enableDistance = iceCar.calculateDrivingDistance();
		System.out.println("���� ������ �Ÿ��� �� " + enableDistance + "km �Դϴ�.");

	}

}
