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
/**
 *
 * @author Usuario
 */
public class ProdutosController {
    ConnectionFactory connectionFactory = new ConnectionFactory();
    
    public void saveProduct(ProdutosModel produto){
        String sql = "INSERT INTO produtos(nome_produto, preco_produto, unidade_medida_produto) VALUES (?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getPreco());
            statement.setString(3, produto.getMedida());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o produto.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }    
    }
    
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
                produto.setPreco(resultSet.getInt("preco_produto"));
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
    
     public void updateProduct(ProdutosModel produto){
        String sql = "UPDATE produtos SET nome_produto = ?, preco_produto = ?, unidade_medida_produto = ? WHERE id_produtod = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getPreco());
            statement.setString(3, produto.getMedida());
            statement.setInt(4, produto.getId());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar o produto.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }    
    }
    
    
}
