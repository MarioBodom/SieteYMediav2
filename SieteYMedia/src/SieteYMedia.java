import java.util.Scanner;

public class SieteYMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.barajar(baraja);
        Jugador[] jugadores = new Jugador[2];
        boolean juego = true;

        while (juego) {
            System.out.println("Dame los nombres de los dos jugadores");
            for (int i = 0; i < 2; i++) {
                jugadores[i] = nuevoJugador();
            }

            // mostrarJugadores(jugadores);

            jugada(jugadores, coinToss(), baraja);

            mostrarJugadores(jugadores);
            
            juego = false;
        }

        sc.close();
    }

    public static Jugador nuevoJugador() {
        Scanner sc = new Scanner(System.in);
        final String ASK_PLAYER_NAME = "Dame tu nombre y edad:";
        System.out.println(ASK_PLAYER_NAME);
        Jugador player = new Jugador(sc.nextLine(), sc.nextInt());
        sc.reset();
        return player;
    }

    public static void mostrarJugadores(Jugador[] jugadores) {
        String player;
        for (int i = 0; i < jugadores.length; i++) {
            player = "Jugador " + (i + 1) + ": " + jugadores[i].getNombre() + " puntuación: "
                    + jugadores[i].getPuntuacion();
            System.out.println(player);
        }
    }

    public static int coinToss() {
        return (int) Math.round(Math.random());
    }

    public static void jugada(Jugador[] jugadores, int coinToss, Baraja baraja) {
        // int turnos;
        Scanner sc = new Scanner(System.in);
        mostrarJugadores(jugadores);
        if (coinToss == 0) {
            jugadores[0].cogerCarta(baraja);
            System.out.println(jugadores[0].getNombre() + " Tu puntuación es: " + jugadores[0].getPuntuacion());
            System.out.println("Quieres robar o plantarte?");
            String eleccion = sc.nextLine().toLowerCase();
            while (eleccion.equals("robar")) {
                jugadores[0].cogerCarta(baraja);
                System.out.println(jugadores[0].getNombre() + " Tu puntuación es: " + jugadores[0].getPuntuacion());
                System.out.println("Quieres robar o plantarte?");
                eleccion = sc.nextLine().toLowerCase();
            }
            jugadores[1].cogerCarta(baraja);
            System.out.println(jugadores[1].getNombre() + " Tu puntuación es: " + jugadores[1].getPuntuacion());
            System.out.println("Quieres robar o plantarte?");
            eleccion = sc.nextLine().toLowerCase();
            while (eleccion.equals("robar")) {
                jugadores[1].cogerCarta(baraja);
                System.out.println(jugadores[1].getNombre() + " Tu puntuación es: " + jugadores[1].getPuntuacion());
                System.out.println("Quieres robar o plantarte?");
                eleccion = sc.nextLine().toLowerCase();
            }
            mostrarJugadores(jugadores);
        } else {
            jugadores[1].cogerCarta(baraja);
            System.out.println(jugadores[1].getNombre() + " Tu puntuación es: " + jugadores[1].getPuntuacion());
            System.out.println("Quieres robar o plantarte?");
            String eleccion = sc.nextLine().toLowerCase();
            while (eleccion.equals("robar")) {
                jugadores[1].cogerCarta(baraja);
                System.out.println(jugadores[1].getNombre() + " Tu puntuación es: " + jugadores[1].getPuntuacion());
                System.out.println("Quieres robar o plantarte?");
                eleccion = sc.nextLine().toLowerCase();
            }

            jugadores[0].cogerCarta(baraja);
            System.out.println(jugadores[0].getNombre() + " Tu puntuación es: " + jugadores[0].getPuntuacion());
            System.out.println("Quieres robar o plantarte?");
            eleccion = sc.nextLine().toLowerCase();
            while (eleccion.equals("robar")) {
                jugadores[0].cogerCarta(baraja);
                System.out.println(jugadores[0].getNombre() + " Tu puntuación es: " + jugadores[0].getPuntuacion());
                System.out.println("Quieres robar o plantarte?");
                eleccion = sc.nextLine().toLowerCase();
            }
        }
        sc.close();
    }
}
