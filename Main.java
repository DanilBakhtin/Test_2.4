package Main;

import java.util.Scanner;

public class Main {

    private static float number1, number2;

    public static void main(String[] args) {

        //Вызов метода для ввода чисел
        input();
        //Вызов метода для вывода в консоль результатов
        output();
    }

    //Функция для ввода двух чисел
    public static void input(){
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите первое число: ");
            number1 = in.nextFloat();
        }catch (Exception e){
            System.out.println("Первое число введено не правльно!");
            System.exit(0);
        }

        try {
            System.out.println("Введите второе число: ");
            number2 = in.nextFloat();
        }catch (Exception e){
            System.out.println("Второе число введено не правльно!");
            System.exit(0);
        }
    }

    /**
     * Функция вычитания двух чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность чисел
     */
    public static float difference(float a, float b){
        return a - b;
    }

    public static void output(){
        System.out.println("Разности:");
        System.out.printf("%f - %f = %f\n",number1,number2,difference(number1,number2));
        System.out.printf("%f - %f = %f",number2,number1,difference(number2,number1));
    }


}
