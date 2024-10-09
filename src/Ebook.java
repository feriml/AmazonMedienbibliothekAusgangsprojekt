import java.util.Date;
import java.util.Objects;

public class Ebook extends Medium {

    private Urheber autor;
    private String isbn;
    private int seitenanzahl;
    private String auflage;

    public Ebook(String titel, String kommentar, String erscheinungsdatum, Genre genre, Urheber autor, String isbn, int seitenanzahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre);
        setAutor(autor);
        setIsbn(isbn);
        setSeitenanzahl(seitenanzahl);
        setAuflage(auflage);
    }


    public void setAutor(Urheber autor) {
        Objects.requireNonNull(autor);
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        Objects.requireNonNull(isbn);
        this.isbn = isbn;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        if (seitenanzahl <= 0)
        {
            throw new IllegalArgumentException("Seitenanzahl darf nicht gleich oder weniger als 0 sein!");
        }
        this.seitenanzahl = seitenanzahl;
    }

    public void setAuflage(String auflage) {
        Objects.requireNonNull(auflage);
        this.auflage = auflage;
    }

    public Urheber getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Autor: " + getAutor() + " ISBN: " + getIsbn() + " Seitenanzahl: " + getSeitenanzahl() + " Auflage: " + getAuflage());
    }
}
