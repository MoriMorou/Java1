import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

// 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать
// метод, заменяющий в принятом массиве 0 на 1, 1 на 0

        int[] ArrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Ex 1. The original array is: " + Arrays.toString(ArrOne) + "\nChange all elements " +
                "from 0 to 1 and from 1 to 0");
        invertArray(ArrOne);
        System.out.println("Result: " + Arrays.toString(ArrOne));

// 2. Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями
// 1 4 7 10 13 16 19 22

        int[] ArrTwo = new int[8];
        fillArray(ArrTwo);
        System.out.println("\nEx 2. Create the array with 8 elements. Add numbers 1 4 7 10 13 16 19 22.\n" +
                "Result: " + Arrays.toString(ArrTwo));

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий
// числа меньше 6 на 2

        int[] ArrThree = {6, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nEx 3. Create the array " + Arrays.toString(ArrThree) + " and multiply numbers less " +
                "than 6 by 2");
        changeArray(ArrThree);
        System.out.println("Result: " + Arrays.toString(ArrThree));

// 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

        int[] MaxMin = {2, 5, 4, 0, 10, 4, 4, 0, -1, 8, 9, -500};
        System.out.println("\nEx 4. Create the array " + Arrays.toString(MaxMin) + " determine the maximum and " +
                "minimum value");
        MaxAndMin(MaxMin);
//        System.out.println("Result 4 Max: " + result);


// 5. * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
// диагональные элементы единицами, используя цикл(ы);

        System.out.println("\nEx 5. Create the two-dimensional array. Enter 2 same parameters: ");
        int size = in.nextInt();
        FillArr(size);

// 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если
// в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1])
// → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница
// показана символами ||, эти символы в массив не входят.*

        int[] ArrSix = {3, 5, 3, 10, 5, 9, 1, 6, -3, -5, 1, 10, 7};
        System.out.println("\nEx 6. Create the array " + Arrays.toString(ArrSix) + " and check Array Balance ");
        System.out.println("\nThis Array is: " + BalanceArr(ArrSix));

// 7. *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или
// отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.

        System.out.println("\nEx 7. Create the array " + Arrays.toString(ArrSix) + " and change N positions of several " +
                "elements.\nAdd N position(-s): ");
        int n = in.nextInt();
        changePos(ArrSix, n);
    }

    private static void invertArray(int[] ArrOne) {  // нет return, но все равно печаталет так как toString

        for (int i = 0; i < ArrOne.length; i++) {
            if (ArrOne[i] == 1) {  // вариант ArrOne[i] = (ArrOne[i] == 0) ? 1 : 0; или вариант ArrOne[i] ^= 1;
                ArrOne[i] = 0;
            } else {
                ArrOne[i] = 1;
            }
        }
    }

    private static int[] fillArray(int[] ArrTwo) {
        for (int i = 0; i < ArrTwo.length; i++) {
            ArrTwo[i] = i * 3 + 1;  //  или можно создать int progress = 3, int start = 1
        }
        return ArrTwo;
    }

    private static int[] changeArray(int[] ArrThree) {
        for (int i = 0; i < ArrThree.length; i++) {
            if (ArrThree[i] < 6) {
                ArrThree[i] = ArrThree[i] * 2;
            }
        }
        return ArrThree;
    }

    public static void MaxAndMin(int[] MaxMin) {

        int x = 0; //  можно было бы через int result = MaxMin[0]
        int y = 0;

        for (int i = 0; i < MaxMin.length; i++) {
            if (MaxMin[i] > x) {
                x = MaxMin[i];
                continue;
            }
        }

        System.out.println("Result 4 Max: " + x);

        for (int i = 0; i < MaxMin.length; i++) {
            if (MaxMin[i] < y) {
                y = MaxMin[i];
                continue;
            }
        }
        System.out.println("Result 4 Min: " + y);
    }

    private static void FillArr(int size) {

        int[][] DoubleArr = new int[size][size];

        for (int i = 0; i < DoubleArr.length; i++) { //прогоняем массив
            for (int j = 0; j < DoubleArr.length; j++) {
                if ((i == j) || (i == DoubleArr.length - 1 - j)) {
                    DoubleArr[i][j] = 1;
                }
/* вариант 2
                 for (int i=0; i<


*/            }
        }
        // выводим массиив
        for (int i = 0; i < DoubleArr.length; i++) {
            for (int j = 0; j < DoubleArr.length; j++) {
                System.out.print(DoubleArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean BalanceArr(int[] ArrSix) {

        for (int i = 0; i < ArrSix.length; i++) {
//            int liftside = 0;
//            int rightside = 0;
            int balance = 0;
            for (int j = 0; j <= i; j++) { // левая часть
                balance += ArrSix[j];
                System.out.println(" Lift side: " + balance); // для проверки
            }

            for (int j = i + 1; j < ArrSix.length; j++) {
                balance -= ArrSix[j]; // отнимаю от левой части все что есть справа пока не получится 0
                System.out.println(" Right side: " + balance); // для проверки
            }
            if (balance == 0)
                return true;
        }
        return false;
    }

    private static void changePos(int[] ArrSix, int n) {
        if (n > 0) {                                        //вправо
            for (int i = 0; i < n; i++) {
                int move = ArrSix[ArrSix.length - 1];
                for (int j = ArrSix.length - 1; j > 0; j--) {
                    ArrSix[j] = ArrSix[j - 1];
                }
                ArrSix[0] = move;
            }
        } else if (n < 0) {                                 //влево
            for (int i = 0; i < n * (-1); i++) {
                int move = ArrSix[0];
                System.arraycopy(ArrSix, 1, ArrSix, 0, ArrSix.length - 1);
                ArrSix[ArrSix.length - 1] = move;
            }
        }
        System.out.println(Arrays.toString(ArrSix));
    }
}
