# Java `super` Keyword'ü

Java programlama dilinde `super`, bir sınıfta aynı isimdeki öğeler arasında ayrım yapmak ve üst sınıfa erişim sağlamak için kullanılan bir keyword'dür. Kullanım alanları şunlardır:

- **Üst Sınıftaki Metotları Çağırmak:**
   ```java
   class Animal {
       void makeSound() {
           System.out.println("Animal is making a sound");
       }
   }

   class Dog extends Animal {
       void makeSound() {
           super.makeSound(); // Üst sınıftaki metodu çağırma
           System.out.println("Dog is barking");
       }
   }