package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.FormularioAgregarDoctor;
import co.com.choucair.reto1.userinterface.HerokuAppPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioDoctor implements Task {

	public static LlenarFormularioDoctor llenar() {
		return Tasks.instrumented(LlenarFormularioDoctor.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HerokuAppPage.AGREGAR_DOCTOR),
				Enter.theValue("Carlos").into(FormularioAgregarDoctor.NOMBRE_DOC),
				Enter.theValue("Ramirez").into(FormularioAgregarDoctor.APELLIDO_DOC),
				Enter.theValue("2222222").into(FormularioAgregarDoctor.TELEFONO_DOC),
				Click.on(FormularioAgregarDoctor.TIPO_DOCUMENTO_ABRE_DOC),
				Click.on(FormularioAgregarDoctor.TIPO_DOCUMENTO_CEDULA_DOC),
				Enter.theValue("11111111").into(FormularioAgregarDoctor.NUMERO_CEDULA_DOC)
		);
	}

}
