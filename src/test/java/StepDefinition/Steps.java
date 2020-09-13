package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
 WebDriver driver;
 
@Given("Abrir Chrome")
public void abrir_chrome() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("En este paso abre el navegador google chrome");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa_fi\\Downloads\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:13152/bancoPlatinum/");
}

@When("ingresar Username {string} y Password {string}")
public void ingresar_username_y_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa las cresdenciales del sistema");
	System.out.println("En este paso ingresa el nombre de usuario y contraseña en la pagina de login");
	driver.findElement(By.id("username")).sendKeys(string);
	driver.findElement(By.id("pass")).sendKeys(string2);
	
}

@Then("iniciar sesion")
public void iniciar_sesion() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa secion con los datos ingresados desde nuestro archivo Mytest.feature");
	driver.findElement(By.id("loginbtn")).click();
}


}
