package chain2;

public abstract class KagitParaBirimiDagitici {

    protected KagitParaBirimiDagitici sonrakiDagitici;

    public void sonrakiDagiticiyiAyarla(KagitParaBirimiDagitici sonrakiDagitici){
        this.sonrakiDagitici = sonrakiDagitici;
    }
    public abstract void dagitmak(KagitParaBirimi paraBirimi);
}
