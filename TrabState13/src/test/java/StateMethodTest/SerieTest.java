package StateMethodTest;

import StateMethod.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SerieTest {

    Serie serie;

    @BeforeEach
    public void setUp() {
        serie = new Serie();
    }

    @Test
    public void naoDeveLancarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertFalse(serie.lancar());
    }

    @Test
    public void deveFinalizarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertTrue(serie.finalizar());
        assertEquals(SerieEstadoFinalizada.getInstance(), serie.getEstado());
    }

    @Test
    public void devePausarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertTrue(serie.pausar());
        assertEquals(SerieEstadoPausada.getInstance(), serie.getEstado());
    }

    @Test
    public void deveCancelarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertTrue(serie.cancelar());
        assertEquals(SerieEstadoCancelada.getInstance(), serie.getEstado());
    }

    @Test
    public void deveRenovarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertTrue(serie.renovar());
        assertEquals(SerieEstadoRenovada.getInstance(), serie.getEstado());
    }

    @Test
    public void naoDeveContinuarSerieLancada() {
        serie.setEstado(SerieEstadoLancada.getInstance());
        assertFalse(serie.continuar());
    }


    @Test
    public void naoDeveLancarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertFalse(serie.lancar());

    }

    @Test
    public void naoDeveFinalizarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertFalse(serie.finalizar());
    }

    @Test
    public void naoDevePausarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertFalse(serie.pausar());
    }

    @Test
    public void deveCancelarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertTrue(serie.cancelar());
        assertEquals(SerieEstadoCancelada.getInstance(), serie.getEstado());
    }

    @Test
    public void deveRenovarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertTrue(serie.renovar());
        assertEquals(SerieEstadoRenovada.getInstance(),serie.getEstado());
    }

    @Test
    public void DeveContinuarSeriePausada() {
        serie.setEstado(SerieEstadoPausada.getInstance());
        assertTrue(serie.continuar());
        assertEquals(SerieEstadoContinuada.getInstance(),serie.getEstado());
    }

    @Test
    public void naoDeveLancarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.lancar());
    }

    @Test
    public void naoDeveFinalizarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.finalizar());
    }

    @Test
    public void naoDevePausarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.pausar());
    }

    @Test
    public void naoDeveCancelarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.cancelar());
    }

    @Test
    public void naoDeveRenovarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.renovar());
    }

    @Test
    public void naoDeveContinuarSerieFinalizada() {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        assertFalse(serie.continuar());
    }

    @Test
    public void naoDeveLancarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.lancar());
    }

    @Test
    public void naoDeveFinalizarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.finalizar());
    }

    @Test
    public void naoDevePausarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.pausar());
    }

    @Test
    public void naoDeveCancelarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.cancelar());
    }

    @Test
    public void naoDeveRenovarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.renovar());
    }

    @Test
    public void naoDeveContinuarSerieCancelada() {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        assertFalse(serie.continuar());
    }

    @Test
    public void naodeveLancarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertFalse(serie.lancar());
    }

    @Test
    public void deveFinalizarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertTrue(serie.finalizar());
        assertEquals(SerieEstadoFinalizada.getInstance(),serie.getEstado());
    }

    @Test
    public void devePausarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertTrue(serie.pausar());
        assertEquals(SerieEstadoPausada.getInstance(),serie.getEstado());
    }

    @Test
    public void naoDeveCancelarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertTrue(serie.cancelar());
        assertEquals(SerieEstadoCancelada.getInstance(),serie.getEstado());
    }

    @Test
    public void naoDeveRenovarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertFalse(serie.renovar());
    }

    @Test
    public void naoDeveContinuarSerieRenovada() {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        assertFalse(serie.continuar());
    }
    @Test
    public void naoDeveLancarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertFalse(serie.lancar());
    }

    @Test
    public void deveFinalizarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertTrue(serie.finalizar());
        assertEquals(SerieEstadoFinalizada.getInstance(),serie.getEstado());
    }

    @Test
    public void devePausarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertTrue(serie.pausar());
        assertEquals(SerieEstadoPausada.getInstance(),serie.getEstado());
    }

    @Test
    public void deveCancelarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertTrue(serie.cancelar());
        assertEquals(SerieEstadoCancelada.getInstance(),serie.getEstado());
    }

    @Test
    public void deveRenovarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertTrue(serie.renovar());
        assertEquals(SerieEstadoRenovada.getInstance(),serie.getEstado());
    }

    @Test
    public void naoDeveContinuarSerieContinuada() {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        assertFalse(serie.continuar());
    }


}

