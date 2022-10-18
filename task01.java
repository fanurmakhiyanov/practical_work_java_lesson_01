// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
           
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        int triangleNum = n * (n + 1) / 2;
        System.out.printf("Для числа %d требуется %d точек для расставления в форме правильного треугольника", n, triangleNum);
        iScanner.close();

    }
}