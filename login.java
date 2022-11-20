import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver robo;

    @BeforeEach
    public void acessarSite(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("https://www.saucedemo.com/");

    }

    @AfterEach
    public void quit(){

        robo.quit();

    }

    @Test
    public void loginStandard(){

        robo.findElement(By.id("user-name")).sendKeys("standard_user");
        robo.findElement(By.id("password")).sendKeys("secret_sauce");
        robo.findElement(By.id("login-button")).click();
        robo.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assertions.assertEquals("PRODUCTS", robo.findElement(By.className("title")).getText());

    }

    @Test
    public void loginLocked(){

        robo.findElement(By.id("user-name")).sendKeys("locked_out_user");
        robo.findElement(By.id("password")).sendKeys("secret_sauce");
        robo.findElement(By.id("login-button")).click();
        robo.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assertions.assertEquals("PRODUCTS", robo.findElement(By.className("title")).getText());

    }

    @Test
    public void loginProblem(){

        robo.findElement(By.id("user-name")).sendKeys("problem_user");
        robo.findElement(By.id("password")).sendKeys("secret_sauce");
        robo.findElement(By.id("login-button")).click();
        robo.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assertions.assertEquals("PRODUCTS", robo.findElement(By.className("title")).getText());

    }

    @Test
    public void loginPerformance(){

        robo.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        robo.findElement(By.id("password")).sendKeys("secret_sauce");
        robo.findElement(By.id("login-button")).click();
        robo.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assertions.assertEquals("PRODUCTS", robo.findElement(By.className("title")).getText());

    }

}
