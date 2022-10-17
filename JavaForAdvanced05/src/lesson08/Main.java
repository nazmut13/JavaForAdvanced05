package lesson08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[] {"one", "two", "three"};

        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("two");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(1, "b");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.set(1, "B");
        System.out.println(arrayList);

        System.out.println(arrayList.contains("b"));
        System.out.println(arrayList.indexOf("A"));

        arrayList.add(2);
        arrayList.add(3.1415);
        int a = (int) arrayList.get(3);
        System.out.println(a);


    }
}
