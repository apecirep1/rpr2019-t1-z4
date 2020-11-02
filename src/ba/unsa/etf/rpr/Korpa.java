package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50];
    private int brojArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala>=50) return false;
        korpa[brojArtikala++] = a;
        return true;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikala; i++) {
            if (korpa[i].getKod().equals(kod)) {
                Artikl pomocni = new Artikl(korpa[i].getNaziv(), korpa[i].getCijena(), korpa[i].getKod());
                korpa[i] = null;
                pomjeranje(i);
                return pomocni;
            }
        }
        return null;
    }
    public void pomjeranje(int mjesto){
        for(int i=mjesto; i<brojArtikala; i++){
            korpa[i]=korpa[i+1];
        }
        korpa[brojArtikala]=null;
        brojArtikala--;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i<brojArtikala; i++){
            suma+=korpa[i].getCijena();
        }
        return suma;
    }
}
