package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television INFINIA = new Television("INFINIA", 1500000);
		INFINIA.printTelevisionInfo();
		
		Television XCANVAS = new Television("XCANVAS", 1000000, "LCD TV");
		XCANVAS.printTelevisionInfo();
		
		Television CINEMA = new Television("CINEMA", 2000000, "3D TV");
		CINEMA.printTelevisionInfo();
		
		int totalPrice = INFINIA.price + XCANVAS.price + CINEMA.price;
		System.out.println("가격의 합 : " + totalPrice);
	}

}
