import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class carrinho {

    WebDriver robo;

    @BeforeEach
    public void acessarSite(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("https://www.saucedemo.com/");
        robo.findElement(By.id("user-name")).sendKeys("standard_user");
        robo.findElement(By.id("password")).sendKeys("secret_sauce");
        robo.findElement(By.id("login-button")).click();

    }

    @AfterEach
    public void quit(){

        robo.quit();

    }

    @Test
    public void mochila(){

        robo.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

    @Test
    public void LuzDeBicicleta(){

        robo.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

    @Test
    public void CamisaPreta(){

        robo.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

    @Test
    public void Casaco(){

        robo.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

    @Test
    public void RoupaInfantil(){

        robo.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

    @Test
    public void CamisaVermelha(){

        robo.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        robo.findElement(By.className("shopping_cart_link")).click();
        robo.findElement(By.id("checkout")).click();
        robo.findElement(By.id("first-name")).sendKeys("Gustavo");
        robo.findElement(By.id("last-name")).sendKeys("Magalhães");
        robo.findElement(By.id("postal-code")).sendKeys("12345-678");
        robo.findElement(By.id("continue")).click();
        robo.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER", robo.findElement(By.className("complete-header")).getText());

    }

}
