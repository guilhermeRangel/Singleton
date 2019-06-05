import java.util.ArrayList;

public class Carrinho {

    private Produto[] produto;


   private static Carrinho instancia;


   public static Carrinho getInstance() {
       if (instancia == null) {
           instancia = new Carrinho();

       }
       return instancia;
   }


    private Carrinho() {

    }




    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public static Carrinho getInstancia() {
        return instancia;
    }

    public static void setInstancia(Carrinho instancia) {
        Carrinho.instancia = instancia;
    }
}
