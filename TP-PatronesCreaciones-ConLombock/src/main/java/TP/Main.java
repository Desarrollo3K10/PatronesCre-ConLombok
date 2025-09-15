package TP;
import TP.Singleton.Database;
import TP.prototype.Prestamo;
import TP.Factory.LibroFisico;
import TP.Factory.LibroDigital;
import TP.Factory.Logistica;
import TP.Factory.LogisiticaFisico;
import TP.Factory.Libro;
import TP.Factory.LogisticaDigital;
import TP.Builder.Usuario;
import TP.Abstract.AbstractFactory;
import TP.Abstract.EnvioNormal;
import TP.Abstract.EnvioExpress;
import TP.Abstract.AdminUI;
import TP.Abstract.AdminFactory;
import TP.Abstract.InterfazUI;
import TP.Abstract.MetodoEnvio;
import TP.Abstract.UsuarioFactory;
import TP.Abstract.UsuarioUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //---Parte Singleton---//
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println("\n¿Son la misma instancia? " + (db1 == db2));

        db1.agregarLibro("El Quijote");
        db1.agregarLibro("Clean Code");
        db2.listarLibros();

        System.out.println("\n────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");

        //----Parte Protottype---//
        Prestamo prestamoBase = new Prestamo("El Quijote", "Carla Fernández", "2025-08-01", "2025-08-15");
        System.out.println("★ Préstamo original ");
        prestamoBase.mostrar();

        Prestamo prestamo1 = prestamoBase.clone();
            prestamo1.setUsuario("Juan Pérez");
            prestamo1.setFechaFin("2025-08-20");
            System.out.println("\n★ Clon 1");
            prestamo1.mostrar();

        Prestamo prestamo2 = prestamoBase.clone();
            prestamo2.setUsuario("Ana López");
            prestamo2.setLibro("Clean Code");
            System.out.println("\n★ Clon 2");
            prestamo2.mostrar();

        System.out.println("\n────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");

        //---Parte Factory---//
        Logistica logisticaFisico = new LogisiticaFisico();
        Libro libro1 = logisticaFisico.crearLibro();
        libro1.mostrarTipo();
        Logistica logisticaDigital = new LogisticaDigital();
        Libro libro2 = logisticaDigital.crearLibro();
        libro2.mostrarTipo();

        System.out.println("\n────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
        //---Parte Builder---//
        Usuario u1 = Usuario.builder()
                .nombre("Carla Fernandez")
                .direccion("Sobremonte 123")
                .fechaNacimiento("10/10/2004")
                .email("carla@gmail.com")
                .telefono("4317623")
                .build();
        u1.mostrarInfo();

        System.out.println("\n────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
        //---Parte Abstract Factory---//
        AbstractFactory factoryUsuario = new UsuarioFactory();
        AbstractFactory factoryAdmin = new AdminFactory();
        InterfazUI uiUsuario = factoryUsuario.crearUI();
        MetodoEnvio envioUsuario = factoryUsuario.crearEnvio();
        InterfazUI uiAdmin = factoryAdmin.crearUI();
        MetodoEnvio envioAdmin = factoryAdmin.crearEnvio();
        uiUsuario.mostrar();
        envioUsuario.enviar();
        uiAdmin.mostrar();
        envioAdmin.enviar();
    }
}