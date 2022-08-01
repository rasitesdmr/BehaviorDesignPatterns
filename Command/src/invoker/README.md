## Invoker ()

* Çağırıcı, belirli bir komutun nasıl yürütüleceğini bilen ancak komutun nasıl uygulandığını
  bilmeyen bir nesnedir .
* Yalnızca komutun arayüzünü bilir.

* Bazı durumlarda, çağıran komutları yürütmenin yanı sıra depolar ve sıraya koyar.
* Bu, makro kaydı veya geri alma ve yineleme işlevi gibi bazı ek özellikleri uygulamak
  için kullanışlıdır.

* Örneğimizde, komut nesnelerini çağırmaktan ve bunları komutların uygulamak() yöntemiyle
  yürütmekten sorumlu ek bir bileşenin olması gerektiği açıkça ortaya çıkıyor.
  Bu tam olarak invoker sınıfının devreye girdiği yerdir .