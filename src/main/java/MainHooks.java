import cucumber.api.java.Before;
import com.codeborne.selenide.Configuration;

public class MainHooks {
    @Before
    public void prepare(){
        Configuration.browser = "Chrome";
        Configuration.baseUrl ="https://www.google.com";
        Configuration.timeout = 10000;
    }

}
