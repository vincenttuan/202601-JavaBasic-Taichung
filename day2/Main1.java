package day2;

public class Main1 {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int sum = x + y; // 加法 = 8
		int sub = x - y; // 減法 = 2
		int mul = x * y; // 乘法 = 15
		int div = x / y; // 除法 = 1 而非 1.6666
		int mod = x % y; // 餘數 = 2
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println(x + " - " + y + " = " + sub);
		System.out.println(x + " * " + y + " = " + mul);
		System.out.println(x + " / " + y + " = " + div);
		System.out.println(x + " % " + y + " = " + mod);
		/* 
		 *-----------------------------------------------
		 * 透過 printf 來印出內容 (jdk 1.4)               
		 *-----------------------------------------------
		*/
		System.out.printf("%d + %d = %d%n", x, y, sum);
		System.out.printf("%d - %d = %d%n", x, y, sub);
		System.out.printf("%d * %d = %d%n", x, y, mul);
		System.out.printf("%d / %d = %d%n", x, y, div);
		System.out.printf("%d %% %d = %d%n", x, y, mod);


	}

}
