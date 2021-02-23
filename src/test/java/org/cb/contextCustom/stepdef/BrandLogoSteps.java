package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.BrandLogo;
import org.cb.contextCustom.pages.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrandLogoSteps extends Base {

    BrandLogo brandLogo = new BrandLogo();
    Logger logger = LoggerFactory.getLogger(ProductsSteps.class);


    @Then("User verifies that {string} is present")
    public void userVerifiesThatIsPresent(String value) {
        if (value.equals(brandLogo.suppy.getText())){
            textIsDisplayedAndEnabled("Supply from you print from us", brandLogo.suppy);

        }else if(value.equals(brandLogo.bring.getText())){
            textIsDisplayedAndEnabled("Bring Your Own Tee", brandLogo.bring);

        }else if (value.equals(brandLogo.brands.getText())){
            textIsDisplayedAndEnabled("Brands", brandLogo.brands);
        }
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

