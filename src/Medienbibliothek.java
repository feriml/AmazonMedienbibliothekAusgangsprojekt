import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medienListe;

    public Medienbibliothek(ArrayList<Medium> medienListe) {
        this.medienListe = medienListe;
    }

    public void mediumHinzufügen(Medium m)
    {
        medienListe.add(m);
    }

    public void anzeigen()
    {
        for (Medium m : medienListe)
        {
            m.anzeigen();
        }
    }

    public ArrayList<Film> alleFilmeAlsListe()
    {
        ArrayList<Film> film = new ArrayList<>();
        for (Medium m : medienListe)
        {
            if (m instanceof Film)
            {
                film.add((Film) m);
            }
        }
        return film;
    }

    public ArrayList<Ebook> alleEbooksAlsListe()
    {
        ArrayList<Ebook> ebook = new ArrayList<>();
        for (Medium m : medienListe)
        {
            if (m instanceof Ebook)
            {
                ebook.add((Ebook) m);
            }
        }
        return ebook;
    }
}



