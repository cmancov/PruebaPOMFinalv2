package co.com.choucair.certification.prueba.pom.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

@DefaultUrl("http://www.exito.com/celulares")
public class PaginaUrl extends PageObject {

   @FindBy(xpath = "(//div/div/button/span[text()='Agregar'])[1]")
    public WebElementFacade prod1;

    @FindBy(xpath = "(//div/div/button/span[text()='Agregar'])[2]")
    public WebElementFacade prod2;
    @FindBy(xpath = "(//div/div/button/span[text()='Agregar'])[3]")
    public WebElementFacade prod3;
    @FindBy(xpath = "(//div/div/button/span[text()='Agregar'])[4]")
    public WebElementFacade prod4;
    @FindBy(xpath = "(//div/div/button/span[text()='Agregar'])[5]")
    public WebElementFacade prod5;
    @FindBy(xpath = "//*[@id='__next']/header/section/div/div[2]/div[2]/button/span")
    public WebElementFacade link_carrito;
    @FindBy(xpath = "//h1[@class='exito-checkout-io-0-x-pageTitle']")
    public WebElementFacade lbl_carrito;
}
