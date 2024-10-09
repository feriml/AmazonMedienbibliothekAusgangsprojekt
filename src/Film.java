import java.util.Date;
import java.util.Objects;

public class Film extends Medium {

    private Urheber regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;

    public Film(String titel, String kommentar, Date erscheinungsdatum, Genre genre, Urheber regisseur, int spielzeit, boolean uhd, boolean hd) {
        super(titel, kommentar, erscheinungsdatum, genre);
        setRegisseur(regisseur);
        setSpielzeit(spielzeit);
        setUhd(uhd);
        setHd(hd);

    }

    public void setRegisseur(Urheber regisseur) {
        Objects.requireNonNull(regisseur);
        this.regisseur = regisseur;
    }

    public void setSpielzeit(int spielzeit) {
        if (spielzeit >= 0){
            throw new IllegalArgumentException("Spielzeit kann nicht 0 oder darunter sein!");
        }
        this.spielzeit = spielzeit;
    }

    public void setUhd(boolean uhd) {
        this.uhd = uhd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public Urheber getRegisseur() {
        return regisseur;
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public boolean isUhd() {
        return uhd;
    }

    public boolean isHd() {
        return hd;
    }

    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Regisseur: " + getRegisseur() + " Spielzeit: " + getSpielzeit() + " UHD vorhanden? " + isUhd() + " HD vorhanden? " + isHd());
    }
}
