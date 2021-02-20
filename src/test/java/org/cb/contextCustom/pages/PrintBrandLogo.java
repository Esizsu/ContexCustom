package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.support.PageFactory;

public class PrintBrandLogo {

    public PrintBrandLogo() {
        PageFactory.initElements(MyDriver.get(), this);
    }
}
