package MbaFirstProject;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.ProjectLoginPage;
import utilities.BaseTest;



public class ProjectMainPage extends BaseTest {


    ProjectLoginPage loginPage  = new ProjectLoginPage();


    @Test
    public void test1() {
       loginPage.loginMethod();
        String expectedTextOfHomePage = "Desktops";
        String actualTextOfHomePage = loginPage.homePage.getText();
        Assert.assertEquals(actualTextOfHomePage,expectedTextOfHomePage, "This is not homepage");
        loginPage.hover();
        String expectedText = "Monitors (2)";
        String actualText = loginPage.monitor.getText();
        Assert.assertEquals(actualText,expectedText, "Text are not equal");
        loginPage.monitor.click();
        String expectedTextOfMonitor = "Monitors";
        String actualTextOfMonitor = loginPage.monitorText.getText();
        Assert.assertEquals(actualTextOfMonitor,expectedTextOfMonitor, "Text are not equal");


    }

    @Test @Ignore
    public void test2(){
        loginPage.loginMethod();
        String expectedTextOfHomePage = "Desktops";
        String actualTextOfHomePage = loginPage.homePage.getText();
        Assert.assertEquals(actualTextOfHomePage,expectedTextOfHomePage, "This is not homepage");
        loginPage.navigateTo();
        String expectedTextOfMonitor = "Monitors";
        String actualTextOfMonitor = loginPage.monitorText.getText();
        Assert.assertEquals(actualTextOfMonitor,expectedTextOfMonitor, "Text are not equal");
        loginPage.navigateBack();
        String expectedText = "Featured";
        String actualText = loginPage.displayText.getText();
        Assert.assertEquals(actualText,expectedText, "Text are not equal");
    }

    @Test @Ignore
    public void test3(){
        loginPage.loginMethod();
        String expectedTextOfHomePage = "Desktops";
        String actualTextOfHomePage = loginPage.homePage.getText();
        Assert.assertEquals(actualTextOfHomePage,expectedTextOfHomePage, "This is not homepage");
        loginPage.navigateTo();
        String expectedText = "Monitors";
        String actualText = loginPage.monitorText.getText();
        Assert.assertEquals(actualText,expectedText, "Text are not equal");
    }
}
