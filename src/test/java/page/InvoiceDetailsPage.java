package page;

import base.BasePage;
import org.openqa.selenium.By;


public class InvoiceDetailsPage extends BasePage {
    private final By invoce = By.cssSelector("body > section > div > div:nth-child(3) > div:nth-child(5) > a");
    private final By invoceDetails = By.cssSelector("body > section > div > header > h2");
    private final By hotelname = By.cssSelector("h4[class='mt-5']");
    private  final By dateInvoice = By.cssSelector("body > section > div > ul > li:nth-child(1)");
    private  final By dateDue = By.cssSelector("body > section > div > ul > li:nth-child(2)");
    private  final By invoceNumber = By.cssSelector("body > section > div > h6");
    private final By numberBooking = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(1) > td:nth-child(2)");
    private final By customDetails = By.cssSelector("body > section > div > div");
    private final By superiorDouble = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(2) > td:nth-child(2)");
    private final By checkinDate = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(5) > td:nth-child(2)");
    private final By checkoutDate = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(6) > td:nth-child(2)");
    private final By stayCount = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(3) > td:nth-child(2)");
    private final By stayAmount = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(4) > td:nth-child(2)");
    private final By depositNow = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private final By taxVat = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private final By totalAmount = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(3)");

    public void firtItem(){
        clicar(invoce);
        novaAba();
    }

    public String showInvoceDetails(){
        return obterValorPorTexto(invoceDetails);
    }

    public String nameHotel(){
        return obterValorPorTexto(hotelname);
    }

    public String invoiceDate(){
        return posicaoTexto(obterValorPorTexto(dateInvoice),": ", 1);
    }

    public String dueDate(){
        return posicaoTexto(obterValorPorTexto(dateDue), ": ", 1);
    }

    public String invoceNumber(){
        return posicaoTextoStringEspecifica(obterValorPorTexto(invoceNumber), " ",1, 1);
    }

    public String bookingCode(){
        return obterValorPorTexto(numberBooking);
    }

    public String customDetails(){
    return obterValorPorTexto(customDetails).replace("\n", " ");
    }
    public String superiorDouble(){
        return obterValorPorTexto(superiorDouble);
    }
    public String checkInDate(){
        return obterValorPorTexto(checkinDate);
    }
    public String checkOutDate(){
        return obterValorPorTexto(checkoutDate);
    }
    public String stayCount(){
        return obterValorPorTexto(stayCount);
    }
    public String stayAmount(){
        return obterValorPorTexto(stayAmount);
    }
    public String depositNow(){
        return obterValorPorTexto(depositNow);
    }
    public String taxVat(){
        return obterValorPorTexto(taxVat);
    }
    public boolean totalAmount(){
        return obterValorExistente(obterValorPorTexto(totalAmount));
    }

}
