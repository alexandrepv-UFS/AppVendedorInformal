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
public class Maquiagem extends CosmeticoNatura{
    // herança pobre até o momento
    
    public Maquiagem(String categoria, String marca, String tipo) {
        this.setCategoria(categoria);
        this.setMarca(marca);
        this.setTipo(tipo);
    }
}
