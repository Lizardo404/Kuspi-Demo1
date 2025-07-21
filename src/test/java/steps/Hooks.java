package steps;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks extends BasePage{
    public Hooks(){
        super(driver);
    }

 @After
 public void tearDown(Scenario scenario){
      if (scenario.isFailed()){
          scenario.log("❌ Scenario failing, Please refer to the images attached to this report");
          final byte[] screenshot = ((TakesScreenshot) driver)
                  .getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot, "image/png", "Screenshot of the error");

      }
 }
}
