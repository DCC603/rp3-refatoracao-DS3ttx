import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Cliente cliente;
    private DadosBancarios dados_bancarios;
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(String nomeCliente, String cpfCliente, String telefoneCliente, int numAgencia, int numConta, String gerente, double saldo) {
        this.cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
        this.dados_bancarios = new DadosBancarios(numAgencia, numConta, gerente);
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, null, 0, 0, null, 0);
    }

    public void deposito(int quantia){
        Operacao op = new Operacao('d', quantia);
        this.operacoes.add(op);
        this.saldo += quantia;
    }

    public void saque(int quantia){
        Operacao op = new Operacao('s', quantia);
        this.operacoes.add(op);
        this.saldo -= quantia;
    }
    
    public String operationsToString(){
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }
        return dadosExtrato;
    }

    public String toString() {
        String dadosCliente = this.cliente.toString();
        String dadosConta = this.dados_bancarios.toString();
        String saldo = String.format("Saldo: %.2f", this.saldo);
        String dadosExtrato = this.operationsToString();
        

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n" +
                saldo +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
