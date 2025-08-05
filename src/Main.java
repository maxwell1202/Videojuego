/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import model.Arma;
import model.Humano;
import model.Elfo;

public class Main {
    public static void main(String[] args) {
        // Crear armas humanas
        Arma escopeta = new Arma("Escopeta", "fuego", 1, 5, 0.02);
        Arma rifle = new Arma("Rifle Francotirador", "fuego", 1, 5, 0.0);

        // Crear armas mágicas para elfos
        Arma magiaFuego = new Arma("Magia de Fuego", "magia", 1, 5, 0.10);
        Arma magiaTierra = new Arma("Magia de Tierra", "magia", 1, 5, 0.02);
        Arma magiaAire = new Arma("Magia de Aire", "magia", 4, 12, 0.0); //hara mas daño a distancia
        Arma magiaAgua = new Arma("Magia de Agua", "magia", 1, 5, 0.0);

        Humano humano = new Humano("Conejo", escopeta);

        Elfo elfo = new Elfo("Jose", magiaAgua, "agua");

        humano.mostrarEstado();
        elfo.mostrarEstado();

        elfo.atacar(humano);
        humano.mostrarEstado();

        humano.atacar(elfo);
        elfo.mostrarEstado();

        elfo.sanar();
        elfo.mostrarEstado();
    }
}