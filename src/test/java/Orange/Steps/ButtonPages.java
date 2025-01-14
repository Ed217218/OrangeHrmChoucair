package Orange.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH,using = "//ul//li//a/span[text()= 'Recruitment']")
    private WebElement btnRecruitment;

    @FindBy(how = How.XPATH, using = "//button[text()= ' Add ']")
    private WebElement btnAdd;

    @FindBy(how = How.XPATH, using = "//button[text()= ' Save ']")
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//button[text()= ' Save ']")
    private WebElement botonNuevo;
    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin() {
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnRecruitment(){
        btnRecruitment.isDisplayed();
        btnRecruitment.click();
    }

    public void btnAdd(){
        btnAdd.isDisplayed();
        btnAdd.sendKeys(Keys.ENTER);
    }

    public void btnSave(){
        btnSave.isDisplayed();
        btnSave.click();
    }
}
