public class CyclesTheme {
	public static void main(String[] args) {
		// // 1. Подсчет суммы четных и нечетных чисел
		// System.out.println("1. Подсчет суммы четных и нечетных чисел");
		// int startNum = -10;
		// int evenNumSum = 0;
		// int oddNumSum = 0;
		// do {
		// 	if(startNum % 2 == 0) {
		// 		evenNumSum += startNum;
		// 	} else {
		// 		oddNumSum += startNum;
		// 	}
		// 	startNum++;
		// } while(startNum <= 21);
		// System.out.println("В отрезке [-10, 21] сумма четных чисел = " + 
		// 			       evenNumSum + ", а нечетных = " + oddNumSum + "\n");

		// // 2. Вывод чисел в порядке убывания
		// System.out.println("2. Вывод чисел в порядке убывания");
		// int numbers[] = {10, 5, -1};
		// int min = 0;
		// int max = 0;
		// for(int num : numbers) {
		// 	if(num > max) {
		// 	 	max = num;
		// 	}
		// 	if(num < min) {
		// 		min = num;
		// 	} 
		// }
		// for(int i = max - 1; i > min; i--) {
		// 	System.out.print(i + " ");
		// }
		// System.out.println("\n"); 

		// // 3. Вывод реверсивного числа и суммы его цифр
		// System.out.println("3. Вывод реверсивного числа и суммы его цифр");
		// int initialNum = 1234;
		// int digitSum = 0;
		// while(initialNum > 0) {
		// 	int digit = initialNum % 10;
		// 	System.out.print(digit);
		// 	digitSum += digit;
		// 	initialNum /= 10;
		// }
		// System.out.println();
		// System.out.println("Сумма цифр числа 1234 = " + digitSum + "\n");

		// // 4. Вывод чисел в несколько строк
		// System.out.println("4. Вывод чисел в несколько строк");
		// int endNum = 30;
		// int rowNum = -1;
		// for(int i = 1; i < endNum; i++) {
		// 	if(i % 2 != 0) {
		// 		if(rowNum == 4) {
		// 			rowNum = 0;
		// 			System.out.println();
		// 		} else {
		// 			rowNum++;
		// 		}
		// 		System.out.printf("%3d", i);
		// 	}
		// }
		// int zerosCount = 4 - rowNum;
		// for(int i = 0; i < zerosCount; i++) {
		// 	System.out.printf("%3d", 0);
		// }

		// // 5. Проверка количества двоек числа на четность/нечетность
		// System.out.println("5. Проверка количества двоек числа на четность/нечетность");
		// int startsNum = 3242592;
		// int twosCounter = 0;
		// while(startsNum > 0) {
		// 	if(startsNum % 10 == 2) {
		// 		twosCounter++;
		// 	}
		// 	startNum /= 10;
		// }
		// if(twosCounter % 2 == 0) {
		// 	System.out.println("В 3242592 четное количество двоек - " + twosCounter);
		// } else {
		// 	System.out.println("В 3242592 нечетное количество двоек - " + twosCounter);
		// }

		// 6. Отображение геометрических фигур
		System.out.println("6. Отображение геометрических фигур");
		for(int i = 0; i < 5; i++) {
			System.out.println("**********");
		}
	}
}