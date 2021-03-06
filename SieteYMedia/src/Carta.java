public class Carta {
    
    // Constantes
    public final static int OROS = 0;
    public final static int COPAS = 1;
    public final static int ESPADAS = 2;
    public final static int BASTOS = 3;

    // Variables
    private int palo;
    private double valor;
    private String nombre;
    private int numCarta;

    // Constructor
    public Carta(String nombre, int palo, double valor){
        this.nombre = nombre;
        this.palo = palo;
        this.valor = valor;
        
    }
    
    // Metodos
    public int getPalo() {
        return palo;
    }

    public double getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuitString(){
        switch (this.palo) {
            case ESPADAS:
                return "Espadas";
            case BASTOS:
                return "Bastos";
            case OROS:
                return "Oros";
            case COPAS:
                return "Copas";
            default:
                return "??";
            }
        }

    
    /** 
     * @return String
     * Nos da el nombre y el palo de la carta.
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNombre() + " de " + getSuitString();
    }
    
    
    /** 
     * @return int
     */
    public int getNumCarta() {
        return numCarta;
    }
    
    /** 
     * @param numCarta
     */
    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }
}
