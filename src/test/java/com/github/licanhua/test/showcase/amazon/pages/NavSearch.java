package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Container;
import com.github.licanhua.test.framework.base.SelectBox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Canhua Li
 */
public class NavSearch extends Container {
    @FindBy(id = "searchDropdownBox")
    SelectBox departmentSelectBox;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchText;

    @FindBy(xpath = "//input[@value=\"Go\"]")
    WebElement submit;


    public void search(String department, String content) {
        departmentSelectBox.selectByValue(department);
        searchText.sendKeys(content);
        this.clickAndToPage(submit, SearchResultPage.class);
    }
}
