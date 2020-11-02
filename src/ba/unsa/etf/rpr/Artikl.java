package ba.unsa.etf.rpr;

public class Artikl {
    private int cijena;
    private String naziv, kod;

    public int getCijena(){
        return cijena;
    }

    public String getNaziv(){
        return naziv;
    }

    public String getKod(){
        return kod;
    }

    public Artikl(String naziv, int cijena, String kod){
        this.cijena=cijena; this.naziv=naziv; this.kod=kod;
    }
}

