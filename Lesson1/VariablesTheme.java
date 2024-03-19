public class VariablesTheme {
	public static void main(String[] args) {
		// 1. Вывод характеристик компьютера
		System.out.println("1. Вывод характеристик компьютера");
		
		byte ram = 16;
		System.out.println("Количество ОЗУ: " + ram);
		
		short coresCount = 12;
		System.out.println("Число ядер процессора: " + coresCount);
		
		int maxCoreTemp = 100;
		System.out.println("Максимальная температура процессора: " + maxCoreTemp);
		
		long cpuName = 12500;
		System.out.println("Имя процессора: " + cpuName);
		
		float cpuFreq = 2.5f;
		System.out.println("Базовая частота процессора: " + cpuFreq);
		
		double osBuild = 22631.2861;
		System.out.println("Сборка ОС: " + osBuild);
		
		char cpuGen = '5';
		System.out.println("Поколение процессора: " + cpuGen);
		
		boolean isWork = true;
		System.out.println("ПК работает: " + isWork + "\n"); 

		// 2. Расчет стоимости товара со скидкой
		System.out.println("2. Расчет стоимости товара со скидкой");
		
		int penPrice = 100;
		int bookPrice = 200;
		int discount = 11;
		int total = penPrice + bookPrice;
		int discountSum = (total * discount) / 100;
		int discountPrice = total - discountSum;
		System.out.println("Общая стоимость товаров без скидки = " + total);
		System.out.println("Сумма скидки = " + discountSum);
		System.out.println("Общая стоимость товаров со скидкой = " + discountPrice + "\n");
	
		// 3. Вывод слова JAVA
		System.out.println("3. Вывод слова JAVA");
		
		System.out.println("   J    a  v     v  a");
		System.out.println("   J   a a  v   v  a a");
		System.out.println("J  J  aaaaa  V V  aaaaa");
		System.out.println(" JJ  a     a  V  a     a \n");
		
		// 4. Вывод min и max значений целых числовых типов
		System.out.println("4. Вывод min и max значений целых числовых типов");
		
		byte numByte = 127;
		System.out.println("первоначальное значение byte: " + numByte);
		System.out.println("значение byte после инкремента на единицу: " + ++numByte);
		System.out.println("значение byte после декремента на единицу: " + --numByte + "\n");
		
		short numShort = 32767;
		System.out.println("первоначальное значение short: " + numShort);
		System.out.println("значение short после инкремента на единицу: " + ++numShort);
		System.out.println("значение short после декремента на единицу: " + --numShort + "\n");
		
		int numInt = 2147483647;
		System.out.println("первоначальное значение int: " + numInt);
		System.out.println("значение int после инкремента на единицу: " + ++numInt);
		System.out.println("значение int после декремента на единицу: " + --numInt + "\n");
		
		long numLong = 9223372036854775807L;	
		System.out.println("первоначальное значение long: " + numLong);
		System.out.println("значение long после инкремента на единицу: " + ++numLong);
		System.out.println("значение long после декремента на единицу: " + --numLong + "\n");
		
		// 5. Перестановка значений переменных
		System.out.println("5. Перестановка значений переменных");	
		
		int num1 = 2;
		int num2 = 5;
		System.out.println("Исходные значения: num1 = " + num1 + ", num2 = " + num2);
		
		// с помощью третьей переменной
		int swap = num1;
		num1 = num2;
		num2 = swap;
		System.out.println("Перестановка значений с помощью третьей переменной: num1 = " + num1 + ", num2 = " + num2 + "\n");
		
		// с помощью арифметических операций
		System.out.println("Исходные значения: num1 = " + num1 + ", num2 = " + num2);
		num1 += num2; 
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("Перестановка значений с помощью арифметических операций: num1 = " + num1 + ", num2 = " + num2 + "\n");
		
		// с помощью побитовой операции ^
		System.out.println("Исходные значения: num1 = " + num1 + ", num2 = " + num2);
		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;
		System.out.println("Перестановка значений с помощью побитовой операции ^: num1 = " + num1 + ", num2 = " + num2 + "\n");
			
		// 6. Вывод символов и их кодов
		System.out.println("6. Вывод символов и их кодов");

		char dollar = '$';
		char asterisk = '*';
		char atSign = '@';
		char verticalBar = '|';
		char tilde = '~';
		System.out.println((int) dollar + " - " + dollar);
		System.out.println((int) asterisk + " - " + asterisk);
		System.out.println((int) atSign + " - " + atSign);
		System.out.println((int) verticalBar + " - " + verticalBar);
		System.out.println((int) tilde + " - " + tilde + "\n");
	
		// 7. Вывод в консоль ASCII-арт Дюка
		System.out.println("7. Вывод в консоль ASCII-арт Дюка");

		char slash = '/';
		char backslash = '\\';
		char underscore = '_';
		char leftParenthesis = '(';
		char rightParenthesis = ')';
		System.out.println("    " + slash + backslash);
		System.out.println("   " + slash + "  " + backslash);
		System.out.println("  " + slash + underscore + leftParenthesis + " " + 
				rightParenthesis + backslash);
		System.out.println(" " + slash + "      " + backslash);
		System.out.println("" + slash + underscore + underscore + underscore + underscore + 
				slash + backslash + underscore + underscore + backslash + "\n");

		// 8. Вывод количества сотен, десятков и единиц числа
		System.out.println("8. Вывод количества сотен, десятков и единиц числа");

		int number = 123;
		int hundreds = number / 100;
		int tens = (number % 100) / 10;
		int ones = number % 10;
		int sumDigits = hundreds + tens + ones;
		int multiplicationDigits = hundreds * tens * ones;
		System.out.println("Число " + number + " содержит: ");
		System.out.println("сотен - " + hundreds);
		System.out.println("десятков - " + tens);
		System.out.println("единиц - " + ones);
		System.out.println("Сумма его цифр = " + sumDigits);
		System.out.println("Произведение = " + multiplicationDigits + "\n");

		// 9. Вывод времени
		System.out.println("9. Вывод времени");

		int time = 86399;
		int hours = time / 3600;
		int minutes = (time % 3600) / 60;
		int seconds = time % 60;
		System.out.println("Текущее время - " + hours + ":" + minutes + ":" + seconds);
	} 
}	