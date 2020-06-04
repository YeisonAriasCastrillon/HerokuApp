package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.HerokuAppPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{
	
	private HerokuAppPage herokuAppPage;

	public static OpenUp thePage() {
		return Tasks.instrumented(OpenUp.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(herokuAppPage));
	}
}
