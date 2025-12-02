package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.RectangleComparator;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {
        List list = new ArrayList(){{
            add("555-542-231");
            add("555-887-987");
            add("555-161-143");
            add("555-189-6667");
        }};
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========================================");

        HashMap hashMap = new HashMap(){};
        hashMap.put("gio", "555-542-231");
        hashMap.put("luka", "555-887-987");
        hashMap.put("lika", "555-161-143");
        hashMap.put("sandro", "555-189-6667");
        for (Object key : hashMap.keySet()){
            String value = (String) hashMap.get(key);
            if (value.contains("8")){ System.out.println(key + "'s phone number contains digit 8"); }
        }
        System.out.println("========================================");


        TreeSet treeSet = new TreeSet();
        for (int i = 1; i <= 10; i++){
            treeSet.add(new Circle(i));
        }
        treeSet.add(new Circle(5));
        System.out.println(treeSet.toString()); // Ordered results


        HashSet hashSet = new HashSet();
        for (int i = 1; i <= 10; i++){
            hashSet.add(new Circle(i));
        }
        hashSet.add(new Circle(5));
        System.out.println(hashSet.toString()); // Unordered results
        System.out.println("========================================");


        List rectanglesList = new ArrayList(){{
            add(new Rectangle(1, 2));
            add(new Rectangle(4, 1));
            add(new Rectangle(3, 5));
            add(new Rectangle(2, 3));
        }};
        Collections.sort(rectanglesList, new RectangleComparator());
        System.out.println(rectanglesList);

    }
}
