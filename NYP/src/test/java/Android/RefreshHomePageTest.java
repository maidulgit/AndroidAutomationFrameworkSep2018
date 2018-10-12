package Android;

import RefreshHomePage.RefreshHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RefreshHomePageTest extends CommonAPI {
    @Test
    public void refresh() throws InterruptedException{
        RefreshHomePage refreshHomePage = PageFactory.initElements(ad, RefreshHomePage.class);
        refreshHomePage.swipeDown();
    }
}
