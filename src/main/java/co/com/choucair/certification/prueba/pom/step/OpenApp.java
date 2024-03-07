package co.com.choucair.certification.prueba.pom.step;


import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import net.thucydides.core.annotations.Step;

public class OpenApp {
    private PaginaUrl paginaUrl;

    @Step
        public  void appUrl() {
        paginaUrl.open();
    }
}
