/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class CaixaModel {
    public int id_caixa;
    public double valor_inicial;
    public Date abertoAs;
   /* 
    public double entradas;
    public double entradas_dinheiro;
    public enum forma_pagamento { D, C, P}; //D -> dinheiro, C -> Cartão, P -> Pix
    public double entradas_cartao;
    public double entradas_pix;
    public double saidas;
                                */
    
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
