package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Container;
import com.github.licanhua.test.framework.annotation.RelativeElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Canhua Li
 */
public class ProductItem extends Container {
    @RelativeElement
    @FindBy(xpath = "./div/div[3]/div[1]")
    WebElement itemDetail;

    @RelativeElement
    @FindBy(xpath="./div/div[4]/div[1]")
    WebElement price;

    public String getItemDisplayString() {
        return "Item: " + itemDetail.getText() + "  price: " + price.getText();
    }
}
