import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


// задание 1 //////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner in = new Scanner(System.in); //для ввода чисел
        System.out.println("Задание 1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий \n" +
                "результат,где a, b, c, d – входные параметры этого метода.");
        System.out.println("\nВведите число a:");
        float a = in.nextFloat();
        System.out.println("Введите число b:");
        float b = in.nextFloat();
        System.out.println("Введите число c:");
        float c = in.nextFloat();
        System.out.println("Введите число d:");
        float d = in.nextFloat();

        System.out.print("Итого: " + calculation(a, b, c, d));

// задание 2 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\nЗадание 2. \nНаписать метод, принимающий на вход два числа, и проверяющий что их сумма \n" +
                "лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – " +
                "false.");
        System.out.println("\nВведите число a:");
        int k = in.nextInt();
        System.out.println("Введите число b:");
        int l = in.nextInt();


        System.out.println("Итого: " + checksum(k, l));

// задание 3 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\nЗадание 3. \nНаписать метод, которому в качестве параметра передается целое число, \n" +
                "метод должен вернуть true, если число отрицательноеНаписать метод, которому в качестве параметра \n" +
                "передается целое число, метод должен вернуть true, если число отрицательное");
        System.out.println("\nВведите целое число:");
        int m = in.nextInt();

        System.out.println("Итого: " + checknum(m));

// задание 4 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\nЗадание 4. \nНаписать метод, которому в качестве параметра передается строка, " +
                "обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!");

        System.out.print("\nВведите имя: ");
        String name = in.next();
        hello(name);

// задание 5 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\nЗадание 5. \nНаписать метод, который определяет является ли год високосным, и выводит\n" +
                "сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый\n" +
                "400-й – високосный");
        System.out.print("\nВведите год для проверки: ");
        int year = in.nextInt();
        checkyear(year);
    }

    // Задание 1 ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Задание 2 ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean checksum(int k, int l) { // public static тип возврощаемых данных потом имя метода
        // (тип принимаемых данных и имя переменной)
        int c = k + l;
        return c >= 10 && c <= 20;
    }

    // Задание 3 ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean checknum(int m) {
        boolean result;
        result = m > 0;
        return result;
    }

    // Задача 4 ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void hello(String name) {
        System.out.println("Привет! Меня зовут " + name + ".");
    }

    // Задача 5 ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void checkyear(int year) {
        //вариант 1
        System.out.println(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? "Високосный " : "Невисокосный ");
        //вариант 2
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("\nГод " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
}