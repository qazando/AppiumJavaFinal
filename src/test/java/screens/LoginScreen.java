package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import screens.base.BaseScreen;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "login_button")
    @iOSXCUITFindBy(accessibility = "login_button")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "login_username")
    @iOSXCUITFindBy(accessibility = "login_username")
    private MobileElement campoEmail;

    @AndroidFindBy(id = "login_password")
    @iOSXCUITFindBy(accessibility = "login_password")
    private MobileElement campoSenha;

    @AndroidFindBy(id = "mensagem2")
    @iOSXCUITFindBy(accessibility = "welcome_txt")
    private MobileElement mensagem;

    public void validarInicio() {
        this.btnLogin.isDisplayed();
    }

    public void logar() {
        this.campoEmail.sendKeys("qazando@gmail.com");
        this.campoSenha.sendKeys("12345678");
        this.btnLogin.click();
    }

    public void logado() {
        this.mensagem.isDisplayed();
    }
}
