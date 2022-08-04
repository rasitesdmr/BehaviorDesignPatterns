# Visitor ?

* Bir Ziyaretçi kalıbının amacı, mevcut bir nesne yapısında değişiklikler yapmadan yeni bir işlem tanımlamaktır.
* Bileşenlerden oluşan bir bileşik nesnemiz olduğunu hayal edin .
* Nesnenin yapısı sabittir – ya onu değiştiremeyiz ya da yapıya yeni tip elemanlar eklemeyi planlamıyoruz.
* Şimdi, mevcut sınıfları değiştirmeden kodumuza nasıl yeni işlevler ekleyebiliriz?
* Ziyaretçi tasarım deseni bir cevap olabilir. Basitçe söylemek gerekirse,  
  yapının her bir elemanına ziyaretçi sınıfını kabul eden bir fonksiyon eklemek zorundayız.
* Bu şekilde bileşenlerimiz, ziyaretçi uygulamasının onları "ziyaret etmesine" ve bu öğe üzerinde gerekli
  tüm eylemleri gerçekleştirmesine izin verecektir.
* Başka bir deyişle, nesne yapısına uygulanacak algoritmayı sınıflardan çıkaracağız.
* Sonuç olarak, kodu değiştirmeyeceğimiz için Açık/Kapalı ilkesini iyi bir şekilde kullanacağız ,
  ancak yine de yeni bir Ziyaretçi uygulaması sağlayarak işlevselliği genişletebileceğiz .







