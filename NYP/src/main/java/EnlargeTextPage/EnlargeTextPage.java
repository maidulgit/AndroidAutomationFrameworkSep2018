package EnlargeTextPage;

import MenuPage.MenuPage;
import NotificationPage.NotificationsPage;
import base.CommonAPI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EnlargeTextPage extends CommonAPI {

    public void slideToLarge() throws InterruptedException {
        MenuPage menuPage = new MenuPage();
        menuPage.burgerMenu();
        sleepFor(2);
        menuPage.appSettings();
        WebElement slidebar = ad.findElement(By.id("br.com.golmobile.nypost:id/seekbar"));
        int start = slidebar.getLocation().getX();
        int end = slidebar.getSize().getWidth();
        int y = slidebar.getLocation().getY();
        TouchAction action = new TouchAction(ad);
        action.press(start,y).moveTo(end,y).release().perform();
        int moveTo = (int)(end);
        action.press(start,y).moveTo(moveTo,y).release().perform();
        sleepFor(1);
        NotificationsPage notificationsPage = new NotificationsPage();
        notificationsPage.backButton();
    }
}
