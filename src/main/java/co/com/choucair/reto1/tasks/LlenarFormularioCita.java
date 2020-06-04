package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.FormularioAgregarCita;
import co.com.choucair.reto1.userinterface.HerokuAppPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioCita implements Task{

	public static LlenarFormularioCita llenar() {
		return Tasks.instrumented(LlenarFormularioCita.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HerokuAppPage.AGENDAR_CITA),
				Click.on(FormularioAgregarCita.DIA_CITA_ABRE),
				Click.on(FormularioAgregarCita.DIA_CITA_ELIGE),
				Enter.theValue("11111111").into(FormularioAgregarCita.DOCUMENTO_IDENTIDAD_PACIENTE),
				Enter.theValue("11111112").into(FormularioAgregarCita.DOCUMENTO_IDENTIDAD_DOCTOR),
				Enter.theValue("Cita medica").into(FormularioAgregarCita.OBSERVACIONES),
				Click.on(FormularioAgregarCita.GUARDAR)
		);
	}

}
