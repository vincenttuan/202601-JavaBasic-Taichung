package day2;

public class Main7 {

	public static void main(String[] args) {
		// 找零錢練習
		// 50, 10, 5, 1
		// 可樂一瓶 23 元, 付款 100 元 要找幾元 ? 如何找 ?
		int cola = 23;
		int cash = 100;
		int change = cash - cola; // 找錢

		System.out.printf("可樂一瓶 %d 元 付款 %d 元 應找 %d 元%n", cola, cash, change);
	}

}