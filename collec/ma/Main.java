package collec.ma;


public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        
        Book b1 = new Book("978-2123456803",
                "Java ", "Auteur A");

        Book b2 = new Book("978-21209826803",
                "C++", "Auteur B");

        
        lib.addBook(b1);
        lib.addBook(b2);

        lib.addCategory("Physique");
        lib.addCategory("Programmation");
        lib.addCategory("Physique");

        System.out.println(" Liste des livres ");
        lib.displayBooks();

        System.out.println("\n Catégories ");
        lib.displayCategories();

        System.out.println("\n Recherche par ISBN ");
        System.out.println(lib.findByIsbn("978-21209826803"));

        System.out.println("\n Emprunt ");

        if (lib.borrowBook(b1, "Hind")) {
            System.out.println("Livre emprunté par Hind.");
        } else {
            System.out.println("Livre déjà emprunté.");
        }

        if (lib.borrowBook(b1, "Reda")) {
            System.out.println("Livre emprunté par Reda.");
        } else {
            System.out.println("Impossible : livre déjà emprunté.");
        }

        System.out.println("\n Restitution ");
        lib.returnBook(b1);
        System.out.println("Livre restitué.");

        if (lib.borrowBook(b1, "Reda")) {
            System.out.println("Reda peut maintenant emprunter le livre.");
        }
    }
}
