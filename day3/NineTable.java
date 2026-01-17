package day3;

public class NineTable {

	public static void main(String[] args) {
		// 巢狀迴圈應用:九九乘法表

		// x 從 1 ~ 9 的變化
		for(int x = 1 ; x <= 9 ; x++) {

			// y 從 1 ~ 9 的變化
			for(int y = 1 ; y <= 9 ; y++) {
				System.out.printf("%2d*%2d=%2d ", x, y, (x * y));
			}
			System.out.println();

		}

	}

}