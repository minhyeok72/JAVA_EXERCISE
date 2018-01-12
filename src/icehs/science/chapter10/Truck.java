package icehs.science.chapter10;

public class Truck extends Car{
	private int maxWeight;

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}
	
	public void go(int distance){
		System.out.println("트럭을 타고 " + distance  + "km 이동합니다.");
		System.out.println("연료 : " + this.getOilSize());
	}
	
	public void wash() {
		System.out.println("트럭 : 세처합니다.");
	}

}
