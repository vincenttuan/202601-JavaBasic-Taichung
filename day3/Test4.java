package day3;

import java.util.Random;

public class Test4 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// 利用 while 隨機產生 n 個 0~9 的數
		int n = 4;
		while(n > 0) {
			int num = r.nextInt(10); // 0~9
			System.out.printf("n = %d, num = %d%n", n, num);
			//n = n - 1; // n 減去 1
			n--; // n 減去 1
		}

	}

}