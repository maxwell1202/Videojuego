/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import model.Arma;
import model.Humano;
/**
 *
 * @author maxwe
 */
public class Main {
    public static void main(String[] args) {
        Arma escopeta = new Arma("Escopeta", "fuego", 1, 5, 0.02);
        Arma rifle = new Arma("Rifle Franco", "fuego", 1, 5, 0.0);

        Humano jugador1 = new Humano("Carlos", escopeta);
        Humano jugador2 = new Humano("Laura", rifle);

        jugador1.mostrarEstado();
        jugador2.mostrarEstado();

        jugador1.atacar(jugador2);
        jugador2.mostrarEstado();

        jugador2.sanar();
        jugador2.mostrarEstado();
       
    }
    
}
