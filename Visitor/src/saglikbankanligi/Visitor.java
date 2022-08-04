package saglikbankanligi;

public interface Visitor {

    String visitHastane(Hastane hastane);
    String visitIl(Il il);
    String visitUlke(Ulke ulke);

}
