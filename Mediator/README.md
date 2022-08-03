# Mediator ?

* Mediator Pattern ile nesnelerin iletişimi ortak bir noktadan sağlanmakta, nesnelerin birbirleriyle
  doğrudan iletişime girmesi yerine bir aracıyla iletişime girip haberleşmesini tasarımlamaktadır.

## Peki Neden ?

* Nesnelerin birbiriyle doğrudan iletişime girmesi durumunda bir nesnenin iletişime girdiği diğer nesneye bağlı
  olması(referans etmesi vs.) gereksinimini getirir.
* Bu sürecin zincirleme devam etmesi,tightly-coupled(sıkı-bağlı) bir tasarımın ortaya çıkması gibi istenmeyen fakat
  kaçınılmaz sonuçların doğmasına neden olacaktır.
* Zaman içinde nesne sayısı ve bağlantıların karmaşası arttıkça tüm sistemin esnekliği azalır,
  yönetim zorlaşır, bakım maliyetleri ve süresi artar ve yapılması planlanan değişikliklerin getirdiği riskler artar.
* Doğal olarak bu istenen bir durum değildir.

## Peki Çözüm ?

* Çözüm olarak iletişimin merkezine bir aracı koyar ve tüm iletişim bunun üzerinden gerçekleşir.
* Böylece nesneler arası loosely-coupled(gevşek-bağlı) bir bağın kullanılmasına imkan tanır.
* Nesneler iletişim kurmak istediği diğer nesnelerin referanslarını barındırmaz, doğrudan bağlantı kurmaz,
  aracıyı kullanarak tüm iletişimlerini bu aracı katman üzerinden sağlarlar.

## Özet ?

* Yazılım tasarımında mimariyi tasarımlayanların önemli hedeflerinden biri de
  sistemdeki bileşenlerin birbirlerine sıkı sıkıya bağlı olmamaları ve gerektiğinde değiştirilebilmelerini
  sağlayacak kadar esnek bir yapının kurgulanmasıdır. Bu bakış açısıyla Mediator Pattern, sistemdeki nesnelerin
  birbirlerine doğrudan bağlanmalarına gerek kalmayacak bir çözümü önerir. Temel amaç sistemdeki nesneler diğer
  nesnelere doğrudan bağlı olmak yerine bir aracı nesneye bağlı olsunlar ve iletişim bunun üzerinden
  sağlansın düşüncesidir.