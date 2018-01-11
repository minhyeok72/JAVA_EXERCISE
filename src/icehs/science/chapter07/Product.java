package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		printProductInfo();
	}
	
	Product(String name, int price, int discount){
		this.name = name;
		this.price = price;
		this.discount = discount;
		printProductInfo();
	}
	
	void printProductInfo() {
		System.out.println("=====" + name + "=====");
		System.out.println("���� : " + price + "��");
		if(discount > 0) {
			System.out.println("������ : " + discount + "%");
		}else {
			System.out.println("������ : " + "�������� ����");
		}
	}

}
