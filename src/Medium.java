import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Medium {

    private String titel;
    private String kommentar;
    private Date erscheinungsdatum;
    private  Genre genre;

    public Medium(String titel, String kommentar, Date erscheinungsdatum, Genre genre) {
        setTitel(titel);
        setKommentar(kommentar);
        setErscheinungsdatum(erscheinungsdatum);
        setGenre(genre);
    }

    public String getTitel() {
        return titel;
    }

    public String getKommentar() {
        return kommentar;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setTitel(String titel) {
        Objects.requireNonNull(titel);
        this.titel = titel;
    }

    public void setKommentar(String kommentar) {
        Objects.requireNonNull(kommentar);
        this.kommentar = kommentar;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        Objects.requireNonNull(erscheinungsdatum);
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void setGenre(Genre genre) {
        Objects.requireNonNull(genre);
        this.genre = genre;
    }

    public void anzeigen()
    {
        System.out.println("Titel: " + getTitel() + " Kommentar: " + getKommentar() +
                " Erscheinungsdatum: " + getErscheinungsdatum() + genre.toString());
    }
}
