public class Ders {
    private String dersAd;
    private String dersDonem;
    private String dersKodu;



    public Ders(String dersKodu, String dersAd, String dersDonem) {
        this.dersAd = dersAd;
        this.dersDonem = dersDonem;
        this.dersKodu = dersKodu;


    }

    public String getDersAd() {
        return dersAd;
    }
    public String getDersDonem() {
        return dersDonem;
    }
    public String getDersKodu() {
        return dersKodu;
    }

    @Override
    public String toString() {
        return dersAd;
    }
}