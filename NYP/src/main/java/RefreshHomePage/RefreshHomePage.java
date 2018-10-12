package RefreshHomePage;

import NotificationPage.NotificationsPage;
import base.CommonAPI;
import org.openqa.selenium.Dimension;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;


public class RefreshHomePage extends CommonAPI {
    public void swipeDown() throws InterruptedException {

        Dimension size = ad.manage().window().getSize();
        int starty = (int) (size.height / 2);
        int endy = (int) (size.height / 4);
        int startx = size.width / 2;
        TouchAction pullToRefresh = new TouchAction(ad);
        pullToRefresh.longPress(startx, endy).moveTo(startx, starty).release().perform();
        Thread.sleep(10000);
    }
}
