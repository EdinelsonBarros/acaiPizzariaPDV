/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa.saidasEntradas;

import java.util.Date;

public class SaidasEntradasModel {
    private int id_entrada_saida;
    private String entradaSaida;
    private double valor;
    private String observacao;
    private String solicitante;
    private String segmento;
    private String categoria;
    public Date data_hora;
    public int id_caixa;

    public SaidasEntradasModel(int id_caixa, String entradaSaida, double valor, String observacao, String segmento, String categoria, Date data_hora) {
        this.id_caixa = id_caixa;
        this.entradaSaida = entradaSaida;
        this.valor = valor;
        this.observacao = observacao;
        this.segmento = segmento;
        this.categoria = categoria;
        this.data_hora = data_hora;
    }

    public SaidasEntradasModel() {
    }

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public String getEntradaSaida() {
        return entradaSaida;
    }

    public void setEntradaSaida(String entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId_entrada_saida() {
        return id_entrada_saida;
    }

    public void setId_entrada_saida(int id_entrada_saida) {
        this.id_entrada_saida = id_entrada_saida;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public String toString() {
        return "SaidasEntradasModel{" + "id_entrada_saida=" + id_entrada_saida + ", entradaSaida=" + entradaSaida + ", valor=" + valor + ", observacao=" + observacao + ", solicitante=" + solicitante + ", segmento=" + segmento + ", categoria=" + categoria + ", data_hora=" + data_hora + ", id_caixa=" + id_caixa + '}';
    }
    
    
    
    
}
