package icehs.science.chapter07;

public class ComputerTest {

	public static void main(String[] args) {
		Computer R500 = new Computer ("R500", "Win 7", 100, 0);
		R500.printComputerInfo();
		
		Computer R570 = new Computer ("R570", "Win 10", 200, 30);
		R570.printComputerInfo();

	}

}
