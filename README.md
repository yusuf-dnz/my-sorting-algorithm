MySortingAlgorithm

Başlangıç seviyesi sıralama algoritması.
----
Bu algoritmanın çalışma mantığı; dizi içerisinde sıralama yapılacaksa sayıların sırasının diğer sayılardan kaç tanesinden büyük veya küçük olduğuna dayanmaktadır.
Bu değer her eleman için hesaplanır ve her iterasyonda bir elemanın yerleşmesi gereken index hesaplanır.

* Bir while döngüsü başlatıyoruz. Bu döngü, tüm diziyi sıralayana kadar devam edecektir.
* Döngü içinde, bigger ve temp adında iki değişken tanımlıyoruz. bigger, mevcut elemandan daha büyük elemanların sayısını tutacak ve temp, elemanların yerlerini değiştirmek için kullanılacak geçici bir değişken olacak.
* Diziyi ekrana yazdırıyoruz, böylece her adımda nasıl değiştiğini görebiliriz.
* Şimdi, dizideki mevcut elemanı, dizideki diğer tüm elemanlarla karşılaştırarak, kendisinden daha küçük kaç eleman olduğunu bigger değişkenine atıyoruz.
  ```java
      for (int number : numbers) {
                if (numbers[index] > number) bigger++;
            }
            if (index != bigger) {
                temp = numbers[bigger];
                numbers[bigger] = numbers[index];
                numbers[index] = temp;
            } else index++;
  ```

* Eğer index değeri, bigger değeriyle farklıysa asıl yerleşmesi gereken index i tespit etmiş oluyoruz.
* Eğer index ve bigger değerleri eşitse, bu demektir ki mevcut eleman zaten doğru yerde ve bir sonraki elemana geçebiliriz.
Döngü bu şekilde devam eder ve dizideki tüm elemanlar doğru yerlerine taşındıkça sıralama işlemi tamamlanır.
----
Sonuç olarak, bu algoritma dizi içindeki sayıları küçükten büyüğe doğru sıralar. Seçme sıralama, veri kümesinin boyutu arttıkça verimsiz hale gelebilir ve diğer daha verimli sıralama algoritmaları tercih edilebilir. Ancak, algoritmanızı anlamak ve yazmak için bir başlangıç olarak oldukça değerlidir.

![image](https://github.com/yusuf-sea/MySortingAlgorithm/assets/101550162/529f1d99-2fdc-4bbe-88c6-cf29ebb51f6a)
