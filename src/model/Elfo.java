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
    System.out.println(nombre + " infligio " + dano + " puntos de daño " + " con " + tipoMagia);
    
    objetivo.setVidaActual(objetivo.getVidaActual() - dano);
}
    @Override
    public void sanar() {
        double porcentaje = 0.75;
        if (tipoMagia.equalsIgnoreCase("agua")) {
        porcentaje = 0.90;
        }
    int vidaRecuperada = (int)((100 - vidaActual) * porcentaje);
    vidaActual += vidaRecuperada;
    
        System.out.println(nombre + " lanzó un hechizo de sanacion y se recupera " + vidaRecuperada + " de vida");
    }
    
    @Override
    public void mostrarEstado() {
        System.out.println("[" + nombre + " - Elfo " + tipoMagia + "] vida: " + vidaActual + " | Energia: " + energia);
    
    }
    

}
