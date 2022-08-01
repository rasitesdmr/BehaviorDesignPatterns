package chain2;
public class KagitParaBirimi {

    protected int tutar ;

    public KagitParaBirimi(int tutar) {
        super();
        this.tutar = tutar;
    }

    public int getTutar() {
        return tutar;
    }


}

/*
 Çekilecek tutarı tutan sınıf (KagitParaBirimi)

 Şimdi iki amacı olan bir dağıtıcı sınıfı tanımlayalım .

1 -) Kağıt paranın belirli bir nominal değeri için dağıtımı işleyin.
2 -) Banknotun daha küçük nominal değerini işlemek için başka bir vericiye gidin .
 */