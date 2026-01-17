package day3;

import java.util.Random;
import java.security.SecureRandom;

// 隨機
public class Test1 {
	public static void main(String[] args) {
		Random r1 = new Random();
		System.out.println(r1.nextInt()); // 取出隨機整數
		System.out.println(r1.nextInt(100)); // 0~99 隨機整數
		System.out.println(r1.nextInt(9) + 1); // 1~9 隨機整數
		System.out.println(r1.nextInt(11) + 10); // 10~20 隨機整數
		System.out.println(r1.nextInt(11) + 5);  // 5~15 隨機整數

		System.out.println("-------");
		SecureRandom r2 = new SecureRandom();
		System.out.println(r2.nextInt()); // 取出隨機整數(不可預測)
		System.out.println(r2.nextInt(100)); // 0~99 隨機整數(不可預測)
		System.out.println(r2.nextInt(9) + 1); // 1~9 隨機整數(不可預測)
	}
}