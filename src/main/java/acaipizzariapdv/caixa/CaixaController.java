/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa;

import acaipizzariapdv.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class CaixaController {
    ConnectionFactory connectionFactory = new ConnectionFactory();

    public int salvarCaixa(CaixaModel caixa) {
        String sql = "INSERT INTO caixas(valor_inicial, abertura_data_hora, esta_aberto) VALUES(?,?,?)";
        Connection connection = null;
        PreparedStatement statement = null;
        int id_caixa = 0;

        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql, 1);

            statement.setDouble(1, caixa.getValor_inicial());
            statement.setTimestamp(2, new Timestamp(caixa.getAbertoAs().getTime()));
            statement.setBoolean(3, caixa.isAberto());
            statement.execute();
            ResultSet resultSet = statement.getGeneratedKeys();

            while(resultSet.next()){
            id_caixa = resultSet.getInt(1);
            //return id_caixa;
        }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o caixa.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        return id_caixa;
    }

    public List<CaixaModel> consultarHistoricoCaixa() {
        String sql = "SELECT * FROM caixas";
        List<CaixaModel> historicoCaixas = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CaixaModel caixa = new CaixaModel();

                caixa.setId_caixa(resultSet.getInt("id_caixa"));
                caixa.setValor_inicial(resultSet.getDouble("valor_inicial"));
                caixa.setAbertoAs(resultSet.getDate("abertura_data_hora"));
                caixa.setTotal_entradas_dinheiro(resultSet.getDouble("total_entradas_dinheiro"));
                caixa.setTotal_entradas_pix(resultSet.getDouble("total_entradas_pix"));
                caixa.setTotal_entradas_cartao(resultSet.getDouble("total_entradas_cartao"));
                caixa.setTotal_saidas(resultSet.getDouble("total_saidas"));
                caixa.setSaldo_final_dinheiro(resultSet.getDouble("saldo_final_dinheiro"));
                caixa.setAberto(resultSet.getBoolean("esta_aberto"));
                caixa.setFechadoAs(resultSet.getDate("fechamento_data_hora"));
                caixa.setTotal_entradas(resultSet.getDouble("total_entradas"));

                historicoCaixas.add(caixa);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar caixas.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return historicoCaixas;
    }

    public void salvarMovimentacoesCaixa(CaixaModel caixa) {
        String sql = "UPDATE caixas SET "
                + "total_entradas_dinheiro = ?, "
                + "total_entradas_pix = ?, "
                + "total_entradas_cartao = ?, "
                + "total_saidas = ?, "
                + "saldo_final_dinheiro = ?, "
                + "saldo_final = ?, "
                + "esta_aberto = ?, "
                + "fechamento_data_hora = ?, "
                + "total_entradas = ? "
                + "WHERE id_caixa = ? ";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = connectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setDouble(1, caixa.getTotal_entradas_dinheiro());
            statement.setDouble(2, caixa.getTotal_entradas_pix());
            statement.setDouble(3, caixa.getTotal_entradas_cartao());
            statement.setDouble(4, caixa.getTotal_saidas());
            statement.setDouble(5, caixa.getSaldo_final_dinheiro());
            statement.setDouble(6, caixa.getSaldo_final());
            statement.setBoolean(7, caixa.isAberto());
            statement.setTimestamp(8, new Timestamp(caixa.getFechadoAs().getTime()));
            statement.setDouble(9, caixa.getTotal_entradas());
            statement.setInt(10, caixa.getId_caixa());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o caixa.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

}
