package laptop;
public class Laptop {
    public String marca;
    public String modelo;
    private int carga;    
    protected boolean ligado;
    
    protected void ligar() {
        if (this.carga > 0) {
            this.ligado = true;
            System.out.println("EStou ligado");
        } else {
            System.out.println("Estou sem carga.");
        }
        
    }
    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando...");
        System.out.println("Desligado");
    }
    protected void navegar(){
        if (this.ligado == true ) {
            System.out.println("Estou navegando na Internet");
        } else {
            System.out.println("ERRO! Nao posso navegar, pois estou desligado.");
        }
    }
    
}
