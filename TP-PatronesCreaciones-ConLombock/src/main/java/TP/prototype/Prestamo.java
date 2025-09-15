package TP.prototype;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Prestamo implements Cloneable {

    private String libro;
    private String usuario;
    private String fechaInicio;
    private String fechaFin;

    //No creamos el constructor de Prestamo porque lo implementamos mediante lombock.
    //Lo que si, tenemos que implementar la clonacion manual
    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    //Tambien nos ahorramos el escribir manualmente todos los getters y setters de los
    //Atributos de la clase prestamo.

    //El metodo para mostrar infor no es reemplazado con lombock
    public void mostrar() {
         System.out.println("Prestamo de " + libro + " a " + usuario + " desde " + fechaInicio + " hasta " + fechaFin);
    }
}
