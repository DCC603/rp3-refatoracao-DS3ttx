public class Main {


    public static void main(String[] args) {

        Conta minhaConta = new Conta("João", "111.111.111-11", "31 1111-1111",
                            111, 222222, "Gil", 0.00);
        minhaConta.deposito(450);
        minhaConta.saque(50);
        minhaConta.saque(50);
        minhaConta.saque(50);

        System.out.println(minhaConta);
    }
}
