/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.categorias;

import acaipizzariapdv.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoriasModel {
    private String nome;
    private String segmento;

    public CategoriasModel() {
    }

    
    public CategoriasModel(String nome) {
    }

    ConnectionFactory connectionFactory = new ConnectionFactory();
    
    public void salvarCategoria(CategoriasModel categorias){
        String sql = "INSERT INTO categorias(nome, segmento) VALUES(?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, categorias.getNome());
            statement.setString(2, categorias.getSegmento());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar categoria", e);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public ArrayList<CategoriasModel> consultarCategorias(){
        String sql = "SELECT * FROM categorias";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<CategoriasModel> listaCategorias = new ArrayList();
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                CategoriasModel categorias = new CategoriasModel(nome);
                categorias.setNome(resultSet.getString("nome")); 
                categorias.setSegmento(resultSet.getString("segmento")); 
                listaCategorias.add(categorias);
            }
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível consultar categorias", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
        return listaCategorias;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "CategoriasModel{" + "nome=" + nome + ", segmento=" + segmento + '}';
    }
    
    

    
    
    
    
    
    
}
