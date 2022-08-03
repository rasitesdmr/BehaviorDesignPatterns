# Mediator Kullanmadığımız Zaman Sorunlar ?

* Button , Fan ve PowerSupplier sınıfları birbirine sıkı bir şekilde bağlanmıştır.
* Button doğrudan fan üzerinde çalışır.
* Fan hem Button hem de PowerSupplier etkileşime girer.
* Sisteme ikinci bir PowerSupplier eklediğimiz zaman , Fan sınıfının mantığını değiştirmemiz
  gerekecektir .