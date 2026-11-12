package collec.ma;


import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {

        String text = "chat chien chat souris oiseau chien";

        // Découper la phrase en mots
        String[] wordsArray = text.split(" ");

        Set<String> uniqueWords = new HashSet<>();

        // Ajouter les mots dans le Set
        for (String w : wordsArray) {
            uniqueWords.add(w);
        }

        System.out.println("Mots uniques : " + uniqueWords);
    }
}

