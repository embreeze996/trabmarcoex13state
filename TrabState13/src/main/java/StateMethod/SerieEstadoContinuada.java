package StateMethod;

public class SerieEstadoContinuada extends SerieEstado {

    private SerieEstadoContinuada() {};
    private static SerieEstadoContinuada instance = new SerieEstadoContinuada();
    public static SerieEstadoContinuada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Continuada";
    }
    public boolean finalizar(Serie serie) {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        return true;
    }

    public boolean pausar(Serie serie) {
        serie.setEstado(SerieEstadoPausada.getInstance());
        return true;
    }

    public boolean cancelar(Serie serie) {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        return true;
    }

    public boolean renovar(Serie serie) {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        return true;
    }

    public boolean lancar(Serie serie) {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        return false;
    }

}

