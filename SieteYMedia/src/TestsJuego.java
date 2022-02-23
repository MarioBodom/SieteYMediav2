public class TestsJuego extends SieteYMedia {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        for (int i = 0; i < baraja.getCartas().length; i++) {
            System.out.println(baraja.getCartas()[i].getNumCarta()+" "+ baraja.getCartas()[i].toString() + " valor: " + baraja.getCartas()[i].getValor());
        }
        System.out.println("--------------------");
        baraja.barajar();
        for (int i = 0; i < baraja.getCartas().length; i++) {
            System.out.println(baraja.getCartas()[i].toString() + " valor: " + baraja.getCartas()[i].getValor());
        }
        System.out.println("--------------------");
        // baraja.ordenar();        
        // for (int i = 0; i < baraja.getCartas().length; i++) {
        //     System.out.println(baraja.getCartas()[i].toString() + " valor: " + baraja.getCartas()[i].getValor());
        // }

        Jugador player1 = nuevoJugador();
        System.out.println(player1.toString());
        player1.mostrarJugador();
        baraja.robarCarta(player1);
        System.out.println(player1.getMano());
        baraja.robarCarta(player1);
        System.out.println(player1.getMano());
        player1.robarCarta(baraja);
        System.out.println(player1.getMano());
        player1.mostrarJugador();
        // System.out.println(player1.getMano());
        // for (int i = 0; i < baraja.getCartas().length; i++) {
        //     System.out.println(baraja.getCartas()[i].toString() + " valor: " + baraja.getCartas()[i].getValor());
        // }
        // player1.mostrarJugador(player1);
        // Jugador m = nuevoJugador();
        // System.out.println(m.getPuntuacion());
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println("roba");
        // m.robarCarta(baraja);
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println(m.getPuntuacion());
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println("roba");
        // m.robarCarta(baraja);
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println(m.getPuntuacion());
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println("roba");
        // m.robarCarta(baraja);
        // System.out.println(baraja.getCartas()[0].toString());
        // System.out.println(m.getPuntuacion());
    }
}
