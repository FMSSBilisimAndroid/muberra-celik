# Coroutine App

<p align="center"  width="75%">
  <img width="40%" src="https://github.com/muberracelik/patika_fmss_kotlin/blob/main/Coroutine/res/result.png" alt="Application View"/>
</p>


### 1- Döngü kilitlenmeye sebep olacak mı ?

* Evet kilitlenmeye sebep oldu çünkü coroutine yalnızca sonsuz döngüden çıkıldıktan sonra çalışır.

### 2- Kilitlenmeye sebep olmadan  aşağıdaki blok çalışır mı ?

* Hayır çalışmaz. Çünkü sonsuz döngü main threadde çalışıyor.
* Bunun önüne geçmek için bu tarz işlemler async yapıda kullanılmalıdır.

