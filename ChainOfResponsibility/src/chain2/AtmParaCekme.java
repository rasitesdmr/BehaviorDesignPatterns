package chain2;

public class AtmParaCekme {

    protected static KagitParaBirimiDagitici yuzDagitici = new YuzDagitici();
    protected static KagitParaBirimiDagitici elliDagitici = new ElliDagitici();
    protected static KagitParaBirimiDagitici yirmiDagitici = new YirmiDagitici();
    protected static KagitParaBirimiDagitici onDagitici = new OnDagitici();

    protected static KagitParaBirimiDagitici sonrakiDagitici;

    static {
        yuzDagitici.sonrakiDagiticiyiAyarla(elliDagitici);
        elliDagitici.sonrakiDagiticiyiAyarla(yirmiDagitici);
        yirmiDagitici.sonrakiDagiticiyiAyarla(onDagitici);
        sonrakiDagitici = yuzDagitici;
    }

    public static void geriCekmek(KagitParaBirimi paraBirimi){
        if (paraBirimi != null){
            sonrakiDagitici.dagitmak(paraBirimi);
        }
    }

}
