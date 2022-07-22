import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:/Users/burak/Downloads/Selenium/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        WebElement hello = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        hello.click();
        Thread.sleep(500);
        WebElement email = driver.findElement(By.cssSelector("#ap_email"));
        email.sendKeys("writeyour@email.com");
        Thread.sleep(500);
        WebElement cont = driver.findElement(By.cssSelector(".a-button-input"));
        cont.click();
        Thread.sleep(500);
        WebElement password = driver.findElement(By.cssSelector("#ap_password"));
        password.sendKeys("yourpasswordhere");
        Thread.sleep(500);
        WebElement checkbox = driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
        checkbox.click();
        Thread.sleep(500);
        WebElement signIn = driver.findElement(By.cssSelector("#signInSubmit"));
        signIn.click();
        Thread.sleep(500);
        WebElement categories = driver.findElement(By.cssSelector("#searchDropdownBox"));
        categories.click();
        Thread.sleep(500);
        Select slc = new Select(categories);
        slc.selectByVisibleText("Elektronik"); // Category Name
        Thread.sleep(500);
        WebElement search = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        search.click();
        Thread.sleep(1000);
        WebElement prime = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[1]"));
        prime.click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        WebElement primeSell = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[21]"));
        primeSell.click();
        Thread.sleep(1000);
        WebElement airPod = driver.findElement(By.linkText("Apple AirPods Pro ( Yeni Nesil MagSafe Şarj Kutulu) 2021")); // Text Product
        airPod.click();
        Thread.sleep(1000);
        WebElement addToCart = driver.findElement(By.cssSelector("#add-to-cart-button"));
        addToCart.click();
        Thread.sleep(5000);
        WebElement cart = driver.findElement(By.id("attach-sidesheet-view-cart-button"));
        cart.click();
        Thread.sleep(1000);
        WebElement done = driver.findElement(By.name("proceedToRetailCheckout"));
        done.click();



    }
}
