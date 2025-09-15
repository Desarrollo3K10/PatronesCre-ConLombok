package TP.Builder;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    public void mostrarInfo() {
        System.out.println("Usuario:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("-----------------------------");
    }
}
