package test.java;


public class Test {
    public static void main(String[] args) {
        CompareTest compare = new CompareTest();
        MapTest map = new MapTest();
        SortTest sort = new SortTest();

        System.out.println("Сравнение объектов");
        compare.testCompareObjects();
        System.out.println("Тест сортировки");
        sort.test();
        System.out.println("Тест Map");
        map.test();
    }
}
