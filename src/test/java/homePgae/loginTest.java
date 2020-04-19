package homePgae;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest extends ScriptBase {

    @BeforeTest
    public void init(){
        beforeTest();
    }

    @Test
    public void verifyLoginButtonDisplayed(){
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).isDisplayed();


    }

}
