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

    public void setValor(double valor) {
        this.valor = valor;
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNombre() + " de " + getSuitString();
    }
    
}
