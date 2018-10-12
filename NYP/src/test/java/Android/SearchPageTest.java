package Android;

import SearchPage.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchPageTest extends CommonAPI {
    @Test
    public void newsSearch() throws InterruptedException{
        SearchPage searchPage = PageFactory.initElements(ad, SearchPage.class);
        searchPage.searchByText();
    }
}
