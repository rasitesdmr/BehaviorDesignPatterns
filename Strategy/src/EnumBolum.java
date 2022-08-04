public enum EnumBolum {
    SAYILSAL("Sayısal"),
    SOZEL("Sözel"),
    ESİTAGIRLIK("Eşit Ağırlık");

    private String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
