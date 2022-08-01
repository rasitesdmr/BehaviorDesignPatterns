# Command (Komut) Pattern ?

* Bir isteği nesneye dönüştürerek , isteğin kullanıcı sınıfları tarafından rahatça erişebilmesini
  sağlar.
* Nesne üzerinde bir işlemin nasıl yapıldığını bilmediğimiz ya da kullanılmak istenen nesneyi
  tanımadığımız durumlarda kullanılır .
* Yapılmak istenen işlemi bir nesneye dönüştürerek , alıcı nesne tarafından işlemin yerine
  getirmesini sağlar.

## Nasıl Kullanılır ?

* Öncelikle verilmek istenen her komut için bir sınıf yaratılır.
* Bu sınıfların ortak türe sahip olabilmesi için Command isiminde bir arayüz tanımlanır .
* Command arayüzü içerisinde tek bir tane metod gereklidir : execute().
* Her komut için oluşturulan sınıflar exetuce() metodunu uygular ve execute() metodu asıl işlevi
  yapacak olan sınıfın metodunu çağırır.
* Asıl işlevi yapan sınıf Receiver sınıfıdır .
* Daha sonra komut sınıflarının çağrılması için Invoker sınıfı oluşturulur .
* Fakat Invoker sınıfı hangi komut nesnesini kullanacağını bilmez . Sadece nasıl kullanacağını
  bilir.
* Client ise Invoker sınıfını çağıran sınıftır.

## GERÇEK DÜNYADAN BİR ÖRNEK ?

* Bir süper markette, kasanın çalışma mantığını düşünelim.
* Sepetinize almış olduğunuz ürünleri, kayan şeridin üzerine yerleştirirsiniz.
* Kasiyer, ürünleri sırasıyla barkod okuyucu üzerinden geçirir.
* Bu noktada, üründen hala vazgeçme ihtimaliniz vardır.
* Tüm ürünlerin barkodu okunduğunda, toplam fiyat belirlenir ve ödeme aşamasına geçilir.
* Burada yapının tamamı agnostik bir biçimde varolur.
* Buradaki agnostik terimini biraz daha açalım.
* Agnostik kelimesinin doğrudan anlamı “bilinmezci”.
* Bu felsefi terimin mühendislikteki karşılığı ise şu:
* Herhangi bir fiziksel parçadan bağımsız olarak çalışan yani sadece sonuca odaklanan çalışan mekanizma.
* Örneğin, ucu değiştirilebilen bir matkap düşünün.
* Burada matkabın dönen silindir kısmı agnostiktir. Döndüreceği ucun kalınlığını bilmesine gerek yoktur.
* Sadece döndürür o kadar. Ya da ucuna ampul bağlı olan bir duy da agnostiktir.
* Ampulün kaç Watt olduğu ve rengi duyun umurunda bile değildir.
* Yani örneğimizdeki kasiyerin, ürünün ne olduğunu bilmesine gerek yoktur.
* Ürünler de fiyatlar ve hatta kasiyer de değişebilir.
* Ama süreç hep aynıdır.
