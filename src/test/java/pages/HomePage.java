package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HomePage extends Parent {

    public HomePage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products_button;

    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement product1_AddToCard_button;

  //  public WebElement product1_preis = product1_AddToCard_button.findElement(By.xpath("./..>h2"));

    @FindBy(xpath = "//a[@data-product-id='1']/parent::div>h2")
    public WebElement product1_price;

    @FindBy(css = "button[class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping_button;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement product2_AddToCard_button;

    @FindBy(xpath = "//a[@data-product-id='2']/parent::div>h2")
    public WebElement product2_price;

    @FindBy(css = "p[class='text-center']>a[href='/view_cart']")
    public WebElement view_cart_button;


}