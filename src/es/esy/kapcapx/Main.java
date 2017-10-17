package es.esy.kapcapx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fistNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        fistNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        secondNumber = scanner.nextInt();

        System.out.println("Сумма чисел " + "[" + (fistNumber + secondNumber) + "]");
        System.out.println("Разность чисел " + "[" + (fistNumber - secondNumber) + "]");
        System.out.println("Деление чисел " + "[" + (fistNumber / secondNumber) + "]");
        System.out.println("Остаток от деления чисел " + "[" + (fistNumber % secondNumber) + "]");
        System.out.println("Деление по модулю 2 " + "[" + ((fistNumber / secondNumber) % 2) + "]");
        System.out.println("******************" + "Оператор ++var" + "******************");
        System.out.println("Инкремент чисел ++firstNumber " + "[" + ++fistNumber + "]" + "[" + ++secondNumber + "]");
        System.out.println("Декремент чисел --firstNumber " + "[" + --fistNumber + "]" + "[" + --secondNumber + "]");
        System.out.println("******************" + "Оператор var++" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (firstNumber++)  " + "[" + fistNumber++ + "]" + "  (secondNumber++) " + "[" + secondNumber++ + "]");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("******************" + "Оператор x+=" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (x+=2)  " + "[" + (fistNumber+=2) + "]" + "  (secondNumber++) " + "[" + (secondNumber+=2) + "]");


    }
}
