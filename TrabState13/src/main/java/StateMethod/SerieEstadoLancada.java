package StateMethod;

public class SerieEstadoLancada extends SerieEstado {

    private SerieEstadoLancada() {};
    private static SerieEstadoLancada instance = new SerieEstadoLancada();
    public static SerieEstadoLancada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lançada";
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

    public boolean continuar(Serie serie) {
       serie.setEstado(SerieEstadoContinuada.getInstance());
        return false;
    }

}