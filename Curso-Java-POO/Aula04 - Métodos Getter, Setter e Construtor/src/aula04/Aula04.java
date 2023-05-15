package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");
        c1.status();
        Caneta c2 = new Caneta("KKK", 0.25f, "Laranja");
        c2.status();
        
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        //c1.setPonta(0.5f);
        //C1.ponta = 0.5f;
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());     
    }
    
}
