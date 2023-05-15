package aula10.heranca;
public class Aluno extends Pessoa {
    // Atributos
    private int matr;
    private String curso;
    
    //Métodos
    public void cancelarMatr() {
        System.out.println("Matricula sera cancelada");
    }
    
    //Métodos especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
