package collec.ma;


import java.util.*;

public class SetComparison {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Pomme"));

        Set<String> linkedHashSet = new LinkedHashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Pomme"));

        Set<String> treeSet = new TreeSet<>(
            Arrays.asList("Zèbre", "Ananas", "Pomme"));

        System.out.println("HashSet : " + hashSet);

        System.out.println("LinkedHashSet : " + linkedHashSet);

        System.out.println("TreeSet : " + treeSet);
    }
}

