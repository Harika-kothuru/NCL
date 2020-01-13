package com.ncl.cruises;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;

public class ShoreExcursionRepository {

    @FindBy(xpath = "//section[@data-analytics-region='mod_choose_adventure']//a[@title='Explore Shore Excursions -Title']")
    private WebElement ShoreExcursionLink;

    public WebElement getShoreExcursionLink() {
        return ShoreExcursionLink;
    }

    @FindBy(xpath = "//section[@data-analytics-region='mod_choose_adventure']//h3[text()='See The Spectacular']")
    private WebElement SeeTheSpectacularTitle;

    public WebElement getSeeTheSpectacularTitle() {
        return SeeTheSpectacularTitle;
    }

    @FindBy(xpath = "//section[@id='page-shore-excursions']//a/span[text()='Destination']/following-sibling::div")
    private WebElement DestinationDropdown;

    public WebElement getDestinationDropdown() {
        return DestinationDropdown;
    }

    @FindBy(xpath = "//div[@id='search_destinations_chosen']//div/input[@class='chosen-search-input']")
    private WebElement DestinationInput;

    public WebElement getDestinationInput() {
        return DestinationInput;
    }

    @FindBy(xpath = "//ul[@class='chosen-results']/li[1]")
    private WebElement DestinationSuggestion;

    public WebElement getDestinationSuggestion() {
        return DestinationSuggestion;
    }

    @FindBy(xpath = "//button[text()='FIND EXCURSIONS']")
    private WebElement FindExcursionsButton;

    public WebElement getFindExcursionsButton() {
        return FindExcursionsButton;
    }

    @FindBys(@FindBy(xpath = "//div[@class='filter-options']//li/a[@title='Destination']/following-sibling::div[@class='widget-items']/ul[@class='items-list']/li"))
    private List<WebElement> DestinationFilters;

    public List<WebElement> getDestinationFilters() {
        return DestinationFilters;
    }

    @FindBy(xpath = "//div[@class='filter-options']//li/a[@title='Destination']/following-sibling::div[@class='widget-items']/ul[@class='items-list']/li//span")
    private WebElement DestinationFilterText;

    public WebElement getDestinationFilterText() {
        return DestinationFilterText;
    }

    @FindBy(xpath = "//div[@class='filter-options']//li/a[@title='Port']")
    private WebElement PortFilterButton;

    public WebElement getPortFilterButton() {
        return PortFilterButton;
    }

    @FindBys(@FindBy(xpath = "//div[@class='filter-options']//li/a[@title='Port']/following-sibling::div//ul[@id='ports']/li"))
    private List<WebElement> PortsByFilter;

    public List<WebElement> getPortsByFilter() {
        return PortsByFilter;
    }

    @FindBys(@FindBy(xpath = "//div[@class='filter-options']//li/a[@title='Port']/following-sibling::div//ul[@id='ports']/li//label"))
    private List<WebElement> PortsByFilterText;

    public List<WebElement> getPortsByFilterText() {
        return PortsByFilterText;
    }

    @FindBy(xpath = "//div[@id='price-slider-values']//span[2]")
    private WebElement LeftSlideBar;

    public WebElement getLeftSlideBar() {
        return LeftSlideBar;
    }

    @FindBy(id = "price-slider-values")
    private WebElement SlideBar;

    public WebElement getSlideBar() {
        return SlideBar;
    }

    @FindBy(xpath = "//span[@class='legend-column extremes']")
    private WebElement PriceRange;

    public WebElement getPriceRange() {
        return PriceRange;
    }


    @FindBy(xpath = "//ul[@class='filter-extra']//label[text()='Price']")
    private WebElement PriceLabel;

    public WebElement getPriceLabel() {
        return PriceLabel;
    }

}
