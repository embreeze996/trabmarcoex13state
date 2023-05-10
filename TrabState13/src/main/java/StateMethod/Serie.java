package StateMethod;

public class Serie {

    private String titulo;
    private SerieEstado estado;

        public Serie() {
        this.estado = SerieEstadoLancada.getInstance();
    }

    public void setEstado(SerieEstado estado) {
        this.estado = estado;
    }

    public boolean lancar() {
        return estado.lancar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean pausar() {
        return estado.pausar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean renovar() {
        return estado.renovar(this);
    }

    public boolean continuar() {
        return estado.continuar(this);
    }
    public String getTituloEstado() {
        return estado.getEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public SerieEstado getEstado() {
        return estado;
    }
}
