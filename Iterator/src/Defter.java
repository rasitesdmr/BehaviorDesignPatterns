public class Defter {

    private String defterAd;
    private Soru[] sorular;

    public Defter(String defterAd) {
        this.defterAd = defterAd;
        this.sorular = new Soru[9];
        sorular[0] = new Soru(8L);
        sorular[1] = new Soru(9L);
        sorular[2] = new Soru(10L);
        sorular[3] = new Soru(11L);
        sorular[4] = new Soru(12L);
        sorular[5] = new Soru(13L);
        sorular[6] = new Soru(14L);
        sorular[7] = new Soru(15L);
        sorular[8] = new Soru(16L);


    }

    public String getDefterAd() {
        return defterAd;
    }

    public void setDefterAd(String defterAd) {
        this.defterAd = defterAd;
    }

    public SoruIterator getSoruIterator(){
        return new SoruIterator(sorular);
    }

}
