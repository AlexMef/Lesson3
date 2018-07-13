package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    //  Задание 1. Написать программу, которая вычисляет частное двух чисел
//        double firstValue;
//        double secondValue;
//    //  Ввод значений с клавиатуры
//        System.out.print("Введите первое значение = ");
//        firstValue = in.nextDouble();
//        System.out.print("Введите второе значение = ");
//        secondValue = in.nextDouble();
//
//        divide(firstValue, secondValue);

//        Задание 2. Написать программу для проверки знания даты основания Одессы. В случае неправильного ответа программа должна выводить правильный.
//        int date;
//        System.out.print("Введите год основания Одессы : ");
//        date = in.nextInt();
//        if (date == 1794){
//            System.out.println("Верно! Одесса была основана в 1794 году!");
//        } else {
//            System.out.println("Вы ошиблись! Одесса была основана в 1794 году!");
//        }

//
//        Задание 3. Написать программу для вычисления стоимости покупки с учётом скидки (3%, 5%, 7%, 10%)
//        int discount = 0;
//        double price;
//
//        System.out.print("Введите цену покупки : ");
//        price = in.nextDouble();
//
//        if (price <= 0){
//            System.err.println("Сумма покупки не может быть меньше или равна 0");
//        } else if (price >= 5000){
//            discount = 10;
//        } else if (price >= 3000){
//            discount = 7;
//        } else if (price >= 1000){
//            discount = 5;
//        } else if (price >= 500){
//            discount = 3;
//        }
//
//        System.out.println("Сумма покупки без скидки составляет: " + price);
//        System.out.println("Сумма покупки со скидкой составляет: " + ((100-discount) * price)/100 );
//        System.out.println("Скидка составляет: " + discount + " %");

//        Задание 4. Написать программу, которая проверяет, является ли введенное число чётным
//        int divByTwo;
//        System.out.print("Введите число для проверки на чётность: ");
//        divByTwo = in.nextInt();
//        if (divByTwo % 2 == 0){
//            System.out.println("Число " + divByTwo + " - чётное");
//        } else {
//            System.out.println("Число " + divByTwo + " - нечётное");
//        }

//        Задание 5. Написать программу, которая проверяет, делится ли на три введённое с клавиатуры число
//        int divByThree;
//        System.out.print("Введите число для проверки деления на 3 : ");
//        divByThree = in.nextInt();
//        if (divByThree % 3 == 0){
//            System.out.println("Число " + divByThree + " делится на 3");
//        } else {
//            System.out.println("Число " + divByThree + " нацело на 3 не делится");
//        }

//        6. Написать программу для вычисления стоимости разговора по телефону с учётом 20% скидки, предоставляемой по субботам и воскресеньям.
//        Стоимость одной минуты разговора в гривнах
//        double speakCost = 0.5;
//        double discount = 0.2;
//        int speakTime_Minutes;
//        double speakPrice = 0;
//        int dayNumber = 0;
//        System.out.println("Вычисление стоимости телефонного разговора (стоимость минуты разговора без скидки - 0.5 грн)");
//        System.out.print("Длительность разговора (целое количество минут): ");
//        speakTime_Minutes = in.nextInt();
//        do {
//            System.out.println("Введите день недели (Понедельник - 1, Вторник - 2 ... Воскресенье - 7");
//                dayNumber = in.nextInt();
//        } while (dayNumber < 1 || dayNumber > 7);
//
//        switch (dayNumber){
//            case 1: case 2: case 3: case 4: case 5:
//                speakPrice = (speakTime_Minutes * speakCost);
//                break;
//            case 6: case 7:
//                speakPrice = (speakTime_Minutes * (speakCost * (1 - discount)));
//        }
//        System.out.println("Стоимость разговора равна = " + speakPrice + " грн");


////      Задание 7. Дано трёхзначное число. Определить, какая из его цифр больше
//        int threeDigitValue;
//        System.out.print("Введите трёхзначное число : ");
//        threeDigitValue = in.nextInt();
//        if (threeDigitValue < 100 || threeDigitValue > 999){
//            System.err.println("Введенное число не является трёхзначным");
//            return;
//        }
//        int firstDigit = threeDigitValue/100;
//        int secondDigit = (threeDigitValue/10)%10;
//        int thirdDigit = (threeDigitValue)%10;
////        Проверка значений цифр
//        System.out.println(firstDigit);
//        System.out.println(secondDigit);
//        System.out.println(thirdDigit);
//
//        if (firstDigit > thirdDigit){
//            System.out.println("Первая цифра числа : " + firstDigit + " больше чем Третья : " +  thirdDigit);
//        } else if (firstDigit < thirdDigit) {
//            System.out.println("Первая цифра числа : " + firstDigit + " меньше чем Третья : " +thirdDigit);
//        } else {
//            System.out.println("Первая цифра числа : " + firstDigit + " равна Третьей : " + thirdDigit  );
//        }
//
//        if (firstDigit > secondDigit){
//            System.out.println("Первая цифра числа : " + firstDigit + " больше чем Вторая : " +  secondDigit);
//        } else if (firstDigit < secondDigit) {
//            System.out.println("Первая цифра числа : " + firstDigit + " меньше чем Вторая : " + secondDigit);
//        } else {
//            System.out.println("Первая цифра числа : " + firstDigit + " равна Второй : " + secondDigit);
//        }
//
//        if (secondDigit > thirdDigit){
//            System.out.println("Вторая цифра числа : " + secondDigit + " больше чем Третья : " +  thirdDigit);
//        } else if (secondDigit < thirdDigit) {
//            System.out.println("Вторая цифра числа : " + secondDigit + " меньше чем Третья : " + thirdDigit);
//        } else {
//            System.out.println("Вторая цифра числа : " + secondDigit + " равна Третьей : " + thirdDigit);
//        }

////      Задание 8. Дано трёхзначное число. Определить, равен ли квадрат этого числа сумме кубов его цифр
//        int threeDigitValue;
//        threeDigitValue = in.nextInt();
//        int firstDigit = threeDigitValue/100;
//        int secondDigit = (threeDigitValue/10)%10;
//        int thirdDigit = (threeDigitValue)%10;
//        if (Math.pow(threeDigitValue, 2) == (Math.pow(firstDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3))){
//            System.out.println("Квадрат введенного числа равен сумме кубов его цифр");
//        } else {
//            System.out.println("Квадрат введенного числа НЕ равен сумме кубов его цифр");
//        }

////        Задание 9. Даны вещественные числа х и у, не равные друг другу. Меньшее из этих чисел заменить половиной их суммы, а большее - их удвоенным произведением
//        double x;
//        double y;
//        do {
//            System.out.print("Введите x : ");
//            x = in.nextInt();
//            System.out.print("Введите у : ");
//            y = in.nextInt();
//        } while (x == y);
//
//        System.out.println("Исходный х : " + x + " исходный у : " + y);
//        if (x > y){
//            double temp = y;
//            y = (x + y)/2;
//            x = (temp * x)*2;
//        } else {
//            double temp = y;
//            y = (x * y) / 2;
//            x = (x + temp)/2;
//        }
//        System.out.println("Новое значение х : " + x + " новый y : " + y);


    }

    private static void divide(double firstValue, double secondValue){
        if (secondValue == 0){
            System.err.println("Деление на ноль запрещено!!!");
        } else {
            System.out.println(firstValue/secondValue);
        }
    }
}