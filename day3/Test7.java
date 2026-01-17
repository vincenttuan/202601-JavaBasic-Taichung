package day3;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

	// 1~9 猜一個數字
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		//int ans = 8;
		int ans = r.nextInt(9) + 1; // 1~9 隨機數

		do {
			System.out.printf("請輸入 1~9 數字 ==> ");
			int guess = sc.nextInt();
			if(guess > ans) {
				System.out.println("猜大了");
				continue;
			} else if(guess < ans) {
				System.out.println("猜小了");
				continue;
			} else {
				System.out.println("猜對了");
				break;
			}

		} while(true);

		System.out.println("Game over !");
	}

}