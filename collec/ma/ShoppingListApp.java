package collec.ma;


import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

    public static void main(String[] args) {

        // Création de la liste
        List<String> shoppingList = new ArrayList<>();

        // Ajouter des articles
        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        // Afficher la liste
        System.out.println("Articles de la liste :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        // Supprimer un article
        shoppingList.remove("Lait");

        // Vérifier la présence des pommes
        boolean hasApples = shoppingList.contains("Pommes");

        System.out.println("\nContient des pommes ? " + hasApples);

        System.out.println("Taille finale de la liste : "
                + shoppingList.size());

        // Afficher la liste finale
        System.out.println("\nListe finale :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
    }
}

