import org.junit.Test;
import step_definitions.LoginFormStepDefinitions;

public class LoginFormTest {
    @Test
    public void loginFormShouldBePresent() {
        new LoginFormStepDefinitions().openLitecartMainPage();
        new LoginFormStepDefinitions().checkElementsPresence();
    }
}
