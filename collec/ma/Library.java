package collec.ma;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Library {

    // Liste des livres
    private List<Book> books = new ArrayList<>();

    // Catégories sans doublons
    private Set<String> categories = new HashSet<>();

    // Recherche par ISBN
    private Map<String, Book> isbnIndex = new HashMap<>();

    // Gestion des emprunts
    private Map<Book, String> loans = new HashMap<>();

    // Ajouter un livre
    public void addBook(Book book) {
        books.add(book);
        isbnIndex.put(book.getIsbn(), book);
    }

    // Ajouter une catégorie
    public void addCategory(String category) {
        categories.add(category);
    }

    // Rechercher un livre par ISBN
    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

    // Emprunter un livre
    public boolean borrowBook(Book book, String borrower) {

        if (!loans.containsKey(book)) {
            loans.put(book, borrower);
            return true;
        }

        return false;
    }

    // Restituer un livre
    public void returnBook(Book book) {
        loans.remove(book);
    }

    // Afficher les livres
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Afficher les catégories
    public void displayCategories() {
        System.out.println(categories);
    }
}

