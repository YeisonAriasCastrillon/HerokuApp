package co.com.choucair.reto1.stepdefinitions;

import co.com.choucair.reto1.questions.Answer;
import co.com.choucair.reto1.tasks.LlenarFormularioCita;
import co.com.choucair.reto1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HerokuAppCitaStepDefinitions {

	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que Carlos necesita asistir al medico$")
	public void queCarlosNecesitaAsistirAlMedico() {
		OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
	}

	@When("^el realiza el agendamiento de una cita$")
	public void elRealizaElAgendamientoDeUnaCita() {
		OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioCita.llenar());
	}

	@Then("^El verifica que se presente en pantalla mensaje de (.*)$")
	public void elVerificaQueSePresenteEnPantallaMensajeDeDatosGuardadosCorrectamente(String question) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
	}
}
