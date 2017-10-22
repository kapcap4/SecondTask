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
        System.out.println("");

        // Разные системы счисления
        System.out.println("******************" + "Разные системы счисления" + "******************");
        System.out.println("");
        int bin = 4;
        int oct = 9;
        int hex = 10;
        // В двоичном виде выглядит так
        System.out.println("Из десятичного в двоичный");
        System.out.println("Число " + "[" + bin + "]" + " в двоичном виде " + "[" + Integer.toBinaryString(bin) + "]");
        System.out.println("Число " + "[" + oct + "]" + " в восьмеричном виде " + "[" + Integer.toOctalString(oct) + "]");
        System.out.println("Число " + "[" + hex + "]" + " в шестнадцатиричном виде " + "[" + Integer.toHexString(hex) + "]");
        System.out.println("");
        int binary = 0b00000010;
        int octal = 034;
        int hexadecimal = 0xA;
        System.out.println("Число в двоичном виде " + "[" + Integer.toBinaryString(binary) + "]" + " в десятичном виде " + "[" + binary + "]");
        System.out.println("Число в восьмеричном виде " + "[" + Integer.toOctalString(octal) + "]" + " в десятичном виде " + "[" + octal + "]");
        System.out.println("Число в шестнадцатеричном виде " + "[" + Integer.toHexString(hexadecimal) + "]" + " в десятичном виде " + "[" + hexadecimal + "]");
        System.out.println("");
        // Сложение разных систем счисления
        System.out.println("******************" + "Сложение разных систем счисления" + "******************");
        int tmp;
        tmp = binary + octal + hexadecimal;
        System.out.println("Результат сложения " + tmp);
        System.out.println("");
        // Чтение из строки и сложение разных систем счисления
        System.out.println("******************" + "Чтение из строки и сложение разных систем счисления" + "******************");
        String sBin = "00000010";
        String sOct = "34";
        String sHex = "A";
        int resultString;
        resultString = Integer.parseInt(sBin, 2) + Integer.parseInt(sOct, 8) + Integer.parseInt(sHex, 16);
        System.out.println("Результат сложения " + resultString);
        System.out.println("");

        // Тернарный оператор
        System.out.println("******************" + "Тернарный оператор" + "******************");
        final int NUMBER_STANDARD = 1000;
        System.out.println("Сейчас переменная firstNumber " + "[" + fistNumber + "]" + " а переменная secondNumber " + "[" + secondNumber + "]");
        String string = ((fistNumber > NUMBER_STANDARD) && (secondNumber > NUMBER_STANDARD)) ? "ALL" : ((fistNumber > NUMBER_STANDARD) || (secondNumber > NUMBER_STANDARD)) ? "ONLY ONE" : "NO";
        System.out.println(string);
        System.out.println("");

        // Преобразование в тип Boolean
        System.out.println("******************" + "Преобразование в тип Boolean" + "******************");
        System.out.println("Выведет все true, так как проверяет на то, что объект не равен null и вызывает метод сравнения строк без учёта регистра");
        String s1 = "true";
        String s2 = "TRUE";
        String s3 = "tRue";
        String s4 = "True";
        System.out.println("Передаю true результат " + "[" + Boolean.parseBoolean(s1) + "]");
        System.out.println("Передаю TRUE результат " + "[" + Boolean.parseBoolean(s2) + "]");
        System.out.println("Передаю tRue результат " + "[" + Boolean.parseBoolean(s3) + "]");
        System.out.println("Передаю True результат " + "[" + Boolean.parseBoolean(s4) + "]");
        System.out.println("");
    }
}
