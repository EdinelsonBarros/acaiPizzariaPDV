/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtos;

import acaipizzariapdv.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ProdutosModel {
    public int id;
    public String nome;
    public double precoVenda;
    public double precoCusto;
    public String medida;
    public String categoria;
    public String segmento;
    
   public ProdutosModel(int id, String nome, double precoVenda, double precoCusto, String medida, String categoria, String segmento){
       this.id = id;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.medida = medida;
        this.segmento = segmento;
        this.categoria = categoria;
        
    }
    
   public ProdutosModel(String nome, double precoVenda, String medida){
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.medida = medida;
    }
   
   public ProdutosModel(){
       
    }
   
   ConnectionFactory connectionFactory = new ConnectionFactory();
   
   public void saveProduct(ProdutosModel produto){
        String sql = "INSERT INTO produtos(nome_produto, preco_venda_produto, unidade_medida_produto, preco_custo_produto) VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPrecoVenda());
            statement.setDouble(3, produto.getPrecoCusto());
            statement.setString(4, produto.getMedida());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o produto.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }    
    }
   
   public ArrayList<ProdutosModel> consultarProdutos() {
        String sql = "SELECT * FROM Produtos";
        ArrayList<ProdutosModel> listaProdutos = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                ProdutosModel produto = new ProdutosModel();
                
                produto.setId(resultSet.getInt("id_produtod"));
                produto.setNome(resultSet.getString("nome_produto"));
                produto.setPrecoVenda(resultSet.getDouble("preco_venda_produto"));
                produto.setPrecoCusto(resultSet.getDouble("preco_custo_produto"));
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
   
   public void updateProduct(ProdutosModel produto) {
        String sql = "UPDATE produtos SET nome_produto = ?, preco_venda_produto = ?, preco_custo_produto = ?, unidade_medida_produto = ? WHERE id_produtod = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPrecoVenda());
            statement.setDouble(3, produto.getPrecoCusto());
            statement.setString(4, produto.getMedida());
            statement.setInt(5, produto.getId());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar o produto.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
    
    

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    @Override
    public String toString(){
        return "Id: " + getId() + ", Nome: " + getNome() +"Preço de Custo:" + getPrecoCusto() + ", Preço de Venda: " + getPrecoVenda() + ", Unidade Medida: " + getMedida();
        
    } 
    
    
}
