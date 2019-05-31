public class Cliente extends Pessoa {

    private String email;
    private Integer senha;
    private Carrinho carrinho;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }


}


