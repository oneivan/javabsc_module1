package hw1.lesson3;

import java.util.Scanner;

public class MainApp {
/*
(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”;
(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно,
    то “Желтый”, если больше 20 - “Зеленый”;
(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то метод
    должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
(*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод,
    соответствующий указанному номеру со случайным значением аргументов;

    Домашнее задание сдается через Pull Request!
*/
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        // (*)
        Scanner sc = new Scanner(System.in);
        int mth = sc.nextInt();
        if ( mth >= 1 && mth <= 5 ) {
            int aa = (int) (Math.random()*100);
            int bb = (int) (Math.random()*100);
            int cc = (int) (Math.random()*100);
            boolean ff = (boolean) (cc % 2 == 0);
            System.out.println("aa="+aa+" bb="+bb+" cc="+cc+" ff="+ff);
            if ( mth == 1 ) greetings();
            if ( mth == 2 ) checkSign(aa,bb,cc);
            if ( mth == 3 ) selectColor();
            if ( mth == 4 ) compareNumbers();
            if ( mth == 5 ) addOrSubtractAndPrint(aa,bb, ff);
        }
        else {
            greetings();
            checkSign(-11,4,-99);
            selectColor();
            compareNumbers();
            addOrSubtractAndPrint(22,2, false);
        }
    }
    public static void checkSign( int a, int b, int c ) {
        if ( a+b+c >= 0 )
            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    public static void selectColor() {
        int data = (int) (Math.random()*100);
        System.out.println("data="+data);
        if ( data <= 10 )
            System.out.println("Красный");
        else if (data <= 20 )
            System.out.println("Желтый");
        else System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a=10, b=11;
        if ( a >= b )
            System.out.println("a >= b");
        else System.out.println("a < b");
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment)
            System.out.println(initValue + delta);
        else System.out.println(initValue - delta);
    }
}
