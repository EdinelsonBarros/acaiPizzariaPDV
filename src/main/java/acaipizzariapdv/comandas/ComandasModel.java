/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.comandas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ComandasModel {
    String comanda;
    String operador;
    Date abertoAs;
    Date fechadoAs;
    double valorTotal;
    List produtos;
    String cliente;
    String status;

    public ComandasModel(String operador, Date abertoAs, Date fechadoAs, double valorTotal, List produtos, String cliente, String status, String comanda) {
        this.operador = operador;
        this.abertoAs = abertoAs;
        this.fechadoAs = fechadoAs;
        this.valorTotal = valorTotal;
        this.produtos = produtos;
        this.cliente = cliente;
        this.status = status;
        this.comanda = comanda;
    }

    public ComandasModel() {
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        this.comanda = comanda;
    }
    
    

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Date getAbertoAs() {
        return abertoAs;
    }

    public void setAbertoAs(Date abertoAs) {
        this.abertoAs = abertoAs;
    }

    public Date getFechadoAs() {
        return fechadoAs;
    }

    public void setFechadoAs(Date fechadoAs) {
        this.fechadoAs = fechadoAs;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List getProdutos() {
        return produtos;
    }

    public void setProdutos(List produtos) {
        this.produtos = produtos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    List<ComandasModel> comandas = new ArrayList();
    public void salvarComanda(ComandasModel comanda){
    
    comandas.add(comanda);
    }

    public List<ComandasModel> getComandas() {
        return comandas;
    }

    public void setComandas(List<ComandasModel> comandas) {
        this.comandas = comandas;
    }
    
    
    
    
    
}
