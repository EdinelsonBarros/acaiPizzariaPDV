/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtosavenda;

import acaipizzariapdv.produtos.ProdutosModel;
import acaipizzariapdv.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import acaipizzariapdv.util.ConnectionFactory;

/**
 *
 * @author Usuario
 */
public class ProdutosVendasModel {
    
    ConnectionFactory connectionFactory = new ConnectionFactory();
    
    public ArrayList<ProdutosModel> consultarProdutos(){
            String sql = "SELECT * FROM Produtos";
            ArrayList<ProdutosModel> listaProdutos = new ArrayList<>();
            
            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet resultSet = null;
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                ProdutosModel produto = new ProdutosModel();
                
                produto.setId(resultSet.getInt("id_produtod"));
                produto.setNome(resultSet.getString("nome_produto"));
                produto.setPrecoVenda(resultSet.getInt("preco_venda_produto"));
                produto.setMedida(resultSet.getString("unidade_medida_produto"));
                
                listaProdutos.add(produto);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar produtos.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }    
            return listaProdutos;
        }
}
