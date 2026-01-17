package day3;

import java.security.SecureRandom;

public class Test2 {

	public static void main(String[] args) {
		// 樂透四星彩-電腦選號
		SecureRandom s1 = new SecureRandom();
		int num1 = s1.nextInt(10); // 0~9
		int num2 = s1.nextInt(10); // 0~9
		int num3 = s1.nextInt(10); // 0~9
		int num4 = s1.nextInt(10); // 0~9

		System.out.printf("樂透四星彩-電腦選號: %d %d %d %d%n", num1, num2, num3, num4);

	}

}