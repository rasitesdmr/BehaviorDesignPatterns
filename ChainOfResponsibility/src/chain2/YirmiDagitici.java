package chain2;

public class YirmiDagitici extends KagitParaBirimiDagitici{

    public YirmiDagitici(){
        super();
    }

    @Override
    public void dagitmak(KagitParaBirimi paraBirimi) {
        if (paraBirimi != null){
            int tutar = paraBirimi.getTutar();
            int kalan = tutar;
            if (tutar >= 20){
                int saymak = tutar / 20;
                kalan = tutar % 20 ;
                System.out.println( saymak + " tane 20 TL lik bankot." );
            }
            if (kalan > 0 && this.sonrakiDagitici != null){
                this.sonrakiDagitici.dagitmak(new KagitParaBirimi(kalan));
            }
        }
    }
}
