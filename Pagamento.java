import java.util.Date;


//Rodrigo santos freitas Rm557981
//Richard Camargo De Almeida Rm558367

public class Pagamento {
    private String idPagamento;
    private double valor;
    private Date dataPagamento;
    private Conta conta;
    private String descricao;

    public Pagamento(String idPagamento, double valor, Date dataPagamento, Conta conta, String descricao) {
        this.idPagamento = idPagamento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.conta = conta;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void realizarPagamento() {
        if (conta.getSaldo() >= valor) {
            conta.sacar(valor);
            System.out.println("Pagamento de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }

    public void exibirDetalhesPagamento() {
        System.out.println("ID pagamento: " + idPagamento);
        System.out.println("Data: " + dataPagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
    }
}