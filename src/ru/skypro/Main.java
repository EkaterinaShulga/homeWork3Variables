package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // task6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));

        System.out.println(result);
        System.out.println(-result);
        System.out.println(result);
        System.out.println();


        // task 7
        int aa = 5;
        int bb = 7;
        aa = ++ aa;
        aa = ++ aa;
        bb = --bb;
        bb = --bb;
        System.out.println("переменная аа = " + aa);
        System.out.println("переменная bb = " + bb);
        System.out.println();



        // task 8
        int number = 648;
        int two2 = number / 10 % 10;
        System.out.println("Вторая цифра в заданном числе = " + two2);
    }
}
