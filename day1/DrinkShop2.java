package day1;

public class DrinkShop2 {

	public static void main(String[] args) {
		blackTea();
		System.out.println("----------");
		blackTea();
		System.out.println("----------");
		coffee();
		System.out.println("----------");
		milkTea();
		System.out.println("----------");
		latte();
	}

	// 自訂製作紅茶的方法
	static void blackTea() {
		System.out.println("製作紅茶");
		System.out.println("一個杯子");
		System.out.println("加入紅茶");
		System.out.println("無糖");
		System.out.println("去冰");
	}

	// 自訂製作咖啡的方法
	static void coffee() {
		System.out.println("製作咖啡");
		System.out.println("一個杯子");
		System.out.println("加入咖啡粉");
		System.out.println("加入熱水");
		System.out.println("攪拌均勻");
		System.out.println("加糖");
	}

	// 自訂製作牛奶
	static void milk() {
		System.out.println("製作牛奶");
		System.out.println("一個杯子");
		System.out.println("加入奶粉");
		System.out.println("加入熱水");
		System.out.println("攪拌均勻");
	}

	// 自訂製作奶茶
	static void milkTea() {
		blackTea();
		milk();
	}

	// 自訂製作拿鐵
	static void latte() {
		coffee();
		milk();
	}

}