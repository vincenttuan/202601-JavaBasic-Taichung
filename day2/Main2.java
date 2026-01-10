package day2;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * 可樂一瓶: 25 元
		 * 一手有: 6 瓶
		 * 一打有: 12 瓶
		 * 一箱有: 24 瓶
		*/
		int cola = 25; // 可樂一瓶的價格
		int hand = 6;  // 一手有幾瓶
		int doz  = 12; // 一打有幾瓶
		int box  = 24; // 一箱有幾瓶
		
		// 買 ? 箱要多少錢 ?
		int qty = 10; // 數量
		int sum = cola * box * qty;
		
		System.out.printf("可樂一瓶 %d 元 買 %d 箱共需 %d 元%n", cola, qty, sum);

	}

}
