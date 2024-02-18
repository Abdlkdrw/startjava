public class IfElseStatementTheme {
	public static void main(String[] args) {
		// 1. Перевод псевдокода на язык Java
		System.out.println("1. Перевод псевдокода на язык Java");
		String gender = "male";
		if (gender != "male") {
			System.out.println("Вы не подлежите призыву!");
		} else {
			System.out.println("Вы должны пройти срочную службу!!!");
		}

		int age = 20;
		if (age > 18) {
			System.out.println("Вы совершеннолетний");
		} else {
			System.out.println("Вы несовершеннолетний");
		}

		double height = 1.7;
		if (height < 1.8) {
			System.out.println("Ваш рост ниже чем среднестатистический рост РФ");
		} else {
			System.out.println("Ваш рост выше чем среднестатистический рост РФ");
		}

		char nameFirstLetter = "Nurulla".charAt(0);
		if (nameFirstLetter == 'M') {
			System.out.println("Ваше имя начинается на " + nameFirstLetter + "\n");
		} else if (nameFirstLetter == 'I') {
			System.out.println("Ваше имя начинается на " + nameFirstLetter + "\n");
		} else {
			System.out.println("Ваше имя начинается на " + nameFirstLetter + "\n");
		}

		// 2. Поиск большего числа
		System.out.println("2. Поиск большего числа");
		int num1 = 42;
		int num2 = 56;
		if (num1 > num2) {
			System.out.println("Число " + num1 + " больше числа " + num2 + "\n");
		} else if (num1 < num2) {
			System.out.println("Число " + num2 + " больше числа " + num1 + "\n");
		} else {
			System.out.println("Число " + num1 + " и число " + num2 + " равны\n");
		}

		// 3. Проверка числа
		System.out.println("3. Проверка числа");
		int checkNum = -197;
		if (checkNum == 0) {
			System.out.println("Введённое число равно 0 \n");
		} else {
			if (checkNum > 0) {
				System.out.print("Число " + checkNum + " является положительным");
			} else {
				System.out.print("Число " + checkNum + " является отрицательным");
			}
			if (checkNum % 2 == 0) {
				System.out.print(" и чётным\n");
			} else {
				System.out.print(" и нечётным\n");
			}
		}

		// 4. Поиск одинаковых цифр в числах
		System.out.println("4. Поиск одинаковых цифр в числах");
		int number1 = 123;
		int number2 = 223;
		int hundreds1 = number1 / 100;
		int hundreds2 = number2 / 100;
		int tens1 = (number1 % 100) / 10;
		int tens2 = (number2 % 100) / 10;
		int ones1 = number1 % 10;
		int ones2 = number2 % 10;
		if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
			System.out.println(number1 + " " + number2);
			if (hundreds1 == hundreds2) {
				System.out.println(hundreds1 + " - 3-й разряд");
			} 
			if (tens1 == tens2) {
				System.out.println(tens1 + " - 2-й разряд");
			} 
			if (ones1 == ones2){
				System.out.println(ones1 + " - 1-й разряд");
			}
		} else {
			System.out.println("Нет равных цифр в разрядах чисел");
		}
		System.out.println();

		// 5. Определение символа по его коду
		System.out.println("5. Определение символа по его коду");
		char code = '\u0031';
		System.out.println("Символ " + code);
		if (code >= '0' && code <= '9') {
			System.out.println("Символ " + code + " является цифрой\n");
		} else if (code >= 'A' && code <= 'Z') {
			System.out.println("Символ " + code + " является большой буквой\n");
		} else if (code >= 'a' && code <= 'z') {
			System.out.println("Символ " + code + " является маленькой буквой\n");
		} else {
			System.out.println("Символ " + code + " не является ни буквой, ни цифрой\n");
		}

		// 6. Подсчет суммы вклада и начисленных банком %
		System.out.println("6. Подсчет суммы вклада и начисленных банком %");
		int depositSum = 30000;
		int interestRate = 5;
		if (depositSum >= 100000 && depositSum <= 300000) {
			interestRate = 7;
		} else if (depositSum > 3000000) {
			interestRate = 10;
		}
		System.out.println("Сумма вклада = " + depositSum);
		int interestRateSum = (depositSum * interestRate) / 100;
		System.out.println("Сумма начисленного процента = " + interestRateSum);
		int totalSum = depositSum + interestRateSum;
		System.out.println("Итоговая сумма = " + totalSum + "\n");

		// 7. Определение оценки по предметам
		System.out.println("7. Определение оценки по предметам");
		int historyPercent = 59;
		int historyGrade = 5;
		if (historyPercent <= 60) {		
			historyGrade = 2;
		} else if (historyPercent > 60 && historyPercent < 73) {
			historyGrade = 3;
		} else if (historyPercent > 73 && historyPercent < 91) {
			historyGrade = 4;
		}
		int csPercent = 92;
		int csGrade = 5;
		if (csPercent <= 60) {		
			csGrade = 2;
		} else if (csPercent > 60 && csPercent < 73) {
			csGrade = 3;
		} else if (csPercent > 73 && csPercent < 91) {
			csGrade = 4;
		}
		System.out.println("История - " + historyGrade);
		System.out.println("Программирование - " + csGrade);
		float averageGrade = (float) (historyGrade + csGrade) / 2;
		System.out.println("Средний балл оценок по предметам = " + averageGrade);
		float averagePercent = (float) (historyPercent + csPercent) / 2;
		System.out.print("Средний % по предметам = " + averagePercent + "%\n");

		// 8. Расчет годовой прибыли
		System.out.println("8. Расчет годовой прибыли");
		int monthlyIncome = 13000;
		int roomRentForMonth = 5000;
		int productionCostForMonth = 9000;
		int profitForYear = (monthlyIncome - roomRentForMonth - productionCostForMonth) * 12;
		if (profitForYear <= 0) {
			System.out.print("Прибыль за год: " + profitForYear);
		} else {
			System.out.print("Прибыль за год: +" + profitForYear);
		}
	}
}



