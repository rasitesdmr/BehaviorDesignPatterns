# Iterator Nedir ?

* Yineleyici tasarım kalıbı, bir koleksiyonun öğelerine sırayla erişmenin bir yolunu belirleyen davranışsal
  bir tasarım kalıbıdır.
* Kapsayıcının altında yatan temsili açığa çıkarmadan öğelerin erişilebilirliğini uygulamamız için bir yol sağlar.
* Uygulama geliştirirken en çok kullandığımız veri yapısı herhalde koleksiyonlardır.
* Hatta özellikle veritabanı uygulamaları geliştirirken, genellikle veriyi bir koleksiyon biçiminde bellekte saklarız.
* Bu koleksiyonların çoğu basit düzeyde olduğu doğru.
* Fakat bazen, ağaç yapısı (composite) gibi kompleks veri yapılarının kullanıldığı koleksiyonlar da karşımıza
  çıkabiliyor.

## Şimdi Düşünelim ?

* Elinizde birkaç tane farklı yapıda koleksiyon olsun.
* Bu koleksiyonların içindeki her bir elemanda dolaşmanız gereken durumlar olacaktır öyle değil mi?
* Basit bir koleksiyonda böyle bir iş problem değil.
* Ancak kompleks yapıdaki bir koleksiyonda, elemanlar arasında nasıl hareket edersiniz?
* Hele ki bu hareketinizin stratejisi değişirse, bu değişim ile nasıl bir mimariyle baş edersiniz?

## Şu Soruları Sorabilmeliyiz ?

* Şu anki öge nedir?
* Başka öge kaldı mı?
* Bir sonraki ögeye geç (ya da bir önceki)
* Her ne olursa olsun, bir yineleyici her türlü öge ile çalışabilir olmalı.
* Başka bir deyişle, iterasyon koleksiyondan bağımsız bir biçimde tasarlanmalı.
* Yani yineleyicinin neyi yinelediğini bilmesine gerek yok.
* Şimdi çözümümüzün parçalarını üç aşağı beş yukarı belirleyebiliriz artık.

## Adımlar ?

* Yineleyici, her türlü tiple çalışabilmeli. Bunu, arayüzü jenerik yaparak sağlayabiliriz.
* Bir yineleyici, o an çalıştığı ögeyi döndürebilmeli. Bu, yineleyicinin yalnızca-okunur bir özelliği olabilir.
* Yineleyici, ileri ya da geri hareket edebilmeli. Fakat bu hareketi, eğer yinelediği koleksiyon uygunsa yapmalı.
  Yani denetlemeli ve uygunsa, ikinci adımda belirttiğimiz özelliği güncellemeli.

## Kısacası

* Şimdi bir kitabım olsun 5 tane sorusu liste şeklinde dönsün 10 tanesi de array şeklinde dönsün .
* Ve ben bunları alt alta tek seferde yazdırmam gerek.
* işte bunun için bi iterator döndürün ve sorular arasında gezinti yapabiliyim.