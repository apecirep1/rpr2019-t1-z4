package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] supermarket = new Artikl[1000];
    private int brojArtikala =0;

    public Artikl[] getArtikli(){
        return supermarket;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikala; i++) {
            if (supermarket[i].getKod().equals(kod)) {
                Artikl pomocni = new Artikl(supermarket[i].getNaziv(), supermarket[i].getCijena(), supermarket[i].getKod());
                supermarket[i] = null;
                pomjeranje(i);
                return pomocni;
            }
        }
        return null;
    }
    public void pomjeranje(int mjesto){
        for(int i=mjesto; i<brojArtikala; i++){
            supermarket[i]=supermarket[i+1];
        }
        supermarket[brojArtikala]=null;
        brojArtikala--;
    }

    public void dodajArtikl(Artikl biciklo) {
        if(brojArtikala<1000) supermarket[brojArtikala++] = new Artikl(biciklo.getNaziv(), biciklo.getCijena(), biciklo.getKod());
    }
}
