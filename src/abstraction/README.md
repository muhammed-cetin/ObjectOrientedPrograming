# Abstract Class ve Abstract Metodlar

## Abstract Class Nedir?

Bir sınıfın abstract olabilmesi için içerisinde bir veya birden fazla abstract metodu barındırması gerekmektedir. Abstract sınıfların önemli özellikleri şunlardır:

- Abstract sınıflar, içerisinde abstract metodları bulunduran sınıflardır.
- Diğer sınıfların aksine, abstract sınıflardan nesne oluşturmak mümkün değildir.
- Abstract sınıfların içerisinde abstract olmayan metotlar da bulunabilir.
- Bir abstract class'a sınırsız sayıda sınıf extend edilebilir, ancak her bir abstract class yalnızca bir sınıfa extend edilebilir.
- Multiple inheritance (Çoklu Miras) desteklenmez.

## Abstract Class Kullanım Amaçları

Abstract sınıfların kullanım amaçları şunlardır:

- Tüm alt sınıflar tarafından ortak olarak kullanılmasını istediğimiz özellikleri belirlemek.
- Farklı alt sınıfların aynı metodu farklı şekillerde uygulamalarını sağlamak.

## Abstract Metod Nedir?

Abstract metodlar, bir sınıf içerisinde yalnızca imza (signature) düzeyinde bulunan ve alt sınıflar tarafından implemente edilmesi gereken metotlardır. Abstract metodlar şu özelliklere sahiptir:

- Bir sınıfın içerisinde abstract metod oluşturmak için, o sınıfın abstract sınıf olması şarttır.
- Abstract metodun access modifier'ı public veya default olarak belirlenebilir.
- Abstract metodun bir gövdesi (body) olmaz, sadece metod imzasından ibarettir.
- Static veya final olamazlar, çünkü alt sınıflar tarafından override edilmeye müsait olmalıdırlar.
