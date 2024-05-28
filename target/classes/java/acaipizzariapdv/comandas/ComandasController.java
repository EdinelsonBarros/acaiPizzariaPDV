/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.comandas;

/**
 *
 * @author Usuario
 */
public class ComandasController {
    
    
    
    ComandasModel comandasModel = new ComandasModel();
    public void abrirComanda(ComandasModel comandas){
        comandasModel.salvarComanda(comandas);
    }
}
