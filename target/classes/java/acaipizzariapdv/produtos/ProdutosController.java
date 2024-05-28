/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import acaipizzariapdv.util.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProdutosController {
    
    ProdutosModel produtosModel = new ProdutosModel();
    
    public void saveProduct(ProdutosModel produto) {
        produtosModel.saveProduct(produto);
    }
    
    public ArrayList<ProdutosModel> consultarProdutos() {
       ArrayList<ProdutosModel> listaProdutos;
       listaProdutos =  produtosModel.consultarProdutos();
        return listaProdutos;
    }
    
    public void updateProduct(ProdutosModel produto) {
        produtosModel.updateProduct(produto);
    }
    
}
