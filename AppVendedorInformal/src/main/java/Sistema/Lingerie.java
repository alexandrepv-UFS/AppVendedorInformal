/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Daniel Santos Rodrigues
 */
public class Lingerie extends Produto{
    private String tamanho, cor;

    public Lingerie(String tamanho, String cor, double IDProduto, String nome, String publico, String genero, String modelo, String fabricante, int quantidade, Double precoVenda) {
        super(IDProduto, nome, publico, genero, modelo, fabricante, quantidade, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
    }
    
    
    
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    
    
}
