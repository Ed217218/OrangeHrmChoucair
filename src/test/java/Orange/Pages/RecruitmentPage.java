package Orange.Pages;

import Orange.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private ButtonPages buttonPages;

    @FindBy(how = How.XPATH, using = "//input[@name = 'firstName']")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.XPATH, using = "//input[@name = 'lastName']")
    private WebElement txtLastName;

    @FindBy(how = How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    private WebElement txtEmail;

    public RecruitmentPage(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);
        PageFactory.initElements(driver, this);
    }

    public void llenarAddCandidate() {
        buttonPages.btnRecruitment();
        buttonPages.btnAdd();
    }

    public void agregarUsuario(String firstName, String middle, String lastName, String Email) {
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middle);
        txtLastName.sendKeys(lastName);
        txtEmail.sendKeys(Email);
        buttonPages.btnSave();
    }


}
