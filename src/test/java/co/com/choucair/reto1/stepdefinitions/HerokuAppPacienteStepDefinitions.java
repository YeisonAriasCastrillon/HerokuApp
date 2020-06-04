package co.com.choucair.reto1.stepdefinitions;

import co.com.choucair.reto1.questions.Answer;
import co.com.choucair.reto1.tasks.LlenarFormularioPaciente;
import co.com.choucair.reto1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HerokuAppPacienteStepDefinitions {
	
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que Carlos necesita registrar un paciente nuevo$")
	public void queCarlosNecesitaRegistrarUnPacienteNuevo() {
		OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
	}

	@When("^el realiza el registro del mismo en el aplicativo de administracion de Hospitales$")
	public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales() {
		OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioPaciente.llenar());
	}

	@Then("^El verifica que se presente en la pantalla el mensaje (.*)$")
	public void elVerificaQueSePresenteEnLaPantallaElMensajeDatosGuardadosCorrectamente(String question) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
	}
}
