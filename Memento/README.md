# MEMENTO ?

* Memento kelime anlamı hatıra vb anlamlara gelmektedir.
* Dolayısıyla şöyle bir mantık yürütebiliriz.
* Bir sınıfın belli değerlerini başka bir yerde saklamak ve gerektiğinde tekrar yüklemek için kullanılır.
* Memento design pattern için en belirgin örnek olarak oyunları verebiliriz.
* Oyunda belirli bir noktaya kadar geldiğimizi ve bu noktada oyunu kaydettiğimizi düşünelim.
* İlerleyen aşamaları geçemedik ve oyuna yeniden başlamak yerine daha önceden kaydettiğimiz noktaya geri dönmek isteriz.
* İşte tam da memento design pattern için bir problem.

## Sınıflar ?

* Originator: Nesnenin nasıl kaydedilip nasıl çekileceğini bilen sınıftır.
* Memento: Kaydedilecek nesnenin state tutar.
* CareTaker: Memento nesnesinin versiyonlarını tutan yapıdır.
