package day2;

public class Main3 {

	public static void main(String[] args) {
		/*
		 * 浮點數 (double) 應用
		 * 半徑 r = 10
		 * 請計算出圓面積與球體積
		 * 圓面積公式: r * r * 3.14
		 * 球體積公式: 4/3 * r * r * r * 3.14
		 * 
		*/
		int r = 10;
		double pi = 3.1415926;
		double area = r * r * pi; // 圓面積
		double volume = 4.0/3 * r * r * r * pi; // 球體積

		System.out.printf("半徑 %d 圓面積 %f 平方單位%n", r, area);
		System.out.printf("半徑 %d 球體積 %f 立方單位%n", r, volume);

	}

}
