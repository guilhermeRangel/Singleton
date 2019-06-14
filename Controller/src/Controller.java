


public class controller {


       ListaDeProdutos pList = new ListaDeProdutos();

       



        Produto p = null;
        Produto p2 = null;

        public static void main(String args[]) {

                new controller();

        }

        private controller(){
                p = new Produto("01", "concha", 2.0);
                p2 = new Produto("02", "galinha", 3.0);
                pList.CriaEAdicionaNaListaUmProduto(p);
        }

}
