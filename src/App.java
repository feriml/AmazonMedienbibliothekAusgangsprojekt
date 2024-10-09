import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Medium film = new Film("Harry Potter", "Im Film geht es um Zauberer",
                "20-07-2007", new Genre("Abenteuer"),
                new Urheber("David", "Yates", "Warnerbros"),
                130, true, true);

        Medium ebook = new Ebook("Herr der Ringe", "Ein Film über Magier und Kobolde",
                "03-11-1999", new Genre("Fantasy, Abenteuer"),
                new Urheber("J.J.R.", "Tolkien", "Warnerbros"),
                "1343218723", 489, "Ernst Klett Verlag");

        ArrayList<Medium> medienListe = new ArrayList<>();
        Medienbibliothek medienbibliothek = new Medienbibliothek(medienListe);
    }
}
