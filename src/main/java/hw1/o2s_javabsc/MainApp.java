package hw1.o2s_javabsc;

public class MainApp {
/*
(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”;
(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно,
    то “Желтый”, если больше 20 - “Зеленый”;
*/
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        greetings();
        checkSign(-11,4,-99);
        selectColor();
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
}
