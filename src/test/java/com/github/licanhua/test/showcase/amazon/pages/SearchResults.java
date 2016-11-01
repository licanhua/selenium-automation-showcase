package com.github.licanhua.test.showcase.amazon.pages;

import com.github.licanhua.test.framework.Container;
import com.github.licanhua.test.framework.annotation.RelativeElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Canhua Li
 */
public class SearchResults extends Container {
    @RelativeElement
    @FindBy(xpath=".//li[starts-with(@id, 'result_')]")
    List<ProductItem> productItemList;

    public void printAllItems(){
        StringBuilder sb = new StringBuilder();
        sb.append("We found totally " + productItemList.size() + " items\n");
        int i= 1;
        for (ProductItem productItem : productItemList) {
            sb.append(i++);
            sb.append(" ");
            sb.append(productItem.getItemDisplayString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
