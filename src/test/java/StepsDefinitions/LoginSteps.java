package StepsDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import screens.LoginScreen;

public class LoginSteps {

    LoginScreen login;

    public LoginSteps() {

        login = new LoginScreen();
    }

    @Dado("^que estou na tela de login$")
    public void queEstouNaTelaDeLogin() {
        this.login.validarInicio();
    }

    @Quando("^informo um usuario valido$")
    public void informoumusuariovalido() {
        this.login.logar();
    }

    @Entao("^vejo a tela home$")
    public void vejoatelahome() {
        this.login.logado();
    }
}