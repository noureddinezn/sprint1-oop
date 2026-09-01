public class Book {
    // Attributes
    private String titre;
    private String auteur;
    private double prix;
    private int nombrePages;
    private boolean disponible; // New attribute

    // Constructor
    public Book(String titre, String auteur, double prix, int nombrePages, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nombrePages = nombrePages;
        this.disponible = disponible;
    }

    // Method to borrow the book
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre " + titre + " has been successfully borrowed.");
        } else {
            System.out.println("Le livre " + titre + " is already borrowed.");
        }
    }

    // Display method
    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix + " MAD");
        System.out.println("Nombre de pages: " + nombrePages);
        System.out.println("Disponible: " + (disponible ? "Yes" : "No"));
    }

    // Main method for testing
    public static void main(String[] args) {
        Book monLivre = new Book("Clean Code", "Robert C. Martin", 250.0, 464, true);
        monLivre.afficherDetails();
        monLivre.emprunter();
        monLivre.afficherDetails();
    }
}