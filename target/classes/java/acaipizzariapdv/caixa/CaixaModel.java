/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa;

import acaipizzariapdv.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CaixaModel {

    public int id_caixa;
    public double valor_inicial;
    public Date abertoAs;
    public double total_entradas_dinheiro;
    public double total_entradas_cartao;
    public double total_entradas_pix;
    public double total_entradas;
    public double total_saidas;
    public double saldo_final_dinheiro;
    public double saldo_final;
    public boolean aberto = false;
    public Date fechadoAs;

    public CaixaModel() {
    }

    public CaixaModel(double valor_inicial, Date abertoAs, boolean aberto) {
        this.valor_inicial = valor_inicial;
        this.abertoAs = abertoAs;
        this.aberto = aberto;
    }

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

            while (resultSet.next()) {
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

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public double getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public double getTotal_entradas_dinheiro() {
        return total_entradas_dinheiro;
    }

    public void setTotal_entradas_dinheiro(double total_entradas_dinheiro) {
        this.total_entradas_dinheiro = total_entradas_dinheiro;
    }

    public double getTotal_entradas_cartao() {
        return total_entradas_cartao;
    }

    public void setTotal_entradas_cartao(double total_entradas_cartao) {
        this.total_entradas_cartao = total_entradas_cartao;
    }

    public double getTotal_entradas_pix() {
        return total_entradas_pix;
    }

    public void setTotal_entradas_pix(double total_entradas_pix) {
        this.total_entradas_pix = total_entradas_pix;
    }

    public double getTotal_entradas() {
        return total_entradas;
    }

    public void setTotal_entradas(double total_entradas) {
        this.total_entradas = total_entradas;
    }

    public double getTotal_saidas() {
        return total_saidas;
    }

    public void setTotal_saidas(double total_saidas) {
        this.total_saidas = total_saidas;
    }

    public double getSaldo_final_dinheiro() {
        return saldo_final_dinheiro;
    }

    public void setSaldo_final_dinheiro(double saldo_final_dinheiro) {
        this.saldo_final_dinheiro = saldo_final_dinheiro;
    }

    public double getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(double saldo_final) {
        this.saldo_final = saldo_final;
    }

    public Date getAbertoAs() {
        return abertoAs;
    }

    public void setAbertoAs(Date abertoAs) {
        this.abertoAs = abertoAs;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Date getFechadoAs() {
        return fechadoAs;
    }

    public void setFechadoAs(Date fechadoAs) {
        this.fechadoAs = fechadoAs;
    }

    @Override
    public String toString() {
        return "CaixaModel{" + "id_caixa=" + id_caixa + ", valor_inicial=" + valor_inicial + ", abertoAs=" + abertoAs + ", total_entradas_dinheiro=" + total_entradas_dinheiro + ", total_entradas_cartao=" + total_entradas_cartao + ", total_entradas_pix=" + total_entradas_pix + ", total_entradas=" + total_entradas + ", total_saidas=" + total_saidas + ", saldo_final_dinheiro=" + saldo_final_dinheiro + ", saldo_final=" + saldo_final + ", aberto=" + aberto + ", fechadoAs=" + fechadoAs + '}';
    }

}
