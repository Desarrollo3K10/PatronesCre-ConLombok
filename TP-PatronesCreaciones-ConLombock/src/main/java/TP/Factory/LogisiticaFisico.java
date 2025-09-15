package TP.Factory;

public class LogisiticaFisico extends Logistica {
    @Override
    public Libro crearLibro() {
        return new LibroFisico();
    }
}
