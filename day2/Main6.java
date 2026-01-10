package day2;

public class Main6 {
	public static void main(String[] args) {
		/*
		 * 可樂一瓶 20 元
		 * 買 3 送 1 (買 x 送 y)
		 * 買 10 瓶要花多少錢
		*/
		int cola = 20;
		int qty = 10;
		int x = 3; // 買 x 送 y
		int y = 1; 

		//int bottles = 3 * (qty / 4) + (qty % 4);
		int bottles = x * (qty / (x+y)) + (qty % (x+y));
		int sum = cola * bottles;

		System.out.printf("可樂一瓶 %d 元 (買%d送%d) 買 %d 瓶需花費 %d 元%n", cola, x, y, qty, sum);
		System.out.printf("實際要支付的瓶數 bottles = %d%n", bottles);

	}
}
