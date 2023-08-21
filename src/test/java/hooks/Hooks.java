package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {


    @Before
    public void setUo(Scenario scenario) {
        System.out.println("scenario started..");
        System.out.println("scenario id = " + scenario.getId());
        System.out.println("scenario name = " + scenario.getName());

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            System.out.println("scenario failed");
            // takeScreenshot(scenario.getName());

            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");
            System.out.println("Screenshot taken for failed scenario: " + scenario.getName());
        }
       Driver.getDriver().close();
    }



    public String takeScreenshot(String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);

        String targetPath = ".\\test-output\\Screenshots\\" + name + new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()) + ".png";

        FileUtils.copyFile(source, new File(targetPath));

        return targetPath;
    }




}
