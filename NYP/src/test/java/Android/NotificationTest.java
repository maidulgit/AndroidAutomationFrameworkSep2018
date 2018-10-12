package Android;

import NotificationPage.NotificationsPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NotificationTest extends CommonAPI {
    @Test
    public void notification() throws InterruptedException{
        NotificationsPage notificationsPage = PageFactory.initElements(ad, NotificationsPage.class);
        notificationsPage.toggleAllSwitches();
    }
}
