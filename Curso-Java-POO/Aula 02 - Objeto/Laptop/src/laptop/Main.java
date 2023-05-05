package laptop;
public class Main {
    public static void main (String args[]) {
        Laptop l1 = new Laptop();
        l1.marca = "Acer";
        l1.modelo = "Nitro 5";
        //l1.carga = 0;
        l1.ligar();
        l1.desligar();
        //l1.navegar();
    }
}
