package TP.Singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
//No lo utilizo porque necesito crear el constructor manualmente para mostrar el mensaje de
//instancia creada.

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Database {

    private final List<String> libros = new ArrayList<>();

    private Database() {
        System.out.println("Instancia creada");
    }

    //Clase Interna Estatica que implementa Singleton.
    private static class Holder {
        private static final Database INSTANCE = new Database();
    }

    //Metodo mediante el cual los objetos solicitan la instancia.
    public static Database getInstance() {
        return Holder.INSTANCE;
    }

    // Agregar un libro a la lista
    public void agregarLibro(String titulo) {
        this.libros.add(titulo);
    }

    // Obtener la lista de libros de manera inmutable
    public List<String> getLibro() {
        return Collections.unmodifiableList(this.libros);
    }

    // Listar los libros en consola
    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("(Sin libros)");
        } else {
            this.libros.forEach(l -> System.out.println("✮ " + l));
        }
    }

}
