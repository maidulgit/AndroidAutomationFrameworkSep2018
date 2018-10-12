package Android;

import MenuPage.MenuPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MenuPageTest extends CommonAPI {
    @Test
    public void menu() throws InterruptedException{
        MenuPage menuPage = PageFactory.initElements(ad, MenuPage.class);
        menuPage.allSections();
    }
}
