
/*

Daha sonra bu duruma geri döndürülebilmesi için belirli bir zamanda bir nesne durumunu saklar.
Basitçe , bir nesnedeki değişiklikleri geri almanıza ve yenilemenize izn verir .

 */

public class Memento {

    // Memento objesi içinde saklanan makale
    private String makale ;

    // Yeni bir makale stringini memento objecte kaydedin
    public Memento(String makaleKaydet) {
        makale = makaleKaydet;
    }
    // Makalede saklanan değeri dön
    public String kaydedilmismakaleyiAl(){
        return makale;
    }
}
