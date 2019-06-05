import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produto = new ArrayList<>();


   private static Carrinho instancia;


   public static Carrinho getInstance() {
       if (instancia == null) {
           instancia = new Carrinho();

       }
       return instancia;
   }

    //construtor
    private Carrinho() {

    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto.add(produto);
    }

    public static Carrinho getInstancia() {
        return instancia;
    }

    public static void setInstancia(Carrinho instancia) {
        Carrinho.instancia = instancia;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produto=" + produto +
                '}';
    }
}
