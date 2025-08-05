/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maxwe
 */
public class Orco extends Personaje {
    private boolean sangrando = false;
    private int turnosSangrado = 0;
    private boolean efectoCuracionExtra = false;

    public Orco(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = arma.calcularDano();
        System.out.println(nombre + " ataca con " + arma.getNombre() + " y hace " + dano + " de dano.");
        objetivo.setVidaActual(objetivo.getVidaActual() - dano);

        if (arma.getNombre().equalsIgnoreCase("Hacha")) {
            if (objetivo instanceof Orco) {
                System.out.println("El objetivo ya es un orco y resiste el sangrado.");
            } else {
                System.out.println("¡" + objetivo.getNombre() + " esta sangrando! (-3 de vida por 2 turnos)");
                if (objetivo instanceof Orco orcoObjetivo) {
                    orcoObjetivo.activarSangrado();
                }
            }
        }
    }

    @Override
    public void sanar() {
        int vidaMax = 100;
        int vidaFaltante = vidaMax - vidaActual;

        if (vidaFaltante <= 0) {
            System.out.println(nombre + " ya tiene la vida al máximo. No necesita curarse.");
            return;
        }

        int vidaRecuperada = (int)(vidaFaltante * 0.25);
        vidaActual += vidaRecuperada;
        efectoCuracionExtra = true;

        System.out.println(nombre + " uso una pocion de curacion y recupera " + vidaRecuperada + " de vida.");
        System.out.println("En el siguiente turno, recibira curacion adicional.");
    }

    public void curacionAdicional() {
        if (efectoCuracionExtra) {
            int vidaMax = 100;
            int vidaFaltante = vidaMax - vidaActual;
            int extra = (int)(vidaFaltante * 0.15);
            vidaActual += extra;
            System.out.println(nombre + " recibe curacion adicional de " + extra + " de vida.");
            efectoCuracionExtra = false;
        }
    }

    public void activarSangrado() {
        sangrando = true;
        turnosSangrado = 2;
    }

    public void aplicarSangrado() {
        if (sangrando && turnosSangrado > 0) {
            vidaActual -= 3;
            turnosSangrado--;
            System.out.println(nombre + " sufre sangrado (-3). Turnos restantes: " + turnosSangrado);

            if (turnosSangrado == 0) {
                sangrando = false;
            }
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("[" + nombre + " - Orco] Vida: " + vidaActual + " | Energia: " + energia);
    }
}