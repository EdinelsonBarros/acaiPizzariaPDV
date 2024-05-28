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

    CaixaModel caixaModel = new CaixaModel();

    public int salvarCaixa(CaixaModel caixa) {
        int id_caixa =  caixaModel.salvarCaixa(caixa);
        return id_caixa;
    }

    public List<CaixaModel> consultarHistoricoCaixa() {
        List historicoCaixas = caixaModel.consultarHistoricoCaixa();
        return historicoCaixas;
    }

    public void salvarMovimentacoesCaixa(CaixaModel caixa) {
        
    }
        

           

}
