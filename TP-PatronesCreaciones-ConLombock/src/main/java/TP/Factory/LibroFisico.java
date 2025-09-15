package TP.Factory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class LibroFisico implements Libro{

    private String Titulo;
    private String Autor;

    public LibroFisico (){}

    @Override
    public void mostrarTipo() {
        System.out.println("Esto es un libro Fisico");
    }
}
