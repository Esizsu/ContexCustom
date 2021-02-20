import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.ProductsPage;
import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.stepdef.ProductsSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintBrandLogoSteps extends Base {

    ProductsPage productsPage = new ProductsPage();
    Logger logger = LoggerFactory.getLogger(ProductsSteps.class);


    @Then("User verifies that {string} is present")
    public void userVerifiesThatIsPresent(String arg0) {
    }

    @Then("User verifies that Print Now button is present")
    public void userVerifiesThatPrintNowButtonIsPresent() {
    }

    @Then("User verifies that Print image is present")
    public void userVerifiesThatPrintImageIsPresent() {
    }

    @Then("User verifies that {string} logo is present")
    public void userVerifiesThatLogoIsPresent(String arg0) {

    }



}

