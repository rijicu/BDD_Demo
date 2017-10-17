package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.LitecartMainPage;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;

public class SaleStickersFindDefinitions {



    @After
    public void tearDown() {
        DriverFactory.shutDownDriver();
    }
}
