package StateMethod;

public class SerieEstadoRenovada extends SerieEstado {

    private SerieEstadoRenovada() {};
    private static SerieEstadoRenovada instance = new SerieEstadoRenovada();
    public static SerieEstadoRenovada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Renovada";
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

    public boolean lancar(Serie serie) {
        serie.setEstado(SerieEstadoRenovada.getInstance());
        return false;
    }

    public boolean continuar(Serie serie) {
        serie.setEstado(SerieEstadoContinuada.getInstance());
        return false;
    }

}
