package TP.Factory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class LibroDigital implements Libro{

    //Lombok genera automaticamente el constructor de los atributos, y los getters y setters
    private String Titulo;
    private String Autor;

    public LibroDigital(){}

    @Override
    public void mostrarTipo() {
        System.out.println("Esto es un libro Digital");
    }
}
