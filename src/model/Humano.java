/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maxwe
 */
public class Humano extends Personaje {

    public Humano(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = arma.calcularDano();
        System.out.println(nombre + " ataca con " + arma.getNombre() + " y hace " + dano + " de dannio.");
        objetivo.setVidaActual(objetivo.getVidaActual() - dano);
    }

    @Override
    public void sanar() {
        int vidaRecuperada = (int)((100 - vidaActual) * 0.5); //50 del dano que recibe
        vidaActual += vidaRecuperada;
        System.out.println(nombre + " se ha curado y recupera " + vidaRecuperada + " de vida.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("[" + nombre + "] Vida: " + vidaActual + " | Energia: " + energia);
    }
}
