package StateMethod;

public class SerieEstadoFinalizada extends SerieEstado {

    private SerieEstadoFinalizada() {};
    private static SerieEstadoFinalizada instance = new SerieEstadoFinalizada();
    public static SerieEstadoFinalizada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizada";
    }
    public boolean lancar(Serie serie) {
        serie.setEstado(SerieEstadoFinalizada.getInstance());
        return false;
    }

    public boolean pausar(Serie serie) {
        serie.setEstado(SerieEstadoPausada.getInstance());
        return false;
    }

    public boolean cancelar(Serie serie) {
        serie.setEstado(SerieEstadoCancelada.getInstance());
        return false;
    }

    public boolean renovar(Serie serie) {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        return false;
    }

    public boolean continuar(Serie serie) {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        return false;
    }

}

