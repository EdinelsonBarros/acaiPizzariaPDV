/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa.saidasEntradas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;

import acaipizzariapdv.util.ConnectionFactory;


public class SaidasEntradasController {
    
    ConnectionFactory connectionFactory = new ConnectionFactory();
    
    public void salvarSaidaEntrada(SaidasEntradasModel saidasEntradas){
        String sql = "INSERT INTO entradas_saidas_caixa("
                + "entrada_saida_caixa,"
                + "valor,"
                + "segmento,"
                + "categoria,"
                + "data_hora,"
                + "idcaixa,"
                + "observacao,"
                + "solicitante)"
                + "values(?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
             connection = connectionFactory.getConnection();
             statement = connection.prepareStatement(sql, 1);
             statement.setString(1, saidasEntradas.getEntradaSaida());
             statement.setDouble(2, saidasEntradas.getValor());
             statement.setString(3, saidasEntradas.getSegmento());
             statement.setString(4, saidasEntradas.getCategoria());
             statement.setTimestamp(5, new Timestamp(saidasEntradas.getData_hora().getTime()));
             statement.setInt(6, saidasEntradas.getId_caixa());
             statement.setString(7, saidasEntradas.getObservacao());
             statement.setString(8, saidasEntradas.getSolicitante());
             statement.execute();     
             
        } catch(Exception e){
            throw new RuntimeException("Não foi possível registrar saída/entrada.", e);
        } finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        
           
    }
    
    public List<SaidasEntradasModel> consultarEntradasSaidas(int idCaixa){
        String sql = "SELECT * FROM entradas_saidas_caixa WHERE idcaixa=?";
        List<SaidasEntradasModel> saidasEntradas = new ArrayList();
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idCaixa);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                SaidasEntradasModel saidaEntrada = new SaidasEntradasModel();
                
                saidaEntrada.setId_entrada_saida(resultSet.getInt("identrada_saida_caixa"));
                saidaEntrada.setEntradaSaida(resultSet.getString("entrada_saida_caixa"));
                saidaEntrada.setValor(resultSet.getDouble("valor"));
                saidaEntrada.setSegmento(resultSet.getString("segmento"));
                saidaEntrada.setCategoria(resultSet.getString("categoria"));
                saidaEntrada.setId_caixa(resultSet.getInt("idcaixa"));
                saidaEntrada.setObservacao(resultSet.getString("observacao"));
                saidaEntrada.setSolicitante(resultSet.getString("solicitante"));
                saidasEntradas.add(saidaEntrada);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível carregar entradas e saídas.", e);
        } finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return saidasEntradas;
        
    }
    
    //Pesquisa de todos os registros
    public List<SaidasEntradasModel> consultarEntradasSaidas(){
        String sql = "SELECT * FROM entradas_saidas_caixa";
        List<SaidasEntradasModel> saidasEntradas = new ArrayList();
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                SaidasEntradasModel saidaEntrada = new SaidasEntradasModel();
                
                saidaEntrada.setId_entrada_saida(resultSet.getInt("identrada_saida_caixa"));
                saidaEntrada.setEntradaSaida(resultSet.getString("entrada_saida_caixa"));
                saidaEntrada.setValor(resultSet.getDouble("valor"));
                saidaEntrada.setSegmento(resultSet.getString("segmento"));
                saidaEntrada.setCategoria(resultSet.getString("categoria"));
                saidaEntrada.setId_caixa(resultSet.getInt("idcaixa"));
                saidaEntrada.setObservacao(resultSet.getString("observacao"));
                saidaEntrada.setSolicitante(resultSet.getString("solicitante"));
                saidasEntradas.add(saidaEntrada);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível carregar entradas e saídas.", e);
        } finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return saidasEntradas;
        
    }
    
}
