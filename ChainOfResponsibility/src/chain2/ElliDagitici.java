package chain2;

public class ElliDagitici extends KagitParaBirimiDagitici{

    public ElliDagitici(){
        super();
    }

    @Override
    public void dagitmak(KagitParaBirimi paraBirimi) {
        if (paraBirimi != null){
            int tutar = paraBirimi.getTutar();
            int kalan = tutar;
            if (tutar >= 50){
                int saymak = tutar / 50;
                kalan = tutar % 50 ;
                System.out.println(saymak + " tane 50 TL lik bankot.");
            }
            if (kalan > 0 && this.sonrakiDagitici != null){
                this.sonrakiDagitici.dagitmak(new KagitParaBirimi(kalan));
            }
        }

    }
}
