package test.java;

import main.java.CompareObjects;

import java.util.*;

public class CompareTest {

    public void testCompareObjects() {

        System.out.println("Сравнение объектов");

        Object first = new Object();
        Object second = new Object();

        System.out.println("Тест 1 (два Object)");
        System.out.println("equals(): "+CompareObjects.compare(first, second));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(first, second));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(first, second));
        System.out.println("______________");

        Bird i = new Bird("Птичка");
        Bird j = new Bird("Птичка");


        System.out.println("Тест 2 (Объекты кастомного класса)");
        System.out.println("equals(): "+CompareObjects.compare(i, j));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(i, j));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(i, j));
        System.out.println("______________");


        ArrayList a = new ArrayList(9);
        ArrayList b = new ArrayList((9));


        System.out.println("Тест 3 (два пустых ArrayList)");
        System.out.println("equals(): "+CompareObjects.compare(a, b));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(a, b));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(a, b));
        System.out.println("______________");

        LinkedList linkedList = new LinkedList();
        ArrayList  arrayList = new ArrayList();


        System.out.println("Тест 4 (ArrayList и LinkedList)");
        System.out.println("equals(): "+CompareObjects.compare(linkedList, arrayList));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(linkedList, arrayList));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(linkedList, arrayList));
        System.out.println("______________");


        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(2);
        linkedList1.add(1);
        ArrayList  arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);


        System.out.println("Тест 5 (ArrayList и LinkedList с одинаковыми значениями, но в разных позициях)");
        System.out.println("equals(): "+CompareObjects.compare(linkedList1, arrayList1));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(linkedList1, arrayList1));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(linkedList1, arrayList1));
        System.out.println("______________");


        Collection arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        Collection set = new HashSet();
        set.add(1);
        set.add(2);

        //Set и ArrayList c одинаковыми значениями - false везде, кроме toString().equals()
        System.out.println("Тест 6 (Set и ArrayList с одинаковыми значениями)");
        System.out.println("equals(): "+CompareObjects.compare(arrayList2, set));
        System.out.println("Сравнение хеш кодов: "+CompareObjects.compareHashCode(arrayList2, set));
        System.out.println("Сравнение строкового представления "+CompareObjects.compareToString(arrayList2, set));
        System.out.println("______________");


    }


    class Bird {
        private String name;
        private final boolean winged;
        Bird(String name) {
            this.name = name;
            winged = true;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

    }
}
