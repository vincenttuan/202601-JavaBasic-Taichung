package day2;

public class Main5 {

	public static void main(String[] args) {
		/*
		 * 可樂一瓶 20 元
		 * 買二送一
		 * 買 10 瓶要花多少錢
		*/
		int cola = 20;
		int qty = 10;
		int bottles = 2*(qty / 3) + (qty % 3);
		int sum = cola * bottles;

		System.out.printf("可樂一瓶 %d 元 (買二送一) 買 %d 瓶需花費 %d 元%n", cola, qty, sum);
		System.out.printf("實際要支付的瓶數 bottles = %d%n", bottles);
	}

}