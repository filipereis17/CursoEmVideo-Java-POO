package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta(12312, "CC", "Sheldon");
        c1.depositar(300.0f);
        c1.pagarMensal();
        c1.sacar(300);
        c1.pagarMensal();
        c1.sacar(50);
        c1.statusConta();
        
        //ContaBanco c2 = new ContaBanco();
    }
    
}
