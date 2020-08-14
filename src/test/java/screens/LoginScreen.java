package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import screens.base.BaseScreen;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "login_button")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "login_username")
    private MobileElement campoEmail;

    @AndroidFindBy(id = "login_password")
    private MobileElement campoSenha;

    @AndroidFindBy(id = "mensagem2")
    private MobileElement homeAplicativo;

    public void validarInicio() {
        this.btnLogin.isDisplayed();
    }

    public void logar() {
        this.campoEmail.sendKeys("qazando@gmail.com");
        this.campoSenha.sendKeys("123456");
        this.btnLogin.click();
    }

    public void validoHome() {
        this.homeAplicativo.isDisplayed();
    }

}
