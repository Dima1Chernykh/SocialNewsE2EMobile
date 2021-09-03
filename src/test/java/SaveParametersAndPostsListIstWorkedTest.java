import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaveParametersAndPostsListIstWorkedTest extends BaseMethods {

    @Epic(value = "Settings and Posts list interaction")
    @Description(value = "Check SAVE button and go to Posts list is worked.")
    @Test
    public void testSaveParametersAndPostsListIstWorked() {
        StartPage startPage = new StartPage(driver);
        PostsPage postsPage = new PostsPage(driver);
        startPage.saveButton.click();
        Assert.assertEquals(postsPage.postsHeader.getText(), "Posts list");
        Assert.assertTrue(postsPage.postDate.isDisplayed());
        Assert.assertTrue(postsPage.authorName.isDisplayed());
        Assert.assertTrue(postsPage.postBody.isDisplayed());
    }

}
