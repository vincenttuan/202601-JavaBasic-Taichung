package day3;

import java.util.Random;

public class Test6 {
	public static void main(String[] args) {
		// 1~99 之間印出 10 個隨機偶數
		// 偶數判斷: if (num % 2 == 0) 表示 num 是偶數 <-- 初學者邏輯
		// 偶數判斷: 當不是偶數時,提早進入下一次的迴圈   <-- 進階者邏輯 countine 的使用

		Random r = new Random();
		int n = 10;
		
		while(n > 0) {
			int num = r.nextInt(99) + 1; // 1~99

			if(num % 2 != 0) {
				continue;
			}

			System.out.printf("n = %2d, num = %2d%n", n, num);
			n--;

		}
		
	}
}