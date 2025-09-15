package TP.Abstract;

//Fabrica abstracta como l ahemos implementado no hace uso de lombok, no tiene
//atributos ni nada que pueda simplificar lombok

public interface AbstractFactory {
    InterfazUI crearUI();

    MetodoEnvio crearEnvio();
}
