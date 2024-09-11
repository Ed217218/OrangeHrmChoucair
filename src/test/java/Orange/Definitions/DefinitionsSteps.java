package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Pages.RecruitmentPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	//llamado de clase
	private LoginPage loginPage = new LoginPage(driver);

	private RecruitmentPage recruitmentPage = new RecruitmentPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}

	@When("^el usuario diligenica usuario (.*) diligencia password (.*)$")
	public void llenarLogin(String userName, String password) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.llenarLogin(userName, password);
	}

	@When("^el usuario ingresa add Candidate diligencia el formulario (.*) (.*) (.*) (.*)$")
	public void agregarUsuario(String firtsName, String middle, String lastName, String Email) {
		this.recruitmentPage= new RecruitmentPage(driver);
		this.recruitmentPage.llenarAddCandidate();
		this.recruitmentPage.agregarUsuario(firtsName, middle, lastName, Email);
	}

}