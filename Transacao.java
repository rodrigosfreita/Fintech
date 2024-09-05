import java.util.Date;

//Rodrigo santos freitas Rm557981
//Richard Camargo De Almeida Rm558367


public class Transacao {
    private String idTransacao;
    private Date data;
    private double valor;
    private String tipo;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(String idTransacao, Date data, double valor, String tipo, Conta contaOrigem, Conta contaDestino) {
        this.idTransacao = idTransacao;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    // Getters e Setters
    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void efetuarTransacao() {
        if (tipo.equals("Transferência")) {
            contaOrigem.transferir(contaDestino, valor);
        } else if (tipo.equals("Débito")) {
            contaOrigem.sacar(valor);
        } else if (tipo.equals("Crédito")) {
            contaDestino.depositar(valor);
        }
        System.out.println("Transação efetuada com sucesso.");
    }

    public void exibirDetalhesTransacao() {
        System.out.println("ID Transação: " + idTransacao);
        System.out.println("Data: " + data);
        System.out.println("Valor: " + valor);
        System.out.println("Tipo: " + tipo);
    }
}

