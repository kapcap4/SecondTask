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
        // Приведение примитивных типов данных
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4E+38f;
        double d = 1.7E+308;

        System.out.println("******************" + "Приметивные типы данных" + "******************");
        System.out.println("Тип byte значение " + "[" + b + "]");
        System.out.println("Тип short значение " + "[" + s + "]");
        System.out.println("Тип int значение " + "[" + i + "]");
        System.out.println("Тип long значение " + "[" + l + "]");
        System.out.println("Тип float значение " + "[" + f + "]");
        System.out.println("Тип double значение " + "[" + d + "]");
        System.out.println("");

        int i1 = b + 1;
        System.out.println("Тип int <-- byte " + "[" + i1 + "]");
        long l3 = b + 1;
        System.out.println("Тип long <-- byte " + "[" + l3 + "]");
        long l1 = s + 1;
        System.out.println("Тип long <-- short " + "[" + l1 + "]");

        float f1 = b;
        System.out.println("Тип float <-- byte " + "[" + f1 + "]");
        float f2 = s;
        System.out.println("Тип float <-- short " + "[" + f2 + "]");
        float f3 = i;
        System.out.println("Тип float <-- int " + "[" + f3 + "]");
        double f4 = l;
        System.out.println("Тип double <-- long " + "[" + f4 + "]");

    }
}
