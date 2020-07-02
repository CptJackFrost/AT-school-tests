package test.java;

import main.java.Map;

import java.util.HashMap;

public class MapTest {

    public static void test (){

        System.out.println("Подсчет элементов");

        //ожидается 3, фактический результат - 0
        System.out.println("Тест 1 (Ерохин Сергей)");
        System.out.println(Map.countElementsInMap("Ерохин", "Сергей"));
        System.out.println("________________");

        //ожидается 1, фактический результат - 1
        System.out.println("Тест 2 (Дмитров Алексей)");
        System.out.println(Map.countElementsInMap("Дмитров", "Алексей"));
        System.out.println("________________");

        //ожидается 2, фактический результат - 1
        System.out.println("Тест 1 (Андреев Андрей)");
        System.out.println(Map.countElementsInMap("Андреев", "Андрей"));
        System.out.println("________________");


        System.out.println("Удаление элементов");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        System.out.println(map);


        //результат - ConcurrentModificationException
        System.out.println("Тест 1 (Владимир)");
        System.out.println(Map.deleteValueFromMap(map, "Владимир"));
        System.out.println("________________");

    }
}
