package ex13;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        HashSet<String> set2 = new HashSet<>();

        set2.add("Milk");
        set2.add("Meat");
        set2.add("Fish");
        set2.add("Egg");
        set2.add("Bread");

        System.out.println(set2);

        set.retainAll(set2);

        System.out.println(set);

    }

}
