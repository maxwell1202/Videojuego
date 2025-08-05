/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maxwe
 */
public class Elfo extends Personaje {
    private String tipoMagia;
    
    public Elfo (String nombre, Arma arma, String tipoMagia) {
        super(nombre, arma);
        this.tipoMagia = tipoMagia;
        
        if (tipoMagia.equalsIgnoreCase("agua")) {
        this.vidaActual = 115;
       } 
    }

    @Override
public void atacar(Personaje objetivo) {
    int dano = arma.calcularDano();
    System.out.println(nombre + " infligio " + dano + " puntos de dano " + " con " + tipoMagia);
    
    objetivo.setVidaActual(objetivo.getVidaActual() - dano);
}
   @Override
public void sanar() {
    double porcentaje = 0.75;
    if (tipoMagia.equalsIgnoreCase("agua")) {
        porcentaje = 0.90;
    }

    int vidaMaxima = tipoMagia.equalsIgnoreCase("agua") ? 115 : 100;

    int vidaFaltante = vidaMaxima - vidaActual;

    if (vidaFaltante <= 0) {
        System.out.println(nombre + " ya tiene la vida al maximo. No necesita curarse.");
        return;
    }

    int vidaRecuperada = (int)(vidaFaltante * porcentaje);
    vidaActual += vidaRecuperada;

    System.out.println(nombre + " lanza un hechizo de sanacion y recupera " + vidaRecuperada + " de vida.");
}
    
    @Override
    public void mostrarEstado() {
        System.out.println("[" + nombre + " - Elfo " + tipoMagia + "] vida: " + vidaActual + " | Energia: " + energia);
    
    }
    

}
