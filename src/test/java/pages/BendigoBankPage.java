package pages;

import org.junit.Assert;

public class BendigoBankPage extends BasePage{

    //WebElements by Xpaths
    private String personalDemo = "//button[normalize-space()='Launch Personal Demo']";
    private String businesDemo = "//button[normalize-space()='Launch Business Demo']";

    // Bank Demo Page Menu
    private String accounts  ="//a[@id='Navigation_Item_accounts']";
    private String moveMoney ="//a[@id='Navigation_Item_move_money']";
    private String activity  ="//a[@id='Navigation_Item_activity']";
    private String contacts  ="//a[@id='Navigation_Item_contacts']";
    private String cards     ="//a[@id='Navigation_Item_cards']";
    private String onLineFX  ="//a[@id='Navigation_Item_fx']";
    private String news      ="//a[@id='Navigation_Item_change_log']";
    private String support   ="//a[@id='Navigation_Item_support']";
    private String logOutBk    ="//span[normalize-space()='Log Out']";
    private String settings  ="//a[@id='Navigation_Item_settings']";

    //Accounts webElements
    private String demoEveryAccount ="//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li[1]/a/div/div[1]/div[1]/div";
     private String accountSetup    = "//i[@class='ico-more']//*[name()='svg']";
     private String transFAccount   = "//i[@class='ico-transferbetween chakra-j4jpic']";
    private String demoMultiSig     ="//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li[2]/a/div/div[1]/div[1]/div";
    private String demoMyMasterCard ="//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li[3]/a/div/div[1]/div[1]/div";
    private String demoHomeLoan     ="//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li[4]/a/div/div[1]/div[1]/div";
    private String demoTermDepo     ="//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li[5]/a/div/div[1]/div[1]/div";

    private String payAnyone = "//*[@id=\"Landing_Pay_Anyone\"]/div";
    private String newPayee  = "//span[normalize-space()='New Payee']";
    private String bSB       = "//div[contains(text(),'BSB & Account Number')]";
    private String namePayeeTxt = "//*[@id=\"Pay_Anyone_Name\"]";
    private String bSBTxt     = "//input[@id='Pay_Anyone_BSB']";
    private String accountTxt = "//input[@id='Pay_Anyone_AccountNumber']";
    private String nextBtnPayee = "//*[@id=\"Pay_Anyone_AddContact\"]";

    private String confirmationBtn ="//button[@id='Payee_Name_Check_Confirm']";

    private String payFromRdoBtn = "//li[@id='Transfer_Select_AccountPay_Account_From_0']//i[@class='ico-radio-select_32px checkable-group__icon']//*[name()='svg']";
    private String amountTxt = "//*[@id=\"Pay_Anyone_Past_Payments\"]";
    private String descriptionTxt = "//*[@id=\"Pay_Anyone_Description\"]";
    private String paymentNextBtn = "//*[@id=\"Pay_Anyone_Next\"]";

    public BendigoBankPage() {
        super(driver);
    }

    public void navigateToBank(){
        navigateTo("https://demo.bendigobank.com.au/banking/sign_in");
        System.out.println("--------------------------------------------");
        System.out.println("<< System Open Bendigo Bank Demo >>");
        System.out.println("--------------------------------------------");

    }

