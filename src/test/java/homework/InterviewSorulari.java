package homework;

public class InterviewSorulari {

    //How do you find the number of iframe on a page? Bir sayfadaki toplan iframe sayisini basil buluruz?
    //***Iframe ler iframe tagi kullanılarak oluşturulur. Bu durumda find elements by frame locatorini kullanarak tum iframeleri bulurum
    //***driver.findElements(By.tagName(“iframe”));
    //***driver.findElements(By.xpath(“//iframe”));
    //————————————
    //Explain how you can switch back from a main page? Tekrar ana sayfaya nasil donersin?
    //***2 farkli yol vardır.
    //***defaultContent yada parentFrame metotlarını kullarak gecis yapabiliriz.
    //———————————-
    //What is the difference between defaultContent and parentFrame? defaultContent ve parentFrame arasindaki farklar nelerdi?
    //*** Oncelikle her ikiside framein misina cikmamizi saglar. Ama defaultContent direk ana sayfaya atlatır, parentFrame ise bir üst seviyeye atlatir
    //—————————————
    //What might be the reason for your test case to fail?Bir test case in fail etme sebepleri neler olabilir?
    //Yanlis locator. Cozum : Tekrar elementi locate etmek. Değişken element var ise ona gore dynamic bir xpath yazarız.
    //Wait / Syncronization /Bekleme problemi: Cozum : implicit wait de yeterli sure oldugundan emin oluruz. O sureyi arttırabiliriz. 30 saniye verilebilir. Explicit wait kullanilabilir(sonra gore).
    //Iframe. Cozum : switch to iframe
    //Alert. Cozum : switch to alert
    //New window(Yeni pencere) : switch to window

    /*
    1- Actions nedir? Actions Class nedir ?
*Actions selenium dan gelen bir kütüphanedir.
Mouse ve Keyboard islemlerini gerçekleştirmek icin kullandigimiz hazır bir selenium kutuphanesidir.
Ornegin, sag tiklamak(contextClick), çift tıklamak(doubleClick), elementin uzerine gitmek(moveToElement) gibi
mouse islemlerini gerçekleştirebiliriz.
Ayni zamanda, shift, control, delete, enter gibi keyboard tuslarinada actions yardımıyla basabiliriz.
Bu tur islemlerde sendKeys metodu kullaninir.
2- Ne tur methodlar kullandin?
Actions metotlari onemlidir.
Ve tekrar tekrar kullanmam gerektiğinden, Actions metotlarını içeren Reusable metodları oluşturdum.
Ve gerektiğinde bu reusable metodları kullanıyorum. Ornegin rightClick methodunu bir elemente raga tiklamak icin
test classimda vagira bilirim.
3- Hangi methodlari kullandin ne ne ise yarar?
Ornegin, sag tiklamak(contextClick), çift tıklamak(doubleClick), elementin uzerine gitmek(moveToElement) gibi
mouse islemlerini gerçekleştirebiliriz. Ayni zamanda, shift, control, delete, enter gibi keyboard tuslarinada
actions yardımıyla basabiliriz. Bu tur islemlerde sendKeys metodu kullaninir.


     */

    /*
    Interview Questions
Tell me 5 exception that you get.-5 adet selenium da aldigin exceptions dan bahset.
What type of exceptions do you get in selenium? - Seleniumda ki align exceptions tiplerinden bahset
What is your solution?-Cozum ne?
What type of waits do you use?- Hangi resit wait kullanirsin?
Which wait do you prefer?- Hangi wait tercih edersin?
Why do you prefer that wait?- Neden onu tercih edersin?
How to you resolve synronization issue?-Senkronizasyon problemini nasil cozersin?

NoSuchElementException
TimeOutException
NullPointerException
InvalidSelectorException
StaleElementReferenceException
InvalidElementStateException
WebDriverException
ElementNotInteractableException
ElementClickInterceptedException
InvalidArgumentException
JavascriptException
RemoteDriverServerException
     */
}
