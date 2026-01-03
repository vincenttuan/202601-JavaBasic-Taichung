package day1;

// Java 基本型別應用
public class TypeDemo1 {

	public static void main(String[] args) {
		// 整數型別 byte, short, int, long
		// 定義一個變數來存放資料
		int x = 90;
		int y = 80;
		// 總和
		int sum = x + y;
		// 平均
		int avg = sum / 2;
		System.out.println("總分:" + sum);
		System.out.println("平均:" + avg);
		// 最大值:透過數學 API => Math.max(x, y) 來取得
		// 最小值:透過數學 API => Math.min(x, y) 來取得
		System.out.println("最大值:" + Math.max(x, y));
		System.out.println("最小值:" + Math.min(x, y));
		// 平方:透過數學 API => Math.pow(x, 2) 來取得
		System.out.println("x 的平方:" + Math.pow(x, 2));
		// 開根號:透過數學 API => Math.sqrt(x) 來取得
		System.out.println("x 開根號:" + Math.sqrt(x));
	}

}