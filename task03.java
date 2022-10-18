// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class task03 {
        public static void main(String[] args) {
           double number1;
           double number2;
           double answer;
           char operation;

        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите первое число: ");
        number1 = iScanner.nextDouble();
        System.out.printf("Введите второе число: ");
        number2 = iScanner.nextDouble();
        
        System.out.print("\nВозможные операции над числами:\n'+' - сложение\n'-' - вычитание\n'*' - умножение\n'/' - деление: \nВведите символ операции: ");
        operation = iScanner.next().charAt(0);
        iScanner.close();

        switch(operation) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1 / number2;
                break;
            default:  System.out.printf("\nОшибка! Введите корректный символ операции над числами");
                return;
        }

        System.out.print("\nРезультат операции:\n");
        System.out.printf(number1 + " " + operation + " " + number2 + " = " + answer + "\n");

    }
}