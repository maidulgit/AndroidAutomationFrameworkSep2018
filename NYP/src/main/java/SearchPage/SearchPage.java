package SearchPage;

import MenuPage.MenuPage;
import base.CommonAPI;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
    public static WebElement searchBox;

    public void searchByText() throws InterruptedException{
        sleepFor(1);
        MenuPage menuPage = new MenuPage();
        menuPage.burgerMenu();
        //searchBox.click();
        sleepFor(1);
        searchBox.sendKeys("information technology");

        //Unable to hit search
        ad.getKeyboard().sendKeys(Keys.RETURN);

    }
}