    public void clickPersonalDemo(){
       try {
           clickElement(personalDemo);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ User select Launch Personal Demo -----");

       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
    }

    public void clickBusinesDemo(){
        try {
            clickElement(businesDemo);
            System.out.println("---- ✔ User select Launch Business Demo -----");
            System.out.println("-----------------------------------------");
        } catch (Exception e) {
            System.out.println("-----------------------------------------");
            System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
            throw new RuntimeException(e);
        }
    }

    public void clickMenuItems(String menu) throws InterruptedException{
       String election = menu;
       try {
           System.out.println("-----------------------------------------");
           System.out.println("----  User select Item menu -----");
                switch (election) {
                    case "accounts":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(accounts);
                        break;
                    case "move_money":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(moveMoney);
                        break;
                    case "activity":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(activity);
                        break;
                    case "contacts":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(contacts);
                        break;
                    case "cards":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(cards);
                        break;
                    case "fx":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(onLineFX);
                        break;
                    case "change_log":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(news);
                        break;
                    case "setting":
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(settings);
                        break;
                    default:
                        Thread.sleep(300);
                        System.out.println(" ✔ -|" + election + "| -- Selected");
                        clickElement(accounts);
                }
      } catch (Exception e) {
          System.out.println("###################################################");
          System.out.println(" ❌ -|"+ menu +"| -- Selected");
          System.out.println("---------------❌_No Items found it_❌------------");
          throw new RuntimeException(e);
      }
    }

    public void lofOffBankOption() throws InterruptedException{
        try {
            Thread.sleep(300);
          System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
          clickElement(logOutBk);
          System.out.println("<<< System log Off >>>");
        } catch (Exception e) {
            System.out.println("###################################################");
            System.out.println("---------------❌_No Items found it_❌------------");
            throw new RuntimeException(e);
        }
    }

    public void accountsTittle(int item) throws InterruptedException {
        int x = item;
        int i =1;
        String currentTitle = "";
        System.out.println("###################################################");
        System.out.println("<<< Text Comparative >>>");
        while (i<=x){
            currentTitle= textFromElement("//*[@id=\"entrypoint\"]/div/section/div[1]/div[1]/div/div[1]/div[3]/ol/li/ol/li["+i+"]/a/div/div[1]/div[1]/div");
            switch (i) {
                case 1:
                    Thread.sleep(300);
                    try {
                        Assert.assertEquals("Demo Everyday Account",currentTitle);
                        System.out.println(" ✔ -| Comparative successfully | Text compared :"+currentTitle );
                    } catch (Exception e) {
                        System.out.println("###################################################");
                        System.out.println("---------------❌_No Match successfully_❌------------");
                        throw new RuntimeException(e);
                    }

                case 2:
                    Thread.sleep(300);
                    try {
                        Assert.assertEquals("Demo Multi Signatory Account",currentTitle);
                        System.out.println(" ✔ -| Comparative successfully | Text compared :"+currentTitle );
                    } catch (Exception e) {
                        System.out.println("###################################################");
                        System.out.println("---------------❌_No Match successfully_❌------------");
                        throw new RuntimeException(e);
                    }

                case 3:
                    Thread.sleep(300);
                    try {
                        Assert.assertEquals("Demo My Mastercard",currentTitle);
                        System.out.println(" ✔ -| Comparative successfully | Text compared :"+currentTitle );
                    } catch (Exception e) {
                        System.out.println("###################################################");
                        System.out.println("---------------❌_No Match successfully_❌------------");
                        throw new RuntimeException(e);
                    }

                case 4:
                    Thread.sleep(300);
                    try {
                        Assert.assertEquals("Demo Home Loan",currentTitle);
                        System.out.println(" ✔ -| Comparative successfully | Text compared :"+currentTitle );
                    } catch (Exception e) {
                        System.out.println("###################################################");
                        System.out.println("---------------❌_No Match successfully_❌------------");
                        throw new RuntimeException(e);
                    }

                case 5:
                    Thread.sleep(300);
                    try {
                        Assert.assertEquals("Demo Term  Deposit",currentTitle);
                        System.out.println(" ✔ -| Comparative successfully | Text compared :"+currentTitle );
                    } catch (Exception e) {
                        System.out.println("###################################################");
                        System.out.println("---------------❌_No Match successfully_❌------------");
                        throw new RuntimeException(e);
                    }
            }
        i++;
        }
   }

   public void clickPayAnyone(){
       try {
           clickElement(payAnyone);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ User select Pay Anyone option -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
   }

   public void newPayeeContact(){
       try {
           clickElement(newPayee);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ User select New Payee Contact option -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           clickElement(bSB);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ User select BSB & Account Number option -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
   }

   public void payeeFormularySetup() throws InterruptedException  {
      String namePayee = "Bruce Banner";
      String textBSB = "633500";
      String txtNoCta ="102190347";
       try {
           write(namePayeeTxt,namePayee);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ Name Added  -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           write(bSBTxt,textBSB);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ BSB Number Added  -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           write(accountTxt,txtNoCta);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ No. Account added  -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           clickElement(nextBtnPayee);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ Click on Next Button  -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           Thread.sleep(500);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ Click on Confirmation Details -----");
           clickElement(confirmationBtn);
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
   }

   public void newTransacction() throws InterruptedException{
       try {
           Thread.sleep(500);
           clickElement(payFromRdoBtn);
           write(amountTxt, "1200");
           write(descriptionTxt, "Transaction test example");
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ Formulary Payment Completed -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }
       try {
           Thread.sleep(100);
           clickElement(paymentNextBtn);
           System.out.println("-----------------------------------------");
           System.out.println("---- ✔ Click on Confirmation Details -----");
       } catch (Exception e) {
           System.out.println("-----------------------------------------");
           System.out.println("--  ❌ No Item Launch Demo selected  ❌ -----");
           throw new RuntimeException(e);
       }

   }


}
