package chain2;

public class YuzDagitici extends KagitParaBirimiDagitici{

    public YuzDagitici() {
        super();
    }

    @Override
    public void dagitmak(KagitParaBirimi paraBirimi) {
        if (paraBirimi != null){
            int tutar = paraBirimi.getTutar();
            int kalan = tutar;
            if (tutar >= 100){
                int saymak = tutar / 100;
                kalan = tutar % 100 ;
                System.out.println( saymak + " tane 100 TL lik bankot." );
            }
            if (kalan > 0 && this.sonrakiDagitici != null){
                this.sonrakiDagitici.dagitmak(new KagitParaBirimi(kalan));
            }
        }
    }
}
