package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println("===== ���ǹ� ������ �����մϴ�. ======");
		
		pub1.setPrice(-10000);
		pub1.setPrice(5000);
		pub1.setTitle("��ȭ �ﱹ��");
		pub1.setPage(-20);
		pub1.setPage(300);
		System.out.println("���ǹ� ���� : " + pub1.getTitle() + " ( " + pub1.getPrice() +
				"��, " + pub1.getPage() + "page )");
		
	}

}
