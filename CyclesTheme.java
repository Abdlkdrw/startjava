public class CyclesTheme {
	public static void main(String[] args) {
		// 1. Подсчет суммы четных и нечетных чисел
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int evenSum = 0;
		int oddSum = 0;
		for(int i = -10; i <= 21; i++) {
			do{ 
				int evenSum += i;
			} while(i % 2 != 0) {
				int oddSum += i;
			}
		}
		System.out.println("Сумма чётных чисел = " + evenSum);
	}
}