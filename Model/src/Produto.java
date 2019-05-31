public class Produto {

    private String codigo;
    private String nomeProduto;
    private Double valor;

    public Produto(String codigo, String nomeProduto, Double valor) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
