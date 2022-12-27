package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_Dropdown {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    @Test
    public void selectByIndexTest() {


        // 1. Locate Dropdown element
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        //2. Select objesi olustur
        Select yearDropdown = new Select(year);
        //3. Select objesini kullanarak 3 farkli sekilde secim yapabilirim.
        yearDropdown.selectByIndex(22);

        // Dogun yilini, ayini, ve gununu su sekilde secer : 2000, January, 10

        //Ay secimi
        WebElement ay = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDropdown = new Select(ay);
        monthDropdown.selectByValue("0");//January seceneginin valuesi 0

        // Gun secimi selectByVisibleTest
        WebElement gun = driver.findElement(By.id("day"));
        Select gunDropdown = new Select(gun);
        gunDropdown.selectByVisibleText("10");// case sensitive
    }
    @Test
    public void printAllTest(){

        // Tum eyalet isimlerini consola yazdir.
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        List<WebElement> stateList = stateDropdown.getOptions();
        /*for(WebElement eachState : stateList){
            System.out.println(eachState.getText());
        }*/
        stateList.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    public void getSelectedOptionsTest(){

        // State dropdown daki varsayilan secili secenegin 'Select a State' oldugunu verify edelim.
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State",varsayilanText);
    }
    @After
    public void tearDown(){
        driver.close();
    }

    // Reusable Method: Dropdown icin tekrarli kullanabilecegimiz bir method olusturalim.


/*
1. What is dropdown? Dropdown nedir?
Dropdown liste olusturmak icin kullanilir.
2. How to handle dropdown elements? Dropdown nasil automate edilir?
-Dropdown'i Locate ederiz
-Select objecti'i olustururum
-Select objecti'i ile istedigim secenegi secerim
NOT: Select object'i olusturma nedenim, dropdownlarin Select class'i ile olusturulmasi
3. Tum dropdown seceneklerini nasil print ederiz
- tum dropdown elementlerini getOptions() methodu ile listeye koyariz
    - sonra secenekleri loop ile yazdirabilirz
    4. Bir secenegin secili oldugunu otomate etmek icin ne yapilir?
    Ornek: Gun olarak 10 i secdik ama ya secilmediyse?
    getFirstSelectedOption() secili olan secenegi return eder
 */


}
