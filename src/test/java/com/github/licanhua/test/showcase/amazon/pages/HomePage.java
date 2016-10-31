package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Page;
import org.openqa.selenium.support.FindBy;

/**
 * @author Canhua Li
 */
public class HomePage extends Page {
    @FindBy(id = "nav-search")
    NavSearch navSearch;

    public void doSearch(String department, String text) {
        System.out.println("Try to search " + text + " in department " + department);
        navSearch.search(department, text);
    }
}
