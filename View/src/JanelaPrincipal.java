
//http://t2ti.com/curso/video/java/basico/modulos/Java_Basico_Modulo_10.pdf

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaPrincipal implements ActionListener {

    Carrinho c1 = Carrinho.getInstance();

    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel produto = new JLabel("Selecione o produto desejado: ");
    DefaultListModel listModel = new DefaultListModel();
    JList lista = new JList(listModel);
    JButton botao = new JButton("adicionar ao carrinho");
    ImageIcon iconCarrinho = new ImageIcon(new ImageIcon("/Users/rangel/Google Drive/Singleton/View/src/carrinho.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));


    JButton btnCarrinho = new JButton("Carrinho de compras", iconCarrinho);



    public static void main(String args[]) {

        new JanelaPrincipal();

    }


    private JanelaPrincipal() {

        //definimos o título da janela
        janela.setTitle("Sistema de Compras");

        //definimos a largura e a altura da janela
        janela.setSize(400, 400);
       // botao.setBackground(Color.orange);
        botao.setEnabled(true);
        btnCarrinho.setEnabled(true);
        botao.addActionListener(this);
        btnCarrinho.addActionListener(this);
        //define a posição da janela na tela
        janela.setLocation(400, 200);
        //define que ao fechar a janela, encerre a aplicação
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new GridLayout(4, 2, 5, 1));
        painel.add(produto);

        Produto feijao = new Produto("01", "feijao", 5.0);
        Produto arroz = new Produto("02", "arroz", 3.0);
        Produto lentilha = new Produto("03", "lentilha", 4.0);


        listModel.addElement(feijao);
        listModel.addElement(arroz);
        listModel.addElement(lentilha);

        produto.setHorizontalAlignment(0);
        painel.add(lista);
        painel.add(botao);
        janela.add(painel);
        btnCarrinho.setIcon(iconCarrinho);
        painel.add(btnCarrinho);

        //mostramos a janela
        janela.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            JOptionPane.showMessageDialog(null, "produto adicionado com sucesso");
            //System.out.println(lista.getSelectedValue());

            Produto teste = (Produto) listModel.getElementAt(lista.getSelectedIndex());

            c1.setProduto(teste);

            System.out.println(c1);

        }
        if (e.getSource() == btnCarrinho) {
            JOptionPane.showMessageDialog(null, c1);
    }

    }
}