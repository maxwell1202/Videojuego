/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maxwe
 */
public class Arma {
     private String nombre;
    private String tipo; 
    private int danoMin;
    private int danoMax;
    private double modificador;

    public Arma(String nombre, String tipo, int danoMin, int danoMax, double modificador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.modificador = modificador;
    }

    public int calcularDano() {
        int base = (int)(Math.random() * (danoMax - danoMin + 1)) + danoMin;
        return base + (int)(base * modificador);
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}

