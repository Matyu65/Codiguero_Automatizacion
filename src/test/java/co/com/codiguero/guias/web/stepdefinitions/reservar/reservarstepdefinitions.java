package co.com.codiguero.guias.web.stepdefinitions.reservar;

import co.com.codiguero.guias.web.taks.opensite.OpenSiteTask;
import co.com.codiguero.guias.web.taks.reservar.Llenardatosiniciales;
import co.com.codiguero.guias.web.utilities.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class reservarstepdefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario tiene toda la informacion que necesita$")
    public void queElUsuarioTieneTodaLaInformacionQueNecesita(List<Map<String, Object>> informacion)  {
        theActorCalled("Usuario").attemptsTo(CargarDatos.conLaSiguiente(informacion));
    }

    @Cuando("^realiza la reserva con los datos$")
    public void realizaLaReservaConLosDatos() throws Exception {
        theActorInTheSpotlight().attemptsTo(OpenSiteTask.openSiteCapaVivaAir());
        theActorInTheSpotlight().attemptsTo(Llenardatosiniciales.datosIniciales());
    }

    @Entonces("^el usuario deberia ver los resultados$")
    public void elUsuarioDeberiaVerLosResultados() throws Exception {

    }

}
