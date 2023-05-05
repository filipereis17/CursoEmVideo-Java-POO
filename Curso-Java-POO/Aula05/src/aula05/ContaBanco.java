package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(int nC, String t, String d) {
        this.numConta = nC;
        this.tipo = t;
        this.dono = d;
        this.status = true;
        
        if ("CC".equals(this.tipo)) {
            this.saldo = 50.0f;
        } else if ("CP".equals(tipo)) {
            this.saldo = 150.0f;
        }      
        System.out.println("Conta " + this.numConta + " criada com sucesso");
    }
    public void fecharConta() {
        if (saldo != 0) {
            this.status = false;
        } else {
            System.out.println("Não é possivel encerrar a conta. Você possui saldo/debito na conta");
        }
    }
    public void depositar(float valor) {
        if (this.status == true) {
            this.saldo += valor;
        } else {
            System.out.println("Impossivel depositar.");
        }
        
    }
    public void sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else  {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void pagarMensal() {
        if(this.status == true) {
            if ("CC".equals(this.tipo)) {
                this.saldo -= 12.0f;
            } else {
                this.saldo -= 20.0f;
            }
        }
    }
    
    public void statusConta() {
        System.out.println("----------------------------------");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da Conta: " + this.isStatus());
    }
    
}
