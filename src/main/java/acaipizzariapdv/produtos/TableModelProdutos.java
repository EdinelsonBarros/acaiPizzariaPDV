/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelProdutos extends AbstractTableModel {
    
    String[] columns = { "Nome", "Preço", "Unidade Medida" };
    List<ProdutosModel> produtosModel = new ArrayList();
    
    // métodos obrigatórios para implementar a interface AbstractTableModel
    @Override
    public int getRowCount(){
        return produtosModel.size();
    }
    
    @Override
    public int getColumnCount(){
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return produtosModel.get(rowIndex).getNome();

            case 1:
                return produtosModel.get(rowIndex).getPreco();
            case 2:
                return produtosModel.get(rowIndex).getMedida();
            default:
                return "Dados não encontrados.";

        }
    }
    
    //métodos não obrigatórios
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false; // lembrar de ver como fica
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(produtosModel.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    public String[] getColumns(){
        return this.columns;
    }
    
    public List<ProdutosModel> getProdutos(){
        return this.produtosModel;
    }
    
    public void setProdutos(List<ProdutosModel> produtos){
        this.produtosModel = produtos;
    }
}
