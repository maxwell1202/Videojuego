/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maxwe
 */
public abstract class Personaje {
    protected String nombre;
    protected int vidaActual;
    protected int energia;
    protected Arma arma;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.arma = arma;
        this.vidaActual = 100;
        this.energia = 100;
    }

    public abstract void atacar(Personaje objetivo);
    public abstract void sanar();
    public abstract void mostrarEstado();

    public boolean estaVivo() {
        return vidaActual > 0;
    }

    public String getNombre() { return nombre; }
    public int getVidaActual() { return vidaActual; }
    public void setVidaActual(int vidaActual) { this.vidaActual = vidaActual; }
}
