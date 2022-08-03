## Mediator Kullanalım ?

* Button , Fan ve PowerSupplier sınıflarının hiçbiri doğrudan iletişim kurmaz .
* Arabulucuyla (Mediator) yalnızca tek bir referansları vardır .
* İleride ikinci bir güç kaynağı eklememiz gerekirse tek yapmamız gereken Mediator'un mantığını güncellemek;
* Düğme ve Fan sınıflarına dokunulmaz.