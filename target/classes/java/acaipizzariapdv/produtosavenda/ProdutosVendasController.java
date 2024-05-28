/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtosavenda;

import acaipizzariapdv.produtos.TableModelProdutos;
import acaipizzariapdv.produtos.ProdutosController;
import acaipizzariapdv.produtos.ProdutosModel;
import java.util.ArrayList;
import java.util.List;

public class ProdutosVendasController {

    TableModelProdutosVendas tableModelProdutos = new TableModelProdutosVendas();

    public TableModelProdutosVendas setarModelTabela() {
        tableModelProdutos.setProdutos(initProdutos());
        return tableModelProdutos;
    }

    List produtos = new ArrayList();
    public List<ProdutosModel> initProdutos() {
        ProdutosController produtosController = new ProdutosController();
        produtos = produtosController.consultarProdutos();
        return produtos;
    }
}
