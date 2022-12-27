package day05_JUnit;

import org.junit.*;

public class C04_BeforeClassAfterClass {

    //BeforeClass ve AfterClass notasyonlari sadece static methodlar icin calisir.
    //BeforeClass ve AfterClass kullanirsak olusturdugumuz Test methodlarinin hepsi
    //ayni anda calisip en son AfterClassi calistiririz
    // ama sadece Before ve After kullanirsak her test icin before ve after kullanir


    @BeforeClass
    public static void setUp() {
        System.out.println("butun testlerden once calisti");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("Butun testlerden sonra calisti");
    }
    @Before
    public void setup01() {
        System.out.println("Her testten once calisir");
    }
    @After
    public void tearDown01() {
        System.out.println("her testten sonra calisir");
    }
    @Test
    public void test01() {
        System.out.println("ilk test");
    }
    @Test
    public void test02() {
        System.out.println("ikinci test");
    }
    @Test
    @Ignore
    public void test03() {
        System.out.println("ucuncu test");
    }



}