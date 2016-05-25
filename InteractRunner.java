// Класс для запуска калькулятора

import java.util.Scanner;

public class InteractRunner {
	public static void main (String[] arg) {
		Scanner reader = new Scanner(System.in);
		
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter type arithmetic operation :");
				String op_type = reader.next();				
				System.out.println("Enter first arg :");
				String first = reader.next();
				System.out.println("Enter second arg :");
				String second = reader.next();
				
				switch (op_type) {
					case "+": {
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
					case "-": {
						calc.subtract(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
					case "*": {
						calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
					case "/": {
						calc.divide(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
				}
				
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		}
		finally {
			reader.close();
		}
	}
}