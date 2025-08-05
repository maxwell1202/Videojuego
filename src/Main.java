/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import model.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Armas disponibles
        Arma escopeta = new Arma("Escopeta", "fuego", 1, 5, 0.02);
        Arma rifle = new Arma("Rifle Francotirador", "fuego", 1, 5, 0.0);
        Arma magiaFuego = new Arma("Magia de Fuego", "magia", 1, 5, 0.10);
        Arma magiaTierra = new Arma("Magia de Tierra", "magia", 1, 5, 0.02);
        Arma magiaAire = new Arma("Magia de Aire", "magia", 4, 12, 0.0);
        Arma magiaAgua = new Arma("Magia de Agua", "magia", 1, 5, 0.0);
        Arma hacha = new Arma("Hacha", "cuerpo", 1, 5, 0.0);
        Arma martillo = new Arma("Martillo", "cuerpo", 1, 5, 0.0);

        // === JUGADOR 1 ===
        System.out.print("Jugador 1, ingresa tu nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Elige tu raza:");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Orco");
        int raza1 = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Personaje jugador1 = null;

        switch (raza1) {
            case 1 -> {
                System.out.println("Elige tu arma:");
                System.out.println("1. Escopeta");
                System.out.println("2. Rifle Francotirador");
                int armaH = scanner.nextInt();
                scanner.nextLine();
                Arma armaSeleccionada = (armaH == 1) ? escopeta : rifle;
                jugador1 = new Humano(nombre1, armaSeleccionada);
            }
            case 2 -> {
                System.out.println("Elige tipo de magia:");
                System.out.println("1. Fuego");
                System.out.println("2. Tierra");
                System.out.println("3. Aire");
                System.out.println("4. Agua");
                int tipo = scanner.nextInt();
                scanner.nextLine();
                String magia = switch (tipo) {
                    case 1 -> "fuego";
                    case 2 -> "tierra";
                    case 3 -> "aire";
                    default -> "agua";
                };
                Arma armaSeleccionada = switch (magia) {
                    case "fuego" -> magiaFuego;
                    case "tierra" -> magiaTierra;
                    case "aire" -> magiaAire;
                    default -> magiaAgua;
                };
                jugador1 = new Elfo(nombre1, armaSeleccionada, magia);
            }
            case 3 -> {
                System.out.println("Elige tu arma:");
                System.out.println("1. Hacha");
                System.out.println("2. Martillo");
                int armaO = scanner.nextInt();
                scanner.nextLine();
                Arma armaSeleccionada = (armaO == 1) ? hacha : martillo;
                jugador1 = new Orco(nombre1, armaSeleccionada);
            }
            default -> System.out.println("Opción inválida.");
        }

        // === JUGADOR 2 ===
        System.out.print("Jugador 2, ingresa tu nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Elige tu raza:");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Orco");
        int raza2 = scanner.nextInt();
        scanner.nextLine();

        Personaje jugador2 = null;

        switch (raza2) {
            case 1 -> {
                System.out.println("Elige tu arma:");
                System.out.println("1. Escopeta");
                System.out.println("2. Rifle Francotirador");
                int armaH = scanner.nextInt();
                scanner.nextLine();
                Arma armaSeleccionada = (armaH == 1) ? escopeta : rifle;
                jugador2 = new Humano(nombre2, armaSeleccionada);
            }
            case 2 -> {
                System.out.println("Elige tipo de magia:");
                System.out.println("1. Fuego");
                System.out.println("2. Tierra");
                System.out.println("3. Aire");
                System.out.println("4. Agua");
                int tipo = scanner.nextInt();
                scanner.nextLine();
                String magia = switch (tipo) {
                    case 1 -> "fuego";
                    case 2 -> "tierra";
                    case 3 -> "aire";
                    default -> "agua";
                };
                Arma armaSeleccionada = switch (magia) {
                    case "fuego" -> magiaFuego;
                    case "tierra" -> magiaTierra;
                    case "aire" -> magiaAire;
                    default -> magiaAgua;
                };
                jugador2 = new Elfo(nombre2, armaSeleccionada, magia);
            }
            case 3 -> {
                System.out.println("Elige tu arma:");
                System.out.println("1. Hacha");
                System.out.println("2. Martillo");
                int armaO = scanner.nextInt();
                scanner.nextLine();
                Arma armaSeleccionada = (armaO == 1) ? hacha : martillo;
                jugador2 = new Orco(nombre2, armaSeleccionada);
            }
            default -> System.out.println("Opción inválida.");
        }

        // Mostrar estado inicial de ambos jugadores
        System.out.println("\nESTADO INICIAL DE LOS JUGADORES:");
        jugador1.mostrarEstado();
        jugador2.mostrarEstado();
    }
}
