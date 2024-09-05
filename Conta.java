import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Rodrigo santos freitas Rm557981
//Richard Camargo De Almeida Rm558367


public class Conta {
    private String numeroConta;
    private double saldo;
    private String tipoConta;
    private String nomeProprietario;

    public Conta(String numeroConta, double saldo, String tipoConta, String nomeProprietario) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.nomeProprietario = nomeProprietario;
    }

    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    // Métodos de Operação
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Fundos insuficientes");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Fundos insuficientes para transferência");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": " + saldo);
    }
}
