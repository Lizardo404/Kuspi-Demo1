package steps;

import io.cucumber.java.en.*;
import pages.BendigoBankPage;

public class BendigoBankSteps {
    BendigoBankPage bankDemo = new BendigoBankPage();

    @Given("to visit bank demo")
    public void toVisitBankDemo() {
        bankDemo.navigateToBank();
    }

    @When("select launch personal demo")
    public void selectPersonalDemo() {
        bankDemo.clickPersonalDemo();
    }

    @Then("select {word} from demo bank")
    public void selectItemFromMenu( String menu) throws InterruptedException {
        //int itemMenu = 9;
         bankDemo.clickMenuItems(menu);
    }

    @And("select launch business demo")
    public void selectBusinesDemo() {
        bankDemo.clickBusinesDemo();
    }


    @And("log Off demo bank")
    public void logOffDemoBank() throws InterruptedException {
      bankDemo.lofOffBankOption();
    }

    @Then("comparate account title")
    public void comparateAccountTitle() throws InterruptedException {
        int item =5;
        bankDemo.accountsTittle(item);
    }

    @Then("select pay anyone")
    public void selectPayAnyone() {
       bankDemo.clickPayAnyone();
    }

    @And("click new Payee and BSB and account Number")
    public void clickNewPayee() {
      bankDemo.newPayeeContact();
    }

    @Then("complete formulary New Payee")
    public void payeeFormulary() throws InterruptedException {
        bankDemo.payeeFormularySetup();
    }

    @And("sent payment to new payee")
    public void sentPayToNewPayee() throws InterruptedException{
       bankDemo.newTransacction();
    }
}


