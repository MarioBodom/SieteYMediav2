import java.util.Random;

public class Baraja {

    // Variables
    private Carta[] cartas;
    private int posSiguienteCarta;
    // Constructor
    public Baraja() {
        this.cartas = new Carta[40];
        this.posSiguienteCarta = 0;
        crearBaraja();
    }

    // Metodos

    private void crearBaraja(){
        int posCarta = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                switch (j) {
                    case 0:
                        cartas[posCarta] = new Carta("As", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 1:
                        cartas[posCarta] = new Carta("Dos", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 2:
                        cartas[posCarta] = new Carta("Tres", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 3:
                        cartas[posCarta] = new Carta("Cuatro", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 4:
                        cartas[posCarta] = new Carta("Cinco", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 5:
                        cartas[posCarta] = new Carta("Seis", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 6:
                        cartas[posCarta] = new Carta("Siete", i, j + 1);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 7:
                        cartas[posCarta] = new Carta("Sota", i, 0.5);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 8:
                        cartas[posCarta] = new Carta("Caballo", i, 0.5);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;
                    case 9:
                        cartas[posCarta] = new Carta("Rey", i, 0.5);
                        cartas[posCarta].setNumCarta(posCarta+1);
                        posCarta += 1;
                        break;

                    default:
                        break;
                }
            }
        }
    }
    
    public Carta[] getCartas() {
        return cartas;
    }

    public void barajar() {
        Random r = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int j = r.nextInt(cartas.length);
            if (j != i) {
                Carta temp = cartas[i];
                cartas[i] = cartas[j];
                cartas[j] = temp;                
            }
        }
    }

    public void ordenar(){
        for (int i = 1; i < cartas.length; i++) {
            int j = i-1;
            Carta temp = cartas[i];
            while (j >= 0 && temp.getNumCarta() < cartas[j].getNumCarta()) {
                cartas[j+1] = cartas[j];
                j = j-1;
            }
            cartas[j+1] = temp;
        }
    }
    public void inicioBaraja(){
        this.posSiguienteCarta++;
    }

    public void moverPrimeraCarta(Baraja baraja) {
        for (int i = 0; i < baraja.getCartas().length - 1; i++) {
            Carta temp = baraja.getCartas()[i];
            baraja.getCartas()[i] = baraja.getCartas()[i + 1];
            baraja.getCartas()[i + 1] = temp;
        }
    }

    // Metodo para añadir una carta al jugador
    public void robarCarta(Jugador jugador){
        Carta aux = cartas[posSiguienteCarta];
        jugador.setPlaying(true);
        jugador.setMano(aux);
        System.out.println(jugador.getNombre()+" has robado un "+aux.toString());
        jugador.setPuntuacion(aux.getValor());
        this.posSiguienteCarta++;
    }
    // public void cogerCarta(Baraja baraja){
    //     Carta cartaRobada = baraja.getCartas()[];
    //     double puntos = cartaRobada.getRank();
    //     puntuacion += puntos;
    //     baraja.inicioBaraja();
    // }

}
