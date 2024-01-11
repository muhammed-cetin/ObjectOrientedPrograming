# Interface Nedir?

Interface, tam abstraction (tam soyutlama) olarak nitelendirilen bir kavramdır. İşte Interface'in temel özellikleri:

- Interface, içine abstract olmayan metotlar eklenmeyen bir soyutlama türüdür.
- Interface'ler tam abstraction oldukları için, oluşturulan metotlara abstract kelimesini iliştirmeye gerek yoktur.
- Interface içerisinde tanımlanan metotlar varsayılan olarak public'tir, bu nedenle metot oluştururken public kelimesini kullanmaya gerek yoktur.
- Bir class'ı bir interface'in alt sınıfı yapmak için 'extends' değil, 'implements' kelimesi kullanılır.
- Bir class, birden fazla sayıda interface'e implement edilebilir.
- Bir interface, birden fazla sayıda interface'e extend edilebilir.
- Bir class, bir interface'in parent'ı olamaz.
- Bir interface'in içerisinde "instant variable" (anlık değişken) oluşturulamaz.
- Bir interface'in içinde oluşturulan her değişken final ve static olmak zorundadır.
- Bir class, implement edildiği interface içerisindeki tüm metotları override etmek zorundadır. Aksi halde, o class'ın abstract class olması gerekir.

## Ne Amaçla Kullanılır?

1. **Soyutlamayı Sağlar:** Interface, sınıflar arasında ortak bir arayüz sağlayarak soyutlamayı mümkün kılar. Farklı sınıflar, aynı arayüzü kullanarak birbirine benzer davranışları sergileyebilir.

2. **Çoklu Mirası Taklit Eder:** Java gibi dillerde, bir sınıf sadece bir tane başka bir sınıftan miras alabilir (single inheritance). Ancak bir sınıf birden fazla interface'i implement edebilir. Bu, çoklu miras benzeri bir yapı sağlar.

3. **Kodun Daha Esnek Olmasını Sağlar:** Interface, kodun daha esnek olmasına katkı sağlar. Aynı arayüzü implement eden farklı sınıfların nesnelerini aynı şekilde kullanabiliriz (polimorfizm).

4. **Proje Yapısını Düzenler:** Büyük projelerde, farklı ekipler tarafından geliştirilen farklı sınıflar arasında ortak bir arayüz belirlenmesini sağlar. Bu, kodun daha düzenli ve sürdürülebilir olmasına yardımcı olur.

