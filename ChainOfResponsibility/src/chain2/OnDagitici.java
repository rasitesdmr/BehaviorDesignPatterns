package chain2;

public class OnDagitici extends KagitParaBirimiDagitici{

    public OnDagitici(){
        super();
    }

    @Override
    public void dagitmak(KagitParaBirimi paraBirimi) {
        if (paraBirimi != null){
            int tutar = paraBirimi.getTutar();
            int kalan = tutar;
            if (tutar >= 100){
                int saymak = tutar / 10;
                kalan = tutar % 10 ;
                System.out.println(saymak + "tane 10 TL lik bankot.");
            }
            if (kalan > 0 && this.sonrakiDagitici != null){
                this.sonrakiDagitici.dagitmak(new KagitParaBirimi(kalan));
            }
        }

    }
}
