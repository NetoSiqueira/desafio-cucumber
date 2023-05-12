package page;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By pageLogin = By.xpath("//h1");
    private final By userName = By.xpath("//input[@name='username']");
    private final By password = By.xpath("//input[@name='password']");

    private final By pageInvoiceList = By.xpath("//h2[@class='mt-5']");

    private final By logout = By.linkText("Logout");

    private final By buttonLogin = By.id("btnLogin");

    private final By alertDanger = By.xpath("//*[@class='alert alert-danger mt-3']");

    public String showPage(){
        return obterValorPorTexto(pageLogin);
    }

    public void setUserName(String user){
        escreve(userName, user);
    }

    public void setPassword(String pass){
        escreve(password, pass);
    }

    public void button(){
        clicar(buttonLogin);
    }

    public String pageInvoiceList(){
        return obterValorPorTexto(pageInvoiceList);
    }

    public void logout(){
        clicarLink(logout);
    }

    public String alertDanger(){
        return obterValorPorTexto(alertDanger);
    }

}
