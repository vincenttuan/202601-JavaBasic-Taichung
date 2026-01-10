package day2;


public class Main11 {
	public static void main(String[] args) {
		// col = 1, 8 玩具
		// col = 2, 3, 7, 6 飲料
		// col = 4, 5 糖果

		int col = 2;

		if(col == 1 || col == 8) {
			System.out.println("玩具一個");
		} else if(col == 2 || col == 3 || col == 6 || col == 7) {
			System.out.println("飲料一瓶");
		} else if(col == 4 || col == 5) {
			System.out.println("糖果一顆");
		} else {
			System.out.println("資料錯誤");
		}

		// 改用 switch-case
		switch(col) {
			case 1:
			case 8:	
				System.out.println("玩具一個");
				break;
			case 2:
			case 3:
			case 6:
			case 7:
				System.out.println("飲料一瓶");
				break;
			case 4:
			case 5:
				System.out.println("糖果一顆");
				break;
			default:
				System.out.println("資料錯誤");	
		}
	}
}
