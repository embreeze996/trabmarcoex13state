package StateMethod;

public abstract class SerieEstado {

    public abstract String getEstado();

    public boolean lancar(Serie serie) {
        return false;
    }

    public boolean finalizar(Serie serie) {
        return false;
    }

    public boolean pausar(Serie serie) {
        return false;
    }

    public boolean cancelar(Serie serie) {
        return false;
    }

    public boolean renovar(Serie serie) {
        return false;
    }

    public boolean continuar(Serie serie) {
        return false;
    }
}
