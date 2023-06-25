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
        Assert.assertEquals("Rendezvous Hotel", page.nameHotel());
    }
    @When("validation the Invoice Date: {string}")
    public void validationTheInvoiceDate(String string) {
        Assert.assertEquals("14/01/2018", page.invoiceDate());
    }
    @When("validation the Due Date: {string}")
    public void validationTheDueDate(String string) {
        Assert.assertEquals("15/01/2018", page.dueDate());
    }
    @When("validation the Invoice Number: {string}")
    public void validationTheInvoiceNumber(String string) {
        Assert.assertEquals("110", page.invoceNumber());
    }
    @When("validation the Booking Code: {string}")
    public void validationTheBookingCode(String string) {
        Assert.assertEquals("0875", page.bookingCode());
    }
    @When("validation the Customer Details: {string}")
    public void validationTheCustomerDetails(String string) {
        System.out.println(page.customDetails());
        Assert.assertEquals("JOHNY SMITH R2, AVENUE DU MAROC 123456", page.customDetails());
    }
    @When("validation the Room:{string}")
    public void validationTheRoom(String string) {

    }
    @When("validation the Check In: {string}")
    public void validationTheCheckIn(String string) {

    }
    @When("validation the Check Out: {string}")
    public void validationTheCheckOut(String string) {

    }
    @When("validation the Total Stay Count: {string}")
    public void validationTheTotalStayCount(String string) {

    }
    @When("validation the Total Stay Amount: {string}")
    public void validationTheTotalStayAmount(String string) {

    }
    @When("validation the Deposit Now: {string}")
    public void validationTheDepositNow(String string) {

    }
    @When("validation the Tax & VAT: {string}")
    public void validationTheTaxVAT(String string) {

    }
    @When("validation the Total Amount: {string}")
    public void validationTheTotalAmount(String string) {

    }
}
