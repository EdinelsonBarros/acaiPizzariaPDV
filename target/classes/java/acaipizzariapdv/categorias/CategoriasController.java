/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.categorias;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CategoriasController {
    CategoriasModel categoriasModel = new CategoriasModel();
    
    public void salvarCategoria(CategoriasModel categorias){
        categoriasModel.salvarCategoria(categorias);
    }
    
    public ArrayList<CategoriasModel> consultarCategorias(){
        ArrayList listaCategorias = categoriasModel.consultarCategorias();
        return listaCategorias;
    }
    
}
