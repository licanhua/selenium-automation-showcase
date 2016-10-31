package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Page;
import org.openqa.selenium.support.FindBy;

/**
 * @author Canhua Li
 */
public class SearchResultPage extends Page {
    @FindBy(id="atfResults")
    SearchResultListContainer searchResultListContainer;

    public void printSearchResult() {
        System.out.println("Prepare to print all results");
        searchResultListContainer.printAllItems();
    }
}
