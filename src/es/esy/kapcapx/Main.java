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
        // Оператор ++x
        System.out.println("******************" + "Оператор ++var" + "******************");
        System.out.println("Инкремент чисел ++firstNumber " + "[" + ++fistNumber + "]" + "[" + ++secondNumber + "]");
        System.out.println("Декремент чисел --firstNumber " + "[" + --fistNumber + "]" + "[" + --secondNumber + "]");
        // Оператор x++
        System.out.println("******************" + "Оператор var++" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (firstNumber++)  " + "[" + fistNumber++ + "]" + "  (secondNumber++) " + "[" + secondNumber++ + "]");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        // Оператор x+=
        System.out.println("******************" + "Оператор x+=" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (x+=2)  " + "[" + (fistNumber+=2) + "]" + "  (secondNumber++) " + "[" + (secondNumber+=2) + "]");
        // Оператор <<
        System.out.println("******************" + "Оператор <<" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (<<)  " + "[" + (fistNumber << 1) + "]" + "  (<<) " + "[" + (secondNumber << 1) + "]");
        // Оператор >>
        System.out.println("******************" + "Оператор >>" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (>>)  " + "[" + (fistNumber >> 1) + "]" + "  (>>) " + "[" + (secondNumber >> 1) + "]");
        // Оператор >>>
        System.out.println("******************" + "Оператор >>>" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (>>>)  " + "[" + (fistNumber >> 1) + "]" + "  (>>>) " + "[" + (secondNumber >> 1) + "]");
        // Integer обёртка << >>
        System.out.println("******************" + "Обёртка Integer" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (<<)  " + "[" + Integer.toBinaryString(Integer.rotateLeft(fistNumber, 1)) + "]" + "  (>>) " + "[" + Integer.toBinaryString(Integer.rotateRight(secondNumber, 1)) + "]");
        // Оператор ~
        System.out.println("******************" + "Оператор ~ Побитовый переворот числа" + "******************");
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        System.out.println("Оператор (~)  " + "[" + (~fistNumber) + "]" + "  (~) " + "[" + (~secondNumber) + "]");

    }
}
