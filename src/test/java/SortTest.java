package test.java;

import main.java.Sort;

import java.lang.reflect.Array;

public class SortTest {
    public void test(){

        System.out.println();
        int [] array1 = {0, 1, 2, 5, 7};


        //ожидаемый результат [7, 5, 2, 1, 0], фактический - [7, 5, 2, 1, 0]
        System.out.println("Тест 1 (сокращенный синтаксис, длина массива 5)");
        printArray(Sort.reverseSort(array1));
        System.out.println("_______________");

        //ожидаемый результат [5, 4, 3, 2, 1, 0], фактический - [5, 4, 3, 2, 1, 0]
        int [] array2;
        array2 = new int[6];
        array2[0] = 0;
        array2[1] = 1;
        array2[2] = 2;
        array2[3] = 3;
        array2[4] = 4;
        array2[5] = 5;

        System.out.println("Тест 2 (new int[], другие значения, длина массива 6)");
        printArray(Sort.reverseSort(array2));
        System.out.println("_______________");

    }

    public void printArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

}
