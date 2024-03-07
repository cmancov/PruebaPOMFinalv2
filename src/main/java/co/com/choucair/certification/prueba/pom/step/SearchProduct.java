package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import net.bytebuddy.matcher.ElementMatcher;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Random;

import static net.bytebuddy.matcher.ElementMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SearchProduct {

  private PaginaUrl paginaUrl;

    @Step
    public  void pageSearch() {
        paginaUrl.prod1.click();
        paginaUrl.prod2.click();
        paginaUrl.prod3.click();
        paginaUrl.prod4.click();
        paginaUrl.prod5.click();
        paginaUrl.link_carrito.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
        @Step
        public void verify(){
    }
}


