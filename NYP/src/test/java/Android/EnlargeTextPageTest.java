package Android;

import EnlargeTextPage.EnlargeTextPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EnlargeTextPageTest extends CommonAPI {
    @Test
    public void menu() throws InterruptedException{
        EnlargeTextPage enlargeTextPage = PageFactory.initElements(ad, EnlargeTextPage.class);
        enlargeTextPage.slideToLarge();
    }
}
