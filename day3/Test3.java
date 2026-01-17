package day3;

import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		
		Random r = new Random();

		while(true) {
			int num = r.nextInt(100); // 0~99

			System.out.printf("num = %d%n", num);

			// 若 num == 0 就跳離迴圈
			if(num == 0) {
				break; // 跳離迴圈
			}

		}

	}

}