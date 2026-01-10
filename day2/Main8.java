package day2;

public class Main8 {

	public static void main(String[] args) {
		/*
			吉伊卡哇-小桃公仔 1 個 222 元
			付款 1000 元, 請問應找多少錢 ? 如何找 ?
			500, 100, 50, 10, 5, 1
		*/
		int tao = 222;
		int cash = 1000;
		int change = cash - tao; // 應找 778
		System.out.printf("吉伊卡哇-小桃公仔 1 個 %d 元 付款 %,d 元, 應找 %d 元%n", tao, cash, change);

		// 找 500
		int fiveHundred = change / 500; // 1 張
		change = change % 500;          // 278 元

		// 找 100
		int oneHundred = change / 100;  // 2 張
		change = change % 100;          // 78 元

		// 找 50
		int fifty = change / 50;        // 1 枚
		change = change % 50;           // 28 元

		// 找 10
		int ten = change / 10;          // 2 枚
		change = change % 10;           // 8 元

		// 找 5
		int five = change / 5;          // 1 枚
		change = change % 5;            // 3 元

		// 找 1
		int one = change;               // 3 枚

		System.out.printf("500元: %d 張%n", fiveHundred);
		System.out.printf("100元: %d 張%n", oneHundred);
		System.out.printf(" 50元: %d 張%n", fifty);
		System.out.printf(" 10元: %d 張%n", ten);
		System.out.printf("  5元: %d 張%n", five);
		System.out.printf("  1元: %d 張%n", one);
	}

}