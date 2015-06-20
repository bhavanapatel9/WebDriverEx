/**
 * Created by Sony on 02/05/2015.
 */
//import org.openqa.selenium.By;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class WebDriverEx {
   public static WebDriver webdriver;
    String uname = "admin";
    String pwd="Insoft12";
    @BeforeClass
  /*  public static void beforeClassMethod()
    {
        System.out.println("method before class");
    }*/
    public static void OpenBrowser() {
        webdriver = new FirefoxDriver();
        webdriver.get("http://insoftt.trial47.orangehrmlive.com/symfony/web/index.php/auth/login");
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    /*public void afterClassMethod()
    {
        System.out.println("after class method");
    }*/
    public static void closeBrowser() {
        webdriver.quit();
    }

    @Before
    public  void login() {
        WebElement username = webdriver.findElement(By.id("txtUsername"));
        username.sendKeys(uname);
        WebElement passwordwd = webdriver.findElement(By.id("txtPassword"));
        passwordwd.sendKeys(pwd);
        WebElement btn = webdriver.findElement(By.id("btnLogin"));
        btn.click();
        beforeMethod();

    }


    public static void beforeMethod()
    {
        System.out.println("Before annotation method");
    }


    @After
    /*public void afterMethod()
    {
        System.out.println("after annotation method");
    }*/
    public   void logout() {
        WebElement welcome = webdriver.findElement(By.id("welcome"));
        welcome.click();
        webdriver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
        WebElement logout = webdriver.findElement(By.linkText("Logout"));
        logout.click();

    }

    @Test
    public void testcaseOne() {
        WebElement adminlink = webdriver.findElement(By.id("menu_admin_viewAdminModule"));
        adminlink.click();
        WebElement searchbtn = webdriver.findElement(By.id("searchBtn"));
        if (searchbtn.isDisplayed()) System.out.println("search button id present");
    }

    /*public  static void testcaseTwo()
    {
        WebElement pimMmodule = webdriver.findElement(By.id("menu_pim_viewPimModule"));
        pimMmodule.click();

    }*/

}
