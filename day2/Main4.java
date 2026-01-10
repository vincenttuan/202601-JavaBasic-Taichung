package day2;

public class Main4 {

	public static void main(String[] args) {
		/*
		 * 可樂一瓶 20 元
		 * 買一送一
		 * 買 ? 瓶要花多少元
		*/
		int cola = 20; // 每瓶價格
		int qty = 9;  // 要買的瓶數
		int bottles = (qty / 2) + (qty % 2); // 實際要支付的瓶數

		int sum = cola * bottles; // 實際要支付的錢 = cola * bottles

		System.out.printf("可樂一瓶 %d 元 (買一送一) 買 %d 瓶需花費 %d 元%n", cola, qty, sum);
	}

}
