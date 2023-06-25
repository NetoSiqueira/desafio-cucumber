package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.InvoiceDetailsPage;

public class InvoceDetailsSteps {

    private InvoiceDetailsPage page = new InvoiceDetailsPage();

    @Given("to click the Invoice Details link for the first item presented in the screen")
    public void toClickTheInvoiceDetailsLinkForTheFirstItemPresentedInTheScreen() {
       page.firtItem();
    }
    @When("the application shows the informations of the Invoice")
    public void theApplicationShowsTheInformationsOfTheInvoice() {
        Assert.assertEquals("Invoice Details", page.showInvoceDetails());
    }
    @When("validation the Hotel Name: {string}")
    public void validationTheHotelName(String string) {
        Assert.assertEquals(string, page.nameHotel());
    }
    @When("validation the Invoice Date: {string}")
    public void validationTheInvoiceDate(String string) {
        Assert.assertEquals(string, page.invoiceDate());
    }
    @When("validation the Due Date: {string}")
    public void validationTheDueDate(String string) {
        Assert.assertEquals(string, page.dueDate());
    }
    @When("validation the Invoice Number: {string}")
    public void validationTheInvoiceNumber(String string) {
        Assert.assertEquals(string, page.invoceNumber());
    }
    @When("validation the Booking Code: {string}")
    public void validationTheBookingCode(String string) {
        Assert.assertEquals(string, page.bookingCode());
    }
    @When("validation the Customer Details: {string}")
    public void validationTheCustomerDetails(String string) {
//        System.out.println(page.obterValorPorTexto(page.customDetails).replace("\n", " "));
//        System.out.println(page.customDetails());
//       Assert.assertTrue(page.customDetails());
        Assert.assertEquals(string, page.customDetails());
    }
    @When("validation the Room:{string}")
    public void validationTheRoom(String string) {
        Assert.assertEquals(string, page.superiorDouble());
    }
    @When("validation the Check In: {string}")
    public void validationTheCheckIn(String string) {
        Assert.assertEquals(string, page.checkInDate());
    }
    @When("validation the Check Out: {string}")
    public void validationTheCheckOut(String string) {
        Assert.assertEquals(string, page.checkOutDate());
    }
    @When("validation the Total Stay Count: {string}")
    public void validationTheTotalStayCount(String string) {
        Assert.assertEquals(string, page.stayCount());
    }
    @When("validation the Total Stay Amount: {string}")
    public void validationTheTotalStayAmount(String string) {
        Assert.assertEquals(string, page.stayAmount());
    }
    @When("validation the Deposit Now: {string}")
    public void validationTheDepositNow(String string) {
        Assert.assertEquals(string, page.depositNow());
    }
    @When("validation the Tax & VAT: {string}")
    public void validationTheTaxVAT(String string) {
        Assert.assertEquals(string, page.taxVat());
    }
    @When("validation the Total Amount: {string}")
    public void validationTheTotalAmount(String string) {
        System.out.println(page.totalAmount());
        Assert.assertTrue(page.totalAmount());
    }
}
