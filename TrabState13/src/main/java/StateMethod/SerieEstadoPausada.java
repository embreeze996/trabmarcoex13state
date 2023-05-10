package StateMethod;

public class SerieEstadoPausada extends SerieEstado {

    private SerieEstadoPausada() {};
    private static SerieEstadoPausada instance = new SerieEstadoPausada();
    public static SerieEstadoPausada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pausada";
    }

    public boolean lancar(Serie serie) {
        serie.setEstado(SerieEstadoLancada.getInstance());
        return false;
    }

    public boolean finalizar(Serie serie) {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        return false;
    }

    public boolean cancelar(Serie  serie) {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        return true;
    }

    public boolean renovar(Serie  serie) {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        return true;
    }

    public boolean continuar(Serie serie) {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        return true;
    }

}