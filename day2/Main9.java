package day2;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		/*
			吉伊卡哇-小桃公仔 1 個 222 元
			付款(使用者輸入), 請問應找多少錢 ? 如何找 ?
			500, 100, 50, 10, 5, 1
		*/
		Scanner sc = new Scanner(System.in); // 建立一個 Scanner 物件資源名叫 sc, 以後若要使用 Scanner 的資源就透過 sc 來調用

		int tao = 222;
		
		System.out.printf("吉伊卡哇-小桃公仔 1 個 %d 元, 請輸入付款金額:", tao);
		//int cash = 1000;
		int cash = sc.nextInt(); // 取得使用者所輸入的數字
		
		int change = cash - tao; // 應找 778

		// 判斷金額是否足夠
		if(change >= 0) {
			System.out.println("付款金額足夠");
		} else {
			System.out.println("付款金額不足");
		}

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
		System.out.printf(" 50元: %d 枚%n", fifty);
		System.out.printf(" 10元: %d 枚%n", ten);
		System.out.printf("  5元: %d 枚%n", five);
		System.out.printf("  1元: %d 枚%n", one);
	}

}
