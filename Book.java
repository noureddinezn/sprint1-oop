public class Book {
    // Attributes
    private String titre;
    private String auteur;
    private double prix;
    private int nombrePages;

    // Constructor
    public Book(String titre, String auteur, double prix, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nombrePages = nombrePages;
    }

    // Display method
    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix + " MAD");
        System.out.println("Nombre de pages: " + nombrePages);
    }

    // Main method for testing
    public static void main(String[] args) {
        Book monLivre = new Book("Clean Code", "Robert C. Martin", 250.0, 464);
        monLivre.afficherDetails();
    }
}