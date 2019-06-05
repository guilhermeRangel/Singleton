import java.util.ArrayList;

public class ListaDeProdutos{


   static ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Produto aux = null;



    public ArrayList<Produto> getProdutosList() {
        return produtos;
    }



    public void CriaEAdicionaNaListaUmProduto(Produto aux) {
        this.aux = aux;
        produtos.add(aux);
    }





}
