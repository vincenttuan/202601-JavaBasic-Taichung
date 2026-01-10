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

		// 找零錢 50 元, 此時的 change = 77
		int fifty = change / 50; // -> 77 / 50 = 1
		System.out.printf("50元: %d 個%n", fifty);
		change = change % 50; // 還剩下多少錢沒找 -> 77 % 50 = 27

		// 找零錢 10 元, 此時的 change = 27
		int ten = change / 10; // -> 27 / 10 = 2
		System.out.printf("10元: %d 個%n", ten);
		change = change % 10; // -> 27 % 10 = 7

		// 找零錢 5 元, 此時的 change = 7
		int five = change / 5; // -> 7 / 5 = 1
		System.out.printf(" 5元: %d 個%n", five);
		change = change % 5; // -> 7 % 5 = 2

		// 找零錢 1 元, 此時的 change = 2
		int one = change;
		System.out.printf(" 1元: %d 個%n", one);
	}
}
