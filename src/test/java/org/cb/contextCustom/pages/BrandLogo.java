package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandLogo {

    public BrandLogo() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "(//img[@alt='Context Custom'])[3]")
    public WebElement contexcustomlogo;

    @FindBy(xpath = "//img[@alt='Gildan'] ")
    public WebElement giildan;



    @FindBy(xpath = "(//img[@alt='Shop Converse'])[3]  ")
    public WebElement printimage;
}
