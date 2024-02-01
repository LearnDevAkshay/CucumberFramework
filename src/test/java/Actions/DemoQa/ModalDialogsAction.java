package Actions.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.ModalDialogsPage;
import setup.BaseClass;

import java.time.Duration;

public class ModalDialogsAction {

    WebDriver driver;

    BaseClass baseClass;

    ModalDialogsPage modalDialogsPage;

    public ModalDialogsAction(BaseClass baseClass) {

        this.baseClass = baseClass;

        driver = baseClass.getDriver();

        modalDialogsPage = new ModalDialogsPage(driver);

    }

    public void clickOnModalDialogsWidget() {

        modalDialogsPage.modalDialogWidget.click();
    }

    public void clickOnSmallModalButton() {
        modalDialogsPage.smallModalButton.click();
    }

    public void clickOnLargeModalButton() {
        modalDialogsPage.largeModalButton.click();
    }

    public void validateSmallDialog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(modalDialogsPage.smallDialogMessage));

        //System.out.println(modalDialogsPage.smallDialogMessage.getText());

        modalDialogsPage.smallDialogCloseButton.click();

    }

    public void validateBigDialog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(modalDialogsPage.largeDialogMessage));

        // System.out.println(modalDialogsPage.largeDialogMessage.getText());

        modalDialogsPage.largeDialogCloseButton.click();

    }
}
