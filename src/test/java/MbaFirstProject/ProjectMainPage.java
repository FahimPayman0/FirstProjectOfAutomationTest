package MbaFirstProject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.ProjectLoginPage;
import utilities.BaseTest;



public class ProjectMainPage extends BaseTest {


    ProjectLoginPage loginPage  = new ProjectLoginPage();


    @Test
    public void test1() {
        loginPage.loginMethod();
        loginPage.hover();


    }

    @Test @Ignore
    public void test2(){
        loginPage.loginMethod();
        loginPage.navigateTo();
        loginPage.navigateBack();
    }

    @Test @Ignore
    public void test3(){
        loginPage.loginMethod();
        loginPage.navigateTo();
    }
}
