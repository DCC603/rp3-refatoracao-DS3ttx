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

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método
    public void realizarOperacao(char tipo, int valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);

        if (tipo == 'd')
            this.saldo += valor;
        else if(tipo == 's')
            this.saldo -= valor;
    }

    public String toString() {
        // TODO(#4) REFATORAR: Esses dados não estão relacionados a conta
        String dadosCliente = String.format("CPF: %s\nNome: %s\nTelefone: %s",
                this.cliente.getCPF(), this.cliente.getNome(), this.cliente.getTelefone());

        // TODO(#4) REFATORAR: Esses dados não estão relacinados a conta
        String dadosConta = String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                this.dados_bancarios.getNumAgencia(), this.dados_bancarios.getNumConta(),
                this.dados_bancarios.getNomeGerente(), this.saldo);

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return "-----CLIENTE-----\n" +
                dadosCliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
