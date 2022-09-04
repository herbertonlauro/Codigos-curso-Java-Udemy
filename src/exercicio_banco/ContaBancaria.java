package exercicio_banco;

public class ContaBancaria {
    private final String numero;
    private String nomeTitular;
    private double saldo;


    public ContaBancaria(String numero, String nomeTitular, double valorDepositoInicial){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = valorDepositoInicial;
    }

    public ContaBancaria(String numero, String nomeTitular){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double taxaSaque = 5.00;
        double valorTotalSaque = valor + taxaSaque;

        this.saldo -= valorTotalSaque;
    }

    public void dadosDaConta() {
        System.out.println("Dados da conta: ");
        System.out.print("Número: ");
        System.out.print(this.getNumero() + " ");
        System.out.print("Titular: ");
        System.out.print(this.getNomeTitular() + " ");
        System.out.print("Valor: ");
        System.out.print(this.getSaldo());
        System.out.println();
    }
}
