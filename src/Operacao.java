public class Operacao {

    private String tipo;
    private double valor;

    public Operacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public static Operacao deposito(double valor){
        return new Operacao("Depósito", valor);
    }
    
    public static Operacao saque(double valor){
        return new Operacao("Saque", valor);
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
